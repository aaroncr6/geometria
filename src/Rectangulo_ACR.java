
public class Rectangulo_ACR extends FiguraGeometrica_ACR {
	private double l1;
	private double l2;
	
	public Rectangulo_ACR(String tipoFigura, double lG, double lP) {
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}

	
	/** 
	 * @author Aarón Cutillas Ruz
	 * @version 1.2
	 * calcula el area
	 * @return double
	 * devuelve el resultado del area
	 */
	@Override
	public double area() {
		return l1 * l2;
	}
	
	
	/**
	 * @author Aarón Cutillas Ruz
	 * @version 1.2
	 * calcula el perimetro 
	 * @return double
	 * devuelve el resultado del perimetro
	 */
	@Override
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}

}
