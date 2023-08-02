
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.*;
import java.io.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.dao.EventDAO;
import com.spring.entity.Event;
import com.spring.service.EventService;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Logger log = Logger.getLogger("org.hibernate");
		log.setLevel(Level.OFF);
		System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.NoOpLog");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// Fill your code here
		
		ApplicationContext context = new ClassPathXmlApplicationContext("./applicationContext.xml");
		EventDAO dao = context.getBean("eventDAO", EventDAO.class);

		List<Event> eventList = dao.getAllEvents();
		System.out.println("Before inserting");
		display(eventList);

		System.out.println("Enter the id of the Event : ");
		int id = Integer.parseInt(br.readLine());

		if (id < 1 && id <= eventList.size()) {
			System.out.println("Invalid id");
		} else {
			System.out.println("Enter the name of the Event :");
			String eventName = br.readLine();
			System.out.println("Enter the Organiser name :");
			String orgainser = br.readLine();
			System.out.println("Enter the organiser number :");
			String organiserNumber = br.readLine();
			System.out.println("Enter the Hall name :");
			String hallName = br.readLine();
			System.out.println("Enter the location :");
			String location = br.readLine();

			System.out.println("Value inserted successfully");
			dao.createEvent(id, eventName, orgainser, organiserNumber, hallName, location);

			System.out.println("After insertion");
			eventList = dao.getAllEvents();
			display(eventList);
		}
	}

	public static void display(List<Event> events) {
		System.out.printf("%-15s %-15s %-15s %-15s %-15s %s\n", "Id", "Event Name", "Organiser Name",
				"Organiser Number", "Hall Name", "Location");
		for (Event e : events) {
			System.out.printf("%-15s %-15s %-15s %-15s %-15s %s\n", e.getId(), e.getEventName(), e.getOrganiser(), e.getOrganiserNumber(), e.getHallName(), e.getLocation());
		}
	}

}