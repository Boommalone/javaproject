package Deposit;

import java.util.Scanner;

public class Accounts {
	
	String name;
	int pass;
	int call;
	int balance;
	int previonsTransaction;
	
	Accounts(String name,int call){
		
		this.name = name;
		this.call = call;
		
	}
	
	void withdraw(int amount) {
		
		
		balance = balance - amount;
		previonsTransaction = -amount;
	}
	void deposit(int amount) {
		balance = balance + amount;
		previonsTransaction = amount;
	
	}
	
	
	void previonsTransaction() {
	
		if(previonsTransaction < 0) {
			System.out.println("ถอนเงิน"+ previonsTransaction );
		}
		else if(previonsTransaction > 0) {
			System.out.println("ฝากเงิน"+ previonsTransaction );
		}
		else {
			System.out.println("ไม่มีธุระกรรมเกิดขึ้น");
		}
	
	}
	void showManu() {
		
		char option;
		
		System.out.println("Welcome "+ name +"\n");
		System.out.println("===================");
		
		Scanner data = new Scanner(System.in);
				
		System.out.println("| D |เงินฝาก ");
		System.out.println("| W |เพื่อถอนเงิน ");
		System.out.println("| P |ธุระกรรมก่อนหน้า ");
		System.out.println("| B |เช็คยอด ");
		System.out.println("| E |กลับสู่เมนู ");
		
		
		
		do {
		System.out.println("===== ป้อนตัวเลือก ======");
		option = data.next().charAt(0);
		switch(option) {
		
		
		case 'D':
		System.out.println("ต้องฝากเงินเท่าไหร่");
		int amountD = data.nextInt();
		deposit(amountD);
		break;
		
		case 'W':
			System.out.println("ต้องการถอนเท่าไหร่");
			int amountW = data.nextInt();
			withdraw(amountW);
			break;
			
		case 'B':
			System.out.println("เช็คยอด "+ balance);
			break;
			
		case 'P':
			previonsTransaction();
			
			//System.out.println("ต้องการฝากเท่าไหร่");
			//int amountP = data.nextInt();
			//deposit(amountP);
			break;
		
		
			
		case 'E':
			System.out.println("กลับสู่เมนู");
			break;
			
			default:
				System.out.println();
		}
		
		}while(option != 'E');
		
		
		
		
		
	}
}
