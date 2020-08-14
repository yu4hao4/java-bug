import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 * @author yuhao5
 * @date 2020-08-14
 */
public class RMIClient {
    public static void main(String[] args) throws NamingException {
        //设置系统静态属性，指定上下文环境的FACTORY为rmi，从而替换掉默认的URL来指向我自定义的地址。
        //也可以通过创建一个HashTable来指定下面这两个键值，然后传给InitialContext
        System.setProperty(Context.INITIAL_CONTEXT_FACTORY,"com.sun.jndi.rmi.registry.RegistryContextFactory");
        //指定rmi远程地址
        System.setProperty(Context.PROVIDER_URL,"rmi://localhost:1379");
        //初始化JDNI服务入口
        Context ctx = new InitialContext();
        //通过名字检索远程对象
        Object obj = ctx.lookup("Exploit");
    }
}
