
public class Primerejercicio {

	public static void main(String[] args) {
	
		Persona p1=new Persona();
		p1.edad=20;
		p1.nombre="Ceci";
		
		Persona p2=new Persona();
		p2.edad=1;
		p2.nombre="Catalina";
		double suma=0;
		//int vueltas=0;
		Persona[] lista=new Persona[] {p1,p2};
		for (int i=0;i<lista.length;i++) {
			//System.out.println(lista[i].edad+ " " +lista[i].nombre);
			
			
			suma=suma+lista[i].edad;
			
			//vueltas++;
		}
		
		System.out.println(suma);
		//System.out.println(suma/vueltas);
		System.out.println(suma/lista.length);
		
		
		
		

	}

}
