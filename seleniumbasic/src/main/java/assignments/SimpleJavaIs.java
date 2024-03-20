package assignments;

import java.util.Scanner;

public class SimpleJavaIs {

	public void IsNumberTwoDigit()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int i = sc.nextInt();
		
		if(i >= 10 && i <= 99)
		{
			System.out.println("True");
		}
		else
			System.out.println("False");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleJava j = new SimpleJava();
		j.IsNumberTwoDigit();
	}

}
