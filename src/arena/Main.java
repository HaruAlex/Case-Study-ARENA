package arena;

import arena.boundary.NotifyInterestGroupsForm;
import arena.boundary.RequestSponsorshipForm;
import arena.boundary.SelectExclusiveSponsorForm;
import arena.boundary.TournamentForm;
import arena.control.AnnounceTournamentControl;
import arena.entity.Advertiser;
import arena.entity.Game;
import arena.entity.InterestGroup;
import arena.entity.KnockOutStyle;
import arena.entity.League;
import arena.entity.LeagueOwner;
import arena.entity.Player;
import arena.entity.TicTacToe;
import arena.entity.TournamentStyle;

/**
 * Điểm khởi đầu của chương trình mô phỏng Use Case AnnounceTournament.
 * Kịch bản chạy theo đúng 3 Sequence Diagrams từ Chapter 5 của case study ARENA:
 * <ul>
 *   <li>Luồng 1 (Figure 5-26): Tournament Creation Workflow</li>
 *   <li>Luồng 2 (Figure 5-27): Sponsorship Workflow</li>
 *   <li>Luồng 3 (Figure 5-28): Interest Group Notification Workflow</li>
 * </ul>
 *
 * @author 4651050189_Nguyen Yen Nhi
 * @version 1.0
 */
public class Main {

    /**
     * Phương thức main — khởi chạy toàn bộ kịch bản mô phỏng.
     *
     * @param args Tham số dòng lệnh (không sử dụng)
     */
    public static void main(String[] args) {
        System.out.println("============== KHOI DONG HE THONG ARENA ==============\n");

        // 1. Khởi tạo môi trường và dữ liệu mẫu
        Game ticTacToe = new TicTacToe();
        TournamentStyle knockOut = new KnockOutStyle();
        LeagueOwner joe = new LeagueOwner("Joe", "joe@arena.com");
        League league = new League("TicTacToe Beginners League", ticTacToe, knockOut);

        // Khởi tạo các Advertiser và Interest Group trong Arena
        Advertiser nike = new Advertiser("Nike", "contact@nike.com", true);
        Advertiser adidas = new Advertiser("Adidas", "contact@adidas.com", true);
        Player alice = new Player("Alice", "alice@gmail.com");
        Player bob = new Player("Bob", "bob@gmail.com");

        InterestGroup ticTacToeFans = new InterestGroup("TicTacToe Fans");
        ticTacToeFans.addUser(alice);
        ticTacToeFans.addUser(bob);

        // ----------------------------------------------------
        // LUỒNG 1: TOURNAMENT CREATION WORKFLOW (Figure 5-26)
        // ----------------------------------------------------
        System.out.println("--- 1. LUONG TAO GIAI DAU (Tournament Creation Workflow) ---");
        TournamentForm tournamentForm = new TournamentForm();
        AnnounceTournamentControl control = tournamentForm.newTournament(league);

        // Thiết lập dữ liệu Arena ban đầu cho Control
        control.getArena().addAdvertiser(nike);
        control.getArena().addAdvertiser(adidas);
        control.getArena().addInterestGroup(ticTacToeFans);

        tournamentForm.setName("Autumn Championship 2026");
        tournamentForm.setMaxPlayers(16);
        tournamentForm.commit();

        System.out.println();

        // ----------------------------------------------------
        // LUỒNG 2: SPONSORSHIP WORKFLOW (Figure 5-27)
        // ----------------------------------------------------
        System.out.println("--- 2. LUONG TIM KIEM & CHOT TAI TRO (Sponsorship Workflow) ---");
        RequestSponsorshipForm reqSponsorForm = new RequestSponsorshipForm();
        reqSponsorForm.requestExclusiveSponsor(control);

        // LeagueOwner quyết định chọn Nike làm nhà tài trợ độc quyền
        SelectExclusiveSponsorForm selectSponsorForm = new SelectExclusiveSponsorForm();
        selectSponsorForm.selectSponsor(control, nike);

        System.out.println();

        // ----------------------------------------------------
        // LUỒNG 3: INTEREST GROUP WORKFLOW (Figure 5-28)
        // ----------------------------------------------------
        System.out.println("--- 3. LUONG THONG BAO HOAN TAT (Interest Group Workflow) ---");
        NotifyInterestGroupsForm notifyForm = new NotifyInterestGroupsForm();

        // Thông báo cho các Sponsor về kết quả chọn tài trợ
        notifyForm.notifySponsorsOfDecision(control);

        // Thông báo công bố giải đấu mới cho cộng đồng
        notifyForm.notifyInterestGroups(control);

        System.out.println("\n============== HOAN THANH UC ANNOUNCE TOURNAMENT ==============");
    }
}
