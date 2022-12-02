package uz.tgsoft.task1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.tgsoft.task1.entity.Client;
import uz.tgsoft.task1.entity.Sim_number;

@RepositoryRestResource(path = "Sim_number", collectionResourceRel = "List")
public interface Sim_numberRepository extends JpaRepository<Sim_number,Integer> {
}
