import java.util.regex.*;
import java.util.*;

public class App {

public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
	String regex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
    System.out.print("Enter a valid Email: ");  
    String str = scan.nextLine();
	Pattern pat = Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
	Matcher match = pat.matcher(str);
    scan.close();
	
	while ((match.find()))
	System.out.println( str +" : "+ match.matches());
}
}