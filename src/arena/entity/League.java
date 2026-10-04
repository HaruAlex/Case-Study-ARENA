package arena.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Biểu diễn một League (Giải đấu) chứa nhiều Tournament.
 * League gắn với một trò chơi ({@link Game}) và một thể thức thi đấu
 * ({@link TournamentStyle}), đồng thời quản lý danh sách các Tournament thuộc về nó.
 *
 * @author 4651050189_Nguyen Yen Nhi
 * @version 1.0
 */
public class League {

    /** Tên của League. */
    private String name;

    /** Trò chơi mà League này tổ chức thi đấu. */
    private Game game;

    /** Thể thức thi đấu áp dụng cho các Tournament trong League. */
    private TournamentStyle style;

    /** Danh sách các Tournament đã được tạo trong League. */
    private List<Tournament> tournaments;

    /**
     * Khởi tạo League với tên, trò chơi và thể thức thi đấu cho trước.
     *
     * @param name  Tên League, không được null
     * @param game  Trò chơi áp dụng, không được null
     * @param style Thể thức thi đấu, không được null
     */
    public League(String name, Game game, TournamentStyle style) {
        this.name = name;
        this.game = game;
        this.style = style;
        this.tournaments = new ArrayList<>();
    }

    /**
     * Tạo một Tournament mới và thêm vào danh sách quản lý của League.
     *
     * @param name       Tên Tournament, không được null
     * @param maxPlayers Số lượng người chơi tối đa, phải lớn hơn 0
     * @return Đối tượng {@link Tournament} vừa được tạo
     */
    public Tournament createTournament(String name, int maxPlayers) {
        Tournament t = new Tournament(name, maxPlayers);
        this.tournaments.add(t);
        return t;
    }

    /**
     * Trả về tên của League.
     *
     * @return Tên League
     */
    public String getName() {
        return name;
    }

    /**
     * Trả về danh sách tất cả Tournament thuộc League này.
     *
     * @return Danh sách {@link Tournament} đã được tạo
     */
    public List<Tournament> getTournaments() {
        return tournaments;
    }
}
