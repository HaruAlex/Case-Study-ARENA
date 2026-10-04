package arena.entity;

/**
 * Biểu diễn một Tournament (Giải đấu thi đấu cụ thể) trong hệ thống ARENA.
 * Tournament thuộc về một {@link League}, có giới hạn số người chơi và
 * có thể gắn với một nhà tài trợ độc quyền ({@link Advertiser}).
 *
 * @author 4651050189_Nguyen Yen Nhi
 * @version 1.0
 */
public class Tournament {

    /** Tên của Tournament. */
    private String name;

    /** Số lượng người chơi tối đa được phép tham gia. */
    private int maxPlayers;

    /** Nhà tài trợ độc quyền của Tournament (có thể null nếu chưa chọn). */
    private Advertiser exclusiveSponsor;

    /**
     * Khởi tạo Tournament với tên và giới hạn số người chơi.
     *
     * @param name       Tên giải đấu, không được null
     * @param maxPlayers Số người chơi tối đa, phải lớn hơn 0
     */
    public Tournament(String name, int maxPlayers) {
        this.name = name;
        this.maxPlayers = maxPlayers;
    }

    /**
     * Trả về tên của Tournament.
     *
     * @return Tên giải đấu
     */
    public String getName() {
        return name;
    }

    /**
     * Trả về số lượng người chơi tối đa của Tournament.
     *
     * @return Số người chơi tối đa
     */
    public int getMaxPlayers() {
        return maxPlayers;
    }

    /**
     * Trả về nhà tài trợ độc quyền hiện tại của Tournament.
     *
     * @return Đối tượng {@link Advertiser} tài trợ, hoặc {@code null} nếu chưa có
     */
    public Advertiser getExclusiveSponsor() {
        return exclusiveSponsor;
    }

    /**
     * Gán nhà tài trợ độc quyền cho Tournament.
     *
     * @param exclusiveSponsor Đối tượng {@link Advertiser} được chọn làm nhà tài trợ
     */
    public void setExclusiveSponsor(Advertiser exclusiveSponsor) {
        this.exclusiveSponsor = exclusiveSponsor;
    }
}
