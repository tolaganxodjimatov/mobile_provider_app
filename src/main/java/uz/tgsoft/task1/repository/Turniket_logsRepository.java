package uz.tgsoft.task1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.tgsoft.task1.entity.Client;
import uz.tgsoft.task1.entity.Turniket_logs;

@RepositoryRestResource(path = "Turniket_logs", collectionResourceRel = "List")
public interface Turniket_logsRepository extends JpaRepository<Turniket_logs,Integer> {
}
