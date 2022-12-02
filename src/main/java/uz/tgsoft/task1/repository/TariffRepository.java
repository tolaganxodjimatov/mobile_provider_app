package uz.tgsoft.task1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.tgsoft.task1.entity.Client;
import uz.tgsoft.task1.entity.Tariff;

@RepositoryRestResource(path = "Tariff", collectionResourceRel = "List")
public interface TariffRepository extends JpaRepository<Tariff,Integer> {
}
