/**
 * udes.ds.rmi MultiplicativeEquation.java 3 sept. 08
 */
package udes.ds.agent;

/**
 * Stores an equation of the type f(x)*g(x)
 *
 * @author Luc Bergevin
 * @version 1.0
 */
public class MultiplicativeEquation extends AbstractEquation {

    private static final long serialVersionUID = 1L;
    private AbstractEquation _first;
    private AbstractEquation _second;

    public MultiplicativeEquation(AbstractEquation first, AbstractEquation second) {
            super();
            _first = first;
            _second = second;
    }

    public AbstractEquation getFirst() {
            return _first;
    }

    public AbstractEquation getSecond() {
            return _second;
    }

    /**   
     * @see udes.ds.rmi.hw.Equation#getFunctionValue(double)      
     */
    public double getFunctionValue(double x) {
            return (_first.getFunctionValue(x) * _second.getFunctionValue(x));
    }

    /**   
     * @see udes.ds.rmi.hw.AbstractEquation#getUserReadableString()      
     */
    public String getUserReadableString() {
            return new String("(" + _first.getUserReadableString() + ")(" + _second.getUserReadableString() + ")");
    }
    
    /**
    * Derivation de l'equation
    */
    public AbstractEquation derivate(){
        MultiplicativeEquation first = new MultiplicativeEquation(this.getFirst().derivate(), this.getSecond());
        MultiplicativeEquation second = new MultiplicativeEquation(this.getFirst(), this.getSecond().derivate());

        return new SummativeEquation(first, second);
    }
}
