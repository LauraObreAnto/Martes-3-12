
public class EjercicioRecorrer {

	public static void main(String[] args) {
		
		String[] lista=new String[] {"Hola","amigos","que","tal","estais"};
		
		for(int i=0;i<lista.length;i++) {
			for (int j=0;j<lista[i].length();j++) {
				char caracter=lista[i].charAt(j);
				System.out.println(caracter);
			}
		}

	}

}
