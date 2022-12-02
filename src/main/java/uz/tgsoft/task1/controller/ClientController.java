package uz.tgsoft.task1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.tgsoft.task1.entity.Client;
import uz.tgsoft.task1.payload.ApiResponse;
import uz.tgsoft.task1.payload.ClientDTO;
import uz.tgsoft.task1.repository.ClientRepository;
import uz.tgsoft.task1.service.ClientService;

@RestController
@RequestMapping("/api/Client")
public class ClientController {
    //metod ustida turib Нажмите Ctrl+Alt+Shift+Insertи выберите HTTP-запрос https://www.jetbrains.com/help/idea/http-client-in-product-code-editor.html#composing-http-requests
    //Alt+Insert Constructor menusini (Generate) chaqiradi
//Create Read Update Delete
    @Autowired
    ClientService clientService;

    //Create
    @PostMapping
    public HttpEntity<?> addClient(@RequestBody ClientDTO clientDTO) {
        ApiResponse apiResponse = clientService.addClient(clientDTO);
        return ResponseEntity.status(HttpStatus.OK).body(apiResponse);
    }

    //Read
    @GetMapping("/{id}")
    public HttpEntity<?> getByIDClient(@PathVariable Integer id) {
        Client client = clientService.getByIDClient(id);
        return ResponseEntity.ok(client);
    }

    //Update
    @PutMapping("/{id}")
    public HttpEntity<?> editClient(@PathVariable Integer id, @RequestBody ClientDTO clientDTO) {
        ApiResponse apiResponse = clientService.editClient(id, clientDTO);
        return ResponseEntity.status(201).body(apiResponse);
    }

    //Delete
    @DeleteMapping("/{id}")
    public HttpEntity<?> deleteByIdClient(@PathVariable Integer id) {
        ApiResponse apiResponse = clientService.deleteByIdClient(id);

        return ResponseEntity.status(HttpStatus.OK).body(apiResponse);
    }

}
