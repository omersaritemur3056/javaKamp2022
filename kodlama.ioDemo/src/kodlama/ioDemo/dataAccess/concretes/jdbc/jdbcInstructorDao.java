package kodlama.ioDemo.dataAccess.concretes.jdbc;

import kodlama.ioDemo.dataAccess.abstracts.InstructorDao;
import kodlama.ioDemo.entites.concretes.Instructor;

public class jdbcInstructorDao implements InstructorDao {

	@Override
	public void save(Instructor instructor) {
		System.out.println(instructor + " JDBC ile eklendi.");
		
	}

}
