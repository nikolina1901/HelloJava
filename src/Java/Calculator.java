package Java;

public class Calculator {
    public Calculator(){

    }
    public int add(int a, int b){
        int result = a + b;
        return result;
    }
    public int subtract(int a, int b){
        int result = a - b;
        return result;
    }
    public int multiply(int a, int b){
        int result = a * b;
        return result;
    }
    public int divide(int a, int b){
        int result = a / b;
        return result;
    }
    public int modulo(int a, int b){
        int result = a % b;
        return result;
    }
   public static void main(String[] args){
        Calculator myCalculator = new Calculator();
        System.out.print("7 + 9 =");
       System.out.println( myCalculator.add(7,9));
       System.out.print("97 - 79 =");
       System.out.println(myCalculator.subtract(97,79));
       System.out.print("7 * 9 =");
       System.out.println(myCalculator.multiply(7,9));
       System.out.print("975 / 15 =");
       System.out.println(myCalculator.divide(975,15));
       System.out.print("15 % 8 =");
       System.out.println(myCalculator.modulo(15,8));
   }
}
