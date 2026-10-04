package arena.entity;

/**
 * Lớp trừu tượng biểu diễn người dùng chung trong hệ thống ARENA.
 * Các loại người dùng cụ thể như {@link LeagueOwner}, {@link Player},
 * và {@link Advertiser} đều kế thừa từ lớp này.
 *
 * @author 4651050189_Nguyen Yen Nhi
 * @version 1.0
 */
public abstract class User {

    /** Tên hiển thị của người dùng. */
    private String name;

    /** Thông tin liên lạc của người dùng (email hoặc số điện thoại). */
    private String contact;

    /**
     * Khởi tạo một người dùng mới với tên và thông tin liên lạc.
     *
     * @param name    Tên người dùng, không được null
     * @param contact Thông tin liên lạc (email/SĐT), không được null
     */
    public User(String name, String contact) {
        this.name = name;
        this.contact = contact;
    }

    /**
     * Trả về tên của người dùng.
     *
     * @return Tên người dùng
     */
    public String getName() {
        return name;
    }

    /**
     * Cập nhật tên của người dùng.
     *
     * @param name Tên mới, không được null
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Trả về thông tin liên lạc của người dùng.
     *
     * @return Thông tin liên lạc (email/SĐT)
     */
    public String getContact() {
        return contact;
    }

    /**
     * Cập nhật thông tin liên lạc của người dùng.
     *
     * @param contact Thông tin liên lạc mới, không được null
     */
    public void setContact(String contact) {
        this.contact = contact;
    }
}
