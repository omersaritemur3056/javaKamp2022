package kodlama.ioDemo.dataAccess.abstracts;

import java.util.List;

import kodlama.ioDemo.entites.concretes.Course;

public interface CourseDao {

	void save(Course course);
	
	List<Course> getAll();
	
	Course findByCourseId(int id);
}
