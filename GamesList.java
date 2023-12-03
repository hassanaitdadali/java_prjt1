package projet1;

import java.util.ArrayList;
import java.util.List;

public class GamesList {
	private List<Games> gamesList;

	public GamesList() {
		this.gamesList = new ArrayList<>();
	}
	
	public void AlimenterList(List<Games> games) {
	    this.gamesList.addAll(games);
	}
	
	
	
	
}
