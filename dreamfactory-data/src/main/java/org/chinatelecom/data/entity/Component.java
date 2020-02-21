package org.chinatelecom.data.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author :WQ
 * @Description:
 */

@Data
@Entity
@Table(name = "tbl_component")
public class Component implements Serializable {

    private static final long serialVersionUID = 601678067526578179L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String componentName;

    private String description;

    //状态 管理员添加/未审核/审核不通过/审核通过
    private String status;

    //审核管理员的用户id
    private Integer adminUserId;
}
