
public class Nota {

	
	private double valor;

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		if (valor>0 && valor<10) {
		this.valor = valor;}
		if (valor<0 || valor>10) {
			System.out.println("Este es un valor no válido");
		}
}
}