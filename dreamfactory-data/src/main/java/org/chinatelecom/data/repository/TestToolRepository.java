package org.chinatelecom.data.repository;

import org.chinatelecom.data.entity.TestTool;
import org.chinatelecom.data.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author :WQ
 * @Description:
 */
public interface TestToolRepository extends JpaRepository<TestTool,Integer>, JpaSpecificationExecutor<TestTool> {
}
