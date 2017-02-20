package com.rdlopes.jpa.autoconfigure;

import com.rdlopes.jpa.custom.JpaConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by rui on 20/02/2017.
 * Part of custom-jpa.
 * <p>
 */
@Configuration
@ConditionalOnClass(CustomJpaRepositories.class)
@Import(JpaConfiguration.class)
public class JpaCustomAutoConfiguration {

}
