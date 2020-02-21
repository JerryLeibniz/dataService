package org.chinatelecom.data.service;

import org.chinatelecom.data.entity.User;

/**
 * @author :WQ
 * @Description:
 */
public interface UserService {

    public Integer checkUser(String str);

    public Integer register(User user);
}
