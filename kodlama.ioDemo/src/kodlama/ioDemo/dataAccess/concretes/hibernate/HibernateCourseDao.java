package kodlama.ioDemo.dataAccess.concretes.hibernate;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import kodlama.ioDemo.dataAccess.abstracts.CourseDao;
import kodlama.ioDemo.entites.concretes.Course;

public class HibernateCourseDao implements CourseDao {

	List<Course> courses = new ArrayList<>();
	
	
	@Override
	public void save(Course course) {
		System.out.println(course.getCourseName() + " Hibernate ile eklendi");
		courses.add(course);
	}

	@Override
	public Course findByCourseId(int id) {
		//buralar şimdilik önemli değil
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
