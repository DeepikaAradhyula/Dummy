package com.cg.gamescheduleappln.service;




import java.util.List;

import com.cg.gamescheduleappln.bean.Day;


public interface SportsService {
	public Day addDay(Day d);
	public Day findByDay(String dayName);
	public List<Day> findByGame(String gameName);
	//public void setRepo(SportsRepo repo);

}
