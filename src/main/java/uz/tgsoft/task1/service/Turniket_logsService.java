package uz.tgsoft.task1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uz.tgsoft.task1.entity.Turniket_logs;
import uz.tgsoft.task1.payload.ApiResponse;
import uz.tgsoft.task1.payload.Turniket_logsDTO;
import uz.tgsoft.task1.repository.Turniket_logsRepository;

import java.util.Optional;

@Service
public class Turniket_logsService {

    @Autowired
    Turniket_logsRepository turniketLogsRepository;

    public ApiResponse add(Turniket_logsDTO turniketLogsDTO) {
        return new ApiResponse("Saved", true);
    }

    public Turniket_logs getByID(Integer id) {
        Optional<Turniket_logs> optionalTurniketLogs = turniketLogsRepository.findById(id);
        return optionalTurniketLogs.get();
    }

    public ApiResponse edit(Integer id, Turniket_logsDTO turniketLogsDTO) {
        return new ApiResponse("Edited", true);

    }

    public ApiResponse deleteById(Integer id) {
        return new ApiResponse("Deleted", true);
    }


}
