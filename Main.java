package Bank;

/*
// Single Level Inheritance
// Base class
class Reserved_bank{
	String location;
	int bank_id;
	public void msgInfo(String location) {
		System.out.println("Reserved bank Location : " + location);
	}
}
// Derived Class
class SBI extends Reserved_bank {
	public void msgInfo(int bank_id) {
		System.out.println("Bank Id : " + bank_id);
	}
}
public class Main{
	public static void main(String[] args) {
	// Creating Object
		SBI b = new SBI();
		b.msgInfo("Bandra Kurla Complex, Bandra East, Mumbai");
		b.msgInfo(400051);
	}
}
*/
//................................................................

/*
// Multilevel Inheritance
// Parent class
class Reserved_bank{
	String location;
	int bank_id;
	double employee;
	public void msgInfo(String location) {
		System.out.println("Reserved bank Location : " + location);
	}
}
// (Child class:SBI bank) (Parent class : Reserved bank)
class SBI extends Reserved_bank {
	public void msgInfo(int bank_id) {
		System.out.println("Bank Id : " + bank_id);
	}
}
// (Child class:HDFC) (Parent class :SBI bank)
class HDFC extends SBI{
	public void msgInfo(double employee) {
		System.out.println("Total Employee : "+ employee);
	}
}
public class Main{
	public static void main(String[] args) {
	// Creating Object
		HDFC b = new HDFC();
		b.msgInfo("Bandra Kurla Complex, Bandra East, Mumbai");
		b.msgInfo(400051);
		b.msgInfo(78.6d);
	}
}
*/

//.............................................................

/*
//  3
// Hierarchical Inheritance
// Parent class
class Reserved_bank{
	String location;
	int bank_id;
	double employee;
	public void msgInfo(String location) {
		System.out.println(location);
	}
}
// (Child class : SBI) (Parent class : Reserved bank)
class SBI extends Reserved_bank {
	public void msgInfo(String location,int bank_id) {
		System.out.println("Bank Location : " + location + "\nBank Id : " +bank_id);
	}
}
class IndianOverseas extends Reserved_bank{
	public void msgInfo(String location,int bank_id,double employee) {
		System.out.println("Bank Location : "+location+"\nBank Id : " + bank_id+ "\nTotal Employees : " +  employee);
	}
}
public class Main{
	public static void main(String[] args) {
	// Creating Object
		IndianOverseas b = new IndianOverseas();
		b.msgInfo("Information about Reserved and IndianOverseas bank");
		b.msgInfo("Bandra Kurla Complex, Bandra East, Mumbai",400051,78.6d);
		System.out.println();
		// Creating new Object
		SBI b1 = new SBI();
		b1.msgInfo("Information about Reserved and SBI bank");
		b1.msgInfo("Bandra Kurla Complex, Bandra East, Mumbai", 784503);
		
		
	}
}
*/

/*
//   4
// Using Super key word
class Reserved_bank{
	String location = "Bandra Kurla Complex, Bandra East, Mumbai";
	int bank_id = 4010798;
	public void msgInfo() {
		System.out.println("Bandra Kurla Complex, Bandra East, Mumbai");
	}
	// Parent class Constructor
	Reserved_bank(){
		System.out.println("Reserver Bank");
	}
}
class SBI extends Reserved_bank {
//Child class constructor
	SBI(){
		// Using Super keyword to fetch information of The Parent class Contractor 
		super();
		System.out.println("Parent class Constructor");
		// Using Super Keyword to fetch the information of Base class method
		System.out.println("\nBase Class Method ");
		super.msgInfo();
		//Using Super Keyword to fetch the information of Super class variable
		System.out.println("\nSuper class variable information");
		System.out.println(super.bank_id);
		System.out.println(super.location);
		//Derived class value
		System.out.println("\nChild class");
		System.out.println("SBI Bank ....");
		//super();   //error
	}
}
public class Main{
	public static void main(String[] args) {
	// Calling constructor
		SBI b = new SBI();
	}
}
*/


class Reserved_bank{
	String location = "Bandra Kurla Complex, Bandra East, Mumbai";
	int bank_id = 4010798;
	public void msgInfo() {
		System.out.println("Bandra Kurla Complex, Bandra East, Mumbai");
	}
	// Parent class Constructor
	Reserved_bank(){
		System.out.println("Reserver Bank");
	}
}
class SBI extends Reserved_bank {
//Child class constructor
	SBI(){
		System.out.println("SBI bank");
	}
}
class IndianOverseas extends Reserved_bank{
	public void msgInfo(String location,int bank_id,double employee) {
		System.out.println("Bank Location : "+location+"\nBank Id : " + bank_id+ "\nTotal Employees : " +  employee);
	}
	IndianOverseas(){
		super();
		System.out.println("......");
	}
}

public class Main{
	public static void main(String[] args) {
	// Calling constructor
		SBI b = new SBI();
	}
}