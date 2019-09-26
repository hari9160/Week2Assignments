import java.util.Scanner;

public class Divide {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); 
        //Initialize Variables 
        int divisor, dividend, quotient, remainder, temp; 
            System.out.print("Enter your divisor (smaller value): "); 
            divisor = s.nextInt();
            System.out.print("Enter your dividend (larger value): "); 
            dividend = s.nextInt(); 
            if (divisor > dividend){ //switch
            temp = dividend; 
            dividend = divisor; 
            divisor = temp; 
        }  
            //calculate 
            quotient = dividend / divisor; 
            remainder = dividend % divisor; 
            
            System.out.format("The quotient is: %d\n", quotient);
            System.out.format("and the remainder is: %d\n", remainder); 
            
                
                
                
    }
    
}
