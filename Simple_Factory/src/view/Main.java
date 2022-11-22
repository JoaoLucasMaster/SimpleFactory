package view;

import model.*;

public class Main {

	public static void main(String[] args) {
		
	Animais cachorro = FabricaAnimais.fabricacao(1);
	System.out.println(cachorro.acaoAnimal());
	
	Animais gato=FabricaAnimais.fabricacao(2);
	System.out.println(gato.acaoAnimal());
	
	Animais pato=FabricaAnimais.fabricacao(3);
	System.out.println(pato.acaoAnimal());
	
	}

}
