
public class Application {

	/**
	 * This is the Application object that will launch our application
	 * @author Rob Kelley
	 * @version 1.3
	 * Lab1 
	 * CS131ON
	 */
		public static void main(String[] args) {
			
			NonPlayerCharacter npc1 = new NonPlayerCharacter();
			//Uncomment the line below to ensure reportStructure() method works after you have written it.
			System.out.println(npc1.reportStructure());
			System.out.println(npc1.introduce());
			System.out.println(npc1.exclaim()+ "\n");
			
			NonPlayerCharacter npc2 = new NonPlayerCharacter("515", "NEUTRAL", true, "AVERAGE" );
			System.out.println(npc2.reportStructure());
			System.out.println(npc2.introduce());
			System.out.println(npc2.exclaim() + "\n");
			
			
			
			BasketballTeam B1 = new BasketballTeam();
			System.out.println(B1.toString());
					
			BasketballTeam B2 = new BasketballTeam(" Louisville Labs"," Hank the Chocolate Lab", " Zac Sells" );
			System.out.println(B2.toString() + "\n");
			B2.setStats(25, 10, 500, 1500, 200, 250);
			B2.getStats();
			
			B2.setWins(25);
			B2.setLosses(10);
			B2.setFieldGoals(500);
			B2.setFieldGoalsAttempted(1500);
			B2.setFreeThrows(200);
			B2.setFreeThrowsAttempted(250);
			
			System.out.println(("\n" + B2.getWinPercentage() * 100));
			System.out.println((B2.fieldGoalPercentage() * 100));
			System.out.println((B2.freeThrowPercentage() * 100));
		
		
			
		}//end main

	}//end class




