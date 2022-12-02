package uz.tgsoft.task1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uz.tgsoft.task1.entity.Detalization;
import uz.tgsoft.task1.payload.ApiResponse;
import uz.tgsoft.task1.payload.DetalizationDTO;
import uz.tgsoft.task1.repository.DetalizationRepository;

import java.util.Optional;

@Service
public class DetalizationService {

    @Autowired
    DetalizationRepository detalizationRepository;

    public ApiResponse add(DetalizationDTO detalizationDTO) {

        return new ApiResponse("Saved", true);
    }

    public Detalization getByID(Integer id) {
        Optional<Detalization> optionalDetalization = detalizationRepository.findById(id);
        return optionalDetalization.get();
    }

    public ApiResponse edit(Integer id, DetalizationDTO detalizationDTO) {
        return new ApiResponse("Edited", true);
    }

    public ApiResponse deleteById(Integer id) {

        return new ApiResponse("Deleted", true);
    }
}
