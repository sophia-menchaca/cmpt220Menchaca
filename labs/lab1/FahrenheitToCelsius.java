import java.util.Scanner;
public class FahrenheitToCelsius {
  public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
           double celsius, fahrenheit;
           System.out.print(&quot;Enter a temperature in Celsius: &quot;);
           celsius = sc.nextDouble();
           fahrenheit = 32 + (celsius * 9.0 / 5);
           System.out.println(celsius +&quot; C = &quot; + fahrenheit + &quot; F&quot;);
    }
}

