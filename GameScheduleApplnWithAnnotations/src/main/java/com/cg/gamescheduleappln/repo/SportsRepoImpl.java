package com.cg.gamescheduleappln.repo;

import java.util.ArrayList;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.cg.gamescheduleappln.bean.Day;
import com.cg.gamescheduleappln.bean.Game;
@Repository
public class SportsRepoImpl implements SportsRepo {
	@Resource(name="maps")
	private Map<String,Day> data;
	public SportsRepoImpl(Map<String, Day> data) {
		this.data=data;
	}
	
	
	
	
	@Override
	public List<Day> findByGameName(String gameName) {
		List<Day> dayList = new ArrayList<Day>();
		for (Day day : data.values()) {
			List<Game> list = day.getGames();
			for (Game game : list) {
				if(game.getName().equals(gameName)){
					dayList.add(day);
				}
			}
		}
		return dayList;
	}




	@Override
	public Day findByDayName(String dayName) {
		if(!data.containsKey(dayName)){
			System.out.println("does not exists");
			
		}
		return data.get(dayName);
	}




	@Override
	public Day save(Day d) {
		data.put(d.getName(),d);
		return d;
	}
	
	
	

	
	
	
}
