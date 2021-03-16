package geometria;

public class Retangulo implements Objeto{

	@Override
	public double area(int a, int b) {		
		return a*b;
	}

	@Override
	public double volume() {		
		return 150;
	}

}
