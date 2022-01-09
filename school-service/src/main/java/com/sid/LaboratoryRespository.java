package com.sid;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface LaboratoryRespository extends JpaRepository<Laboratory, Long>{

}
