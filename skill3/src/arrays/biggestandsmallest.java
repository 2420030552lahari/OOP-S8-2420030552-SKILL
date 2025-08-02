package arrays;
import java.util.Scanner;
public class biggestandsmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.print("Enter number of elements ");
int n = sc.nextInt();
int[] arr = new int[n];
System.out.println("Enter the array elements:");
for (int i = 0; i < n; i++) {
    arr[i] = sc.nextInt();
    }
int min = arr[0];
int max = arr[0];
for (int i = 1; i < n; i++) {
    if (arr[i] < min) {
        min = arr[i];
    }
    if (arr[i] > max) {
        max = arr[i];
    }
}
System.out.println("smallest :"+min);
System.out.println("biggest :"+max);
	}

}
