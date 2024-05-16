package oopconcept;

import java.util.Scanner;

public class BankApplication {
	int balanceAmount;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Bankmethods ob = new Bankmethods();
		BankApplication obj = new BankApplication();

		String str = "yes";
		while (str.equals("yes")) {
			System.out.println("Select Your Service");
			System.out.println("1.Account Details  2.Balance  3.Deposit  4.Withdraw");
			int ch = sc.nextInt();

			switch (ch) {

			case 1:
				ob.detail(obj.balanceAmount);
				break;

			case 2:
				ob.balance(obj.balanceAmount);
				break;

			case 3:
				obj.balanceAmount = ob.deposit(obj.balanceAmount);
				break;

			case 4:
				obj.balanceAmount = ob.withdraw(obj.balanceAmount);
				break;

			default:
				System.out.println("Invalid Choice");
			}
			System.out.println("Do you want to continue: yes/no ");
			str = sc.next();

		}
		sc.close();
	}

}

interface banks {
	public void detail(int bAmount);

	public void balance(int bAmount);

	public int deposit(int bAmount);

	public int withdraw(int bAmount);

}

class Bankmethods implements banks {

	Scanner sc = new Scanner(System.in);

	@Override
	public void detail(int bAmount) {
		String name, acno;
		System.out.println("Enter Your Name: ");
		name = sc.next();
		System.out.println("Enter Account Number: ");
		acno = sc.next();
		System.out.println("Account Number : " + acno);
		System.out.println("Account Holder Name: " + name);
		System.out.println("Your Balance : " + bAmount);

	}

	@Override
	public void balance(int bAmount) {
		System.out.println("Your Balance : " + bAmount);

	}

	@Override
	public int deposit(int bAmount) {

		System.out.println("Enter Amount: ");
		int dAmount = sc.nextInt();
		return bAmount += dAmount;

	}

	@Override
	public int withdraw(int bAmount) {
		System.out.println("Enter Amount: ");
		int wAmount = sc.nextInt();
		if (wAmount <= bAmount) {
			System.out.println("Get Your Cash");
			return bAmount -= wAmount;
		} else {
			System.out.println("Insufficent Balance");
			return bAmount;
		}
	}

}
