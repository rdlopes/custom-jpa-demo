package com.rdlopes.jpa.custom.reporitories.impl;

import com.rdlopes.jpa.custom.reporitories.BaseRepository;
import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import javax.persistence.EntityManager;
import java.io.Serializable;

/**
 * Created by rui on 19/02/2017.
 * Part of demo-jpa.
 * <p>
 */
@NoRepositoryBean
public class BaseRepositoryImpl<T, ID extends Serializable>
        extends SimpleJpaRepository<T, ID>
        implements BaseRepository<T, ID> {

    public BaseRepositoryImpl(JpaEntityInformation<T, ID> entityInformation, EntityManager entityManager) {
        super(entityInformation, entityManager);
    }

    @Override
    public String someCustomMethod(ID id) {
        return "Class for entity of id " + id + " is: " + getDomainClass().getSimpleName();
    }
}
