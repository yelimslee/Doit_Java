package classpart;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student(100, "이순신");
//		studentLee.studentName = "이순신";
//		studentLee.studentID = 100;
//		studentLee.adress = "서울시 영등포구 여의도동";
		
		Student studentKim = new Student();
		studentKim.studentName = "김유신";
		studentKim.studentID = 101;
		studentKim.adress = "미국 산호세";
		
		studentLee.showStudentInFor();
		studentKim.showStudentInFor();
		
		System.out.println(studentLee);
		System.out.println(studentKim);
	}
}