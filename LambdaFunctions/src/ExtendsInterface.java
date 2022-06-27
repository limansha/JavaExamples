//a class can extend only one other class, an interface can extend any number of interfaces.
interface Sports {
   public void setHomeTeam(String name);
   public void setVisitingTeam(String name);
}

// Filename: Football.java
interface Football extends Sports {
   public void homeTeamScored(int points);
   public void visitingTeamScored(int points);
   public void endOfQuarter(int quarter);
}

// Filename: Hockey.java
interface Hockey extends Sports {
   public void homeGoalScored();
   public void visitingGoalScored();
   public void endOfPeriod(int period);
   public void overtimePeriod(int ot);
}
class Team implements Football{

	@Override
	public void setHomeTeam(String name) {
		System.out.println("home team is "+name);
	}

	@Override
	public void setVisitingTeam(String name) {

		System.out.println("visiting team is "+name);
	}

	@Override
	public void homeTeamScored(int points) {

		System.out.println("home team scored "+points);
	}

	@Override
	public void visitingTeamScored(int points) {

		System.out.println("visiting team scored "+points);
	}

	@Override
	public void endOfQuarter(int quarter) {

		System.out.println("end of Quarter "+quarter);
	}
	
}
public class ExtendsInterface {

	public static void main(String[] args) {
	Football fb = new Team();
	fb.endOfQuarter(1);
	fb.setHomeTeam("Rangers");
	fb.setVisitingTeam("Avengers");
	fb.homeTeamScored(100);
	fb.visitingTeamScored(150);
	}

}
