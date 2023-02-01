package animals.farm;

public class Main {

	public static void main(String[] args) {
		
		Dog rex = new Dog();
		System.out.println("Cane: ");
		rex.sound();
		rex.sleep();
		
		Sparrow titti = new Sparrow();
		System.out.println("Passerotto: ");
		titti.eat();
		titti.sleep();
		
		Dolphin willy = new Dolphin();
		System.out.println("Delfino: ");
		willy.eat();
		willy.sound();
		willy.sleep();
		
		
	}

}
