package arena.entity;

/**
 * Lớp trừu tượng biểu diễn thể thức thi đấu của Tournament.
 * Các thể thức cụ thể (ví dụ: {@link KnockOutStyle}) phải kế thừa lớp này
 * và cung cấp tên thể thức qua constructor.
 *
 * @author 4651050189_Nguyen Yen Nhi
 * @version 1.0
 */
public abstract class TournamentStyle {

    /** Tên của thể thức thi đấu. */
    private String styleName;

    /**
     * Khởi tạo TournamentStyle với tên thể thức cho trước.
     *
     * @param styleName Tên thể thức thi đấu, không được null hoặc rỗng
     */
    public TournamentStyle(String styleName) {
        this.styleName = styleName;
    }

    /**
     * Trả về tên của thể thức thi đấu.
     *
     * @return Tên thể thức
     */
    public String getStyleName() {
        return styleName;
    }
}
