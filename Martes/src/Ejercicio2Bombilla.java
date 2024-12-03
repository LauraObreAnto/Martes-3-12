import java.util.Scanner;

public class Ejercicio2Bombilla {

	public static void main(String[] args) {
		System.out.println("Introduce un valor");
		Scanner sc=new Scanner(System.in);
		
		Bombilla bombilla1=new Bombilla();
		
		int x=sc.nextInt();
		
		bombilla1.setI(x);
		bombilla1.incrementar();
		System.out.println(bombilla1.getI());
		bombilla1.decrementar();
		System.out.println(bombilla1.getI());

		
	}
}
	
		
		
		
		
		