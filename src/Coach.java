import java.util.List;

public class Coach  extends Footballer implements IPerson{
        public String name;
        public String Strategy;


    // create contractor for class coach
    public Coach(String name, String position, List<String> skills,
                  String teamName,String plan){
        super(name,position,skills,teamName,plan);
        this.name=name;
        this.Strategy=Strategy;


    }

    // create method to analyze performance
    public void Analzeperfome() {
        System.out.println("Coach " + name + " is planning the " +
                Strategy + " strategy for the team: " + getTeamName("liver pool"));
    }

    // Override methods from interface Person
    @Override
    public String get_name() {
        return name;
    }

    @Override
    public String get_role() {
        return "Coach";
    }
}
