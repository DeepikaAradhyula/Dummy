package com.cg.gamescheduleappln.ui;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.cg.gamescheduleappln.bean.Day;
import com.cg.gamescheduleappln.bean.Game;
import com.cg.gamescheduleappln.repo.SportsRepo;
import com.cg.gamescheduleappln.repo.SportsRepoImpl;
import com.cg.gamescheduleappln.service.SportsService;
import com.cg.gamescheduleappln.service.SportsServiceImpl;

public class Client {
	 
	
	public static void main(String[] args) {
		//Map<String,Day> data=new HashMap<String,Day>();
		//SportsRepo repo=new SportsRepoImpl(data);
		
		//SportsService service=new SportsServiceImpl(repo);
		
		GenericXmlApplicationContext ctx=new GenericXmlApplicationContext("config.xml");
		SportsService service=ctx.getBean("service",SportsService.class);
		//SportsService service2=ctx.getBean("service",SportsService.class);
		//System.out.println("are two strings same "+(service==service2));
		//System.out.println(service);
		//System.out.println(service2);
		/*Day day1=ctx.getBean("day",Day.class);
		System.out.println(service.addDay(day1));*/
		//service.setRepo(repo);
		
		Day d1=new Day();
		//System.out.println(d1);
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
		System.out.println(dd1.getName() +" "+dd1.getGames());
		
		Day d2=new Day();
		//System.out.println(d2);
		List<Game> day2 = new ArrayList<Game>();

		Game g21 = new Game();
		g21.setName("Badminton");
		Game g22 = new Game();
		g22.setName("Cricket");
		Game g23 = new Game();
		g23.setName("Kabadi");
		Game g24 = new Game();
		g24.setName("BasketBall");
		day2.add(g21);
		day2.add(g22);
		day2.add(g23);
		day2.add(g24);

		d2.setName("Day 2");
		d2.setGames(day2);
		Day dd2=service.addDay(d2);
		System.out.println(dd2.getName() +" "+dd2.getGames());
		
		Day d3=new Day();
		List<Game> day3 = new ArrayList<Game>();
		
		Game g31 = new Game();
		g31.setName("Hockey");
		Game g32 = new Game();
		g32.setName("VolleyBall");
		Game g33 = new Game();
		g33.setName("coco");
		Game g34 = new Game();
		g34.setName("FootBall");
		day3.add(g31);
		day3.add(g32);
		day3.add(g33);
		day3.add(g34);

		d3.setName("Day 3");
		d3.setGames(day3);
		Day dd3=service.addDay(d3);
		System.out.println(dd3.getName() +" "+dd3.getGames());
		
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
		
		
		
		
	}
	
	

		

	
	
}
