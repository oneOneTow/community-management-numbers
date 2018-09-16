package vens.ai.graduate.design.numbers;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * @author vens
 * @date 2018-05-04 19:34
 **/
@SpringBootApplication
@MapperScan(basePackages = "vens.ai.graduate.design.numbers.mapper")
public class NumbersApplication {
    public static void main(String[] args) {
        SpringApplication.run(NumbersApplication.class, args);
    }
}
