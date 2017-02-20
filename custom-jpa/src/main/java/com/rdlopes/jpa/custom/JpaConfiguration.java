package com.rdlopes.jpa.custom;

import com.rdlopes.jpa.custom.reporitories.impl.BaseRepositoryImpl;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by rui on 20/02/2017.
 * Part of custom-jpa.
 * <p>
 */
@Configuration
@EntityScan(basePackageClasses = JpaConfiguration.class)
@EnableJpaRepositories(basePackageClasses = JpaConfiguration.class,
                       repositoryBaseClass = BaseRepositoryImpl.class)
public class JpaConfiguration {

}
