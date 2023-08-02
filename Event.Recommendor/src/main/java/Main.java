import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.Event;
import spring.EventList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		
		Event e1 = context.getBean("event1", Event.class);
		Event e2 = context.getBean("event2", Event.class);
		Event e3 = context.getBean("event3", Event.class);
			
		EventList service = new EventList();

		service.insert(e1);
		service.insert(e2);
		service.insert(e3);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your Budget");
		double budget = sc.nextDouble();
		ArrayList<String> res = service.recommendfor(budget);
		
		for(String s : res) {
			System.out.println(s);
		}
	}

}
