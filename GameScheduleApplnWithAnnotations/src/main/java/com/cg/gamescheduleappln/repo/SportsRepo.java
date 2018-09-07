package com.cg.gamescheduleappln.repo;

import java.util.List;

import com.cg.gamescheduleappln.bean.Day;

public interface SportsRepo {
	public Day save(Day d);
	public Day findByDayName(String dayName);
	public List<Day> findByGameName(String gameName);
	
}
