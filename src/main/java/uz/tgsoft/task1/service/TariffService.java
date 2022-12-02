package uz.tgsoft.task1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uz.tgsoft.task1.entity.Tariff;
import uz.tgsoft.task1.payload.ApiResponse;
import uz.tgsoft.task1.payload.TariffDTO;
import uz.tgsoft.task1.repository.TariffRepository;

import java.util.Optional;


@Service
public class TariffService {

    @Autowired
    TariffRepository tariffRepository;

    public ApiResponse add(TariffDTO tariffDTO) {
        return new ApiResponse("Saved", true);
    }

    public Tariff getByID(Integer id) {
        Optional<Tariff> optionalTariff = tariffRepository.findById(id);
        return optionalTariff.get();
    }

    public ApiResponse edit(Integer id, TariffDTO tariffDTO) {
        return new ApiResponse("Edited", true);

    }

    public ApiResponse deleteById(Integer id) {
        return new ApiResponse("Deleted", true);
    }

}
