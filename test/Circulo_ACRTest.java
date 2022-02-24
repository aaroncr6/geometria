import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;    
    
public class Circulo_ACRTest {

    @Before
    public void setup(){

    }
    double PI=3.14;
        
    @Test
    public void testArea() {

        Circulo_ACR areaCirculo = new Circulo_ACR(-3, "Circulo");
        double area = areaCirculo.area();
        assertEquals(28.2744, area);

    }
    @Test
    public void testPerimetro(){
        Circulo_ACR perimetroCirculo = new Circulo_ACR(-3, "Circulo");
        double perimetro = perimetroCirculo.perimetro();
        assertEquals(18.8496, perimetro);

 


    }
}
    