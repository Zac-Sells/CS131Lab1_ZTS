public abstract class SportsTeam {

	protected String teamName;
	protected String teamMascot;
	protected String HeadCoach;
	protected int wins;
	protected int losses;
	
	public SportsTeam() 
	{
	this.teamName = "";
	this.teamMascot = "";
	this.HeadCoach = "";
	this.wins = 0;
	this.losses = 0;
	}
	
	public SportsTeam(String teamName, String teamMascot, String headCoach)
	{
		setTeamName(teamName);
		setTeamMascot(teamMascot);
		setHeadCoach(headCoach);
		this.wins = 0;
		this.losses = 0;
	}
	
	public double getWinPercentage() 
	{
		return (double)(wins/((double)wins+(double)losses));
	}
	
	public abstract double [] getStats();

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getTeamMascot() {
		return teamMascot;
	}

	public void setTeamMascot(String teamMascot) {
		this.teamMascot = teamMascot;
	}

	public String getHeadCoach() {
		return HeadCoach;
	}

	public void setHeadCoach(String headCoach) {
		HeadCoach = headCoach;
	}

	public int getWins() {
		return wins;
	}

	public void setWins(int wins) {
		this.wins = wins;
	}

	public int getLosses() {
		return losses;
	}

	public void setLosses(int losses) {
		this.losses = losses;
	}

	
	
}