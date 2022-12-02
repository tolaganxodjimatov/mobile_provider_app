package uz.tgsoft.task1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Sim_number {
    @Id
    @GeneratedValue
    private Integer id;

    private String numPrefiks; //94  93 XXX XX XX

    private String number; //XXX XX XX

    @OneToMany(mappedBy = "sim_number", cascade = CascadeType.ALL)
    private List<Payment> paymentList;

    @ManyToOne
    private User_employee user_employee;

    @ManyToOne
    private Client client;

    @ManyToOne
    private Sp_client_type clientType;

    private boolean simStatus;

}
