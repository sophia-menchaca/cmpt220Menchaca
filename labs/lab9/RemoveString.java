import java.io.*;
import java.util.*;
public class RemoveString {
    public static void main(String[] args) throws Exception {
        // Check if the file exists
    	System.out.print("Enter the file name with extension : ");

        Scanner input = new Scanner(System.in);

        File sourcefile = new File(input.nextLine());

        input = new Scanner(sourcefile);

        // Read text from the file and save it in a string builder
        StringBuilder sb = new StringBuilder();

        String lineSeparator = System.getProperty("line.separator");
        boolean firstLine =  true;
            String toBeRemove = "work";
        while (input.hasNext()) {
            String s1 = input.nextLine();
            String s2 = s1.replaceAll(toBeRemove, "");
            if (firstLine) {
                sb.append(s2);
                firstLine = false;
            } else {
                sb.append(lineSeparator + s2);
            }
        }
        //print the new file name
        PrintWriter output = new PrintWriter(sourcefile);
        output.println(sb.toString());
        output.close();
    }
}