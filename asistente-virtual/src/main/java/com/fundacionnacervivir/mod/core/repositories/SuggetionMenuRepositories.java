package com.fundacionnacervivir.mod.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.fundacionnacervivir.mod.core.entities.SuggetionsMenu;

public interface SuggetionMenuRepositories
    extends JpaRepository<SuggetionsMenu, Long>, JpaSpecificationExecutor<SuggetionsMenu> {
}
