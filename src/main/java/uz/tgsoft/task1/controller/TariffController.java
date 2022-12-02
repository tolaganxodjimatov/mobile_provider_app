package uz.tgsoft.task1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.tgsoft.task1.entity.Tariff;
import uz.tgsoft.task1.payload.ApiResponse;
import uz.tgsoft.task1.payload.TariffDTO;
import uz.tgsoft.task1.service.TariffService;

@RestController
@RequestMapping("/Tariff")
public class TariffController {

    @Autowired
    TariffService tariffService;
    //Create
    @PostMapping
    public HttpEntity<?> add(@RequestBody TariffDTO tariffDTO) {
        ApiResponse apiResponse = tariffService.add(tariffDTO);
        return ResponseEntity.status(201).body(apiResponse);
    }

    //Read
    @GetMapping("/{id}")
    public HttpEntity<?> getByID(@PathVariable Integer id) {
        Tariff tariff = tariffService.getByID(id);
        return ResponseEntity.ok(tariff);
    }


    //Update
    @PutMapping("/{id}")
    public HttpEntity<?> edit(@PathVariable Integer id, @RequestBody TariffDTO tariffDTO) {
        ApiResponse apiResponse = tariffService.edit(id, tariffDTO);
        return ResponseEntity.status(201).body(apiResponse);
    }


    //Delete
    @DeleteMapping("/{id}")
    public HttpEntity<?> deleteById(@PathVariable Integer id) {
        ApiResponse apiResponse = tariffService.deleteById(id);
        return ResponseEntity.status(201).body(apiResponse);
    }

}
