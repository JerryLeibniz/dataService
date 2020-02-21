package org.chinatelecom.data.repository;

import org.chinatelecom.data.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author WQ
 * @create 2020-02-08 15:32
 */

public interface UserRepository extends JpaRepository<User,Long>, JpaSpecificationExecutor<User> {

    int countByNameOrEmail(String str, String str1);

}
