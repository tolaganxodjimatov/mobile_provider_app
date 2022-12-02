package uz.tgsoft.task1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uz.tgsoft.task1.entity.Payment;
import uz.tgsoft.task1.payload.ApiResponse;
import uz.tgsoft.task1.payload.PaymentDTO;
import uz.tgsoft.task1.repository.PaymentRepository;
import uz.tgsoft.task1.temple.Payments;

import java.util.Optional;


@Service
public class PaymentService {

    @Autowired
    PaymentRepository paymentRepository;

    public ApiResponse add(PaymentDTO paymentDTO) {
        return new ApiResponse("Saved", true);
    }

    public Payment getByID(Integer id) {
        Optional<Payment> optionalPayment = paymentRepository.findById(id);
        return optionalPayment.get();
    }

    public ApiResponse edit(Integer id, PaymentDTO paymentDTO) {
        return new ApiResponse("Edited", true);

    }

    public ApiResponse deleteById(Integer id) {
        return new ApiResponse("Deleted", true);
    }


}
