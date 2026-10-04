package arena.boundary;

import arena.entity.Advertiser;

/**
 * Boundary Object — biểu diễn thư phản hồi từ Advertiser về quyết định
 * tài trợ độc quyền cho Tournament.
 * Đối tượng này được tạo ra sau khi hệ thống nhận được phản hồi từ nhà quảng cáo.
 *
 * @author 4651050189_Nguyen Yen Nhi
 * @version 1.0
 */
public class SponsorshipReply {

    /** Nhà quảng cáo đã phản hồi. */
    private Advertiser advertiser;

    /** Trạng thái phản hồi: {@code true} nếu đồng ý tài trợ, {@code false} nếu từ chối. */
    private boolean accepted;

    /**
     * Khởi tạo SponsorshipReply với thông tin nhà quảng cáo và quyết định phản hồi.
     *
     * @param advertiser Nhà quảng cáo phản hồi, không được null
     * @param accepted   {@code true} nếu đồng ý tài trợ, {@code false} nếu từ chối
     */
    public SponsorshipReply(Advertiser advertiser, boolean accepted) {
        this.advertiser = advertiser;
        this.accepted = accepted;
    }

    /**
     * Trả về nhà quảng cáo đã gửi phản hồi này.
     *
     * @return Đối tượng {@link Advertiser} liên quan
     */
    public Advertiser getAdvertiser() {
        return advertiser;
    }

    /**
     * Kiểm tra nhà quảng cáo có đồng ý tài trợ hay không.
     *
     * @return {@code true} nếu đồng ý, {@code false} nếu từ chối
     */
    public boolean isAccepted() {
        return accepted;
    }
}
