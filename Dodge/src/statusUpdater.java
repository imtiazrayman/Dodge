import java.awt.*;

public class statusUpdater {
	
	// this class will create a status update of what the user selects based on their own preferences.
	public String PlayerMode = "";
	public String DifficultyMode = "";
	public String statusString = "";
	
	public String statusUpdater() {
		if(Game.difficulty == gameDifficultyId.NORMAL) {
			DifficultyMode = "NORMAL";
		}
		if(Game.difficulty == gameDifficultyId.HARD) {
			DifficultyMode = "HARD";
		}
		if(Game.difficulty == gameDifficultyId.INSANE) {
			DifficultyMode = "INSANE";
		}
		
		if(Game.playersInGame == playerCount.SINGLEPLAYER) {
			PlayerMode = "SINGLE-PLAYER";
			
		}
		if(Game.playersInGame == playerCount.MULTIPLAYER) {
			PlayerMode = "MULTIPLAYER";
			Game.playersInGame = playerCount.MULTIPLAYER;
		}
		
		
		statusString = PlayerMode + "\n" +  DifficultyMode;
	
		return statusString;
		
	}
	
	
	
	
	
	
}
