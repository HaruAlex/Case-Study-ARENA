package arena.boundary;

import arena.control.AnnounceTournamentControl;
import arena.entity.Advertiser;

/**
 * Boundary Object — form cho phép LeagueOwner chọn một Advertiser
 * trong số danh sách các nhà quảng cáo đã phản hồi đồng ý tài trợ.
 * Sau khi chọn, form chuyển tiếp quyết định tới {@link AnnounceTournamentControl}
 * để chốt hợp đồng và trừ phí tài trợ.
 *
 * @author 4651050189_Nguyen Yen Nhi
 * @version 1.0
 */
public class SelectExclusiveSponsorForm {

    /**
     * Xác nhận chọn nhà tài trợ độc quyền và chuyển tiếp quyết định đến Control Object.
     *
     * @param control        Đối tượng {@link AnnounceTournamentControl} điều phối xử lý,
     *                       không được null
     * @param selectedSponsor Nhà quảng cáo được LeagueOwner chọn làm tài trợ độc quyền,
     *                        không được null
     */
    public void selectSponsor(AnnounceTournamentControl control, Advertiser selectedSponsor) {
        System.out.println("[Boundary: SelectExclusiveSponsorForm] LeagueOwner chon nha tai tro doc quyen: "
                + selectedSponsor.getName());
        control.setSponsorship(selectedSponsor);
    }
}
