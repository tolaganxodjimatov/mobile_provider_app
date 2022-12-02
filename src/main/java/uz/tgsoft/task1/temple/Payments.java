package uz.tgsoft.task1.temple;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Timestamp;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payments {
    @Id
    @GeneratedValue
    private Integer id;

    @Column(nullable = false,length = 250)
    private String full_name;

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
