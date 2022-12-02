package uz.tgsoft.task1.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {
    @Id
    @GeneratedValue
    private Integer id;

//    @Column(nullable = false,length = 250)
    @ManyToOne(optional = false,fetch = FetchType.LAZY)
    private Sim_number sim_number;

    @CreationTimestamp
    private Timestamp paymentDate;

    private Integer amount;

    private boolean enabled; //Default false - yozmasa ham

//    @UpdateTimestamp
//    private Timestamp updated_at;

    //    //implement qilingan polelare uchun malumot beradi
//    private boolean accountNonExpired = true;
//
//    private boolean accountNonLocked = true;
//
//    private boolean credentialsNonExpired = true;
//
}
