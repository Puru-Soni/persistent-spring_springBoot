import com.spring.entity.*;
import com.spring.dao.*;
import java.util.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) throws IOException {
		Logger log = Logger.getLogger("org.hibernate");
		log.setLevel(Level.OFF);
		System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.NoOpLog");
		@SuppressWarnings("resource")
		ApplicationContext factory=new ClassPathXmlApplicationContext("applicationContext.xml");  

		//Fill your code here
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		OwnerDAO dao = factory.getBean(OwnerDAO.class);
		for(Owner o : dao.getAllOwners()){
			System.out.println(o.getName());
		}
		
		System.out.println("Enter the name of the person you want to search");
		String name = br.readLine();
		String res = dao.getOwnerNumberByName(name);
		System.out.println(res);
		
		System.exit(0);
	}

}