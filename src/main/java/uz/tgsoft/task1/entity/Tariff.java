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
public class Tariff {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(nullable = false,length = 250)
    private String name;

    @ManyToOne
    private Sp_client_type clientType;

    @Column(nullable = false)
    private Integer price;

    @Column(nullable = false)
    private Integer migration_price;

    private Timestamp tarifEndDate;

    @Column(nullable = false)
    private Integer inet_limit;

    @Column(nullable = false)
    private Integer localTimeLimit;

    @Column(nullable = false)
    private Integer globalTimeLimit;

    @Column(nullable = false)
    private Integer sms_limit;




}
