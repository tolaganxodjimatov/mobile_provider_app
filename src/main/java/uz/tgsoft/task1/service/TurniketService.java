package uz.tgsoft.task1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uz.tgsoft.task1.entity.Turniket;
import uz.tgsoft.task1.payload.ApiResponse;
import uz.tgsoft.task1.payload.TurniketDTO;
import uz.tgsoft.task1.repository.TurniketRepository;

import java.util.Optional;

@Service
public class TurniketService {
    @Autowired
    TurniketRepository turniketRepository;

    public ApiResponse add(TurniketDTO turniketDTO) {
        return new ApiResponse("Saved", true);
    }

    public Turniket getByID(Integer id) {
        Optional<Turniket> optionalTurniket = turniketRepository.findById(id);
        return optionalTurniket.get();
    }

    public ApiResponse edit(Integer id, TurniketDTO turniketDTO) {
        return new ApiResponse("Edited", true);
    }

    public ApiResponse deleteById(Integer id) {
       return new ApiResponse("Deleted", true);
    }
}
