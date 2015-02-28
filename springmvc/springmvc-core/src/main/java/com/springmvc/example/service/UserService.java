package com.springmvc.example.service;

import com.springmvc.example.dto.UserDTO;
import com.springmvc.example.entity.User;
import com.springmvc.example.exception.SpringMVCException;

public interface UserService {

	public UserDTO getUser(UserDTO userDTO)throws SpringMVCException;
}
