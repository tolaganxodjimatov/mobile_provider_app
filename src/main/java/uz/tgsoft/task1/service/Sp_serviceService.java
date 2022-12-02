package uz.tgsoft.task1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uz.tgsoft.task1.entity.Sp_service;
import uz.tgsoft.task1.payload.ApiResponse;
import uz.tgsoft.task1.payload.Sp_serviceDTO;
import uz.tgsoft.task1.repository.Sp_serviceRepository;

import java.util.Optional;

@Service
public class Sp_serviceService {
    @Autowired
    Sp_serviceRepository spServiceRepository;

    public ApiResponse add(Sp_serviceDTO spServiceDTO) {
        boolean exists = spServiceRepository.existsByName(spServiceDTO.getName());
        if (exists) return new ApiResponse("Already exists",false);
        Sp_service spService=new Sp_service(null,spServiceDTO.getName());
        spServiceRepository.save(spService);
        return new ApiResponse("Saved", true);
    }

    public Sp_service getById(Integer id) {
        Optional<Sp_service> optionalSpService = spServiceRepository.findById(id);
        return optionalSpService.get();
    }

    public ApiResponse edit(Integer id, Sp_serviceDTO spServiceDTO) {
        return new ApiResponse("Edited", true);
    }

    public ApiResponse deleteById(Integer id) {
        return new ApiResponse("Deleted", true);
    }
}
