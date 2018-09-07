package com.cg.gamescheduleappln.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;

import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Day {
	@Id @GeneratedValue
	private int id;
	private String name;
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
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
	@Override
	public String toString() {
		return "Day [id=" + id + ", name=" + name + ", games=" + games + "]";
	}
	
	
}
