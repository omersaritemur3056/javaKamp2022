package kodlama.ioDemo.business.abstracts;

import kodlama.ioDemo.entites.concretes.Course;

public interface CourseService {

	void add(Course course) throws Exception;
	void getCourses();
}
