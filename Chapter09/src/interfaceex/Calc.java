package interfaceex;

public interface Calc {

  double PI = 3.14; // Compile 시에 public static final 이 자동으로 붙는다.
  int ERROR = -999999999;

  int add(int num1, int num2);
  int substract(int num1, int num2);
  int times(int num1, int num2);
  int divide(int num1, int num2);

}
