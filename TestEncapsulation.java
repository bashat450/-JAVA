package OopsConcept;

public class TestEncapsulation {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "Neha";
		System.out.println(s1.name);
		// Using Private Id
		s1.setId(101);
		System.out.println(s1.getId());
		//Using Private Password
		s1.setPassword("123@bas!");
		System.out.println(s1.getPassword());
		
		
		
		

	}

}
