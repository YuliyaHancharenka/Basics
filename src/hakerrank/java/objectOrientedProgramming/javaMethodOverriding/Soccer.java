package hakerrank.java.objectOrientedProgramming.javaMethodOverriding;


public class Soccer extends Sports {

    @Override
    String getName() {
        return "Soccer Class";
    }

    public void getNumberOfTeamMembers() {
        System.out.println( "Each team has 11 players in " + getName() );
    }
}
