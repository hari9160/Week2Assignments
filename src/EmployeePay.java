import java.util.Scanner; 

public class EmployeePay {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //Initialize Variables
        int hours, overhours = 0; 
        double regpay = 0, overpay = 0, totalpay; 
        //Accumulator Variables 
        double grandtotal = 0, totalregpay = 0, totaloverpay = 0; 
        
        for (int x = 1; x <= 5; x++){ 
            while (true) { 
                System.out.format("Enter hours worked for employee %d: ", x);
                hours = s.nextInt(); 
                if (hours > 0 && hours <= 70) { 
                    break; 
                }else { 
                    System.out.format("Invalid Try Again");
                }
            }
            if (hours > 40){ 
                overhours = hours - 40; 
                hours = 40; 
                
            }
            //calculate all forms of output to user
            regpay = 15 * hours; 
            overpay = 22.50 * overhours; 
            totalpay = regpay + overpay; 
            totalregpay += totalpay; 
            totaloverpay += overpay; 
            grandtotal = totalregpay + totaloverpay; 
            
            System.out.format("Regular Pay: $%.2f\n", regpay); 
            System.out.format("Overtime Pay: $%.2f\n", overpay); 
            System.out.format("Total Pay: $%.2f\n", totalpay);
            
        }
        System.out.format("\n----------------------\n"); 
        System.out.format("Total Regular Pay: $%.2f\n", totalregpay); 
        System.out.format("Total Overtime Pay: $%.2f\n", totaloverpay); 
        System.out.format("Grand Total Pay: $%.2f\n", grandtotal);
    }
    
}
