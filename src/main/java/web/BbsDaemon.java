package web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class BbsDaemon {
    @RequestMapping("/")
    public String index(){
        return "欢迎光临论坛";
    }

    public static void main(String[] args){
        SpringApplication.run(BbsDaemon.class, args);
    }
}
