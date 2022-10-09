package kodlama.ioDemo.dataAccess.concretes.jdbc;

import java.util.List;
import java.util.Optional;

import kodlama.ioDemo.dataAccess.abstracts.CourseDao;
import kodlama.ioDemo.entites.concretes.Course;

public class jdbcCourseDao implements CourseDao {

	List<Course> courses;
	
	@Override
	public void save(Course course) {
		courses.add(course);
		
		System.out.println(course + " JDBC ile eklendi");
		
	}

	@Override
	public Course findByCourseId(int id) {
		 Optional<Course> inDbCourse = courses.stream().filter((course) -> course.getId() == id ).findFirst();
		 if(inDbCourse.isPresent()) {
			 return (inDbCourse.get());
		 }
		 return null;
	}

	@Override
	public List<Course> getAll() {
		
		return courses;
	}

	

}
