package com.cg.gamescheduleappln.bean;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;

import javax.persistence.Id;

@Entity
public class Game {
	@Id @GeneratedValue
	private int id;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Game: " + name;
	}

	
	
	
}
