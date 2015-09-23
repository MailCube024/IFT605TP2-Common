package contracts;

import java.rmi.Remote;
import java.rmi.RemoteException;
import udes.ds.agent.Equation;

/**
 *
 */
public interface IDerivationCommand extends Remote {

    public Equation Derivate(Equation e) throws RemoteException;
}
