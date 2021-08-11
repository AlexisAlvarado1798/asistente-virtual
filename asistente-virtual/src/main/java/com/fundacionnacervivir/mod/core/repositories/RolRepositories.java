package com.fundacionnacervivir.mod.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import com.fundacionnacervivir.mod.core.entities.Roles;


public interface RolRepositories extends JpaRepository<Roles, Long >, JpaSpecificationExecutor<Roles> {
  //CRUD DE LA TABLA ROLES
}
