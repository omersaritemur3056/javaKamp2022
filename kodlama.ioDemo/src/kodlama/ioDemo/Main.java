package kodlama.ioDemo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import kodlama.ioDemo.business.concretes.CategoryManager;
import kodlama.ioDemo.business.concretes.CourseManager;
import kodlama.ioDemo.core.DatabaseLogger;
import kodlama.ioDemo.core.Logger;
import kodlama.ioDemo.core.SmsLogger;
import kodlama.ioDemo.dataAccess.abstracts.CategoryDao;
import kodlama.ioDemo.dataAccess.abstracts.CourseDao;
import kodlama.ioDemo.dataAccess.concretes.hibernate.HibernateCategoryDao;
import kodlama.ioDemo.dataAccess.concretes.hibernate.HibernateCourseDao;
import kodlama.ioDemo.dataAccess.concretes.jdbc.jdbcCourseDao;
import kodlama.ioDemo.entites.concretes.Category;
import kodlama.ioDemo.entites.concretes.Course;
import kodlama.ioDemo.entites.concretes.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Category category1 = new Category();
		category1.setId(1);
		category1.setCategoryName("Programlama");
	
		
		Instructor instructor1 = new Instructor(1, "Engin Demiroğ");
		
		Course course1 = new Course();
		course1.setId(1);
		course1.setCourseName("C#");
		course1.setPrice(0);
		course1.setCategory(category1);
		course1.setInstructor(instructor1);
		
		Course course2 = new Course();
		course2.setId(2);
		course2.setCourseName("Java");
		course2.setPrice(100);
		course2.setCategory(category1);
		course2.setInstructor(instructor1);
		
//		Course course3 = new Course();
//		course3.setId(3);
//		course3.setCourseName("Java");
//		course3.setPrice(100);
//		course3.setCategory(category1);
//		course3.setInstructor(instructor1);
		
		CourseDao courseDao1 = new jdbcCourseDao();
		List<Logger> loggers = new ArrayList<>(Arrays.asList(new DatabaseLogger(), new SmsLogger()));
		
		
		CourseManager courseManager1 = new CourseManager(courseDao1, loggers);
		courseManager1.add(course1);
		courseManager1.add(course2);
		//courseManager1.add(course3);
	
		System.out.println("----------------");
		System.out.println("Kurs veritabanımız : ");
		
		//simüle veritabanından veri aldık
		for (Course course : courseDao1.getAll()) {
			System.out.println("Kurslarımız : " + course.getCourseName() + ", Kategorileri : " + course.getCategory().getCategoryName() + ", Eğitmeni : " + course.getInstructor().getInstructorName());
		}
		
		
		System.out.println("------------------------------------");
		
		//Kategori ismi testi
		//Yukarıda category1 zaten tanımlı şimdi category2'yi tanımlıyoruz
		
		Category category2 = new Category();
		category2.setId(2);
		category2.setCategoryName("Programlama");
		
		CategoryDao categoryDao1 = new HibernateCategoryDao();
		
		CategoryManager categoryManager1 = new CategoryManager(categoryDao1, loggers);
		categoryManager1.add(category1);
		categoryManager1.add(category2);

	}

}
