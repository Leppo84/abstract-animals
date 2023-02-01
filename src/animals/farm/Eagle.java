package animals.farm;

public class Eagle extends Animale implements Flyer {

	@Override
	public void sound() {
		System.out.println("Keeeik!");
	}

	@Override
	public void eat() {
		System.out.println("Meat");
	}

	@Override
	public void fly() {
		System.out.println("The eagle is flying");
		
		
	}
	
	
	
}

