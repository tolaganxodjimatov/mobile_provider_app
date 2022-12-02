package uz.tgsoft.task1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uz.tgsoft.task1.entity.Sp_branche;
import uz.tgsoft.task1.payload.ApiResponse;
import uz.tgsoft.task1.payload.Sp_brancheDTO;
import uz.tgsoft.task1.repository.Sp_brancheRepository;

import java.util.Optional;

@Service
public class Sp_brancheService {
    @Autowired
    Sp_brancheRepository sp_brancheRepository;

    public ApiResponse add(Sp_brancheDTO spBrancheDTO) {
        return new ApiResponse("Saved", true);
    }

    public Sp_branche getById(Integer id) {
        Optional<Sp_branche> optionalSpBranche = sp_brancheRepository.findById(id);
        return optionalSpBranche.get();
    }

    public ApiResponse edit(Integer id, Sp_brancheDTO spBrancheDTO) {
        return new ApiResponse("Edited", true);
    }

    public ApiResponse deleteById(Integer id) {
        return new ApiResponse("Deleted", true);
    }

}
