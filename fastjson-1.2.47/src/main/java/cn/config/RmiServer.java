package cn.config;

/**
 * @author yuhao5
 * @date 2020-08-14
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiServiceExporter;

@Configuration
public class RmiServer {

    @Bean
    public RmiServiceExporter getRmiServiceExporter() {
        RmiServiceExporter rmiServiceExporter = new RmiServiceExporter();
        rmiServiceExporter.setRegistryPort(1379);
        return rmiServiceExporter;
    }
}
