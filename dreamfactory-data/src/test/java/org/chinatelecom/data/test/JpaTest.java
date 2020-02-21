package org.chinatelecom.data.test;

import org.chinatelecom.data.testPackge.RoleTest;
import org.chinatelecom.data.testPackge.TestUser;
import org.chinatelecom.data.entity.User;
import org.chinatelecom.data.repository.TestUserRepostiory;
import org.chinatelecom.data.service.impl.UserServiceImpl;
import org.chinatelecom.data.testPackge.Ttest;
import org.chinatelecom.data.testPackge.TtestMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JpaTest {

    @Autowired
    private TestUserRepostiory testUserRepostiory;

//    @Autowired
//    private UserRepository userRepository;
    @Autowired
    private UserServiceImpl userService;

    @Autowired
    private TtestMapper ttestMapper;

    @Test
    public void test1(){

        Ttest ttest = new Ttest();
        ttest.setName("小四");
        ttestMapper.save(ttest);

    }

    @Test
    @Transactional
    public void testCheckUser(){
//        Integer i = userService.checkUser("123");
//        int i = userRepository.countByNameOrEmail("123", "123");

        User user = new User();
        user.setName("测试一号");
        Integer i = userService.register(user);
        System.out.println(i);

    }

    @Test
    @Transactional
    public void test(){
        Optional<TestUser> byId = testUserRepostiory.findById(1L);
        TestUser testUser = byId.get();
        List<RoleTest> roleTests = testUser.getRoleTests();
        System.out.println(roleTests);


    }

    @Test
    @Transactional
    @Rollback(false)
    public void testSave(){
        TestUser user = new TestUser();
        user.setName("小K");
        user.setPassword("123");
        user.setUsername("dani");

        RoleTest r1 = new RoleTest();
        r1.setName("马仔");

        //关联
        List<RoleTest> roleTests = user.getRoleTests();
        roleTests.add(r1);
        r1.setTestUser(user);

        testUserRepostiory.save(user);
    }

}
