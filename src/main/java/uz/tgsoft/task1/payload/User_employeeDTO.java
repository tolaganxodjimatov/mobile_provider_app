package uz.tgsoft.task1.payload;

import lombok.Data;
import uz.tgsoft.task1.entity.Sp_branche;
import uz.tgsoft.task1.entity.Sp_employe_role;
import uz.tgsoft.task1.entity.Turniket;

import java.sql.Timestamp;
import java.util.List;
import java.util.Set;

@Data
public class User_employeeDTO {
    private String full_name;
    private String password;
    private String pinfl;
    private Timestamp created_at;
    private Timestamp updated_at;
    private Set<Sp_employe_role> employeRoleSet;
    private List<Turniket> turniketList;
    private boolean enabled; //Default false - yozmasa ham
    private Integer branche_id;
}
