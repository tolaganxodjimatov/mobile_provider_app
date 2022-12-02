package uz.tgsoft.task1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.tgsoft.task1.entity.Sp_branche;
import uz.tgsoft.task1.entity.Sp_client_type;

@RepositoryRestResource(path = "Sp_client_type", collectionResourceRel = "List")
public interface Sp_client_typeRepository extends JpaRepository<Sp_client_type,Integer> {
}
