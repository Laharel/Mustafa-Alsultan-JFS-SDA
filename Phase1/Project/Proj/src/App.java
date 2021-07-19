import java.io.File;
import java.util.*;

public class App {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Hello, This program is made by Mustafa!");
        System.out.println("This program works by selecting an option then following the instructions");
        System.out.println("Select one of the following options 1-display(sorted) 2-add 3-search 4-delete 5-rename 0-exit");
        int operator=scan.nextInt();
        scan.nextLine();
        while (operator!=0) {
            if (operator>0 && operator<6){
                
                if (operator==1) {
                    System.out.println("Please Enter File/Directory Name");
                    String input = scan.nextLine();  // Read user input
                    try {
                        File file = new File("/home/laharel/Desktop/"+input);//path+name
                        if (file.exists()){
                            // list of file objects
                            File[] paths = file.listFiles();
                            List<File> files=Arrays.asList(paths);
                            Collections.sort(files);
                            // for each name in the path array
                            for (File path : files) {
                                // prints file name or directory name
                                if (path.isDirectory()) {
                                    System.out.println("Directory " + path.getName());
                                } else {
                                    System.out.println("File " + path.getName());
                                }
                            }
                        }
                        else {
                            System.out.println("Does not exist");
                        }
                    } catch (Exception e) {
                        System.err.println("Things went wrong: " + e.getMessage());
                        e.printStackTrace();
                    }
                }
                
                else if (operator==2)
                {
                    System.out.println("To Add a file select option 1, To Add a Directory select option 2");
                    int inputc=scan.nextInt();
                    scan.nextLine();
                    if (inputc==1){
                        System.out.println("Please Enter File Name including extention");
                        String input = scan.nextLine();  // Read user input
                        try {
                            File myObj = new File("/home/laharel/Desktop/"+input);//path+name
                            if (myObj.createNewFile()) {
                                System.out.println("File created: " + myObj.getName());
                                } else {
                                System.out.println("File already exists.");
                                }
                            } 
                        catch (Exception e) {
                                System.out.println("An error occurred.");
                                e.printStackTrace();
                            } 
                        }
                        else if (inputc==2) {
                            System.out.println("Please Enter Directory Name");
                            String input = scan.nextLine();  // Read user input
                            try {
                                File myObj = new File("/home/laharel/Desktop/"+input);//path+name
                                if (myObj.mkdir()) {
                                    System.out.println("File created: " + myObj.getName());
                                    } else {
                                    System.out.println("File already exists.");
                                    }
                                } 
                            catch (Exception e) {
                                    System.out.println("An error occurred.");
                                    e.printStackTrace();
                            }
                        }else
                        {
                            System.out.println("Invalid entry,Please select options 1 or 2");
                        }
                    }
                
                else if (operator==3)
                {
                    System.out.println("Please Enter File/Directory Name");
                    String input = scan.nextLine();  // Read user input
                    File myObj = new File("/home/laharel/Desktop"+input); //path+name
                    if (myObj.exists()) { 
                        System.out.println("The file: " + myObj.getName()+" Exists");
                    } else {
                        System.out.println("File does not exist");
                    }
                }
                else if (operator==4)
                {
                    System.out.println("Please Enter File Name");
                    String input = scan.nextLine();  // Read user input
                    File myObj = new File("/home/laharel/Desktop"+input);//path+name 
                    if (myObj.delete()) { 
                        System.out.println("Deleted the file: " + myObj.getName());
                    } else {
                        System.out.println("Failed to delete the file because file does not exist.");
                    }
                }
                
                else
                {
                    System.out.println("Please Enter Current Name");
                    String inputa = scan.nextLine();  // Read user input
                    File oldName =
                    new File("/home/laharel/Desktop"+inputa);//path+name
                    System.out.println("Please Enter New Name");
                    String inputb = scan.nextLine();  // Read user input
                    File newName = 
                    new File("/home/laharel/Desktop"+inputb);//path+name
                    if (oldName.renameTo(newName)) 
                        System.out.println("Renamed successfully");        
                    else 
                        System.out.println("Failed to rename");
                }
            }
            else
            {
                System.out.println("Invalid entry,Please select options 0 to 5");
            }
            
            System.out.println("Select one of the following options 1-display(sorted) 2-add 3-search 4-delete 5-rename 0-exit");
            operator=scan.nextInt();
            scan.nextLine();
        }
        scan.close();
        System.out.println("Bye");
    }
}