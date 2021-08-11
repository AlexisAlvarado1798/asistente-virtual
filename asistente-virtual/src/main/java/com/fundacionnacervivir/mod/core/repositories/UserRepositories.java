package com.fundacionnacervivir.mod.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import com.fundacionnacervivir.mod.core.entities.Users;

public interface UserRepositories extends JpaRepository<Users, Long>, JpaSpecificationExecutor<Users> {
  //CRUD DE BASE DE BASE DE DATOS
}
