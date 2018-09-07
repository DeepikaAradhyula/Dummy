package com.cg.gamescheduleappln.repo;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cg.gamescheduleappln.bean.Day;

public interface SportsRepo extends JpaRepository<Day, Integer> {
	public Day save(Day d);
	
	@Query(value = "select d from Day d where d.name=(:g)")
	 Day findByDayName(@Param(value="g")String dayName);
	
	@Query(value="select d from Day d INNER JOIN d.games g where g.name=(:ga)")
	List<Day> findByGameName(@Param(value="ga")String gameName);

}
