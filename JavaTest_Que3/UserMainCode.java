package JavaTest_Que3;
import java.util.*;
public class UserMainCode {

		public static void main(String args[])
		 {
		 Scanner sc = new Scanner(System.in);
		     System.out.println("Please Enter the value of N : ");
		     int n=sc.nextInt();
		     System.out.println("Now Enter the value of R : ");
		     int r=sc.nextInt();
		   int ncr=fact(n)/(fact(r)*fact(n-r));
		 
		     System.out.println("The Value of "+n+"C"+r+" = "+ncr);
		    	}
		 
		 static int fact(int n)
		 {
		 int i,f=1;
		     for(i=1;i<=n;i++)
		     {
		         f=f*i;
		     } 
		     return f;
		 }
		}
