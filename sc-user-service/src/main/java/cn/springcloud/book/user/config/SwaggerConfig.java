package cn.springcloud.book.user.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

//@Configuration
public class SwaggerConfig {

//    @Bean
//    public Docket swaggerPersonApi10() {
//        //添加header参数
//        ParameterBuilder ticketPar = new ParameterBuilder();
//        List<Parameter> pars = new ArrayList<>();
//        ticketPar.name("x-customs-user")
//                 .description("x-customs-user")
//                 .modelRef(new ModelRef("string"))
//                 .parameterType("header")
//                 .required(false)
//                 .build(); //header中的ticket参数非必填，传空也可以
//        pars.add(ticketPar.build());    //根据每个方法名也知道当前方法在设置什么参数
//
//        return new Docket(DocumentationType.SWAGGER_2)
//            .select()
//            .apis(RequestHandlerSelectors.basePackage("cn.springcloud.book.user.controller"))
//            .paths(PathSelectors.any())
//            .build()
//            .globalOperationParameters(pars)
//            .apiInfo(
//                new ApiInfoBuilder()
//                    .version("1.0")
//                    .title("Original Service API")
//                    .description("Original Service API v1.0")
//                    .build()
//                    );
//    }
}
