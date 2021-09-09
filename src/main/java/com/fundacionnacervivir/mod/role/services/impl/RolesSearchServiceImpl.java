package com.fundacionnacervivir.mod.role.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fundacionnacervivir.mod.core.dtos.NameDto;
import com.fundacionnacervivir.mod.core.entities.Roles;
import com.fundacionnacervivir.mod.core.repositories.RolRepositories;
import com.fundacionnacervivir.mod.role.services.RoleSearchServices;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RolesSearchServiceImpl implements RoleSearchServices {
  private final RolRepositories rolRepositories;

  @Autowired
  public RolesSearchServiceImpl(final RolRepositories rolRepositories) {
    this.rolRepositories = rolRepositories;
  }

  @Override
  public List<NameDto> getRoles() {
    final List<Roles> rolesList = rolRepositories.findAll();
    return rolesList.stream().map(RolesSearchServiceImpl::mapperEntityToDto).collect(Collectors.toList());
  }

  private static NameDto mapperEntityToDto(final Roles roles) {
    final NameDto nameDto = new NameDto();
    nameDto.setId(roles.getRolId());
    nameDto.setCode(roles.getRolCode());
    nameDto.setDescription(roles.getRolDescription());
    return nameDto;
  }

}
