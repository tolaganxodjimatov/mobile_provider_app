package uz.tgsoft.task1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uz.tgsoft.task1.entity.Sp_employe_role;
import uz.tgsoft.task1.payload.ApiResponse;
import uz.tgsoft.task1.payload.Sp_employe_roleDTO;
import uz.tgsoft.task1.repository.Sp_employe_roleRepository;

import java.util.Optional;

@Service
public class Sp_employe_roleService {
    @Autowired
    Sp_employe_roleRepository spEmployeRoleRepository;

    public ApiResponse add(Sp_employe_roleDTO spEmployeRoleDTO) {
        return new ApiResponse("Saved", true);
    }

    public Sp_employe_role getByID(Integer id) {
        Optional<Sp_employe_role> optionalSpEmployeRole = spEmployeRoleRepository.findById(id);
        return optionalSpEmployeRole.get();
    }


    public ApiResponse edit(Integer id, Sp_employe_roleDTO spEmployeRoleDTO) {
        return new ApiResponse("Edited", true);
    }

    public ApiResponse deleteById(Integer id) {
        return new ApiResponse("Deleted", true);
    }
}
