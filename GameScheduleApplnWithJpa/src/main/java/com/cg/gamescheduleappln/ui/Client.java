package com.cg.gamescheduleappln.ui;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.gamescheduleappln.bean.Day;
import com.cg.gamescheduleappln.bean.Game;
import com.cg.gamescheduleappln.repo.SportsRepo;
import com.cg.gamescheduleappln.repo.SportsRepoImpl;
import com.cg.gamescheduleappln.service.SportsService;
import com.cg.gamescheduleappln.service.SportsServiceImpl;






public class Client {
	
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
		
		EntityManager em = emf.createEntityManager();
		SportsRepo repo=new SportsRepoImpl(em);
		SportsService service = new SportsServiceImpl(repo);
	
		//em.getTransaction().begin();
	/*	
		Day d1=new Day();
		List<Game> day1 = new ArrayList<Game>();

		Game g11 = new Game();
		g11.setName("Hockey");
		Game g12 = new Game();
		g12.setName("Cricket");
		Game g13 = new Game();
		g13.setName("Kabadi");
		day1.add(g11);
		day1.add(g12);
		day1.add(g13);

		d1.setName("Day 1");
		d1.setGames(day1);
		Day dd1=service.addDay(d1);
		//em.getTransaction().commit();
		System.out.println(dd1.getName() +" "+dd1.getGames());
		
	//	em.getTransaction().begin();
		
		Day d2=new Day();
		
		List<Game> day2 = new ArrayList<Game>();

		Game g21 = new Game();
		g21.setName("Badminton");
	
		Game g24 = new Game();
		g24.setName("BasketBall");
		day2.add(g21);
		//day2.add(g12);
	//	day2.add(g13);
		day2.add(g24);

		d2.setName("Day 2");
		d2.setGames(day2);
		Day dd2=service.addDay(d2);
		//em.getTransaction().commit();
		System.out.println(dd2.getName() +" "+dd2.getGames());
		
	//	em.getTransaction().begin();
		Day d3=new Day();
		List<Game> day3 = new ArrayList<Game>();
		
		//Game g31 = new Game();
		//g31.setName("Hockey");
		Game g32 = new Game();
		g32.setName("VolleyBall");
		Game g33 = new Game();
		g33.setName("coco");
		Game g34 = new Game();
		g34.setName("FootBall");
	//	day3.add(g11);
		day3.add(g32);
		day3.add(g33);
		day3.add(g34);

		d3.setName("Day 3");
		d3.setGames(day3);
		Day dd3=service.addDay(d3);
	//	em.getTransaction().commit();
		System.out.println(dd3.getName() +" "+dd3.getGames());
		*/
	/*	Day d4=new Day();
		List<Game> day4 = new ArrayList<Game>();
		
		Game g31 = new Game();
		g31.setName("Hockey");
		Game g32 = new Game();
		g32.setName("VolleyBall");
		Game g33 = new Game();
		g33.setName("coco");
		Game g34 = new Game();
		g34.setName("FootBall");
		day4.add(g31);
		day4.add(g32);
		day4.add(g33);
		day4.add(g34);

		d4.setName("Day 4");
		d4.setGames(day4);
		Day dd4=service.addDay(d4);
	//	em.getTransaction().commit();
		System.out.println(dd4.getName() +" "+dd4.getGames());
		
		Day d5=new Day();
		List<Game> day5 = new ArrayList<Game>();
		
		//Game g31 = new Game();
		//g31.setName("Hockey");
		Game g42 = new Game();
		g42.setName("VolleyBall");
		Game g43 = new Game();
		g43.setName("coco");
		//Game g34 = new Game();
		//g34.setName("FootBall");
		day5.add(g31);
		day5.add(g42);
		day5.add(g43);
		day5.add(g32);

		d5.setName("Day 5");
		d5.setGames(day5);
		Day dd5=service.addDay(d5);
	//	em.getTransaction().commit();
		System.out.println(dd5.getName() +" "+dd5.getGames());
		*/
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter day name");
		String dayName=sc.nextLine();
		Day dd=service.findByDay(dayName);
		System.out.println(dd.getName()+" "+dd.getGames());
		
		System.out.println("Enter game name");
		String gameName=sc.nextLine();
		List<Day> dayDetails=service.findByGame(gameName);
		for (Day day : dayDetails) {
			System.out.println(day.getName()+" "+day.getGames());
		}
		
		em.close();
		emf.close();
		
	}
	
	

		

	
	
}
