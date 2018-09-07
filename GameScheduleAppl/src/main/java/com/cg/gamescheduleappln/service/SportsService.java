package com.cg.gamescheduleappln.service;

import java.util.List;

import com.cg.gamescheduleappln.bean.Day;
import com.cg.gamescheduleappln.repo.SportsRepo;

public interface SportsService {
	public Day addDay(Day d);
	public Day findByDay(String dayName);
	public List<Day> findByGame(String gameName);
	public void setRepo(SportsRepo repo);

}
