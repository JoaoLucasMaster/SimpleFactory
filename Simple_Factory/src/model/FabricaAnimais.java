package model;

public class FabricaAnimais {

	public static Animais fabricacao(int id)
	{
		if(id==1)
		{
			return new Cachorro();
		}
		else if(id==2)
		{
			return new Gato();
		}
		else if(id==3)
		{
			return new Pato();
		}
		
		return null;
	}
	
}
