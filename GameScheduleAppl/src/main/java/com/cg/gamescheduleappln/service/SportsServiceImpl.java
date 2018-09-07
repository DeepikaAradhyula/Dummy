package com.cg.gamescheduleappln.service;

import java.util.List;


import com.cg.gamescheduleappln.bean.Day;
import com.cg.gamescheduleappln.repo.SportsRepo;

public class SportsServiceImpl implements SportsService {
	SportsRepo repo;

	
	

	
	public SportsServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public Day addDay(Day d) {
		// TODO Auto-generated method stub
				return repo.save(d);
	}

	@Override
	public Day findByDay(String dayName) {
		return repo.findByDayName(dayName);
	}



	@Override
	public List<Day> findByGame(String gameName) {
		return repo.findByGameName(gameName);
	}

	@Override
	public void setRepo(SportsRepo repo) {
		// TODO Auto-generated method stub
		this.repo=repo;
		
	}





}
