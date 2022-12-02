package uz.tgsoft.task1.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import uz.tgsoft.task1.entity.Client;
import uz.tgsoft.task1.entity.Sp_service;

@RepositoryRestResource(path = "Sp_service", collectionResourceRel = "List")
public interface Sp_serviceRepository extends JpaRepository<Sp_service,Integer> {
    boolean existsByName(String name);





}
