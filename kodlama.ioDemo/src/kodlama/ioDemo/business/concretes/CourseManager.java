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
	
	


	public CourseManager(CourseDao courseDao, List<Logger> loggers) {
		super();
		this.courseDao = courseDao;
		this.loggers = loggers;
	}


	//bu operasyonumuzun benzerini Category için de yapabiliriz...
	@Override
	public void add(Course course) throws Exception {
		
		
	if (course.getPrice() < 0) {
		
		throw new Exception("Kursun fiyatı 0'dan küçük olamaz.");
	}
	
	for(Course inDbCourse : courseDao.getAll()) {
		if (inDbCourse == course) {
			System.out.println(course + " ismi tekrar edemez");
			return;
		}
	}		
		courseDao.save(course);
		
		for (Logger logger : loggers) {
			logger.log();
		}
	}


	@Override
	public void getCourses() {
		
		courseDao.getAll();
	}


	

}
