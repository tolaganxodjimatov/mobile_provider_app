package uz.tgsoft.task1.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Turniket_logs {
    @Id
    @GeneratedValue
    private Integer id;

//    @Column(nullable = false, length = 250)
    @ManyToOne
    private Turniket turniket;

    @ManyToOne(optional = false,fetch = FetchType.LAZY)
    private User_employee employee;

    private Boolean status;

    private Timestamp created_at;

    private String card_number;


}
