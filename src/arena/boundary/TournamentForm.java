package arena.boundary;

import arena.control.AnnounceTournamentControl;
import arena.entity.League;

/**
 * Boundary Object — form nhập liệu để khởi tạo và thiết lập thông tin Tournament.
 * LeagueOwner tương tác với form này để nhập tên giải, số người chơi và xác nhận tạo.
 * Sau khi {@link #commit()} được gọi, yêu cầu được chuyển tiếp tới
 * {@link AnnounceTournamentControl} để xử lý logic nghiệp vụ.
 *
 * @author 4651050189_Nguyen Yen Nhi
 * @version 1.0
 */
public class TournamentForm {

    /** Control Object điều phối luồng tạo Tournament. */
    private AnnounceTournamentControl control;

    /** Tên Tournament sẽ được tạo. */
    private String name;

    /** Số người chơi tối đa của Tournament. */
    private int maxPlayers;

    /**
     * Bắt đầu luồng tạo Tournament mới với một League cho trước.
     * Tạo một {@link AnnounceTournamentControl} mới và gắn nó với League.
     *
     * @param league Giải đấu đang tạo Tournament, không được null
     * @return Đối tượng Control điều khiển luồng xử lý tiếp theo
     */
    public AnnounceTournamentControl newTournament(League league) {
        System.out.println("[Boundary: TournamentForm] LeagueOwner mo form tao Tournament moi.");
        this.control = new AnnounceTournamentControl(league);
        return this.control;
    }

    /**
     * Gán tên cho Tournament sắp được tạo.
     *
     * @param name Tên Tournament, không được null hoặc rỗng
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gán số lượng người chơi tối đa cho Tournament sắp được tạo.
     *
     * @param maxPlayers Số người chơi tối đa, phải lớn hơn 0
     */
    public void setMaxPlayers(int maxPlayers) {
        this.maxPlayers = maxPlayers;
    }

    /**
     * Xác nhận form và gửi yêu cầu tạo Tournament đến Control Object.
     * Phải gọi {@link #setName(String)} và {@link #setMaxPlayers(int)} trước khi commit.
     */
    public void commit() {
        System.out.println("[Boundary: TournamentForm] LeagueOwner nhan Commit form.");
        control.createTournament(name, maxPlayers);
    }
}
