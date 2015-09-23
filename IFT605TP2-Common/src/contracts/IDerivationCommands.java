
package contracts;

import java.rmi.Remote;
import java.rmi.RemoteException;
import udes.ds.agent.Equation;

/**
 *
 */
public interface IDerivationCommands extends Remote {
    boolean Derivate(String e) throws RemoteException;
}
