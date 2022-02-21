package JavaTest_Que4;
import java.util.*;
public class UserMainCode {
	public static void validatePassword(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		    String a = sc.next();
		    if (a.length() >= 8) {
		      if (a.contains("#") || a.contains("@") || a.contains("_")) {
		        char c = a.charAt(0);
		        if (Character.isAlphabetic(c)) {
		          char dd = a.charAt(a.length() - 1);
		          
		          if ((Character.isAlphabetic(dd)) || (Character.isDigit(dd)))

		          {
		            if (a.matches(".[0-9]{1,}.")
		                || a.matches(".[a-zA-Z]{1,}.")) {

		              System.out.println("Valid");

		            } else{
		              System.out.println("Not Valid");
		            }
		          } else{
		            System.out.println("Not Valid");
		          }
		        }
		         else{
		            System.out.println("Not Valid");
		          }
		      } else{
		        System.out.println("Not Valid");
		      }

		    } else{
		      System.out.println("Not Valid");
		    }
	}

}

