package uz.tgsoft.task1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.tgsoft.task1.entity.Detalization;
import uz.tgsoft.task1.payload.ApiResponse;
import uz.tgsoft.task1.payload.DetalizationDTO;
import uz.tgsoft.task1.service.DetalizationService;

@RestController
@RequestMapping("/Detalization")
public class DetalizationController {

    @Autowired
    DetalizationService detalizationService;
//    CRUD

    //Create
    @PostMapping
    public HttpEntity<?> add(@RequestBody DetalizationDTO detalizationDTO) {
        ApiResponse apiResponse = detalizationService.add(detalizationDTO);
        return ResponseEntity.status(201).body(apiResponse);
    }

    //Read
    @GetMapping("/{id}")
    public HttpEntity<?> getByID(@PathVariable Integer id) {
        Detalization detalization = detalizationService.getByID(id);
        return ResponseEntity.ok(detalization);
    }


    //Update
    @PutMapping("/{id}")
    public HttpEntity<?> edit(@PathVariable Integer id, @RequestBody DetalizationDTO detalizationDTO) {
        ApiResponse apiResponse = detalizationService.edit(id, detalizationDTO);
        return ResponseEntity.status(201).body(apiResponse);
    }


    //Delete
    @DeleteMapping("/{id}")
    public HttpEntity<?> deleteById(@PathVariable Integer id) {
        ApiResponse apiResponse = detalizationService.deleteById(id);
        return ResponseEntity.status(201).body(apiResponse);
    }
}
