package uz.tgsoft.task1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uz.tgsoft.task1.entity.Sim_number;
import uz.tgsoft.task1.payload.ApiResponse;
import uz.tgsoft.task1.payload.Sim_numberDTO;
import uz.tgsoft.task1.repository.Sim_numberRepository;

import java.util.Optional;

@Service
public class Sim_numberService {

    @Autowired
    Sim_numberRepository sim_numberRepository;

    public ApiResponse add(Sim_numberDTO sim_numberDTO) {
        return new ApiResponse("Saved", true);
    }

    public Sim_number getByID(Integer id) {
        Optional<Sim_number> optionalSimNumber = sim_numberRepository.findById(id);
        return optionalSimNumber.get();
    }

    public ApiResponse edit(Integer id, Sim_numberDTO simNumberDTO) {
        return new ApiResponse("Edited", true);

    }

    public ApiResponse deleteById(Integer id) {
        return new ApiResponse("Deleted", true);
    }
}
