package uz.tgsoft.task1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.tgsoft.task1.entity.Detalization;

@RepositoryRestResource(path = "Detalization", collectionResourceRel = "List")
public interface DetalizationRepository extends JpaRepository<Detalization,Integer> {
}
