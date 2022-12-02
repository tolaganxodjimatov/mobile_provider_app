package uz.tgsoft.task1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.tgsoft.task1.entity.Sp_service;
import uz.tgsoft.task1.payload.ApiResponse;
import uz.tgsoft.task1.payload.Sp_serviceDTO;
import uz.tgsoft.task1.repository.ClientRepository;
import uz.tgsoft.task1.repository.Sp_serviceRepository;
import uz.tgsoft.task1.service.Sp_serviceService;

@RestController
@RequestMapping("/Sp_service")
public class Sp_serviceController {

    @Autowired
    Sp_serviceService spServiceService;
//    Sp_serviceRepository spServiceRepository;

    //Create
    @PostMapping
    public HttpEntity<?> add(@RequestBody Sp_serviceDTO spServiceDTO) {
        ApiResponse apiResponse = spServiceService.add(spServiceDTO);
        return ResponseEntity.status(201).body(apiResponse);
    }

    //Read
    @GetMapping("/{id}")
    public HttpEntity<?> getById(@PathVariable Integer id) {
        Sp_service spService = spServiceService.getById(id);
        return ResponseEntity.status(201).body(spService);

    }

    //Update
    @PutMapping("/{id}")
    public HttpEntity<?> edit(@PathVariable Integer id, @RequestBody Sp_serviceDTO spServiceDTO) {
        ApiResponse apiResponse = spServiceService.edit(id, spServiceDTO);
        return ResponseEntity.status(201).body(apiResponse);
    }


    //Delete
    @DeleteMapping("/{id}")
    public HttpEntity<?> deleteById(@PathVariable Integer id) {
        ApiResponse apiResponse = spServiceService.deleteById(id);
        return ResponseEntity.status(201).body(apiResponse);

    }

}
