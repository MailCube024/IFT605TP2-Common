/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contracts;

import java.rmi.RemoteException;

/**
 *
 * @author Michaël
 */
public interface IAdminHandler extends IDerivationHandler{
    public boolean StopTask(String name) throws RemoteException;
}
