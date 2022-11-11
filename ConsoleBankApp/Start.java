import java.lang.*;
import classes.*;
import interfaces.*;
import fileio.*;
import java.util.*;

public class Start
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Bank b = new Bank();
		FileReadWriteDemo frwd = new FileReadWriteDemo();
		
		boolean choice = true;
		
		while(choice)
		{
			System.out.println("Choose from the Following Options: ");
			System.out.println("--------------------------------------");
			System.out.println("1. Employee Management");
			System.out.println("2. Customer Management");
			System.out.println("3. Customer Account Management");
			System.out.println("4. Account Transaction Management");
			System.out.println("5. Exit");
			System.out.println("--------------------------------------\n");
			
			System.out.print("You have choosed: ");
			int option = sc.nextInt();
			
			switch(option)
			{
				case 1:
				
					System.out.println("********************");
					System.out.println("Employee Management");
					System.out.println("What do you want to do?\n");
					System.out.println("--------------------------------------");
					System.out.println("1. Insert New Employee");
					System.out.println("2. Get An Employee");
					System.out.println("3. Remove an Existing Employee");
					System.out.println("4. Show All Employees");
					System.out.println("5. Go Back");
					System.out.println("--------------------------------------\n");
					System.out.print("Enter your option: ");
					int input1 = sc.nextInt();
					
					switch(input1)
					{
						case 1:
							
							System.out.println("#####################");
							System.out.println("Insert New Employee");
							
							System.out.print("Enter Employee ID: ");
							String empId1 = sc.next();
							
							System.out.print("Enter Employee Name: ");
							String name1 = sc.next();
							
							System.out.print("Enter Employee Salary: ");
							double salary = sc.nextDouble();
							
							Employee e1 = new Employee();
							e1.setEmpId(empId1);
							e1.setName(name1);
							e1.setSalary(salary);
							
							b.insertEmployee(e1);
							
							System.out.println("#####################");
							break;
							
						case 2:
							
							System.out.println("#####################");
							System.out.println("Get An Employee");
							
							System.out.print("Enter Employee ID: ");
							String empId2 = sc.next();
							
							Employee e2 = b.getEmployee(empId2);
							
							if(e2 !=null)
							{
								System.out.println("Employee ID: "+e2.getEmpId());
								System.out.println("Employee Name: "+e2.getName());
								System.out.println("Employee Salary: "+e2.getSalary());
							}
							else
							{
								System.out.println("Employee Does Not Exists");
							}
							System.out.println("#####################");
							break;	

						case 3:
							
							System.out.println("#####################");
							System.out.println("Remove Existing Employee");
							
							System.out.print("Enter Employee ID: ");
							String empId3 = sc.next();
							
							Employee e3 = b.getEmployee(empId3);
							b.removeEmployee(e3);
							
							//b.removeEmployee(b.getEmployee(empId3));
							
							System.out.println("#####################");
							break;	

						case 4:
							
							System.out.println("#####################");
							System.out.println("Show All Employees");
							
							b.showAllEmployees();
							System.out.println("#####################");
							break;	

						case 5:
							
							System.out.println("#####################");
							System.out.println("Go Back");
							System.out.println("#####################");
							break;
							
						default:
							System.out.println("#####################");
							System.out.println("Invaild Choice");
							System.out.println("#####################");
							break;
					}
					System.out.println("********************");
					break;
				
				case 2:
				
					System.out.println("********************");
					System.out.println("Customer Management");
					System.out.println("What do you want to do?\n");
					System.out.println("--------------------------------------");
					System.out.println("1. Insert New Customer");
					System.out.println("2. Get A Customer");
					System.out.println("3. Remove an Existing Customer");
					System.out.println("4. Show All Customers");
					System.out.println("5. Go Back");
					System.out.println("--------------------------------------\n");
					System.out.print("Enter your option: ");
					int input2 = sc.nextInt();
					
					switch(input2)
					{
						case 1:
							
							System.out.println("#####################");
							System.out.println("Insert New Customer");
							
							System.out.print("Enter Customer Nid: ");
							int nid1 = sc.nextInt();
							
							System.out.print("Enter Customer Name: ");
							String name1 = sc.next();
			
							Customer c1 = new Customer();
							c1.setNid(nid1);
							c1.setName(name1);
				
							b.insertCustomer(c1);
							
							System.out.println("#####################");
							break;
							
						case 2:
							
							System.out.println("#####################");
							System.out.println("Get A Customer");
							
							System.out.print("Enter Customer Nid: ");
							int nid2 = sc.nextInt();
							
							Customer c2 = b.getCustomer(nid2);
							
							if(c2 !=null)
							{
								System.out.println("Customer NID: "+c2.getNid());
								System.out.println("Customer Name: "+c2.getName());
								c2.showAllAccounts();
							}
							else
							{
								System.out.println("Customer Does Not Exist");
							}
							System.out.println("#####################");
							break;	

						case 3:
							
							System.out.println("#####################");
							System.out.println("Remove Existing Employee");
							
							System.out.print("Enter Customer NID: ");
							int nid3 = sc.nextInt();
							
							Customer c3 = b.getCustomer(nid3);
							b.removeCustomer(c3);
							
							//b.removeCustomer(b.getcustomer(nid3));
							
							System.out.println("#####################");
							break;	

						case 4:
							
							System.out.println("#####################");
							System.out.println("Show All Customers");
							
							b.showAllCustomers();
							System.out.println("#####################");
							break;	

						case 5:
							
							System.out.println("#####################");
							System.out.println("Go Back");
							System.out.println("#####################");
							break;
							
						default:
							System.out.println("#####################");
							System.out.println("Invaild Choice");
							System.out.println("#####################");
							break;
					}
					System.out.println("********************");
					break;
					
				case 3:
				
					System.out.println("********************");
					System.out.println("Customer Account Management");
					
					System.out.println("What do you want to do?\n");
					System.out.println("--------------------------------------");
					System.out.println("1. Insert New Account for a Customer");
					System.out.println("2. Get An Account of a Customer");
					System.out.println("3. Remove an Existing Account of a Customer");
					System.out.println("4. Show All Accounts of a Customer");
					System.out.println("5. Go Back");
					System.out.println("--------------------------------------\n");
					System.out.print("Enter your option: ");
					int input3 = sc.nextInt();
					
					switch(input3)
					{
						case 1:
						
							System.out.println("#####################");
							System.out.println("Insert New Account of a Customer\n");
							
							System.out.println("Which Type of Account Do you Want to Create?");
							System.out.println("1. Savings Account");
							System.out.println("2. Fixed Account");
							System.out.println("3. Go Back");
							
							System.out.print("Your Type: ");
							int type = sc.nextInt();
							
							Account a = null;
							
							if(type == 1)
							{
								System.out.print("Enter Account Number: ");
								int an1 = sc.nextInt();
								System.out.print("Enter Account Balance: ");
								double balance1 = sc.nextDouble();
								System.out.print("Enter Interest Rate: ");
								double ir1 = sc.nextDouble();
								
								SavingsAccount sa = new SavingsAccount();
								
								sa.setAccountNumber(an1);
								sa.setBalance(balance1);
								sa.setInterestRate(ir1);
								
								a = sa;
							}
							else if(type == 2)
							{
								System.out.print("Enter Account Number: ");
								int an1 = sc.nextInt();
								System.out.print("Enter Account Balance: ");
								double balance1 = sc.nextDouble();
								System.out.print("Enter Tenure Year: ");
								int ty1 = sc.nextInt();
								
								FixedAccount fa = new FixedAccount();
								
								fa.setAccountNumber(an1);
								fa.setBalance(balance1);
								fa.setTenureYear(ty1);
								
								a = fa;
							}
							else if(type == 3)
							{
								System.out.println("Going Back....");
							}
							else
							{
								System.out.println("Invalid Type");
							}
							
							
							if(a != null)
							{
								System.out.print("Enter Customer NID: ");
								int nid1 = sc.nextInt();
								
								b.getCustomer(nid1).insertAccount(a);
								
								/*
								Customer cc = b.getCustomer(nid1);
								cc.insertAccount(a);
								*/
							}
							
							System.out.println("#####################");
							break;
							
						case 2:
						
							System.out.println("#####################");
							System.out.println("Get An Account of a Customer");
							
							System.out.print("Enter Customer NID: ");
							int nid2 = sc.nextInt();
							System.out.print("Enter Account Number: ");
							int an2 = sc.nextInt();
							
							
							Account aa = b.getCustomer(nid2).getAccount(an2);
							
							/*
							Customer cc = b.getCustomer(nid2);
							Account aa = cc.getAccount(an2);
							*/
							
							if(aa != null)
							{
								aa.showInfo();
							}
							
							System.out.println("#####################");
							break;
							
						case 3:
						
							System.out.println("#####################");
							System.out.println("Remove an Existing Account of a Customer");
							
							System.out.print("Enter Customer NID: ");
							int nid3 = sc.nextInt();
							System.out.print("Enter Account Number: ");
							int an3 = sc.nextInt();
							
							b.getCustomer(nid3).removeAccount(b.getCustomer(nid3).getAccount(an3));
							
							/*
							Customer cc = b.getCustomer(nid3);
							Account aa = cc.getAccount(an3);
							cc.removeAccount(aa);
							*/
							
							System.out.println("#####################");
							break;
							
						case 4:
						
							System.out.println("#####################");
							System.out.println("Show All Accounts of a Customer");
							System.out.print("Enter Customer NID: ");
							int nid4 = sc.nextInt();
							
							b.getCustomer(nid4).showAllAccounts();
							
							System.out.println("#####################");
							break;
						
						case 5:
						
							System.out.println("#####################");
							System.out.println("Going Back ....");
							System.out.println("#####################");
							break;
							
						default:

							System.out.println("#####################");
							System.out.println("Invalid Option");
							System.out.println("#####################");
							break;
						
					}
					
					System.out.println("********************");
					break;
								
				case 4:
				
					System.out.println("********************");
					System.out.println("Account Transactions Management");
					
					
					System.out.println("What do you want to do?\n");
					System.out.println("--------------------------------------");
					System.out.println("1. Deposit Money");
					System.out.println("2. Withdraw Money");
					System.out.println("3. Transfer Money");
					System.out.println("4. Show Transaction History");
					System.out.println("5. Go Back");
					System.out.println("--------------------------------------\n");
					
					System.out.print("Enter your option: ");
					int input4 = sc.nextInt();
					
					switch(input4)
					{
						case 1:
						
							System.out.println("#####################");
							System.out.println("Deposit Money\n");
							
							System.out.print("Enter Customer NID: ");
							int nid1 = sc.nextInt();
							System.out.print("Enter Account Number: ");
							int an1 = sc.nextInt();
							System.out.print("Enter Deposit Amount: ");
							double amount1 = sc.nextDouble();
							
							if(amount1>0)
							{
								b.getCustomer(nid1).getAccount(an1).deposit(amount1);
								
								/*
								Customer cc = b.getCustomer(nid1);
								Account aa = cc.getAccount(an1);
								aa.deposit(amount1);
								*/
								
								//frwd.writeInFile("$"+amount1+" has been Deposited in Account Number "+ an1);
								frwd.writeInFile("Deposit	: $"+ amount1+" in "+ an1);
							}
							
							System.out.println("#####################");
							break;
							
						case 2:
						
							System.out.println("#####################");
							System.out.println("Withdraw Money");
							
							System.out.print("Enter Customer NID: ");
							int nid2 = sc.nextInt();
							System.out.print("Enter Account Number: ");
							int an2 = sc.nextInt();
							System.out.print("Enter Withdraw Amount: ");
							double amount2 = sc.nextDouble();
							
							if(amount2>0 && amount2 <= b.getCustomer(nid2).getAccount(an2).getBalance())
							{
								b.getCustomer(nid2).getAccount(an2).withdraw(amount2);
								
								/*
								Customer cc = b.getCustomer(nid2);
								Account aa = cc.getAccount(an2);
								aa.withdraw(amount2);
								*/
								
								frwd.writeInFile("Withdraw	: $"+ amount2+" from "+ an2);
							}
							
							System.out.println("#####################");
							break;
							
						case 3:
						
							System.out.println("#####################");
							System.out.println("Transfer Money");
							
							System.out.print("Enter From Customer NID: ");
							int fromNid = sc.nextInt();
							System.out.print("Enter From Account Number: ");
							int fromAN = sc.nextInt();
							System.out.print("Enter Transfer Amount: ");
							double amount3 = sc.nextDouble();
							
							System.out.print("Enter To Customer NID: ");
							int toNid = sc.nextInt();
							System.out.print("Enter To Account Number: ");
							int toAN = sc.nextInt();
							
							if(amount3>0 && amount3 <= b.getCustomer(fromNid).getAccount(fromAN).getBalance())
							{
								b.getCustomer(fromNid).getAccount(fromAN).transfer(b.getCustomer(toNid).getAccount(toAN), amount3);
								
								/*
								Customer fromCustomer = b.getCustomer(fromNid);
								Customer toCustomer = b.getCustomer(toNid);
								
								Account fromAccount = fromCustomer.getAccount(fromAN);
								Account toAccount = toCustomer.getAccount(toAN);
								
								fromAccount.transfer(toAccount, amount3);
								*/
								
								frwd.writeInFile("Transfer	: $"+amount3 +" from "+fromAN+" to "+toAN);
								
							}
							
							System.out.println("#####################");
							break;
							
						case 4:
						
							System.out.println("#####################");
							System.out.println("Show Transaction History");
							frwd.readFromFile();
							
							System.out.println("#####################");
							break;
							
						case 5:
						
							System.out.println("#####################");
							System.out.println("Going Back..");
							System.out.println("#####################");
							break;
							
						default:
						
							System.out.println("#####################");
							System.out.println("Invalid Option");
							System.out.println("#####################");
							break;
					}
					
					System.out.println("********************");
					break;
								
				case 5:
				
					System.out.println("********************");
					System.out.println("Exit");
					choice = false;
					System.out.println("********************");
					break;
					
				default:
				
					System.out.println("********************");
					System.out.println("Invalid Option");
					System.out.println("********************");
					break;
			}
			
		}
		
		
	}
}
