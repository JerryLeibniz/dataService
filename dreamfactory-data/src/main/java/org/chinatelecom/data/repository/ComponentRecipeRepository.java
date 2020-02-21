package org.chinatelecom.data.repository;

import org.chinatelecom.data.entity.ComponentRecipe;
import org.chinatelecom.data.entity.ScenarioRecipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author :WQ
 * @Description:
 */
public interface ComponentRecipeRepository extends JpaRepository<ComponentRecipe,Integer>, JpaSpecificationExecutor<ComponentRecipe> {
}
