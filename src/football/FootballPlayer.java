package football;

public class FootballPlayer {
	private String playerName;
	private String playerTeam;
	private int playerBackNumber;
	
	public FootballPlayer() {
	
	}
	
	public FootballPlayer(String productName, String productCategory, int productCount) {
		this.playerName = productName;
		this.playerTeam = productCategory;
		this.playerBackNumber = productCount;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public String getPlayerTeam() {
		return playerTeam;
	}

	public void setPlayerTeam(String playerTeam) {
		this.playerTeam = playerTeam;
	}

	public int getPlayerBackNumber() {
		return playerBackNumber;
	}

	public void setPlayerBackNumber(int playerBackNumber) {
		this.playerBackNumber = playerBackNumber;
	}
	
}
