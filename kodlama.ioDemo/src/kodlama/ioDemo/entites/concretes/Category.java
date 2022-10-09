package kodlama.ioDemo.entites.concretes;

import kodlama.ioDemo.entites.abstracts.Entity;

public class Category implements Entity {

	private int id;
	private String categoryName;
	
	private Course[] courses;

	public Category() {
		
	}

	public Category(int id, String categoryName, Course[] courses) {
		super();
		this.id = id;
		this.categoryName = categoryName;
		this.courses = courses;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public Course[] getCourses() {
		return courses;
	}

	public void setCourses(Course[] courses) {
		this.courses = courses;
	}
	
}
