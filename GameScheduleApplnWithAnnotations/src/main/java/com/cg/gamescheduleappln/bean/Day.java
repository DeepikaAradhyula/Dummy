package com.cg.gamescheduleappln.bean;

import java.util.List;

public class Day {
	private String name;
	private List<Game> games;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Game> getGames() {
		return games;
	}
	public void setGames(List<Game> games) {
		this.games = games;
	}
	
}
