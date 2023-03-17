package javaprogram;

/*
public class EqualsMethodEx {
	int a=10;
	int b=20;
	int c;
	EqualsMethodEx(){
		System.out.println("Addition of a and b : ");
		c=a+b;
		System.out.println(c);
	}	

	public static void main(String[] args) {
		System.out.println("1st object is created : ");
		EqualsMethodEx e1 = new EqualsMethodEx();
		System.out.println("2st object is created : ");
		System.out.println(e1);
		EqualsMethodEx e2 = new EqualsMethodEx();
			
		System.out.println("Comparing object with equals method");
		System.out.println(e2);
		System.out.println(e1.equals(e2));
	}

}

//...............................................
*/
class Pen{
	private double price;
	int count;
	//constructor
	Pen(double price,int count){
		this.price=price;
		this.count=count;
	}
//Overriding equals() to compare object of pen class
	public boolean equals(Object obj){
		if(obj == this){
			return true;
		}
//check if obj is an instance of 
	//Pen class or  not null
	//instanceOf[type] also returns false
	if(!(obj instanceof Pen)){
		return false;
	}
	//object cast (similar type cast)
	Pen p =(Pen)obj;
	//compare data member and return type according 
	return Double.compare(price,p.price) == 0 && Integer.compare(count,p.count)==0;
	}
}
class EqualsMethodEx{
		public static void main(String args[]){
			Pen p1= new Pen(10.2,5);			
			Pen p2=new Pen(10.2,5);
			if(p1.equals(p2)){
				System.out.println(" object are Equal");
			}
			else{
				System.out.println("Not equal");
			}
		}
		
	}
