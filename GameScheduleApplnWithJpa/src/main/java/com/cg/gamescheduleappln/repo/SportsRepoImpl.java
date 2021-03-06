package com.cg.gamescheduleappln.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.cg.gamescheduleappln.bean.Day;

public class SportsRepoImpl implements SportsRepo {
protected EntityManager em;
	
	public SportsRepoImpl(EntityManager em){
		this.em=em;
	}

	@Override
	public Day save(Day d) {
		// TODO Auto-generated method stub
		em.getTransaction().begin();
		em.merge(d);
		em.getTransaction().commit();
		return d;
	}

	@Override
	public Day findByDayName(String dayName) {
		// TODO Auto-generated method stub
		TypedQuery<Day> query=em.createQuery("select d from Day d where d.name=:f",Day.class);
		query.setParameter("f", dayName);
		return query.getSingleResult();
	}

		@Override
	public List<Day> findByGameName(String gameName) {
		// TODO Auto-generated method stub
			TypedQuery<Day> query=em.createQuery("select d from Day d INNER JOIN d.games g where g.name=:g",Day.class);
			query.setParameter("g", gameName);
		return query.getResultList();
	}

}
