package br.com.liferay.frequencycontrol.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.liferay.frequencycontrol.entities.Employee;
import br.com.liferay.frequencycontrol.repositories.EmployeeRepository;
import br.com.liferay.frequencycontrol.vo.MessageResponse;

/**
 * Rest Controller to employee services
 * 
 * @author Francisco Athayde Junior
 *
 */
@RestController
public class EmployeeController {
	@Autowired
	private EmployeeRepository _employeeRepository;

	/**
	 * Rest method to get a list of employees
	 * 
	 * @return list of employee
	 */
	@RequestMapping(value = "/employee", method = RequestMethod.GET)
	public List<Employee> Get() {
		return _employeeRepository.findAll();
	}

	@RequestMapping(value = "/employee", method = RequestMethod.POST)
	public MessageResponse Post(@Valid @RequestBody Employee employee) {
		MessageResponse response = new MessageResponse();
		try {
			Employee result = _employeeRepository.save(employee);
			response.setObjectResult(result);
		} catch (Exception e) {
			response.setCode("01");
			response.setDescription("Employee register failed");
		}
		return response;
	}

}
