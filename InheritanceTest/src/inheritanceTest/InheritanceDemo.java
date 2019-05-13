package inheritanceTest;

public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car Toyota = new Car(4,5,false);
		System.out.println("Number of Doors on Toyota's Car : " + Toyota.getNumDoors());
		System.out.println("Number of Wheels on Toyota's Car : " + Toyota.getWheels());
		String electric;
		electric = Toyota.getIsElectric() ? "yes" : "no";
		System.out.println("Is the Toyota's Car electric ? "+ electric);		
		
		Convertible Warna = new Convertible(null);
		System.out.println("Number of Doors on Toyota's Car : " + Warna.getRoofType());
		String roofType;
		electric = Warna.getIsElectric() ? "yes" : "no";
		System.out.println("Is the Toyota's Car electric ? "+ electric);		
	}

}