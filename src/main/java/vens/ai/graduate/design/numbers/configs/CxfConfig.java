package vens.ai.graduate.design.numbers.configs;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import org.apache.cxf.Bus;
import org.apache.cxf.endpoint.Server;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;
import org.apache.cxf.jaxrs.swagger.Swagger2Feature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import vens.ai.graduate.design.numbers.controller.controllerImpl.NumbersControllerImpl;

import java.util.Arrays;

/**
 * @author vens
 * @date 2018-05-04 19:32
 **/
@Configuration
public class CxfConfig {
    @Autowired
    private Bus bus;
    @Autowired
    NumbersControllerImpl numbersController;
    @Bean
    public JacksonJsonProvider jsonProvider() {
        return new JacksonJsonProvider();
    }

    @Bean
    public Server rsServer(){
        JAXRSServerFactoryBean endpoint = new JAXRSServerFactoryBean();
        endpoint.setBus(bus);
        endpoint.setAddress("/");
        endpoint.setServiceBeans(Arrays.<Object>asList(numbersController));
        endpoint.setProvider(new JacksonJsonProvider());
        endpoint.setFeatures(Arrays.asList(new Swagger2Feature()));
        return endpoint.create();
    }
}
