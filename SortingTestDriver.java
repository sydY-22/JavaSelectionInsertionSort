package project10_4;

public class SortingTestDriver {

	public static void main(String[] args) {
		GradeBook[] students = new GradeBook[7];
		
		students[0] = new GradeBook("John", "Doe", "86");
		students[1] = new GradeBook("Alex", "Nickles", "92");
		students[2] = new GradeBook("Jane", "Gray", "77");
		students[3] = new GradeBook("Garfield", "Bakers", "68");
		students[4] = new GradeBook("Sarah", "Stewart", "98");
		students[5] = new GradeBook("Allan", "Rohdes", "80");
		students[6] = new GradeBook("Tim", "Coal", "84");
		
		
		Sorting<GradeBook> sort = new Sorting<GradeBook>();
		
		// sort by last name in descending order (Greatest to least)
		sort.selectionSort(students);
		System.out.println("Selection Sort: ");
		for (GradeBook student : students) {
			System.out.println(student);
		}
		
		System.out.println();
		
		System.out.println("Insertion Sort: ");
		for(GradeBook student : students) {
			System.out.println(student);
		}
		
	}

}
