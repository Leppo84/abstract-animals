package animals.farm;

public class Sparrow extends Animale {

	@Override
	public void sound() {
		System.out.println("Cip! Cip!");
	}

	@Override
	public void eat() {
		System.out.println("Seeds");
	}
	
}

