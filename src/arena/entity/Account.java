package arena.entity;

/**
 * Tài khoản tài chính của nhà quảng cáo (Advertiser), dùng để quản lý
 * số dư và xử lý chi phí tài trợ trong hệ thống ARENA.
 *
 * @author 4651050189_Nguyen Yen Nhi
 * @version 1.0
 */
public class Account {

    /** Số dư hiện tại của tài khoản (đơn vị: USD). */
    private double balance;

    /**
     * Khởi tạo tài khoản với số dư mặc định giả lập ban đầu là 1000.0$.
     */
    public Account() {
        this.balance = 1000.0;
    }

    /**
     * Trừ tiền từ tài khoản nhà quảng cáo khi xác nhận tài trợ.
     *
     * @param amount Số tiền cần trừ (đơn vị: USD), phải lớn hơn 0
     */
    public void charge(double amount) {
        this.balance -= amount;
        System.out.println("[Account] Da tru " + amount + "$ tu tai khoan. So du con lai: " + balance + "$");
    }

    /**
     * Trả về số dư hiện tại của tài khoản.
     *
     * @return Số dư còn lại (đơn vị: USD)
     */
    public double getBalance() {
        return balance;
    }
}
