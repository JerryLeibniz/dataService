package org.chinatelecom.data.repository;

import org.chinatelecom.data.entity.TestEnv;
import org.chinatelecom.data.entity.TestTask;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author :WQ
 * @Description:
 */
public interface TestEnvRepository extends JpaRepository<TestEnv,Integer>, JpaSpecificationExecutor<TestEnv> {
}
