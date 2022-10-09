package kodlama.ioDemo.entites.concretes;

import kodlama.ioDemo.entites.abstracts.Entity;

public class Instructor implements Entity {

	private int id;
	private String instructorName;
	
	public Instructor() {
		
	}

	public Instructor(int id, String instructorName) {
		
		this.id = id;
		this.instructorName = instructorName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getInstructorName() {
		return instructorName;
	}

	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}
	
	
}
