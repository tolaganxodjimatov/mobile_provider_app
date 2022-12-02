package uz.tgsoft.task1.payload;

import lombok.Data;
import uz.tgsoft.task1.entity.Sim_number;

import java.sql.Timestamp;

@Data
public class PaymentDTO {
    private Integer sim_number_id;
    private Timestamp paymentDate;
    private Integer amount;
    private boolean enabled; //Default false - yozmasa ham
}
