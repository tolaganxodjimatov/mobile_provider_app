package uz.tgsoft.task1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.tgsoft.task1.entity.Sp_employe_role;
import uz.tgsoft.task1.payload.ApiResponse;
import uz.tgsoft.task1.payload.Sp_employe_roleDTO;
import uz.tgsoft.task1.repository.ClientRepository;
import uz.tgsoft.task1.repository.Sp_employe_roleRepository;
import uz.tgsoft.task1.service.Sp_employe_roleService;

@RestController
@RequestMapping("/Sp_employe_role")
public class Sp_employe_roleController {

    @Autowired
    Sp_employe_roleService spEmployeRoleService;

    //Create
    @PostMapping
    public HttpEntity<?> add(@RequestBody Sp_employe_roleDTO spEmployeRoleDTO) {
        ApiResponse apiResponse = spEmployeRoleService.add(spEmployeRoleDTO);
        return ResponseEntity.status(201).body(apiResponse);
    }

    //Read
    @GetMapping("/{id}")
    public HttpEntity<?> getByID(@PathVariable Integer id) {
        Sp_employe_role spEmployeRole = spEmployeRoleService.getByID(id);
        return ResponseEntity.status(201).body(spEmployeRole);

    }

    //Update
    @PutMapping("/{id}")
    public HttpEntity<?> edit(@PathVariable Integer id, @RequestBody Sp_employe_roleDTO spEmployeRoleDTO) {
        ApiResponse apiResponse = spEmployeRoleService.edit(id, spEmployeRoleDTO);
        return ResponseEntity.status(201).body(apiResponse);
    }

    //Delete
    @DeleteMapping("/{id}")
    public HttpEntity<?> deleteById(@PathVariable Integer id) {
        ApiResponse apiResponse = spEmployeRoleService.deleteById(id);
        return ResponseEntity.status(201).body(apiResponse);
    }

}
