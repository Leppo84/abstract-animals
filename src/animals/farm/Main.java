//	**Esercizio 1 : classi astratte**
//	Dobbiamo realizzare un programma che rappresenti il regno animale.
//	Creiamo quindi una classe astratta Animale e delle classi che la estendono : Cane, Passerotto, Aquila, Delfino
//	Vogliamo che gli animali abbiano i seguenti metodi
//	- void dormi() (mostra a video “Zzz”)
//	- void verso() (mostra a video il verso fatto dall'animale specifico)
//	- void mangia() (mostra a video quello che mangia : erba, carne, ...?)
//	Quali di questi metodi devono essere implementati nella classe astratta e quali devono essere lasciati astratti e implementati dalle classi che la estendono?
//	Una volta create le classi, nel programma istanziare alcuni animali e utilizzare i metodi implementati.
//	**Esercizio 2 : interfacce**
//	Alcuni degli animali che abbiamo creato volano, altri nuotano.
//	Gli animali che volano hanno il seguente metodo :
//	- void vola() (mostra a video “Sto volando!!!”)
//	Gli animali che nuotano hanno il seguente metodo :
//	- void nuota() (mostra a video “Sto nuotando!!!”)
//	Scrivere un programma avente 2 metodi :
//	- void faiVolare(IVolante animale)
//	- void faiNuotare(INuotante animale)
//	Questi metodi prendono come parametro un animale che può o volare / nuotare e richiamano il corrispondente metodo vola() / nuota().
//	Scrivere un programma che istanzi animali che volano o nuotano e richiamare i metodi faiVolare / faiNuotare passandoglieli come parametro.

package animals.farm;

import java.util.Scanner;

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
		willy.swim();
		
		Eagle fiona = new Eagle();
		System.out.println("Aquila: ");
		fiona.fly();
		
		Scanner nv= new Scanner (System.in);
		
		String command = "";
		
		System.out.println("Che animale vuoi vedere?");
		System.out.println("d: per delfino");		
		System.out.println("a: per aquila");		
		System.out.println("p: per passerotto");
		command=(nv.nextLine());

		
		if (command.equals("d")) {
			willy.swim();
		}
		if (command.equals("a")) {
			fiona.fly();
		}
		if (command.equals("p")) {
			titti.fly();
		}
		else {
			System.out.println("Non funziona qualcosa");			
		}
		System.out.println("Torna a trovarci");
		nv.close();
	}
}
