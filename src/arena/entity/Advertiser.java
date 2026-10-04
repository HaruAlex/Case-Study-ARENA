package arena.entity;

/**
 * Biểu diễn nhà quảng cáo (Advertiser) trong hệ thống ARENA.
 * Advertiser kế thừa từ {@link User} và có tài khoản tài chính riêng,
 * đồng thời có thể đăng ký tài trợ độc quyền (exclusive sponsor) cho Tournament.
 *
 * @author 4651050189_Nguyen Yen Nhi
 * @version 1.0
 */
public class Advertiser extends User {

    /** Tài khoản tài chính dùng để thanh toán phí tài trợ. */
    private Account account;

    /** Cờ xác định nhà quảng cáo có quan tâm đến tài trợ độc quyền hay không. */
    private boolean interestedInExclusive;

    /**
     * Khởi tạo Advertiser với thông tin cơ bản và tự động tạo tài khoản mới.
     *
     * @param name                 Tên nhà quảng cáo
     * @param contact              Thông tin liên hệ (email/SĐT)
     * @param interestedInExclusive {@code true} nếu quan tâm đến tài trợ độc quyền
     */
    public Advertiser(String name, String contact, boolean interestedInExclusive) {
        super(name, contact);
        this.account = new Account();
        this.interestedInExclusive = interestedInExclusive;
    }

    /**
     * Trả về tài khoản tài chính của nhà quảng cáo.
     *
     * @return Đối tượng {@link Account} liên kết với Advertiser này
     */
    public Account getAccount() {
        return account;
    }

    /**
     * Kiểm tra xem nhà quảng cáo có quan tâm đến tài trợ độc quyền hay không.
     *
     * @return {@code true} nếu quan tâm, {@code false} nếu không
     */
    public boolean isInterestedInExclusive() {
        return interestedInExclusive;
    }

    /**
     * Cập nhật trạng thái quan tâm tài trợ độc quyền của nhà quảng cáo.
     *
     * @param interestedInExclusive {@code true} để đánh dấu quan tâm, {@code false} để bỏ
     */
    public void setInterestedInExclusive(boolean interestedInExclusive) {
        this.interestedInExclusive = interestedInExclusive;
    }
}
