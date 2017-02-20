package com.rdlopes.jpa.custom.reporitories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

/**
 * Created by rui on 19/02/2017.
 * Part of demo-jpa.
 * <p>
 */
@NoRepositoryBean
public interface BaseRepository<T, ID extends Serializable> extends JpaRepository<T, ID> {

    String someCustomMethod(ID id);
}
