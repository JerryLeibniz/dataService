package org.chinatelecom.data.repository;

import org.chinatelecom.data.testPackge.TestUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author WQ
 * @create 2020-02-14 11:56
 */
public interface TestUserRepostiory extends JpaRepository<TestUser,Long> {

}
