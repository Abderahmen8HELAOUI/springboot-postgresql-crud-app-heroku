package com.helaoui.springboot2postgresqljpahibernatecrudexample.repository;

import com.helaoui.springboot2postgresqljpahibernatecrudexample.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author USER
 * @version 1.0
 * @created 07/09/2023 - 23:12
 * @project springboot2-postgresql-jpa-hibernate-crud-example
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
