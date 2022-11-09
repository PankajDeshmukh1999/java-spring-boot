package retraining.collection;

public class Player {

	private int playerId;
	private String playerName;

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public Player(int playerId, String playerName) {
		super();
		this.playerId = playerId;
		this.playerName = playerName;
	}

	public Player() {

	}

	@Override
	public String toString() {
		return "player id=" +playerId+ " player name=" + playerName;
	}

}
