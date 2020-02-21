package org.chinatelecom.data.testPackge;

import lombok.Data;
import org.chinatelecom.data.testPackge.TestUser;

import javax.persistence.*;

/**
 * @author WQ
 * @create 2020-02-17 10:49
 */

@Entity
@Data
public class RoleTest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "user_id",referencedColumnName = "id")
    private TestUser testUser;

}
