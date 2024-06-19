import java.util.Scanner;

public class OddEvenArray {
  public static void main(String[] args) {
    // initializing and creating object.
    int n;
    Scanner sc = new Scanner(System.in);

    // enter number for elements.
    System.out.print("Enter no. of elements you want in array : ");
    n = sc.nextInt();
    int a[] = new int[n];

    // enter all elements.
    System.out.println("Enter all the elements : ");
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    System.out.print("Odd numbers in the array are : ");
    for (int i = 0; i < n; i++) {
      if (a[i] % 2 != 0) {
        System.out.print(a[i] + " ");
      }
    }
    System.out.println("");
    System.out.print("Even numbers in the array are : ");
    for (int i = 0; i < n; i++) {
      if (a[i] % 2 == 0) {
        System.out.print(a[i] + " ");
      }
    }
  }
}
