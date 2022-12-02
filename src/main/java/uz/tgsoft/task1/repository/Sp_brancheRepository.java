package uz.tgsoft.task1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.tgsoft.task1.entity.Client;
import uz.tgsoft.task1.entity.Sp_branche;

@RepositoryRestResource(path = "Sp_branche", collectionResourceRel = "List")
public interface Sp_brancheRepository extends JpaRepository<Sp_branche,Integer> {
}
