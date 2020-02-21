package org.chinatelecom.data.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author :WQ
 * @Description:
 */
@Entity
@Data
@Table(name = "tbl_rating_result")
public class RatingResult implements Serializable {

    private static final long serialVersionUID = 600678067526578171L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    //认证结果类型 通过/一票否决/得分不合格
    private String authResultType;

    //一票否决的id列表  组件测试：用例id 场景测试：组件id
    private String rejectedIds;

    //加权百分制总得分
    private Double totalScore;

    //原始总得分
    private Double totalOriginalScore;

    //关键用例百分制总得分
    private Double primaryScore;

    //关键用例原始总得分
    private Double primaryOriginalScore;

    //常规用例百分制总得分
    private Double normalScore;

    //常规用例原始总得分
    private String normalOriginalScore;

    //加分项总得分
    private String bonusScore;

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
