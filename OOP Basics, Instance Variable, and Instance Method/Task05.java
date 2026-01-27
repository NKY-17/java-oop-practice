/*
Write the code in java for the “Tournament” class. The tester class and the output is given below:

Tester class:
public class Tester5{
  public static void main(String [] args){
    Tournament asiaCup = new Tournament();
    System.out.println(asiaCup.name+" "+ asiaCup.sportsType+" "+asiaCup.numberOfTeams+" "+asiaCup.teams);
    System.out.println("**************");
    asiaCup.name="Asia Cup";
    asiaCup.sportsType="Cricket";
    asiaCup.numberOfTeams=4;
    asiaCup.teams = new String[] {"BD","IND","PAK","SL"};
    System.out.printf("%s %s Tournament is played between %d teams\n",asiaCup.name, asiaCup.sportsType, asiaCup.numberOfTeams);
    System.out.println("The teams are:");
    for(int i=0; i<asiaCup.teams.length; i++){
        System.out.println(asiaCup.teams[i]);
    }
  }
}
Output:
null null 0 null
**************
Asia Cup Cricket Tournament is played between 4 teams
The teams are:
BD
IND
PAK
SL
*/

//code:
public class Tournament{
  public String name;
   public String sportsType;
    public int numberOfTeams;
     public String []teams;
}


public class Tester5{
  public static void main(String [] args){
    Tournament asiaCup = new Tournament();
    System.out.println(asiaCup.name+" "+ asiaCup.sportsType+" "+asiaCup.numberOfTeams+" "+asiaCup.teams);
    System.out.println("**************");
    asiaCup.name="Asia Cup";
    asiaCup.sportsType="Cricket";
    asiaCup.numberOfTeams=4;
    asiaCup.teams = new String[] {"BD","IND","PAK","SL"};
    System.out.printf("%s %s Tournament is played between %d teams\n",asiaCup.name, asiaCup.sportsType, asiaCup.numberOfTeams);
    System.out.println("The teams are:");
    for(int i=0; i<asiaCup.teams.length; i++){
        System.out.println(asiaCup.teams[i]);
    }
  }
}
