package uz.tgsoft.task1.payload;

import lombok.Data;
import uz.tgsoft.task1.entity.Client;
import uz.tgsoft.task1.entity.Payment;
import uz.tgsoft.task1.entity.Sp_client_type;
import uz.tgsoft.task1.entity.User_employee;

import java.util.List;

@Data
public class Sim_numberDTO {

    private String numPrefiks; //94  93 XXX XX XX
    private String number; //XXX XX XX
    private List<Payment> paymentList;
    private Integer user_employee_id;
    private Integer client_id;
    private Integer clientType_id;
    private boolean simStatus;
}
