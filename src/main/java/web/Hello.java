package web;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Auther: jiwang
 * @Date: 2018/8/22 09:58
 * @Description:
 */
@Controller("/hello")
@ComponentScan
public class Hello {

    @RequestMapping("/say")
    @ResponseBody
    public String sayHello(){
        return "hello";
    }

}
