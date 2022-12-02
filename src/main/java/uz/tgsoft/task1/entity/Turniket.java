package uz.tgsoft.task1.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Turniket {
    @Id
    @GeneratedValue
    private Integer id;


//    @Column(nullable = false,length = 250)
    @ManyToOne(optional = false,fetch = FetchType.LAZY)
    private User_employee user_employee;

    private Boolean status;

    private Timestamp created_at;

    private String card_number;


}
