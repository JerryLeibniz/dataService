package org.chinatelecom.data.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * 用户实体类
 * @author WQ
 */

@Data
@Entity
@Table(name = "tbl_user")
public class User implements Serializable {

    private static final long serialVersionUID = 693678067526578179L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    /**
     * 用户名称
     */
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String name;

    /**
     * 用户密码
     */
    private String psw;

    private String email;

    private Date createTime;

    private Date updateTime;

    /**
     * 是否认证
     */
    private Integer isauth;

    //电话
    private String phone;

    /**
     * 激活状态码
     */
    private Integer activeStatus;

    /**
     * 用户类型码
     */
    private Integer userType;

    /**
     * 乐观锁版本号
     */
    @Version
    private Integer version;




}

