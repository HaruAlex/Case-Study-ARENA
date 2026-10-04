package arena.entity;

/**
 * Thể thức thi đấu loại trực tiếp (KnockOut) — người thua bị loại ngay lập tức.
 * Đây là một trong các thể thức thi đấu cụ thể kế thừa từ {@link TournamentStyle}.
 * KnockOut phù hợp khi cần xác định nhanh nhà vô địch qua từng vòng đấu.
 *
 * @author 4651050189_Nguyen Yen Nhi
 * @version 1.0
 */
public class KnockOutStyle extends TournamentStyle {

    /**
     * Khởi tạo KnockOutStyle với tên thể thức là "KnockOut".
     */
    public KnockOutStyle() {
        super("KnockOut");
    }
}
