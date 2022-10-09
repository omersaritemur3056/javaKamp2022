package kodlama.ioDemo.business.concretes;

import java.util.Iterator;
import java.util.List;

import kodlama.ioDemo.business.abstracts.CourseService;
import kodlama.ioDemo.core.Logger;
import kodlama.ioDemo.dataAccess.abstracts.CourseDao;
import kodlama.ioDemo.entites.concretes.Course;

public class CourseManager implements CourseService {

	private CourseDao courseDao;
	private List<Logger> loggers; //dependency injection yap ve ekle
	
	
	public CourseManager(CourseDao courseDao) {
		
		this.courseDao = courseDao;
	}


	//bu operasyonumuzun benzerini Category için de yapabiliriz...
	@Override
	public void add(Course course) throws Exception {
		
		
	if (course.getPrice() < 0) {
		System.out.println("Kursun fiyatı 0'dan küçük olamaz.");
		return;
	}
	List<Course> courses = courseDao.getAll();
	for(Course inDbCourse : courses) {
		if (inDbCourse.getId() == course.getId() || inDbCourse.getCourseName() == course.getCourseName()) {
			System.out.println("Kurs mevcut");
			return;
		}
	}
	
				
		courseDao.save(course);
	}


	@Override
	public Course get(int id) {
		
		return courseDao.findByCourseId(id);
		
	}

}
