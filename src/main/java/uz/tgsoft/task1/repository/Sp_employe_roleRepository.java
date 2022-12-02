package uz.tgsoft.task1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.tgsoft.task1.entity.Client;
import uz.tgsoft.task1.entity.Sp_employe_role;

@RepositoryRestResource(path = "Sp_employe_role", collectionResourceRel = "List")
public interface Sp_employe_roleRepository extends JpaRepository<Sp_employe_role,Integer> {
}
