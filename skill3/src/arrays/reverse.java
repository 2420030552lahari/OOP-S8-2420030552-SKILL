package arrays;
import java.util.Scanner;
public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         System.out.println("enter a number");
         int n=sc.nextInt();
         int rev=0;
         int digit=0;
         while(n!=0) {
        	  digit=n%10;
        	 rev=rev*10+digit;
        	 n=n/10;
         }
         System.out.println("reverse number is:" +rev);
	}

}