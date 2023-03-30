package project10_4;

public class GradeBook implements Comparable<GradeBook> {
	private String firstName, lastName, grades;
	
	public GradeBook(String firstName, String lastName, String grades) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.grades = grades;
	}
	
	public void setFirst(String firstName) {
		this.firstName = firstName;
	}
	
	public String getFirst() {
		return firstName;
	}
	
	public void setLast(String lastName) {
		this.lastName = lastName;
	}
	
	public String getLast() {
		return lastName;
	}
	
	public void setGrades(String grades) {
		this.grades = grades;
	}
	
	public String getGrades() {
		return grades;
	}

	@Override
	public int compareTo(GradeBook o) {
		int results;
		if (lastName.equals(o.getLast())) {
			results = firstName.compareTo(o.getFirst());
		}
		else {
			results = lastName.compareTo(o.getLast());
		}
		return results;
	}
	
	public String toString() {
		return "Student Name: " + firstName + " " + lastName + " Grade: " + grades;
	}
	
	public boolean equals(Object other) {
		return (lastName.equals(((GradeBook) other).getLast()) && firstName.equals(((GradeBook)other).getFirst()));
	}
	
	
	

}
