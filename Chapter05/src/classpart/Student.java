package classpart;

public class Student {

  public int studentID;
  public String studentName; // String은 문자열을 사용하기 위한 자바에서 제공하는 클래스
  public String address;

  public void showStudentInfo() {
    System.out.println(studentName + ", " + address);
  }



}
