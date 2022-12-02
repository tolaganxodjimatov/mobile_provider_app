package uz.tgsoft.task1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.tgsoft.task1.entity.Client;
import uz.tgsoft.task1.entity.Turniket;

@RepositoryRestResource(path = "Turniket", collectionResourceRel = "List")
public interface TurniketRepository extends JpaRepository<Turniket,Integer> {
}
