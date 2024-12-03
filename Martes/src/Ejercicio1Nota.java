import java.util.Scanner;

public class Ejercicio1Nota {

	public static void main(String[] args) {
		
		System.out.println("Introduce el nombre");
		Scanner sc=new Scanner(System.in);
		String nombre=sc.next();
		System.out.println("Introduce la nota");
		Nota nota1=new Nota();
		double i=sc.nextDouble();
		nota1.setValor(i);
		if (i<5) {System.out.println("Necesita mejorar");}
		if (i>=5 && i<6) {System.out.println("Suficiente");}
		if (i>=6 && i<7) {System.out.println("Bien");}
		if (i>=7 && i<9) {System.out.println("Notable");}
		if (i>=9 && i<=10) {System.out.println("Sobresaliente");}
	}

}
