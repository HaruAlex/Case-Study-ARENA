package arena.entity;

/**
 * Lớp trừu tượng biểu diễn một trò chơi trên hệ thống ARENA.
 * Các trò chơi cụ thể (ví dụ: {@link TicTacToe}) phải kế thừa lớp này
 * và cung cấp tên trò chơi thông qua constructor.
 *
 * @author 4651050189_Nguyen Yen Nhi
 * @version 1.0
 */
public abstract class Game {

    /** Tên của trò chơi. */
    private String name;

    /**
     * Khởi tạo Game với tên cho trước.
     *
     * @param name Tên của trò chơi, không được null hoặc rỗng
     */
    public Game(String name) {
        this.name = name;
    }

    /**
     * Trả về tên của trò chơi.
     *
     * @return Tên trò chơi
     */
    public String getName() {
        return name;
    }
}
