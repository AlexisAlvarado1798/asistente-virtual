package com.fundacionnacervivir.mod.users.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fundacionnacervivir.mod.core.dtos.UserDto;
import com.fundacionnacervivir.mod.core.entities.Users;
import com.fundacionnacervivir.mod.core.repositories.UserRepositories;
import com.fundacionnacervivir.mod.users.services.UserSearchServices;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UsersSearchServiceImpl implements UserSearchServices {
  private final UserRepositories userRepositories;

  @Autowired
  public UsersSearchServiceImpl(final UserRepositories userRepositories) {
    this.userRepositories = userRepositories;
  }

  @Override
  public List<UserDto> getUsers() {
    final List<Users> usersList = userRepositories.findAll();
    return usersList.stream().map(UsersSearchServiceImpl::mapperEntityTtoDto).collect(Collectors.toList());
  }

  private static UserDto mapperEntityTtoDto(final Users users) {
    final UserDto userDto = new UserDto();
    userDto.setId(users.getUserId());
    userDto.setUserName(users.getUserUsername());
    userDto.setPassword(users.getUserPassword());
    userDto.setCreatedDate(users.getUserCreatedDate() );
    return userDto;
  }
}
