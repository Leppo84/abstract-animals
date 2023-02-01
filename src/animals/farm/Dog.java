package animals.farm;

public class Dog extends Animale {

	@Override
	public void sound() {
		System.out.println("Woff!");
	}

	@Override
	public void eat() {
		System.out.println("Bisquit.");
	}
	
}

