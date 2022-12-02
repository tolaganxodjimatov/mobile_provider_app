package uz.tgsoft.task1.payload;

import lombok.Data;
import uz.tgsoft.task1.entity.User_employee;

import java.util.List;

@Data
public class Sp_brancheDTO {
    private String name;
    private List<User_employee> user_employee;
}
