/**
 * udes.ds.rmi BasicEquation.java 3 sept. 08
 */
package udes.ds.agent;

/**
 * Stores an equation of the type kx^n
 *
 * @author Luc Bergevin
 * @version 1.0
 * @see
 */
public class BasicEquation extends AbstractEquation {

    private static final long serialVersionUID = 1L;
    private double _coefficient;
    private int _exponent;

    public BasicEquation(double coefficient, int exponent) {
        super();
        _coefficient = coefficient;
        _exponent = exponent;
    }

    public double getCoefficient() {
        return _coefficient;
    }

    public int getExponent() {
        return _exponent;
    }

    /**
     * @param x
     * @return
     * @see udes.ds.rmi.hw.Equation#getFunctionValue(double)
     */
    @Override
    public double getFunctionValue(double x) {
        return ((Math.pow(x, _exponent)) * _coefficient);
    }

    /**
     * @return @see udes.ds.rmi.hw.AbstractEquation#getUserReadableString()
     */
    @Override
    public String getUserReadableString() {
        return Double.toString(_coefficient) + "x^" + Integer.toString(_exponent);
    }

    /**
    * Derivation de l'equation
    */
    public AbstractEquation derivate(){
        return new BasicEquation(this.getCoefficient() * this.getExponent(), this.getExponent() - 1);
    }
        
}
