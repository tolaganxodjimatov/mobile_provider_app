package uz.tgsoft.task1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uz.tgsoft.task1.entity.Sp_client_type;
import uz.tgsoft.task1.payload.ApiResponse;
import uz.tgsoft.task1.payload.Sp_client_typeDTO;
import uz.tgsoft.task1.repository.Sp_client_typeRepository;

import java.util.Optional;

@Service
public class Sp_client_typeService {

    @Autowired
    Sp_client_typeRepository spClientTypeRepository;

    public ApiResponse add(Sp_client_typeDTO sp_client_typeDTO) {
        return new ApiResponse("Saved",true);
    }

    public Sp_client_type getById(Integer id) {
        Optional<Sp_client_type> optionalSpClientType = spClientTypeRepository.findById(id);
        return optionalSpClientType.get();
    }

    public ApiResponse edit(Integer id, Sp_client_typeDTO spClientTypeDTO) {
        return new ApiResponse("Edited",true);
    }
    public ApiResponse deleteById(Integer id){
        return new ApiResponse("Deleted",true);
    }
}
