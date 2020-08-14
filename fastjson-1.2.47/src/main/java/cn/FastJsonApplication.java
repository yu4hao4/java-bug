package cn;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.ParserConfig;
import lombok.val;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.sun.rowset.JdbcRowSetImpl;

/**
 * @author yuhao5
 * @date 2020-08-14
 */
@RestController
@SpringBootApplication
public class FastJsonApplication {

    public static void main(String[] args) {
        SpringApplication.run(FastJsonApplication.class, args);
    }

    @PostMapping("/bugTest")
    public String bugTest(@RequestBody String request){
        JSONObject.parseObject(request);
        return "";
    }
}
