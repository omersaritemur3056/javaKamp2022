package kodlama.ioDemo.dataAccess.concretes.hibernate;

import kodlama.ioDemo.dataAccess.abstracts.InstructorDao;
import kodlama.ioDemo.entites.concretes.Instructor;

public class HibernateInstructorDao implements InstructorDao {

	@Override
	public void save(Instructor instructor) {
		System.out.println( instructor + " Hibernate ile eklendi");
		
	}

}
