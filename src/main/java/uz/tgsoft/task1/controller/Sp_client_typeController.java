package uz.tgsoft.task1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.tgsoft.task1.entity.Sp_client_type;
import uz.tgsoft.task1.payload.ApiResponse;
import uz.tgsoft.task1.payload.Sp_client_typeDTO;
import uz.tgsoft.task1.repository.Sp_brancheRepository;
import uz.tgsoft.task1.repository.Sp_client_typeRepository;
import uz.tgsoft.task1.service.Sp_client_typeService;

@RestController
@RequestMapping("/Sp_client_type")
public class Sp_client_typeController {

    @Autowired
    Sp_client_typeService spClientTypeService;

    //    Sp_client_typeRepository spClientTypeRepository;
//Create
    @PostMapping
    public HttpEntity<?> add(@RequestBody Sp_client_typeDTO sp_client_typeDTO) {
        ApiResponse apiResponse = spClientTypeService.add(sp_client_typeDTO);
        return ResponseEntity.status(201).body(apiResponse);
    }

    //Read
    @GetMapping("/{id}")
    public HttpEntity<?> getById(@PathVariable Integer id) {
        Sp_client_type spClientType = spClientTypeService.getById(id);
        return ResponseEntity.status(201).body(spClientType);
    }

    //Update
    @PutMapping("/{id}")
    public HttpEntity<?> edit(@PathVariable Integer id, @RequestBody Sp_client_typeDTO spClientTypeDTO) {
        ApiResponse apiResponse = spClientTypeService.edit(id, spClientTypeDTO);
        return ResponseEntity.status(201).body(apiResponse);
    }
//Delete
    @DeleteMapping("/{id}")
    public HttpEntity<?> deleteById(@PathVariable Integer id){
        ApiResponse apiResponse=spClientTypeService.deleteById(id);
        return ResponseEntity.status(201).body(apiResponse);
    }

}
