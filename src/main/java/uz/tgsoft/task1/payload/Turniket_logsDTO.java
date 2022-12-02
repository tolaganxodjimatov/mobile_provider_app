package uz.tgsoft.task1.payload;

import lombok.Data;
import uz.tgsoft.task1.entity.Turniket;
import uz.tgsoft.task1.entity.User_employee;

import java.sql.Timestamp;

@Data
public class Turniket_logsDTO {
    private Integer turniket_id;
    private Integer employee_id;
    private Boolean status;
    private Timestamp created_at;
    private String card_number;
}
