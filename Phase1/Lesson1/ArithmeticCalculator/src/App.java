import java.util.*;
public class App {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Hello, user!");
        System.out.println("This Calculator works by FirstNumber Operator SecondNumber");
        System.out.println("Select operator 0-exit 1-add 2-subtract 3-multiply 4-divide");
        int operator=input.nextInt();
        int a,b,result;
        while (operator!=0) {
            if (operator>0 && operator<5){
                System.out.println("Enter first number- ");  
                a= input.nextInt();  
                
                System.out.println("Enter second number- ");  
                b= input.nextInt();
    
                if (operator==1) {
                    result=a+b;
                    System.out.println("Addtion result: "+result);
                }
                
                else if (operator==2)
                {
                    result=a-b;
                    System.out.println("Subtraction result: "+result);
                }
                
                else if (operator==3)
                {
                    result=a*b;
                    System.out.println("Multiplication result: "+result);
                }
                
                else
                {
                    result=a/b;
                    System.out.println("Division result: "+result);
                }
            }
            else
            {
                System.out.println("Invalid entry,Please enter numbers 0 to 4");
            }
            
            System.out.println("Select operator 0-exit 1-add 2-subtract 3-multiply 4-divide");
            operator=input.nextInt();
        }
        input.close();
        System.out.println("Bye");
    }
}