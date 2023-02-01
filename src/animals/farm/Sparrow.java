package animals.farm;

public class Sparrow extends Animale implements Flyer {

	@Override
	public void sound() {
		System.out.println("Cip! Cip!");
	}

	@Override
	public void eat() {
		System.out.println("Seeds");
	}

	@Override
	public void fly() {
		System.out.println("The sparrow is flying");
	}
	
}

