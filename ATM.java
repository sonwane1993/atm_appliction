package in.ineuron.atm;

import java.util.HashMap;
import java.util.Scanner;


class Data{
	
	float balance;
	
}
class ATMop{

//	float balance;

	Scanner sc= new Scanner(System.in);

	HashMap<Integer, Data> map = new HashMap<>();

	 public ATMop() {
		
		System.out.println("******************************");
		System.out.println("Welcome to our ATM");
		System.out.println("******************************");

		op();
	}
	
	public void menu(Data obj) {
		
		System.out.println("******************************");

		System.out.println("Please Enter valid number");

		System.out.println("1. check balance");
		System.out.println("2. deposit mouny");
		System.out.println("3. withdraw mouny");
		System.out.println("4. check another account");
		System.out.println("5. exit");

		int x = sc.nextInt();
		if(x == 1)
		{
			check_balance(obj);
			
		}else if(x == 2){
			
			deposit(obj);
			
		}else if(x == 3){
			
			withdew(obj);
			
		}else if(x == 4){
			
			op();
			
		}else if(x == 5){
			
			System.out.println("Thank you!");
			
		}else {
			System.out.println("Please Enter valid number");
			menu(obj);
		}
		
	}

	public void check_balance(Data obj) {

		System.out.println("******************************");

		System.out.println("your balance "+ obj.balance);
		
		System.out.println("******************************");
		menu(obj);

		
		
	}

	public void deposit(Data obj) {
		
		System.out.println("******************************");
		System.out.println("enter your amount");
		float a = sc.nextFloat();
		obj.balance = obj.balance + a;
		
		System.out.println("******************************");
		System.out.println("amount deposit succesfully");
		System.out.println("******************************");

		menu(obj);
	}

	public void withdew(Data obj) {

		System.out.println("******************************");

		System.out.println("enter your amount");
		float a = sc.nextFloat();
		
		if(obj.balance >= a) {
		obj.balance = obj.balance-a;
		System.out.println("amount withdew succesfully");
		}else {
			System.out.println("Insufficent balance");
		}
		
		System.out.println("******************************");
		menu(obj);

	}
	
	
	
	
	public void op() {

		System.out.println("enter your pin code");
		int pincode = sc.nextInt();
		
		if(map.containsKey(pincode) == true) {
			
			Data obj = map.get(pincode);
			menu(obj);
			
		}else {
			
			System.out.println("******************************");
			System.out.println("please create account frist");
			System.out.println("set your pin code");
			int pin = sc.nextInt();
			
			Data obj = new Data();  // for new Account
			map.put(pin,obj);
			menu(obj);
			
		}
		
		
	}
	
	 
}


public class ATM {

	public static void main(String[] args) {


		ATMop obj = new ATMop();
		
	}
	

}
