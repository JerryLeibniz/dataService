package org.chinatelecom.data.testPackge;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Getter
@Setter
public class TestUser {

    // 主键
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    // 用户名
    private String username;
    // 密码
    private String password;
    // 姓名
    private String name;

    @OneToMany(mappedBy = "testUser",cascade = CascadeType.ALL)
    private List<RoleTest> roleTests = new ArrayList<>();


}
