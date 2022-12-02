package uz.tgsoft.task1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uz.tgsoft.task1.entity.User_employee;
import uz.tgsoft.task1.payload.ApiResponse;
import uz.tgsoft.task1.payload.User_employeeDTO;
import uz.tgsoft.task1.repository.User_employeeRepository;

import java.util.Optional;

@Service
public class User_employeeService {
    @Autowired
    User_employeeRepository userEmployeeRepository;

    public ApiResponse add(User_employeeDTO userEmployeeDTO) {
        return new ApiResponse("Saved", true);
    }

    public User_employee getByID(Integer id) {
        Optional<User_employee> optionalUserEmployee = userEmployeeRepository.findById(id);
        return  optionalUserEmployee.get();
    }

    public ApiResponse edit(Integer id, User_employeeDTO userEmployeeDTO) {
        return new ApiResponse("Edited", true);

    }

    public ApiResponse deleteById(Integer id) {
        return new ApiResponse("Deleted", true);
    }
}
