package arena.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Root Entity biểu diễn toàn bộ hệ thống ARENA.
 * Arena quản lý danh sách các Advertiser, InterestGroup, cũng như
 * các cấu hình hệ thống như số Tournament tối đa và phí tài trợ.
 *
 * @author 4651050189_Nguyen Yen Nhi
 * @version 1.0
 */
public class Arena {

    /** Số lượng Tournament tối đa được phép chạy đồng thời. */
    private int maxTournaments;

    /** Phí tài trợ độc quyền (đơn vị: USD) mà Advertiser phải trả. */
    private double sponsorshipFee;

    /** Danh sách các nhà quảng cáo đã đăng ký trong hệ thống. */
    private List<Advertiser> advertisers;

    /** Danh sách các nhóm người dùng quan tâm (Interest Groups) trong hệ thống. */
    private List<InterestGroup> interestGroups;

    /**
     * Khởi tạo thể hiện Arena với các thiết lập mặc định:
     * tối đa 10 Tournament đồng thời và phí tài trợ 200.0$.
     */
    public Arena() {
        this.maxTournaments = 10;
        this.sponsorshipFee = 200.0;
        this.advertisers = new ArrayList<>();
        this.interestGroups = new ArrayList<>();
    }

    /**
     * Kiểm tra giới hạn số lượng Tournament được phép chạy đồng thời.
     * Trong mô phỏng này luôn trả về {@code true} vì chưa đạt giới hạn.
     *
     * @return {@code true} nếu hệ thống còn chỗ, {@code false} nếu đã vượt giới hạn
     */
    public boolean checkMaxTournament() {
        System.out.println("[Arena] Kiem tra quan ly tai nguyen maxTournaments: " + maxTournaments + " -> Hop le.");
        return true;
    }

    /**
     * Tìm danh sách các nhà quảng cáo quan tâm đến tài trợ độc quyền.
     *
     * @return Danh sách {@link Advertiser} có {@code interestedInExclusive = true}
     */
    public List<Advertiser> findInterestedExclusiveSponsors() {
        List<Advertiser> result = new ArrayList<>();
        for (Advertiser adv : advertisers) {
            if (adv.isInterestedInExclusive()) {
                result.add(adv);
            }
        }
        return result;
    }

    /**
     * Thêm một Advertiser vào danh sách quảng cáo của hệ thống.
     *
     * @param advertiser Đối tượng {@link Advertiser} cần thêm, không được null
     */
    public void addAdvertiser(Advertiser advertiser) {
        this.advertisers.add(advertiser);
    }

    /**
     * Thêm một InterestGroup vào danh sách nhóm quan tâm của hệ thống.
     *
     * @param group Đối tượng {@link InterestGroup} cần thêm, không được null
     */
    public void addInterestGroup(InterestGroup group) {
        this.interestGroups.add(group);
    }

    /**
     * Trả về danh sách tất cả các nhóm người dùng quan tâm trong hệ thống.
     *
     * @return Danh sách {@link InterestGroup} hiện có
     */
    public List<InterestGroup> getInterestGroups() {
        return interestGroups;
    }

    /**
     * Trả về phí tài trợ độc quyền của hệ thống.
     *
     * @return Mức phí tài trợ (đơn vị: USD)
     */
    public double getSponsorshipFee() {
        return sponsorshipFee;
    }
}
