
public class Bombilla {

	private int i;

	public int getI() {
		return i;
	}

	public void setI(int i) {
		if(i>=0 && i<=3) {
		this.i = i;}
		if (i<0 || i>3)
		{System.out.println("El elemento no soporta esta intensidad");}
	
	}
	
	public void incrementar() {
		setI(getI()+1);
	}		
	
	public void decrementar() {
		setI(getI()-1);
		}
	
}
