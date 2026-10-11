 package Student;
import java.util.Scanner;
 class customer{
	String Fname;
	String Mname;
	String Lname;
	int age;
	String Email;
	String Address;
	long Mobileno;
	customer(String Fname, String mname, String Lname,int age, String Email, String Address, long Mobileno){
		this.Fname=Fname;
		this.Mname= Mname;
		this.Lname= Lname;
		this.age=age;
		this.Email= Email;
		this.Address=Address;
		this.Mobileno=Mobileno;
	}
	void Detail() {
		System.out.println("********************");
		System.out.println("Your Details: \nYour Name: "+" "+Fname+"\nYour Age: "+ age+"\nEmail: "+Email+"\nPayment Sucessufuly Done " );
		System.out.println("********************");
	}	
} 
public class Bank_Management_System 
{	
	 static Scanner sc = new Scanner(System.in);
	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception{
		
		System.out.println(                  "~~~~~~~~~~WELCOME~~~~~~~~~~\n");
		
		int num;
		do 
		{
		System.out.println("Press 9 For Enter The Bank Management System\n");
		num = sc.nextInt();
		//sc.nextLine();
		try 
		{
		if(num!=9) 
		{
			throw new Exception("Wrong Press! Please Again Press 9: ");
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		}while(num!=9);
		System.out.println("Welcome Sir, May I Help U!\n");
		
       //double balance=500;
		
		while(true) 			
		{
		System.out.println("1.New Account Open.\n2.Deposite Money.\n3.Withdraw Money.\n4.Transfer Money\n5.Check Balance.");
		Scanner DE = new Scanner(System.in);
		System.out.println("\nEnter The Choice: ");
		int choice =DE.nextInt();		
		switch(choice) 
		{
		case 1: 
			    System.out.println("Enter Your  First Name: ");			
				String Fnm = DE.nextLine();				
				System.out.println("Enter Your Middle Name: ");
				String Mnm = DE.nextLine();
				System.out.println("Enter Your Last Name: ");
				String Lnm= DE.nextLine();
				System.out.println("Enter Your Age: ");
				int age = DE.nextInt();
				System.out.println("Enter Your Email: ");
				String Email = DE.next();
				System.out.println("Enter Your Address: ");
				String Add = DE.nextLine();
				System.out.println("Enter Your Mobile Number: ");
				long Mno=DE.nextLong();
				customer c= new customer(Fnm,Mnm,Lnm,age,Email,Add,Mno);
				c.Detail();
				int amount=0;
				do
				{
					System.out.println("Enter Openning Amount Maximum 2500/-");
					amount = sc.nextInt();
					try
					{
					if(amount<2500) 
					{
						throw new Exception("Less Amount! Please Enter Valid Amount: ");						
					}
					}
					catch(Exception e)
					{
						System.out.println(e);
					}
				    }    while(amount <2500);
				System.out.println("********************");
				break;
		case 2:
			System.out.println("Enter The Deposite Amount: ");
			int amo= DE.nextInt();
			
			break;
		case 3:
			System.out.println(" Hello From Case Three");
			break;
		case 4:
			System.out.println("Enter The Amount As Much As You Want: ");
			break; 
		case 5:
			System.out.println("Enter The PIN: ");
			System.out.println("Your balance Is");
				}
		}
	}
	
}
