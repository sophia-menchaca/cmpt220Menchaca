import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class FileCounter {
    public static void main(String[] args) throws Exception {
    	System.out.print("Enter the file name with extension : ");

        Scanner input = new Scanner(System.in);

        File file = new File(input.nextLine());

        input = new Scanner(file);
        //my input: C:\Users\smenc\workspace\Lab9\src\Text
        //output: 
        //Characters: 43
        //Words: 10
        //Lines: 7
        int characters = 0;
        int words = 0;
        int lines = 0;

		while (input.hasNext()) {
		    String s = input.nextLine();//adds 1 for every new line
		    lines++;
		    characters += s.length();
		    String[] split = s.split(" ");//adds 1 for everything split by a space
		    for (String word : split) {
		        words++;
		    }
		}
        System.out.println("Characters: " + characters);
        System.out.println("Words: " + words);
        System.out.println("Lines: " + lines);
    }
}