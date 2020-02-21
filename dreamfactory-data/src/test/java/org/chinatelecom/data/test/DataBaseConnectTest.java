package org.chinatelecom.data.test;

import org.chinatelecom.data.entity.*;
import org.chinatelecom.data.repository.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Example;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;
import java.util.Optional;

/**
 * @author :WQ
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class DataBaseConnectTest {

    @Autowired
    private TestToolRepository testToolRepository;
    @Autowired
    private TestTaskRepository testTaskRepository;
    @Autowired
    private TestEnvItemRepository testEnvItemRepository;
    @Autowired
    private TestEnvRepository testEnvRepository;
    @Autowired
    private TestCaseRepository testCaseRepository;
    @Autowired
    private ScenarioRecipeRepository scenarioRecipeRepository;
    @Autowired
    private ComponentRecipeRepository componentRecipeRepository;

    @Test
    public void testTool(){

        TestTool tool = new TestTool();
        tool.setToolName("工具一");
        tool.setCreateTime(new Date());
        TestTool save = testToolRepository.save(tool);
        System.out.println(save);
        List<TestTool> all = testToolRepository.findAll();
        System.out.println(all);
    }
    @Test
    public void testTask(){

        TestTask task = new TestTask();
        task.setTaskName("任务1");
        task.setCreateTime(new Date());
        TestTask save = testTaskRepository.save(task);
        System.out.println(save);
        Example<TestTask> of = Example.of(task);
        Optional<TestTask> one = testTaskRepository.findOne(of);
        System.out.println(one.get());

    }

    @Test
    public void testEnvItem(){
        TestEnvItem item = new TestEnvItem();
        item.setItemName("条目1");
        item.setCreatePerson("某人");
        TestEnvItem save = testEnvItemRepository.save(item);
        System.out.println(save);
        List<TestEnvItem> all = testEnvItemRepository.findAll();
        System.out.println(all);
    }

    @Test
    public void testEnv(){
        TestEnv env = new TestEnv();
        env.setEnvName("环境1");
        env.setAccount("123");
        TestEnv save = testEnvRepository.save(env);
        System.out.println(save);
        List<TestEnv> all = testEnvRepository.findAll();
        System.out.println(all);
    }

    @Test
    public void testCase(){
        TestCase testCase = new TestCase();
        testCase.setTestCaseName("case1");
        testCase.setTestType("类型1");
        TestCase save = testCaseRepository.save(testCase);
        System.out.println(save);
        List<TestCase> all = testCaseRepository.findAll();
        System.out.println(all);
    }
    @Test
    public void testScenario(){
        ScenarioRecipe recipe = new ScenarioRecipe();
        recipe.setScenarioName("场景1");
        recipe.setLatest(true);
        ScenarioRecipe save = scenarioRecipeRepository.save(recipe);
        System.out.println(save);
        Optional<ScenarioRecipe> byId = scenarioRecipeRepository.findById(save.getId());
        System.out.println(byId.get());
    }

    @Test
    public void testComponent(){
        ComponentRecipe recipe = new ComponentRecipe();
        recipe.setRecipeName("组件测试1");
        recipe.setValidated(true);
        ComponentRecipe save = componentRecipeRepository.save(recipe);
        System.out.println(save);
        List<ComponentRecipe> all = componentRecipeRepository.findAll();
        System.out.println(all);
    }
}
