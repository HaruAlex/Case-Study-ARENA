package arena.boundary;

import arena.entity.Advertiser;

/**
 * Boundary Object — gửi thông báo kết quả chốt tài trợ đến Advertiser.
 * Cho biết nhà quảng cáo có được chọn làm nhà tài trợ độc quyền hay không.
 *
 * @author 4651050189_Nguyen Yen Nhi
 * @version 1.0
 */
public class SponsorNotice {

    /**
     * Gửi thông báo kết quả tài trợ đến một Advertiser cụ thể.
     *
     * @param advertiser Nhà quảng cáo nhận thông báo, không được null
     * @param accepted   {@code true} nếu được chọn làm nhà tài trợ độc quyền,
     *                   {@code false} nếu không được chọn
     */
    public void notifyAdvertiser(Advertiser advertiser, boolean accepted) {
        System.out.println("[Boundary: SponsorNotice] Thong bao ket qua tai tro cho "
                + advertiser.getName() + ": " + (accepted ? "DUOC CHON" : "KHONG DUOC CHON"));
    }
}
