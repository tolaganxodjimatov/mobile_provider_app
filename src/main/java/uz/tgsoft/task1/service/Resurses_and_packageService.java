package uz.tgsoft.task1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uz.tgsoft.task1.entity.Resurses_and_package;
import uz.tgsoft.task1.payload.ApiResponse;
import uz.tgsoft.task1.payload.Resurses_and_packageDTO;
import uz.tgsoft.task1.repository.Resurses_and_packageRepository;

import java.util.Optional;

@Service
public class Resurses_and_packageService {
    @Autowired
    Resurses_and_packageRepository resursesAndPackageRepository;

    public ApiResponse add(Resurses_and_packageDTO resursesAndPackageDTO) {
        return new ApiResponse("Saved", true);
    }

    public Resurses_and_package getById(Integer id) {
        Optional<Resurses_and_package> optionalResurses_and_package = resursesAndPackageRepository.findById(id);
        return optionalResurses_and_package.get();
    }

    public ApiResponse edit(Integer id, Resurses_and_packageDTO resursesAndPackageDTO) {
        return new ApiResponse("Edited", true);
    }

    public ApiResponse deleteById(Integer id) {
        return new ApiResponse("Deleted", true);
    }
}
