package kodlama.ioDemo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import kodlama.ioDemo.business.concretes.CourseManager;
import kodlama.ioDemo.core.DatabaseLogger;
import kodlama.ioDemo.core.Logger;
import kodlama.ioDemo.core.SmsLogger;
import kodlama.ioDemo.dataAccess.abstracts.CourseDao;
import kodlama.ioDemo.dataAccess.concretes.hibernate.HibernateCourseDao;
import kodlama.ioDemo.dataAccess.concretes.jdbc.jdbcCourseDao;
import kodlama.ioDemo.entites.concretes.Category;
import kodlama.ioDemo.entites.concretes.Course;

public class Main {

	public static void main(String[] args) throws Exception {
		
		
		
		Course course1 = new Course();
		course1.setId(1);
		course1.setCourseName("C#");
		course1.setPrice(0);
		
		Course course2 = new Course();
		course2.setId(2);
		course2.setCourseName("Java");
		course2.setPrice(100);
		
		CourseDao courseDao1 = new jdbcCourseDao();
		List<Logger> loggers = new ArrayList<>(Arrays.asList(new DatabaseLogger(), new SmsLogger()));
		
		
		CourseManager courseManager1 = new CourseManager(courseDao1, loggers);
		courseManager1.add(course1);
		courseManager1.add(course2);
	
		System.out.println("----------------");
		
		//simüle veritabanından veri aldık
		for (Course course : courseDao1.getAll()) {
			System.out.println("Kurslarımız : " + course.getCourseName());
		}

	}

}
