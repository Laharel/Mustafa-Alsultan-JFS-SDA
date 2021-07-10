import java.io.FileReader;
import java.io.FileWriter;
public class App {
    public static void main(String[] args)  {
        try {
            FileReader reader = new FileReader("demo.txt");
            FileWriter writer = new FileWriter("hello.txt");
            int c = 0;
            while((c = reader.read()) !=-1){
                writer.write(c);
                writer.flush();
            }
            writer.append(" in progress.");
            writer.close();
            reader.close();
            System.out.println("....Done....");
        }   
        catch (Exception e){
            e.printStackTrace();
        }
    }
}