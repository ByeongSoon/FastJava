package classpart;

public class StudentTest {

  public static void main(String[] args) {

    Student studentJang = new Student();
    studentJang.studentName = "장봉";
    studentJang.address = "서울";

    studentJang.showStudentInfo();

    Student studentKim = new Student();
    studentKim.studentName = "김유신";
    studentKim.address = "경주";

    studentKim.showStudentInfo();

    System.out.println(studentJang);
    System.out.println(studentKim);

  }

}
