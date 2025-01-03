import java.util.List;

// make public class player
public class Player implements IPerson {
   public String name;
   public String position;
   public List<String> skills ;
   private int goalsscored;
   private int matchesplayd;
   private int totalscored;

    public int getTotalscored() {
        return totalscored;
    }

    public void setTotalscored(int totalscored) {
        this.totalscored = totalscored;
    }





    // create set and get function for private attributes
    public int getGoalsscored() {
        return goalsscored;
    }

    public void setGoalsscored(int goalsscored) {
        this.goalsscored = goalsscored;
    }

    public int getMatchesplayd() {
        return matchesplayd;
    }

    public void setMatchesplayd(int matchesplayd) {
        this.matchesplayd = matchesplayd;
    }



    // contractor for class player
    public Player(String name, String position, List<String> skills ) {
        this.name=name;
        this.position=position;
        this.skills=skills;

    }


 // overload update methods to change player position
   public void Update_position(String newposition){
      System.out.println(name+ " "+ "update to "+ newposition);

   }
    // overload update methods to change player position
    public void Update_position( String name ,String newposition){
        System.out.println(name+ " "+ "update to "+ newposition);

    }
     // create improve skill methods to add new sill for player
     public void improveskill( String newskill){
         skills.add("shooting");
         skills.add("passing");
         // check if skill list contain new skill
          if (skills.contains(newskill)) {
              System.out.println("Skill already exists.");
          }
          else{
              System.out.println(name+ " "+ " add new skill"+(newskill) );}
     }
     // create methods to calculate performances scored
    public int calculate_performance(int goalsscored, int matchesplayd ,int totalscored){
        return  (goalsscored * 4) + matchesplayd /totalscored;
    };


    // Override methods from interface Person

    @Override
    public String get_name( ) {
        return name;
    }

    @Override
    public String get_role() {
        return "Player";
    }


}

