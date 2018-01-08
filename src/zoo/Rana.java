package zoo;

public class Rana extends Animal{

	private String Color;
	
	
	//Constructores
	
	public Rana(){
		
	}
	
	public Rana(String Color) {
		super("Rana",4);
		this.setColor(Color);
	}
	
	//Getters y Setters
	
	public String getColor() {
		return Color;
	}


	public void setColor(String color) {
		Color = color;
	}
	
	//MostrarInfo
	
	public void mostrar(){
		System.out.println("La especie es: " + super.getEspecie());
		System.out.println("Tiene " + super.getPatas() + " patas.");
		System.out.println("Es de color " + this.getColor());
	}
	
	

}