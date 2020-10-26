package fp.test;

import fp.punto.*;

/**
 *
 * @author Beto Jr
 */
public class TestPunto extends Test {

    public static void main(String[] args) {
        punto p = new PuntoImpl(2.0, 3.0);
        mostrar("Punto:", p);
        p.setX(3.0);
        mostrar("Punto:", p);
        p.setY(2.0);
        mostrar("Punto:", p);
        
        punto p2 = new PuntoImpl(-1.0, -3.0);
        Double distancia = p.getDistanciaAOtroPunto(p2);
       mostrar ("Distancia entre los puntos: ", distancia);
       
    }
    
}
