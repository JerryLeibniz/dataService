package org.chinatelecom.data.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * 测试环境实体类
 * @author WQ
 */

@Data
@Entity
@Table(name = "tbl_test_env")
public class TestEnv implements Serializable {

    private static final long serialVersionUID = 593678067526578171L;

    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 测试环境名称
     */
    private String envName;

    /**
     * 描述
     */
    private String description;

    //总的访问入口
    private String url;

    //账号
    private String account;

    //密码
    private String password;

    //TODO 测试环境需要关联条目，以后加上

    /**
     * 乐观锁版本号
     */
    private Integer version;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 创建人
     */
    private String createPerson;

    /**
     * 修改人
     */
    private String updatePerson;
}
