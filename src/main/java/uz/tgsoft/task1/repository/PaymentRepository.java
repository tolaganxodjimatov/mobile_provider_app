package uz.tgsoft.task1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.tgsoft.task1.entity.Payment;


@RepositoryRestResource(path = "Payment", collectionResourceRel = "List")
public interface PaymentRepository extends JpaRepository<Payment,Integer> {
}
