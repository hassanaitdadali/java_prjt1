package projet1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class GamesTable {
	private Games[] gamesTable=new Games[4];

	public GamesTable(Games[] gamesTable) {
		super();
		this.gamesTable = gamesTable;
	}
	
	public void trier(Comparator<Games> T) {
		Arrays.sort(gamesTable,T);
	}
	public void ajouteGame(Games g) {
		gamesTable = Arrays.copyOf(gamesTable, gamesTable.length+1);
		gamesTable[gamesTable.length-1]=g;
	}
	public boolean supprimerGame(Games g){
		ArrayList<Games> list=new ArrayList<Games>(Arrays.asList(gamesTable));
		boolean b = list.remove(g);
		gamesTable=list.toArray(new Games[list.size()]);
		return b;
	}
	public int nombreGames() {
		return gamesTable.length;
	}
	public void inverser() {
		ArrayList<Games> list=new ArrayList<Games>(Arrays.asList(gamesTable));
		Collections.reverse(list);
		gamesTable=list.toArray(new Games[list.size()]);
	}
	
	public void AffichElementTab() {
		for (int i = 0; i < this.gamesTable.length; i++) {
		    System.out.println(this.gamesTable[i]);
		  }
	}
	
	public Games max() {
	    if (this.gamesTable.length == 0) {
	        return null;
	    } else {
	        Games max = this.gamesTable[0];
	        for (int i = 1; i < this.gamesTable.length; i++) {
	            if (this.gamesTable[i].compareTo(max) > 0) {
	                max = this.gamesTable[i];
	            }
	        }
	        return max;
	    }
	}
	
	public boolean equals(GamesTable other){
	    return Arrays.equals(this.gamesTable, other.gamesTable);
	}
	
	
	
	
	



}
