public class FibonacciRecursivo {
 
     public static void main(String[] args) {
 
          int resultado = Fibonacci(10);
          System.out.println("Resultado: " + resultado);
     }
 
     private static int Fibonacci(int num){
          if(num == 0 || num==1)
               return num;
          else
               return Fibonacci(num-1) + Fibonacci(num-2);
     }
 
}