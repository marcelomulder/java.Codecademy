public class Calculator {
    
      public void Calculator() {
    
      }
      
      public int add(int a, int b){
        int sum = a + b;
        return sum;
    
      }
    
      public int subtract(int a, int b){
        int difference = a - b;
        return difference;
      }
    
      public int multiply(int a, int b){
        int multiply = a * b;
        return multiply;
      }
    
      public double divide(int a, int b){
        double divide = a / b;
        return divide;
      }
    
      public int modulo(int a, int b){
        int modulo = a % b;
        return modulo;
      }
    
      public static void main (String[] args){
        Calculator myCalculator = new Calculator();
        System.out.println(myCalculator.add(5,7));
        System.out.println(myCalculator.subtract(45,11));
        System.out.println(myCalculator.multiply(5,5));
    
      }
    }