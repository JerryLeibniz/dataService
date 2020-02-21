package org.chinatelecom.data.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author WQ
 */
@Data
@Entity
@Table(name = "tbl_test_case")
public class TestCase implements Serializable {

    private static final long serialVersionUID = 393678067526578171L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    //用例名称
    private String testCaseName;

    //描述
    private String description;

    //标签
    private String tag;

    //测试类别：功能、性能、可靠性、稳定性功能。。。
    private String testType;

    //todo 需要关联测试工具 tool_id

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
