package arena.entity;

/**
 * Biểu diễn ban quản lý/chủ giải đấu (League Owner) trong hệ thống ARENA.
 * LeagueOwner kế thừa từ {@link User} và là actor chính thực hiện
 * Use Case AnnounceTournament: tạo Tournament, chọn nhà tài trợ và gửi thông báo.
 *
 * @author 4651050189_Nguyen Yen Nhi
 * @version 1.0
 */
public class LeagueOwner extends User {

    /**
     * Khởi tạo LeagueOwner với tên và thông tin liên hệ.
     *
     * @param name    Tên chủ giải đấu, không được null
     * @param contact Thông tin liên hệ (email/SĐT), không được null
     */
    public LeagueOwner(String name, String contact) {
        super(name, contact);
    }
}
