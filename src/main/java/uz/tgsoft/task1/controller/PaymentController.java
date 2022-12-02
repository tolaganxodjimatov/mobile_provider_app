package uz.tgsoft.task1.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.tgsoft.task1.entity.Payment;
import uz.tgsoft.task1.payload.ApiResponse;
import uz.tgsoft.task1.payload.PaymentDTO;
import uz.tgsoft.task1.repository.PaymentRepository;
import uz.tgsoft.task1.service.PaymentService;

@RestController
@RequestMapping("/Payment")
public class PaymentController {

    @Autowired
    PaymentService paymentService;

    //CRUD

    //Create
    @PostMapping
    public HttpEntity<?> add(@RequestBody PaymentDTO paymentDTO) {
        ApiResponse apiResponse = paymentService.add(paymentDTO);
        return ResponseEntity.status(201).body(apiResponse);
    }

    //Read
    @GetMapping("/{id}")
    public HttpEntity<?> getByID(@PathVariable Integer id) {
        Payment payment = paymentService.getByID(id);
        return ResponseEntity.status(201).body(payment);

    }

    //Update
    @PutMapping("/{id}")
    public HttpEntity<?> edit(@PathVariable Integer id, @RequestBody PaymentDTO paymentDTO) {
        ApiResponse apiResponse = paymentService.edit(id, paymentDTO);
        return ResponseEntity.status(201).body(apiResponse);

    }

    //Delete
    @DeleteMapping("/{id}")
    public HttpEntity<?> deleteById(@PathVariable Integer id) {
        ApiResponse apiResponse = paymentService.deleteById(id);
        return ResponseEntity.status(201).body(apiResponse);

    }

}
