package uz.tgsoft.task1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uz.tgsoft.task1.entity.Client;
import uz.tgsoft.task1.payload.ApiResponse;
import uz.tgsoft.task1.payload.ClientDTO;
import uz.tgsoft.task1.repository.ClientRepository;

import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    ClientRepository clientRepository;

    public ApiResponse addClient(ClientDTO clientDTO) {
        boolean exists = clientRepository.existsByFullName(clientDTO.getFullName());
        if (exists) return new ApiResponse("Already exists", false);

        Client client = new Client(null, clientDTO.getFullName(), clientDTO.getPassword(), clientDTO.getPinfl(), clientDTO.getCreated_at(), clientDTO.getUpdated_at(), false);
        clientRepository.save(client);
        return new ApiResponse("Saved", true);
    }

    public Client getByIDClient(Integer id) {
        Optional<Client> optionalClient = clientRepository.findById(id);
        return optionalClient.get();
    }

    public ApiResponse editClient(Integer id, ClientDTO clientDTO) {
        return new ApiResponse("Edited", true);
    }

    public ApiResponse deleteByIdClient(Integer id) {
        Optional<Client> optionalClient = clientRepository.findById(id);
        if (!optionalClient.isPresent()) return new ApiResponse("Does not exists",false);
        clientRepository.deleteById(id);
        return new ApiResponse("Deleted", true);
    }


}
