import java.util.*;
public class Temperature {
    public static void main(String[] args) {
        System.out.print("Enter the temperature in Celcius: ");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        double result=(a*9/5)+32;
        System.out.print("The temperature in Farenheit is: " +result);
    }
}