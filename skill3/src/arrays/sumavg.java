package arrays;
import java.util.Scanner;
public class sumavg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter number of elements ");
	        int n = sc.nextInt();
	        int[] arr = new int[n];
	        int sum = 0;
	        System.out.println("Enter the array elements:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	            sum += arr[i];
	        }
	        double average = (double) sum / n;
	        System.out.println("Sum of array elements: " + sum);
	        System.out.println("Average of array elements: " + average);
	         sc.close();
	}

}
