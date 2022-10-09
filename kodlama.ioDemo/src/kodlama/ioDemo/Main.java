package kodlama.ioDemo;

import kodlama.ioDemo.business.concretes.CourseManager;
import kodlama.ioDemo.dataAccess.concretes.hibernate.HibernateCourseDao;
import kodlama.ioDemo.entites.concretes.Category;
import kodlama.ioDemo.entites.concretes.Course;

public class Main {

	public static void main(String[] args) {
		
		
		
		Course course1 = new Course();
		course1.setId(1);
		course1.setCourseName("C#");
		course1.setPrice(100);
		
		CourseManager courseManager1 = new CourseManager(new HibernateCourseDao());
		
		//omersaritemur3056
	
		

	}

}
