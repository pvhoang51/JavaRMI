package Account;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * 
 * @author framgiavn
 *
 */
public class AccountServiceImpl extends UnicastRemoteObject implements IAccount {
    private static final long serialVersionUID = 1L;

    public AccountServiceImpl() throws RemoteException {
    }

    public User getUser() {
        User u = new User();
        u.setId(23);
        u.setUname("framgia");
        u.setPasswd("222");
        return u;
    }
}