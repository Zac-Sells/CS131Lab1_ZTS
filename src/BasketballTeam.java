
public class BasketballTeam extends SportsTeam {

	private int fieldGoals;
	private int fieldGoalsAttempted;
	private int freeThrows;
	private int freeThrowsAttempted;
	double[] Stats= new double [6];
	
	public BasketballTeam()
	{
	super();
	this.fieldGoals = 0;
	this.fieldGoalsAttempted = 0;
	this.freeThrows = 0;
	this.freeThrowsAttempted = 0;
	}
	
	public BasketballTeam(String teamName, String teamMascot, String headCoach)
	{
	
		super(teamName, teamMascot, headCoach);
		this.wins = 0;
		this.losses = 0;
		this.fieldGoals = 0;
		this.fieldGoalsAttempted = 0;
		this.freeThrows = 0;
		this.freeThrowsAttempted = 0;
	}

	public double fieldGoalPercentage()
	{
		return (double)fieldGoals/(double)fieldGoalsAttempted;
	}
	
	public double freeThrowPercentage()
	{
		return (double)freeThrows/(double)freeThrowsAttempted;
	}
	public void setStats (int wins, int losses, int fieldGoals, int fieldGoalsAttempted, int freeThrows, int freeThrowsAttempted) 
	{
		Stats [0] = (double) wins;
		Stats [1] = (double) losses;
		Stats [2] = (double) fieldGoals;
		Stats [3] = (double) fieldGoalsAttempted;
		Stats [4] = (double) freeThrows;
		Stats [5] = (double) freeThrowsAttempted;
	
	}
	
	
	public int getFieldGoals() {
		return fieldGoals;
	}

	public void setFieldGoals(int fieldGoals) {
		this.fieldGoals = fieldGoals;
	}

	public int getFieldGoalsAttempted() {
		return fieldGoalsAttempted;
	}

	public void setFieldGoalsAttempted(int fieldGoalsAttempted) {
		this.fieldGoalsAttempted = fieldGoalsAttempted;
	}

	public int getFreeThrows() {
		return freeThrows;
	}

	public void setFreeThrows(int freeThrows) {
		this.freeThrows = freeThrows;
	}

	public int getFreeThrowsAttempted() {
		return freeThrowsAttempted;
	}

	public void setFreeThrowsAttempted(int freeThrowsAttempted) {
		this.freeThrowsAttempted = freeThrowsAttempted;
	}

	@Override
	public String toString() {
		return  "teamName =" + teamName 
				+ ", teamMascot =" + teamMascot 
				+ ", HeadCoach =" + HeadCoach;
	}

	@Override
	public double [] getStats() {
		for(int i=0;i<Stats.length;i++) 
		System.out.println(Stats[i]);
		return Stats;
	}
	
	
		
}