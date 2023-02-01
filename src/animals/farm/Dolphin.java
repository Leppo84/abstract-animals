package animals.farm;

public class Dolphin extends Animale implements Swimmer {

	@Override
	public void sound() {
		System.out.println("Thrrrrththt!");
	}

	@Override
	public void eat() {
		System.out.println("Fish");
	}
	
	@Override
	public void swim() {
		System.out.println("The dolphin is swimming");
	}
	
}

