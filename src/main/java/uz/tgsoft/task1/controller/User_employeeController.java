package uz.tgsoft.task1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.tgsoft.task1.entity.User_employee;
import uz.tgsoft.task1.payload.ApiResponse;
import uz.tgsoft.task1.payload.User_employeeDTO;
import uz.tgsoft.task1.service.User_employeeService;

@RestController
@RequestMapping("/User_employee")
public class User_employeeController {

    @Autowired
    User_employeeService userEmployeeService;

    //Create
    @PostMapping
    public HttpEntity<?> add(@RequestBody User_employeeDTO userEmployeeDTO) {
        ApiResponse apiResponse = userEmployeeService.add(userEmployeeDTO);
        return ResponseEntity.status(201).body(apiResponse);
    }

    //Read
    @GetMapping("/{id}")
    public HttpEntity<?> getByID(@PathVariable Integer id) {
        User_employee userEmployee=userEmployeeService.getByID(id);
        return ResponseEntity.ok(userEmployee);
    }


    //Update
    @PutMapping("/{id}")
    public HttpEntity<?> edit(@PathVariable Integer id, @RequestBody User_employeeDTO userEmployeeDTO) {
        ApiResponse apiResponse = userEmployeeService.edit(id, userEmployeeDTO);
        return ResponseEntity.status(201).body(apiResponse);
    }


    //Delete
    @DeleteMapping("/{id}")
    public HttpEntity<?> deleteById(@PathVariable Integer id) {
        ApiResponse apiResponse = userEmployeeService.deleteById(id);
        return ResponseEntity.status(201).body(apiResponse);
    }



}
