package kodlama.ioDemo.entites.concretes;

import kodlama.ioDemo.entites.abstracts.Entity;

public class Course implements Entity {

	private int id;
	private String courseName;
	private double price;
	private String description;
	
	private Category category;
	private Instructor instructor;

	public Course() {
		
	}

	public Course(int id, String courseName, double price, String description, Category category,
			Instructor instructor) {
		super();
		this.id = id;
		this.courseName = courseName;
		this.price = price;
		this.description = description;
		this.category = category;
		this.instructor = instructor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Instructor getInstructor() {
		return instructor;
	}

	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}

	
	
}
