import java.util.Scanner;

class PrimeNumber {

   public static void main(String[] args) {
  	   Scanner scan = new Scanner(System.in);
      System.out.print("Input Number : ");
      int number = scan.nextInt();      
    
     for (int i = 2; i <= number; i++) { 
      while(number %i == 0){
          number/=i;
          System.out.print(" " + i);
      }
    }
}
}