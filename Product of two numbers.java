import java.util.*;
public class Product {
    public static void main(String[] args) {
        System.out.println("Enter two numbers: ");
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int prod=0;
        prod=a*b;
        System.out.println("The product of two numbers is: "+ prod);
    }
}