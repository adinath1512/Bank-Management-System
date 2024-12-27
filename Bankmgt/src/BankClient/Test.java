package BankClient;
import java.util.Scanner;

import BankClient.*;
import BankModel.*;
import BankService.*;
import BnakServiceImpl.Sbi;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Rbi bank=new Sbi();
		boolean flag=true;
		while(flag)
		{
			System.out.println("Enter Your Choice");
		System.out.println("1.Create New Account\n2.Display All Details\n3.Deposite Money\n4.Cheack Balance\n5.Exit");
		int ch=sc.nextInt();
			if (ch==1) {
				bank.createAccount();
				
				
			}
			else if (ch==2)
			{
				bank.displayAllDetails();
				
			}

			else if (ch==3) {
				bank.dpositeMoney();
				
			}

			else if (ch==4)
			{
				bank.balenceCheck();
				break;
			}
			else if  (ch==5)
			{
				System.out.println("Scesfully Exit");
				flag=false;
			}
			else{
				System.out.println("Wrong Choice");
			}
			
		}
		
		
		

	}

}
