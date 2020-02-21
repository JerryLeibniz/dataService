package org.chinatelecom.data.repository;

import org.chinatelecom.data.entity.TestCase;
import org.chinatelecom.data.entity.TestEnvItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author :WQ
 * @Description:
 */
public interface TestCaseRepository extends JpaRepository<TestCase,Integer>, JpaSpecificationExecutor<TestCase> {
}
