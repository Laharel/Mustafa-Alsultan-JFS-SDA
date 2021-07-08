import java.util.*;
public class App {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Hello, user!");
        System.out.println("This Calculator works by FirstNumber Operator SecondNumber");
        System.out.println("Select operator 0-exit 1-add 2-subtract 3-multiply 4-divide");
        int operator=scan.nextInt();
        int ina,inb,result;
        while (operator!=0) {
            if (operator>0 && operator<5){
                System.out.println("Enter first number- ");  
                ina= scan.nextInt();  
                
                System.out.println("Enter second number- ");  
                inb= scan.nextInt();
    
                if (operator==1) {
                    result=ina+inb;
                    System.out.println("Addtion result: "+result);
                }
                
                else if (operator==2)
                {
                    result=ina-inb;
                    System.out.println("Subtraction result: "+result);
                }
                
                else if (operator==3)
                {
                    result=ina*inb;
                    System.out.println("Multiplication result: "+result);
                }
                
                else
                {
                    result=ina/inb;
                    System.out.println("Division result: "+result);
                }
            }
            else
            {
                System.out.println("Invalid entry,Please enter numbers 0 to 4");
            }
            
            System.out.println("Select operator 0-exit 1-add 2-subtract 3-multiply 4-divide");
            operator=scan.nextInt();
        }
        scan.close();
        System.out.println("Bye");
    }
}