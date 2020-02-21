package org.chinatelecom.data.entity;

import io.swagger.models.auth.In;
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
@Table(name = "tbl_test_task")
public class TestTask implements Serializable {

    private static final long serialVersionUID = 193678067526578179L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    //类型 组件0/场景1
    private Integer type;

    //任务名称
    private String taskName;

    //描述
    private String description;

    //状态 设计中/已设计/测试中/已测试/测试失败
    private String status;

    //todo 这里由于recipeId是与组件测试表和场景测试表关联，根据type值的不同而决定是与哪个方案关联
    //因此这里后期需要注意一下逻辑，暂时先按着数据库表填recipeId在此

    private Integer recipeId;

    /**
     * 乐观锁版本号
     */
    @Version
    private Integer version;

    /**
     * 创建时间，
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
