package com.example.colabLearnTutorial.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//@RepositoryRestResource(path = "carOwners")
public interface OwnerRepository extends CrudRepository<Owner, Long> {

}
