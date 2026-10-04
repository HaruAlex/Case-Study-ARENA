package arena.entity;

/**
 * Biểu diễn người chơi (Player) trong hệ thống ARENA.
 * Player kế thừa từ {@link User} và là đối tượng nhận thông báo
 * khi có Tournament mới được công bố thông qua InterestGroup.
 *
 * @author 4651050189_Nguyen Yen Nhi
 * @version 1.0
 */
public class Player extends User {

    /**
     * Khởi tạo Player với tên và thông tin liên hệ.
     *
     * @param name    Tên người chơi, không được null
     * @param contact Thông tin liên hệ (email/SĐT), không được null
     */
    public Player(String name, String contact) {
        super(name, contact);
    }
}
