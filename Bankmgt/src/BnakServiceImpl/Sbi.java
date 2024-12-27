package BnakServiceImpl;

import java.util.Scanner;

import BankModel.Account;
import BankService.Rbi;

public class Sbi implements Rbi {

	Scanner sc=new Scanner(System.in);
	Account acc=new Account();
	
	
	
	public void createAccount() {
		System.out.println("Enter Your Account No:");
		int accNo=sc.nextInt();
		acc.setAccNo(accNo);
		
		System.out.println("Enter Your Name:");
		String name=sc.next();
		acc.setName(name);
		
		System.out.println("Enter Your Adhar No:");
		int adharNo=sc.nextInt();
		acc.setAccNo(adharNo);
		
		System.out.println("Enter Your Gender:");
		String gender=sc.next();
		acc.setGender(gender);
		
		System.out.println("Enter Your Age:");
		int age=sc.nextInt();
		acc.setAge(age);
		
		System.out.println("Enter Your Account Balance");
		double accBal=sc.nextDouble();
		acc.setBalence(accBal);
		
		
		
		
		}

	
	public void displayAllDetails() {
		 
		 System.out.println("Account No:");
		
		
		
		
		
	}

	@Override
	public void dpositeMoney() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withdrawal() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void balenceCheck() {
		// TODO Auto-generated method stub
		
	}

}
