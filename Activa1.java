package OopsConcept;

//Final methods
//100% interface
//interface interface_name{
	//declare constant
	//abstract methods only
	//default
//}	

// Third Interface
class Activa1 implements Honda1,TwoWheeler{
	public void run() {
		System.out.println("Running implements successfully...");
		
	}
	public void twoWheeler() {
		System.out.println("Two Wheeler interface implement successfully...");
	}
	
	public static void main(String args[]) {
		Activa1 n = new Activa1();
		n.run();
		n.twoWheeler();
	}
}
