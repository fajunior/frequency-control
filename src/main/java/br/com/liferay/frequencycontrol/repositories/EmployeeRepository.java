package br.com.liferay.frequencycontrol.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.liferay.frequencycontrol.entities.Employee;


/**
 * Interface to use JPA to manipulate Employee
 * 
 * @author Francisco Athayde Junior
 *
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
