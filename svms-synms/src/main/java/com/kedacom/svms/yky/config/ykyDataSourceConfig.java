package com.kedacom.svms.yky.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
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
        entityManagerFactoryRef = "ykyEntityManagerFactory",
        transactionManagerRef = "ykyTransactionManager",
        basePackages = {"com.kedacom.svms.yky.repository"}
)
public class ykyDataSourceConfig {

    @Value("${spring.secondDatasource.drive-class-name}")
    private String driverClassName;

    @Bean(name = "ykyDataSource")
    @ConfigurationProperties(prefix = "spring.secondDatasource")
    public DataSource ykyDataSource() {
        return DataSourceBuilder.create().driverClassName(driverClassName).build();
    }

    @Bean(name = "ykyEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(
            EntityManagerFactoryBuilder builder, @Qualifier("ykyDataSource") DataSource dataSource) {
        return builder
                .dataSource(dataSource)
                .packages("com.kedacom.svms.yky.entity")
                .persistenceUnit("db2")
                .build();
    }

    @Bean(name = "ykyTransactionManager")
    public PlatformTransactionManager TransactionManager(
            @Qualifier("ykyEntityManagerFactory") EntityManagerFactory ykyEntityManagerFactory) {
        return new JpaTransactionManager(ykyEntityManagerFactory);
    }
}
