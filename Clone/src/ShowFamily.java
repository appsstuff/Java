import javax.swing.plaf.synth.SynthSeparatorUI;

public class ShowFamily {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
	
		
		Address address = new Address("Egypt", "Cairo", "Giza", 11121);
		
		Human father = new Human(1000, "Father", 40, "Male", address);
		Human son    = (Human) father.clone();
		
		son.getAddress().setCity("Alex");
		father.getAddress().setCountry("USA");
    	System.out.println("Father address " + father.getAddress());
		System.out.println("Son    address " + son.getAddress());
	}}