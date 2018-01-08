package zoo;

public class Puercoespin extends Animal {
	
	//hereda las funciones de la clase animal con el super
	
	private int peso;
	
	/**
	 * @return the peso
	 */
	public int getPeso() {
		return peso;
	}

	/**
	 * @param peso the peso to set
	 */
	public void setPeso(int peso) {
		this.peso = peso;
	}

	public Puercoespin(int peso) {
		super("Puercoespin",4);
		this.setPeso(peso);
		
	}
	
	public void mostrar(){
		System.out.println("Soy un cuerpoespin y tengo 4 patas y peso "+this.getPeso()+"g");
	}

}
