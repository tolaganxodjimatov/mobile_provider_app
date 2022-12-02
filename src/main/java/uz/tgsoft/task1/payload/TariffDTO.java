package uz.tgsoft.task1.payload;

import lombok.Data;
import uz.tgsoft.task1.entity.Sp_client_type;

import java.sql.Timestamp;

@Data
public class TariffDTO {
    private String name;
    private Integer clientType_id;
    private Integer price;
    private Integer migration_price;
    private Timestamp tarifEndDate;
    private Integer inet_limit;
    private Integer localTimeLimit;
    private Integer globalTimeLimit;
    private Integer sms_limit;
}
