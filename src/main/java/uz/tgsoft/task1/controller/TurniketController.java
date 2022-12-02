package uz.tgsoft.task1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.tgsoft.task1.entity.Tariff;
import uz.tgsoft.task1.entity.Turniket;
import uz.tgsoft.task1.payload.ApiResponse;
import uz.tgsoft.task1.payload.TariffDTO;
import uz.tgsoft.task1.payload.TurniketDTO;
import uz.tgsoft.task1.repository.ClientRepository;
import uz.tgsoft.task1.repository.TurniketRepository;
import uz.tgsoft.task1.service.TurniketService;

@RestController
@RequestMapping("/Turniket")
public class TurniketController {

    @Autowired
    TurniketService turniketService;

//

    //Create
    @PostMapping
    public HttpEntity<?> add(@RequestBody TurniketDTO turniketDTO) {
        ApiResponse apiResponse = turniketService.add(turniketDTO);
        return ResponseEntity.status(201).body(apiResponse);
    }

    //Read
    @GetMapping("/{id}")
    public HttpEntity<?> getByID(@PathVariable Integer id) {
       Turniket turniket= turniketService.getByID(id);
        return ResponseEntity.ok(turniket);
    }


    //Update
    @PutMapping("/{id}")
    public HttpEntity<?> edit(@PathVariable Integer id, @RequestBody TurniketDTO turniketDTO) {
        ApiResponse apiResponse = turniketService.edit(id, turniketDTO);
        return ResponseEntity.status(201).body(apiResponse);
    }


    //Delete
    @DeleteMapping("/{id}")
    public HttpEntity<?> deleteById(@PathVariable Integer id) {
        ApiResponse apiResponse = turniketService.deleteById(id);
        return ResponseEntity.status(201).body(apiResponse);
    }


}
