package uz.tgsoft.task1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.tgsoft.task1.entity.Client;
import uz.tgsoft.task1.entity.User_employee;

@RepositoryRestResource(path = "User_employee", collectionResourceRel = "List")
public interface User_employeeRepository extends JpaRepository<User_employee,Integer> {
}
