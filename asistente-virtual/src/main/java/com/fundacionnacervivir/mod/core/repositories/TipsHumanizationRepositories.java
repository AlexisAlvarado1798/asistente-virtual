package com.fundacionnacervivir.mod.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.fundacionnacervivir.mod.core.entities.TipsHumanization;

public interface TipsHumanizationRepositories extends JpaRepository<TipsHumanization, Long>, JpaSpecificationExecutor<TipsHumanization> {
}
