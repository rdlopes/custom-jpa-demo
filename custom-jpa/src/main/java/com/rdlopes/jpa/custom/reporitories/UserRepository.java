package com.rdlopes.jpa.custom.reporitories;

import com.rdlopes.jpa.custom.entities.User;
import org.springframework.stereotype.Repository;

/**
 * Created by rui on 19/02/2017.
 * Part of demo-jpa.
 * <p>
 */
@Repository
public interface UserRepository extends BaseRepository<User, Long> {

}
