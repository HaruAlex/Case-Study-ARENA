package arena.boundary;

import arena.control.AnnounceTournamentControl;

/**
 * Boundary Object — form phụ trách giai đoạn thông báo cuối cùng trong
 * Use Case AnnounceTournament. Form này thực hiện hai bước:
 * <ol>
 *   <li>Thông báo kết quả tài trợ đến tất cả Advertiser đã phản hồi.</li>
 *   <li>Công bố Tournament mới đến các nhóm người dùng quan tâm (InterestGroups).</li>
 * </ol>
 *
 * @author 4651050189_Nguyen Yen Nhi
 * @version 1.0
 */
public class NotifyInterestGroupsForm {

    /**
     * Kích hoạt luồng thông báo kết quả tài trợ đến tất cả Advertiser đã phản hồi.
     * Advertiser được chọn sẽ nhận thông báo xác nhận; những người còn lại nhận thông báo từ chối.
     *
     * @param control Đối tượng {@link AnnounceTournamentControl} điều phối xử lý,
     *                không được null
     */
    public void notifySponsorsOfDecision(AnnounceTournamentControl control) {
        System.out.println("[Boundary: NotifyInterestGroupsForm] Chuyen sang buoc thong bao ket qua cho cac Sponsor.");
        control.notifySponsorsOfDecision();
    }

    /**
     * Kích hoạt luồng công bố Tournament mới đến tất cả người dùng
     * trong các InterestGroup liên quan.
     *
     * @param control Đối tượng {@link AnnounceTournamentControl} điều phối xử lý,
     *                không được null
     */
    public void notifyInterestGroups(AnnounceTournamentControl control) {
        System.out.println("[Boundary: NotifyInterestGroupsForm] LeagueOwner phat thong bao rao giai den cac InterestGroups.");
        control.notifyInterestGroups();
    }
}
