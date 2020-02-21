package org.chinatelecom.data.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Data
@Entity
@Table(name = "tbl_scenario_recipe")
public class ScenarioRecipe implements Serializable {

    private static final long serialVersionUID = 23678067526578171L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    //场景名称
    private String scenarioName;

    //描述
    private String description;

    private String icon;

    private Integer scenarioType;

    private String category;

    private String visibility;

    private String status;

    private String tag;

    private Integer scenarioVersion;


    //版本升级说明
    private String upgradeDescription;

    //是否最新版
    private boolean isLatest;

    //是否验证 是否有已执行成功(不是验证通过)的测试任务
    private boolean validated;

    //todo 需要关联认证id verified_id,以及和组件测试之间的多对多关系

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
