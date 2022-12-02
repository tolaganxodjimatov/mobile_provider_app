package uz.tgsoft.task1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.tgsoft.task1.entity.Resurses_and_package;
import uz.tgsoft.task1.payload.ApiResponse;
import uz.tgsoft.task1.payload.Resurses_and_packageDTO;
import uz.tgsoft.task1.repository.Resurses_and_packageRepository;
import uz.tgsoft.task1.service.Resurses_and_packageService;

@RestController
@RequestMapping("/Resurses_and_package")
public class Resurses_and_packageController {

    @Autowired
    Resurses_and_packageService resursesAndPackageService;

    //    CRUD
//Create
    @PostMapping
    public HttpEntity<?> add(@RequestBody Resurses_and_packageDTO resursesAndPackageDTO) {
        ApiResponse apiResponse = resursesAndPackageService.add(resursesAndPackageDTO);
        return ResponseEntity.status(201).body(apiResponse);
    }

    //Read
    @GetMapping("/{id}")
    public HttpEntity<?> getById(@PathVariable Integer id) {
        Resurses_and_package resursesAndPackage = resursesAndPackageService.getById(id);
        return ResponseEntity.status(201).body(resursesAndPackage);

    }

//Update
    @PutMapping("/{id}")
    public  HttpEntity<?> edit(@PathVariable Integer id, @RequestBody Resurses_and_packageDTO resursesAndPackageDTO){
        ApiResponse apiResponse=resursesAndPackageService.edit(id,resursesAndPackageDTO);
        return ResponseEntity.status(201).body(apiResponse);


    }


//Delete
    @DeleteMapping("/{id}")
    public HttpEntity<?> deleteById(@PathVariable Integer id){
        ApiResponse apiResponse = resursesAndPackageService.deleteById(id);
        return ResponseEntity.status(201).body(apiResponse);

    }

}
