package org.chinatelecom.data.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author :WQ
 * @Description:
 */

@Data
@Entity
@Table(name = "tbl_test_task_env")
public class TestTaskEnv implements Serializable {

    private static final long serialVersionUID = 173678067526578179L;

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

    //TODO 这里需要关联测试环境id和测试任务id，暂时未决定用注解配置还是靠代码来处理

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

