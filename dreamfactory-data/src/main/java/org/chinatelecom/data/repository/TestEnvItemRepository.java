package org.chinatelecom.data.repository;

import org.chinatelecom.data.entity.TestEnv;
import org.chinatelecom.data.entity.TestEnvItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author :WQ
 * @Description:
 */
public interface TestEnvItemRepository extends JpaRepository<TestEnvItem,Integer>, JpaSpecificationExecutor<TestEnvItem> {
}
