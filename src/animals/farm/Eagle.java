package animals.farm;

public class Eagle extends Animale {

	@Override
	public void sound() {
		System.out.println("Keeeik!");
	}

	@Override
	public void eat() {
		System.out.println("Meat");
	}
	
}

