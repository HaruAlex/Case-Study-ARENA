package arena.boundary;

import arena.entity.User;

/**
 * Boundary Object — gửi thông báo về Tournament mới đến từng người dùng
 * trong một InterestGroup.
 * Trong thực tế, đây sẽ là kênh gửi email hoặc push notification tới người chơi.
 *
 * @author 4651050189_Nguyen Yen Nhi
 * @version 1.0
 */
public class InterestGroupNotice {

    /**
     * Gửi thông báo Tournament mới tới một người dùng cụ thể.
     *
     * @param user           Người dùng nhận thông báo, không được null
     * @param tournamentName Tên Tournament vừa được công bố
     */
    public void notifyPlayer(User user, String tournamentName) {
        System.out.println("[Boundary: InterestGroupNotice] Gui Email/Notice giai dau ["
                + tournamentName + "] toi User: " + user.getName());
    }
}
