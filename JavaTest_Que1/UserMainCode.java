package JavaTest_Que1;
import java.util.*;

    public class UserMainCode {
		 public static int calculateElectricityBill(String inp1, String inp2, int inp3) {
			    int n1 = Integer.parseInt(inp1.substring(5, inp1.length()));
			    int n2 = Integer.parseInt(inp2.substring(5, inp2.length()));
			    int n = Math.abs((n2 - n1) * inp3);
			    return n;
			  }

			  public static void main(String[] args) {
			    Scanner sc = new Scanner(System.in);
			    System.out.println("Enter consumer no. and meter readings : ");
			    String s1 = sc.nextLine();
			    String s2 = sc.nextLine();
			    int n = sc.nextInt();
			    int n1 = calculateElectricityBill(s1, s2, n);
			    System.out.println(n1);
			  }
	}

