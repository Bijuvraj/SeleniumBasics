package assignments;

import java.util.Scanner;

public class SimpleJava {
	public void IsNumberTwoDigit()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int i = sc.nextInt();
		
		if(i <= 9)
		{
			System.out.println("False");
		}
		else
			System.out.println("True");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleJava j = new SimpleJava();
		j.IsNumberTwoDigit();
	}

}
