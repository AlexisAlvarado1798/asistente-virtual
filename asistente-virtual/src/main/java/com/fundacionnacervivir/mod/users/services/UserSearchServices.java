package com.fundacionnacervivir.mod.users.services;

import com.fundacionnacervivir.mod.core.dtos.UserDto;
import java.util.List;

public interface UserSearchServices {

  List<UserDto> getUsers();
}
