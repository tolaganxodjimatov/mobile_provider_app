package uz.tgsoft.task1.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User_employee {
    @Id
    @GeneratedValue
    private Integer id;

    @Column(nullable = false, length = 250)
    private String full_name;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String pinfl;

    @CreationTimestamp
    private Timestamp created_at;

    @UpdateTimestamp
    private Timestamp updated_at;

    @ManyToMany
    private Set<Sp_employe_role> employeRoleSet;

    @OneToMany(mappedBy = "user_employee", cascade = CascadeType.ALL)
    private List<Turniket> turniketList;

    //    //implement qilingan polelare uchun malumot beradi
//    private boolean accountNonExpired = true;
//
//    private boolean accountNonLocked = true;
//
//    private boolean credentialsNonExpired = true;
//
    private boolean enabled; //Default false - yozmasa ham

    @ManyToOne
    private Sp_branche branche;
}
