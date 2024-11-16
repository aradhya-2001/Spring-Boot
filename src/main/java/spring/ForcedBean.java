package spring;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // It means below class can create a bean for those classes (prebuilt) which doesn't have @Component
public class ForcedBean {

    @Bean // to be used where we want to create bean. Now below method will give a bean instead of an object
    public ObjectMapper objectMapper(){
        return new ObjectMapper();
    }
}
