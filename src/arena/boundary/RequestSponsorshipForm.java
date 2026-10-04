package arena.boundary;

import arena.control.AnnounceTournamentControl;

/**
 * Boundary Object — form cho phép LeagueOwner khởi động quá trình tìm kiếm
 * và kêu gọi nhà tài trợ độc quyền cho Tournament.
 * Form này chuyển tiếp yêu cầu tới {@link AnnounceTournamentControl} để
 * tìm kiếm danh sách Advertiser phù hợp và gửi thư mời.
 *
 * @author 4651050189_Nguyen Yen Nhi
 * @version 1.0
 */
public class RequestSponsorshipForm {

    /**
     * Kích hoạt luồng tìm kiếm nhà tài trợ độc quyền thông qua Control Object.
     *
     * @param control Đối tượng {@link AnnounceTournamentControl} điều phối xử lý,
     *                không được null
     */
    public void requestExclusiveSponsor(AnnounceTournamentControl control) {
        System.out.println("[Boundary: RequestSponsorshipForm] LeagueOwner yeu cau tim kiem nha tai tro doc quyen.");
        control.findInterestedExclusiveSponsors();
    }
}
