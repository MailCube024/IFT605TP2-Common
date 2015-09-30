/**
 * udes.ds.rmi Constant.java 3 sept. 08
 */
package udes.ds.agent;

/**
 * Stores a fix value for x or y
 *
 * @author Luc Bergevin
 * @version 1.0
 */
public class Constant extends AbstractEquation {

    private static final long serialVersionUID = 1L;
    private double _value;

    public Constant(double value) {
        super();
        _value = value;
    }

    public double getValue() {
        return _value;
    }

    /**
     * @param x
     * @return
     * @see udes.ds.rmi.hw.Equation#getFunctionValue(double)
     */
    @Override
    public double getFunctionValue(double x) {
        return _value;
    }

    /**
     * @return 
     * @see udes.ds.rmi.hw.AbstractEquation#getUserReadableString()
     */
    @Override
    public String getUserReadableString() {
        return Double.toString(_value);
    }
    
    /**
    * Derivation de l'equation
    */
    public AbstractEquation derivate(){
        return new Constant(0);
    }
    
}
