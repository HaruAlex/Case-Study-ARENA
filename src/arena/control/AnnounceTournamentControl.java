package arena.control;

import arena.boundary.InterestGroupNotice;
import arena.boundary.SponsorNotice;
import arena.boundary.SponsorshipReply;
import arena.boundary.SponsorshipRequest;
import arena.entity.Account;
import arena.entity.Advertiser;
import arena.entity.Arena;
import arena.entity.InterestGroup;
import arena.entity.League;
import arena.entity.Tournament;
import arena.entity.User;
import java.util.ArrayList;
import java.util.List;

/**
 * Control Object điều phối toàn bộ Use Case AnnounceTournament.
 * Lớp này điều phối tương tác giữa các Boundary Objects và Entity Objects
 * theo đúng 3 Sequence Diagrams trong Chapter 5:
 * <ul>
 *   <li>Figure 5-26: Tournament Creation Workflow</li>
 *   <li>Figure 5-27: Sponsorship Workflow</li>
 *   <li>Figure 5-28: Interest Group Notification Workflow</li>
 * </ul>
 *
 * @author 4651050189_Nguyen Yen Nhi
 * @version 1.0
 */
public class AnnounceTournamentControl {

    /** Root Entity quản lý toàn bộ hệ thống ARENA. */
    private Arena arena;

    /** League đang tổ chức Tournament mới. */
    private League league;

    /** Tournament vừa được tạo trong Use Case này. */
    private Tournament tournament;

    /** Danh sách phản hồi từ các Advertiser sau khi gửi thư mời tài trợ. */
    private List<SponsorshipReply> replies;

    /** Nhà tài trợ độc quyền đã được LeagueOwner chọn. */
    private Advertiser selectedSponsor;

    /**
     * Khởi tạo Control Object điều phối việc công bố Tournament.
     *
     * @param league Đối tượng {@link League} hiện tại, không được null
     */
    public AnnounceTournamentControl(League league) {
        this.arena = new Arena();
        this.league = league;
        this.replies = new ArrayList<>();
    }

    /**
     * Tạo Tournament entity nếu tài nguyên hệ thống còn đáp ứng được.
     * Kiểm tra giới hạn Tournament qua {@link Arena#checkMaxTournament()} trước khi tạo.
     *
     * @param name       Tên giải đấu, không được null
     * @param maxPlayers Số người chơi tối đa, phải lớn hơn 0
     */
    public void createTournament(String name, int maxPlayers) {
        if (arena.checkMaxTournament()) {
            this.tournament = league.createTournament(name, maxPlayers);
            System.out.println("[Control] Da tao thanh cong Entity Tournament: " + tournament.getName());
        }
    }

    /**
     * Tìm kiếm danh sách các nhà quảng cáo quan tâm và gửi thư mời tài trợ.
     * Mô phỏng nhận phản hồi đồng ý từ tất cả Advertiser tìm được.
     */
    public void findInterestedExclusiveSponsors() {
        List<Advertiser> candidates = arena.findInterestedExclusiveSponsors();
        System.out.println("[Control] Tim thay " + candidates.size()
                + " nha quang cao tiem nang. Gui SponsorshipRequest...");
        for (Advertiser adv : candidates) {
            SponsorshipRequest req = new SponsorshipRequest();
            req.notifySponsor(adv);
            // Giả lập nhận phản hồi đồng ý từ Advertiser
            SponsorshipReply reply = new SponsorshipReply(adv, true);
            replies.add(reply);
        }
    }

    /**
     * Chốt tài trợ độc quyền và tiến hành tính phí tài khoản nhà quảng cáo.
     * Gán nhà tài trợ cho Tournament và trừ phí tài trợ từ tài khoản của họ.
     *
     * @param sponsor Nhà quảng cáo được chọn làm tài trợ độc quyền, không được null
     */
    public void setSponsorship(Advertiser sponsor) {
        this.selectedSponsor = sponsor;
        this.tournament.setExclusiveSponsor(sponsor);

        // Trừ tiền tài khoản nhà quảng cáo
        Account acc = sponsor.getAccount();
        acc.charge(arena.getSponsorshipFee());
        System.out.println("[Control] Da chot tai tro va tru phi tai tro thanh cong cho "
                + sponsor.getName());
    }

    /**
     * Thông báo kết quả tài trợ đến tất cả các Advertiser đã phản hồi.
     * Advertiser được chọn nhận thông báo xác nhận; những người còn lại nhận thông báo từ chối.
     */
    public void notifySponsorsOfDecision() {
        for (SponsorshipReply reply : replies) {
            SponsorNotice notice = new SponsorNotice();
            boolean isChosen = (reply.getAdvertiser() == selectedSponsor);
            notice.notifyAdvertiser(reply.getAdvertiser(), isChosen);
        }
    }

    /**
     * Gửi thông báo công bố Tournament mới đến tất cả người dùng
     * trong các InterestGroup thuộc hệ thống ARENA.
     */
    public void notifyInterestGroups() {
        List<InterestGroup> groups = arena.getInterestGroups();
        for (InterestGroup ig : groups) {
            InterestGroupNotice notice = new InterestGroupNotice();
            for (User u : ig.getUsers()) {
                notice.notifyPlayer(u, tournament.getName());
            }
        }
    }

    /**
     * Trả về đối tượng Arena đang được sử dụng trong Use Case này.
     *
     * @return Đối tượng {@link Arena} hiện tại
     */
    public Arena getArena() {
        return arena;
    }

    /**
     * Trả về Tournament vừa được tạo trong Use Case này.
     *
     * @return Đối tượng {@link Tournament} đã tạo, hoặc {@code null} nếu chưa tạo
     */
    public Tournament getTournament() {
        return tournament;
    }
}
