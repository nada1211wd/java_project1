import java.util.List;

public class Footballer extends Player {
    public String teamName;
    public String plan;

     // Create fun to return footballer name
    public String getTeamName(String teamName ) {
        return teamName;
    }
    // create constructor for football team class which extends from player
    Footballer(String name, String position, List<String> skills, String teamName ,String plan){
       // call constructor from super class Player
        super( name,position, skills);
         this.teamName=teamName;
         this.plan=plan;
    }


    // create method to add player to team
    public  void add_player( Player player3) {
          System.out.println(" Add player "+ player3.name);

    }
    // create method to remove player from team
    public  void remove_player(Player player3) {
        System.out.println(" remove "+ player3.name);
    }
    public  void change_plan(String Newplan){
        System.out.println( " the new plan" + " " + Newplan);

    }






}
