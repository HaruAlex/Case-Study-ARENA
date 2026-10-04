package arena.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Nhóm người dùng quan tâm đến một League hoặc Game cụ thể.
 * InterestGroup được dùng để gửi thông báo hàng loạt khi có Tournament mới
 * được công bố trong hệ thống ARENA.
 *
 * @author 4651050189_Nguyen Yen Nhi
 * @version 1.0
 */
public class InterestGroup {

    /** Tên định danh của nhóm quan tâm. */
    private String groupName;

    /** Danh sách người dùng thuộc nhóm này. */
    private List<User> users;

    /**
     * Khởi tạo InterestGroup với tên cho trước và danh sách thành viên rỗng.
     *
     * @param groupName Tên nhóm quan tâm, không được null
     */
    public InterestGroup(String groupName) {
        this.groupName = groupName;
        this.users = new ArrayList<>();
    }

    /**
     * Thêm một người dùng vào nhóm quan tâm.
     *
     * @param user Đối tượng {@link User} cần thêm, không được null
     */
    public void addUser(User user) {
        this.users.add(user);
    }

    /**
     * Trả về tên của nhóm quan tâm.
     *
     * @return Tên nhóm
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * Trả về danh sách tất cả người dùng trong nhóm quan tâm.
     *
     * @return Danh sách {@link User} thuộc nhóm
     */
    public List<User> getUsers() {
        return users;
    }
}
