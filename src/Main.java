import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> skills = new ArrayList<>();
        // create instance from class player
        Player player1=new Player("Mo Salah","right wing",skills);
        player1.improveskill(" attacking");
        player1.Update_position("left wing");
        // call two private attribute goalscorer ,matches played
        player1.setGoalsscored(10);
        player1.setMatchesplayd(5);
        player1.setTotalscored(0);

        // handle try catch in main class to catch error
        try {
            System.out.println(  "the player1 performance "+player1.calculate_performance(player1.getGoalsscored(),
                    player1.getMatchesplayd(),player1.getTotalscored()));
        }catch (ArithmeticException e){
            {
                System.out.println("Exception caught: " + e.getMessage());
            }
        }

        System.out.println(player1.get_name());
        System.out.println(player1.get_role());
        // create instance from class coach
        Coach coach1=new Coach("Jürgen Kl opp","trainer",skills,"liverpool","High Pressing");
        coach1.Analzeperfome();
        System.out.println(coach1.get_name());
        System.out.println( coach1.get_role());
        // create instance from class footballer
        Footballer team=new Footballer("liver pool","central",skills,"liver pool" ,"High Pressing");
        Player player3=new Player("Virgil van Disk","left wing",skills);
        System.out.println(team.getTeamName("liver pool"));
        team.remove_player(player1);
        team.change_plan("attacking");

}
}


