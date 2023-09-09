package com.example.gsaccessinggemfiredatarest;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource()
public interface PersonRepository extends CrudRepository<Person,Long> {
    List<Person> findPersonByLastName(@Param("name")String name);
}
