package cfbhcStatParser;

import java.util.ArrayList;

/*
 * This class sets up the team object which will be used to store the data relating to each teams season
 * The data can then be pulled out using getter methods for printing 
 */

public class Team {
	
	private String name;
	private int gamesWon = 0;
	private int gamesLost = 0;
	private int pointsScored;
	private int pointsAgainst;
	private ArrayList<Double> oLineRating;
	private double avgOlineRating;
	private int turnovers;
	private int thirdDownAtt;
	private int thirdDownComp;
	private int fourthDownComp;
	private int fourthDownAtt;
	private int penalties;
	private int penYards;
	private int kickReturnYards;
	private int puntReturnYards;
	
	// Sets name of team object
	private void setName(String name) {
		this.name = name;
	}
	
	private String getName() {
		return this.name;
	}
	
	private int getWins() {
		return this.gamesWon;
	}
	
	private int getLosses() {
		return this.gamesLost;
	}
	
	private void updateWinsAndLosses(Boolean win) {
		if(win) {
			this.gamesWon = gamesWon+1;
		}else {
			this.gamesLost = gamesLost+1;
		}
	}

	private int getPointsScored() {
		return this.pointsScored;
	}
	
	private int getPointsAgainst() {
		return this.pointsScored;
	}
	
	private void updatePointsScored(int scoredThisWeek) {
		this.pointsScored = this.pointsScored + scoredThisWeek;
	}
	
	private void updatePointsAgainst(int AgainstThisWeek) {
		this.pointsScored = this.pointsAgainst + AgainstThisWeek;
	}
	
	private Double getOlineRating() {
		return this.avgOlineRating;
	}
	
	private void addOlineRating(Double rating) {
		this.oLineRating.add(rating);
	}
	
	private void calcOlineRating() {
		Double totalRat = 0.0;
		for(Double x : this.oLineRating) {
			totalRat = totalRat + x;
		}
		this.avgOlineRating = totalRat / oLineRating.size();
	}
	
	private int getTurnovers() {
		return this.turnovers;
	}
	
	private void updateTurnovers(int weeklyTurnovers) {
		this.pointsScored = this.turnovers + weeklyTurnovers;
	}
	

}
