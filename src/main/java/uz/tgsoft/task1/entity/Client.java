package uz.tgsoft.task1.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import uz.tgsoft.task1.entity.enums.RoleEnum;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Client {
    @Id
    @GeneratedValue
    private Integer id;

    @Column(nullable = false,length = 250)
    private String fullName;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String pinfl;

    @CreationTimestamp
    private Timestamp created_at;

    @UpdateTimestamp
    private Timestamp updated_at;



//    //implement qilingan polelare uchun malumot beradi
//    private boolean accountNonExpired = true;
//
//    private boolean accountNonLocked = true;
//
//    private boolean credentialsNonExpired = true;
//
    private boolean enabled; //Default false - yozmasa ham
}
