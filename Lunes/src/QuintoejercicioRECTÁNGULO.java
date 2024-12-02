
public class QuintoejercicioRECTÁNGULO {

	public static void main(String[] args) {
	
		Rectangulo r1=new Rectangulo();
		r1.setBase(2);
		r1.setAltura(5);
		
		Rectangulo r2=new Rectangulo();
		r2.setBase(10);
		r2.setAltura(-4);
		
		Rectangulo r3=new Rectangulo();
		r3.setBase(8);
		r3.setAltura(-14);
		
		Rectangulo r4=new Rectangulo();
		r4.setBase(20);
		r4.setAltura(55);
		
				
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
