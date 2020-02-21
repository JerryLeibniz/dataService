package org.chinatelecom.data.service.impl;

import org.chinatelecom.data.entity.User;
import org.chinatelecom.data.repository.UserRepository;
import org.chinatelecom.data.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author :WQ
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;


    public Integer checkUser(String str) {

        int count = userRepository.countByNameOrEmail(str, str);

        return count;

    }

    public Integer register(User user) {
        User saveUser = userRepository.save(user);
        if (saveUser != null){
            return 1;
        }else {
            return -1;
        }
    }
}
