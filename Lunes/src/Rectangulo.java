
public class Rectangulo {
	
	private double base;
		
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		if (base>0) 
		this.base = base;
		
	}
	
	private double altura;
	
	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		if (altura>0) 
			this.altura = altura;
	
		}

		public double area () {
		return base*altura;
	}
	
	}

