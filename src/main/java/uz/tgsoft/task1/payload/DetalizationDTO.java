package uz.tgsoft.task1.payload;

import lombok.Data;
import uz.tgsoft.task1.entity.Sim_number;
import uz.tgsoft.task1.entity.Sp_service;

import java.sql.Timestamp;

@Data
public class DetalizationDTO {
    private Integer service_id;
    private Timestamp timestamp_date;
    private Integer sim_number_id;
}
