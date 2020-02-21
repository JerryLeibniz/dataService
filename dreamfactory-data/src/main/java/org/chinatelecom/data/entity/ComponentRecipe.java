package org.chinatelecom.data.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Data
@Entity
@Table(name = "tbl_component_recipe")
public class ComponentRecipe implements Serializable {

    private static final long serialVersionUID = 33678067526578171L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    //测试设计名称
    private String recipeName;

    //描述
    private String description;

    //是否公开 仅自己/用户组/完全公开
    private String visibility;

    //状态 设计中/已发布
    private String status;

    //标签
    private String tag;

    //版本
    private Integer recipeVersion;

    //版本升级说明
    private String upgradeDescription;

    //是否最新版
    private boolean isLatest;

    //是否验证 是否有已执行成功(不是验证通过)的测试任务
    private boolean validated;

    //todo 需要关联组件id和认证id component_id verified_id，和场景测试之间的多对多关系

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
