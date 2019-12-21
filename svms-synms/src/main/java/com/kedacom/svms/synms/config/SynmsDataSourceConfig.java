package com.kedacom.svms.synms.config;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        entityManagerFactoryRef = "sdmsEntityManagerFactory",
        transactionManagerRef = "sdmsTransactionManager",
        basePackages = {"com.kedacom.svms.synms.repository"}
)
public class SynmsDataSourceConfig {

    @Value("${spring.secondDatasource.drive-class-name}")
    private String driverClassName;

    @Primary
    @Bean(name = "sdmsDataSource")
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource sdmsDataSource() {
        return DataSourceBuilder.create().driverClassName(driverClassName).build();
    }

    @Primary
    @Bean(name = "sdmsEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(
            EntityManagerFactoryBuilder builder, @Qualifier("sdmsDataSource") DataSource dataSource) {
        return builder
                .dataSource(dataSource)
                .packages("com.kedacom.svms.synms.entity")
                .persistenceUnit("db1")
                .build();
    }

    @Primary
    @Bean(name = "sdmsTransactionManager")
    public PlatformTransactionManager TransactionManager(
            @Qualifier("sdmsEntityManagerFactory")EntityManagerFactory sdmsEntityManagerFactory) {
        return new JpaTransactionManager(sdmsEntityManagerFactory);
    }

}
