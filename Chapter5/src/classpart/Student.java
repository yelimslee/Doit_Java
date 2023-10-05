package classpart;

public class Student {

	int studentID;
	String studentName;
	int grade;
	String adress;
	
	public Student() {}
	
	public Student(int id, String name) {
		studentID = id;
		studentName = name;
	}
	
	public void showStudentInFor() {
		System.out.println(studentName + ", " + adress);
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
}