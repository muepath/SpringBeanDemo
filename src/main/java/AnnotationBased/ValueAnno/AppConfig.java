package AnnotationBased.ValueAnno;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.converter.GenericConverter;
import org.springframework.format.support.DefaultFormattingConversionService;

@Configuration
@PropertySource("classpath:/AnnotationBased/ValueAnno/application.properties")
@ComponentScan(basePackages = "AnnotationBased.ValueAnno")
public class AppConfig {
//    @Bean
//    public MovieRecommender movieRecommender(){
//        return new MovieRecommender();
//    }
//    用于严格控制不存在的值
//    @Bean
//    public static PropertySourcesPlaceholderConfigurer propertyPlaceholderConfigurer() {
//        return new PropertySourcesPlaceholderConfigurer();
//    }

//用于注册自己的类型转换
//@Bean
//public ConversionService conversionService() {
//    DefaultFormattingConversionService conversionService = new DefaultFormattingConversionService();
//    conversionService.addConverter((GenericConverter) new MyCustomConverter());
//    return conversionService;
//}

}