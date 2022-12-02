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
public class Detalization {
    @Id
    @GeneratedValue
    private Integer id;

    @ManyToOne
    private Sp_service service;

    private Timestamp timestamp_date;

    @ManyToOne
    private Sim_number sim_number;
    
}
