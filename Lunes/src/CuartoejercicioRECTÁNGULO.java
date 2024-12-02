
public class CuartoejercicioRECTÁNGULO {

	public static void main(String[] args) {
	
		Rectangulo r1=new Rectangulo();
		r1.base= 10;
		r1.altura=20;
		
		Rectangulo r2=new Rectangulo();
		r2.base=20;
		r2.altura=5;
		
		Rectangulo r3=new Rectangulo();
		r3.base=25;
		r3.altura=10;
		
		Rectangulo r4=new Rectangulo();
		r4.base=20;
		r4.altura=15;
		
		double suma=0;
		int vuelta=0;
		
		Rectangulo[] lista=new Rectangulo[] {r1,r2,r3,r4};
		for (int i=0;i<lista.length;i++) {
			
			suma=suma+lista[i].area();
			vuelta++;
			System.out.println("El area del rectángulo " + vuelta +" es "+lista[i].area());
			
		}
		System.out.println("La suma de las áreas es " +suma);
		
	
		
		
		
		

	}
	
	

}
