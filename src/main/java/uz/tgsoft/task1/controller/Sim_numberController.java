package uz.tgsoft.task1.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.tgsoft.task1.entity.Sim_number;
import uz.tgsoft.task1.payload.ApiResponse;
import uz.tgsoft.task1.payload.Sim_numberDTO;
import uz.tgsoft.task1.repository.PaymentRepository;
import uz.tgsoft.task1.repository.Sim_numberRepository;
import uz.tgsoft.task1.service.Sim_numberService;

@RestController
@RequestMapping("/Sim_number")
public class Sim_numberController {

    @Autowired
    Sim_numberService simNumberService;

    //Create
    @PostMapping
    public HttpEntity<?> add(@RequestBody Sim_numberDTO sim_numberDTO) {
        ApiResponse apiResponse = simNumberService.add(sim_numberDTO);
        return ResponseEntity.status(201).body(apiResponse);
    }

    //Read
    @GetMapping("/{id}")
    public HttpEntity<?> getByID(@PathVariable Integer id) {
        Sim_number simNumber = simNumberService.getByID(id);
        return ResponseEntity.status(201).body(simNumber);
    }

    //Update
    @PutMapping("/{id}")
    public HttpEntity<?> edit(@PathVariable Integer id, @RequestBody Sim_numberDTO simNumberDTO) {
        ApiResponse apiResponse = simNumberService.edit(id, simNumberDTO);
        return ResponseEntity.status(201).body(apiResponse);

    }

    //Delete
    @DeleteMapping("/{id}")
    public HttpEntity<?> deleteById(@PathVariable Integer id) {
        ApiResponse apiResponse = simNumberService.deleteById(id);
        return ResponseEntity.status(201).body(apiResponse);
    }


}
