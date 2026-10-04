package arena.boundary;

import arena.entity.Advertiser;

/**
 * Boundary Object — gửi thư mời tài trợ đến Advertiser để hỏi ý định
 * tài trợ độc quyền cho Tournament sắp diễn ra.
 *
 * @author 4651050189_Nguyen Yen Nhi
 * @version 1.0
 */
public class SponsorshipRequest {

    /**
     * Gửi thông báo mời tài trợ đến một Advertiser cụ thể.
     *
     * @param advertiser Nhà quảng cáo nhận thư mời, không được null
     */
    public void notifySponsor(Advertiser advertiser) {
        System.out.println("[Boundary: SponsorshipRequest] Gui thu moi tai tro toi Advertiser: "
                + advertiser.getName());
    }
}
