package uz.tgsoft.task1.payload;

import lombok.Data;
import uz.tgsoft.task1.entity.Sp_service;

import java.sql.Timestamp;

@Data
public class Resurses_and_packageDTO {

    private String name;
    private Integer service_id;
    private Timestamp creat_date;
    private Integer timeperiud;
    private Integer price;
}
