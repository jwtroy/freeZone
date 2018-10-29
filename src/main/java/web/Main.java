package web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Auther: jiwang
 * @Date: 2018/8/22 10:06
 * @Description:
 */
@SpringBootApplication
public class Main {
    public static void main(String[] args){
        SpringApplication app = new SpringApplication(Main.class);
        app.run();
    }
}
