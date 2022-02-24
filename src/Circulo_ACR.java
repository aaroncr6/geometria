
public class Circulo_ACR extends FiguraGeometrica_ACR {
	private double radio;
	//Constante pi
	static final double PI = 3.1416;
	
	public Circulo_ACR(double r, String tipoFigura) {
		super(tipoFigura);
		if(r < 0){
			radio = Math.abs(r);
		}else{
		radio = r;
		}
		
	}

	@Override
	public double area() {
		return radio * radio * PI;

	}
	
	@Override
	public double perimetro() {
		return radio * 2 * PI;
	}

}
