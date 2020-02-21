package org.chinatelecom.data.repository;

import org.chinatelecom.data.entity.ScenarioRecipe;
import org.chinatelecom.data.entity.TestCase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author :WQ
 * @Description:
 */
public interface ScenarioRecipeRepository extends JpaRepository<ScenarioRecipe,Integer>, JpaSpecificationExecutor<ScenarioRecipe> {
}
