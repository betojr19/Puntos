package fp.punto;

/**
 *
 * @author Beto Jr
 */
public interface punto {

    Double getX();

    Double getY();

    void setX(Double x1);

    void setY(Double y1);
    
    Double getDistanciaAOtroPunto(punto p);
}
