package uz.tgsoft.task1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.tgsoft.task1.entity.Client;

@RepositoryRestResource(path = "Client", collectionResourceRel = "List")
public interface ClientRepository extends JpaRepository<Client, Integer> {
    boolean existsByFullName(String fullName);




}
