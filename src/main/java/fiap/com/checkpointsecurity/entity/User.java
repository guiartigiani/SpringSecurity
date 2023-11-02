package fiap.com.checkpointsecurity.entity;

import javax.persistence.*;

@Entity
@Table(name="TB_USER")
@SequenceGenerator(sequenceName = "SQ_T_USER", name="user", allocationSize = 1)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user")
    private Long id;
    @Column(name="username", nullable = false, length = 20)
    private String username;

    private String password;
    private String roles;
}
