import java.util.Scanner;

class PrimeNumber {

   public static void main(String[] args) {
  	   Scanner scan = new Scanner(System.in);
     int number;
     do{
      System.out.print("Input Number : ");
     
      number = scan.nextInt();      
      int printx=0;
     for (int i = 2; i <= number; i++) { 
      while(number %i == 0){
          number/=i;   
          printx++;
          if (printx==1) { 
            System.out.print("  " + i);  
          }
           else{  
            System.out.print(" x " + i); 
          }
        }
          
          
      }    System.out.println("");
     } while(number!=0); 
}
}

