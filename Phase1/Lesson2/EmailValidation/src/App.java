import java.util.regex.*;
import java.util.*;

public class App {

public static void main(String[] args) {
	ArrayList<String> emails=new ArrayList<String>();
	emails.add("user@domain.com");
	emails.add("user@domain.co.in");
	emails.add("user1@domain.com");
	emails.add("user.name@domain.com");
	emails.add("user#@domain.co.in");
	emails.add("user1_#@domain1.com");
	
	//Invalid emails
	emails.add("user@domain");
	emails.add("user#domain.com");
	emails.add("@yahoo.com");
	
	
    Scanner scan = new Scanner(System.in);
	String regex = "^[A-Z0-9._%#+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
    System.out.print("Enter a valid Email: ");  
    String str = scan.nextLine();
	Pattern pat = Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
	Matcher match = pat.matcher(str);
    scan.close();
	
	for(String email : emails){
		Matcher matcher = pat.matcher(email);
		System.out.println(email +" : "+ matcher.matches());
	}
	while ((match.find()))
	System.out.println( str.substring( match.start(), match.end() ) );
	System.out.println( str +" : "+ match.matches());
}
}