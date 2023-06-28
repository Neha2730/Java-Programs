package testing;
import java.time.Year;
import java.util.*;

public class SeniorAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter your Year of Birth:  ");

Scanner in = new Scanner(System.in);
int birthyear = in.nextInt();

int age = Year.now().getValue() - birthyear;

System.out.println("Your age " + " years old.");

if (age >=  60)
{
	System.out.println(" You are eligible to be Senior citizen.");
	}
else {
	System.out.println(" You are not eligible to be Senior citizen.");
}
	}

}
