package zoo;

public class Main_JonA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal[] animales=new Animal[13];
		animales[0]=new Caballo(50);
		animales[1]=new Pinguino();
		animales[2]=new Gekko(20,40);
		animales[3]=new OsoPanda("Patxi", 4);
		animales[4]=new Perro("Lur", "Caniche");
		animales[5]=new Elefante(2);
		animales[6]=new Leon(31,1.5,10);
		animales[7]=new Lombriz(10);
		animales[8]=new Marmota(10);
		animales[9]=new Mono("Tom","Africana");
		animales[10]=new Pez();
		animales[11]=new Puercoespin(20);
		animales[12]=new Rana("rojo");
		
		for (int i = 0; i < animales.length; i++) {
			animales[i].mostrar();
			System.out.println("_________________");
		}

	}

}
