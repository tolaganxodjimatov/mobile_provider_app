package uz.tgsoft.task1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.tgsoft.task1.entity.Turniket_logs;
import uz.tgsoft.task1.payload.ApiResponse;
import uz.tgsoft.task1.payload.Turniket_logsDTO;
import uz.tgsoft.task1.service.Turniket_logsService;

@RestController
@RequestMapping("/Turniket_logs")
public class Turniket_logsController {

    @Autowired
    Turniket_logsService turniketLogsService;


    //Create
    @PostMapping
    public HttpEntity<?> add(@RequestBody Turniket_logsDTO turniketLogsDTO) {
        ApiResponse apiResponse = turniketLogsService.add(turniketLogsDTO);
        return ResponseEntity.status(201).body(apiResponse);
    }

    //Read
    @GetMapping("/{id}")
    public HttpEntity<?> getByID(@PathVariable Integer id) {
        Turniket_logs turniketLogs = turniketLogsService.getByID(id);
        return ResponseEntity.ok(turniketLogs);
    }


    //Update
    @PutMapping("/{id}")
    public HttpEntity<?> edit(@PathVariable Integer id, @RequestBody Turniket_logsDTO turniketLogsDTO) {
        ApiResponse apiResponse = turniketLogsService.edit(id, turniketLogsDTO);
        return ResponseEntity.status(201).body(apiResponse);
    }


    //Delete
    @DeleteMapping("/{id}")
    public HttpEntity<?> deleteById(@PathVariable Integer id) {
        ApiResponse apiResponse = turniketLogsService.deleteById(id);
        return ResponseEntity.status(201).body(apiResponse);
    }


}
