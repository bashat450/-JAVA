package OopsConcept;

public class ProtectedEx extends ProtectedData{
	protected void msg() {
		System.out.println("Try to access protected data here");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProtectedData e1 = new ProtectedData();
		ProtectedEx e = new ProtectedEx();
		e1.msg();
		e.msg();

	}

}
