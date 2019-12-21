package com.kedacom.svms.synms.config;

import io.swagger.annotations.ApiOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @ProjectName: svms
 * @Package: com.kedacom.svms.devms.config
 * @ClassName: SwaggerConfiguration
 * @Author: zhougaoyang
 * @Description: swagger配置类
 * @Date: 2019/5/22 11:08
 * @Version: 1.0
 */
@Configuration
@EnableSwagger2
public class SwaggerConfiguration {

    @Bean
    public Docket swaggerDocket(){
        return new Docket(DocumentationType.SWAGGER_2)
                    .select()
                    .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
                    .apis(RequestHandlerSelectors.basePackage("com.kedacom.svms.synms.controller"))
                    .build();
    }
}
