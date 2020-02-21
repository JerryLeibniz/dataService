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
@Table(name = "tbl_test_task_sut")
public class TestTaskSut implements Serializable {

    private static final long serialVersionUID = 413678067526578171L;

    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * SUT名称
     */
    private String sutName;

    //品类数
    private Integer amount;

    //url
    private String url;

    /**
     * 账号
     */
    private String account;

    /**
     * 密码
     */
    private String password;

    /**
     * 版本id
     */
    private Integer versionId;

    //TODO 以后需要加上和其他表的管理关系，组件、产品 、测试任务、测试环境条目

    /**
     * 乐观锁版本号
     */
    private Integer version;

    /**
     * 创建时间，注解作用是实现自动填充
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
