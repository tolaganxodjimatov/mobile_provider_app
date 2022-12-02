package uz.tgsoft.task1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.tgsoft.task1.entity.Sp_branche;
import uz.tgsoft.task1.payload.ApiResponse;
import uz.tgsoft.task1.payload.Sp_brancheDTO;
import uz.tgsoft.task1.repository.ClientRepository;
import uz.tgsoft.task1.repository.Sp_brancheRepository;
import uz.tgsoft.task1.service.Sp_brancheService;

@RestController
@RequestMapping("/Sp_branche")
public class Sp_brancheController {

    @Autowired
    Sp_brancheService spBrancheService;

    //Create
    @PostMapping
    public HttpEntity<?> add(@RequestBody Sp_brancheDTO spBrancheDTO) {
        ApiResponse apiResponse = spBrancheService.add(spBrancheDTO);
        return ResponseEntity.status(201).body(apiResponse);
    }

    //Read
    @GetMapping("/{id}")
    public HttpEntity<?> getById(@PathVariable Integer id) {
        Sp_branche spBranche = spBrancheService.getById(id);
        return ResponseEntity.status(201).body(spBranche);
    }

    //Update
    @PutMapping("/{id}")
    public HttpEntity<?> edit(@PathVariable Integer id, @RequestBody Sp_brancheDTO spBrancheDTO) {
        ApiResponse apiResponse = spBrancheService.edit(id, spBrancheDTO);
        return ResponseEntity.status(201).body(apiResponse);

    }

    //Delete
    @DeleteMapping("/{id}")
    public HttpEntity<?> deleteById(@PathVariable Integer id) {
        ApiResponse apiResponse = spBrancheService.deleteById(id);
        return ResponseEntity.status(201).body(apiResponse);

    }

}
