package vens.ai.graduate.design.numbers.configs;

import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import vens.ai.graduate.design.numbers.request.NumberRequestVo;

/**
 * @author vens
 * @date 2018-05-07 10:19
 **/
@Configuration
public class OrikaConfigs {
    @Bean
    public MapperFactory getFactory(){

        MapperFactory mapperFactory=new DefaultMapperFactory.Builder().build();
        mapperFactory.classMap(NumberRequestVo.class, Number.class)
                .exclude("status")
                .byDefault()
                .register();
        return mapperFactory;
    }
}
