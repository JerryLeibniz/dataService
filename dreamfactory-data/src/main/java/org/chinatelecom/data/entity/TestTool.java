package org.chinatelecom.data.entity;

import lombok.Data;
import lombok.Getter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**测试工具实体类
 * @author WQ
 */
@Data
@Entity
@Table(name = "tbl_test_tool")
public class TestTool implements Serializable {

    private static final long serialVersionUID = 693678067526578171L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 工具名称
     */
    private String toolName;

    /**
     * 描述
     */
    private String description;

    /**
     * 配置信息
     */
    private String config;

    /**
     * 工具提供者
     */
    private String provider;

    /**
     * 工具版本号
     */
    private String toolVersion;

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
