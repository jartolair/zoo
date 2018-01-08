package zoo;

public class Pez extends Animal {
	
	Pez() {
		super("pez", 0);
	}

	@Override
	public void mostrar() {
		System.out.println("Soy un "+super.getEspecie() + " con "+ super.getPatas()+" patas");
		
	}

}
