package uz.tgsoft.task1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.tgsoft.task1.entity.Resurses_and_package;

@RepositoryRestResource(path = "Resurses_and_package", collectionResourceRel = "List")
public interface Resurses_and_packageRepository extends JpaRepository<Resurses_and_package,Integer> {
}
