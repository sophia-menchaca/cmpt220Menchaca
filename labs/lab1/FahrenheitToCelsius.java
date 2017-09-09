import java.util.Scanner;
// JA: For some reason, your " show up as &quot;
public class FahrenheitToCelsius {
  public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
           double celsius, fahrenheit;
           System.out.print("Enter a temperature in Celsius: ");
           celsius = sc.nextDouble();
           fahrenheit = 32 + (celsius * 9.0 / 5);
           System.out.println(celsius +" C = " + fahrenheit + " F");
    }
}

