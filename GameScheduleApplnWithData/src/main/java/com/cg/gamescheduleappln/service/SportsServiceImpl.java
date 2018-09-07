package com.cg.gamescheduleappln.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.gamescheduleappln.bean.Day;
import com.cg.gamescheduleappln.repo.SportsRepo;

@Service(value="service")
public class SportsServiceImpl implements SportsService {
	
	@Autowired
	private SportsRepo repo;
	
	@Transactional
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

	





}
