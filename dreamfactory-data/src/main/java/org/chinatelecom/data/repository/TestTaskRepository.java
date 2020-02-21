package org.chinatelecom.data.repository;

import org.chinatelecom.data.entity.TestTask;
import org.chinatelecom.data.entity.TestTool;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author :WQ
 * @Description:
 */
public interface TestTaskRepository extends JpaRepository<TestTask,Integer>, JpaSpecificationExecutor<TestTask> {
}
