package com.springmvc.example.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springmvc.example.dto.UserDTO;
import com.springmvc.example.entity.User;
import com.springmvc.example.exception.SpringMVCException;
import com.springmvc.example.persistence.UserRepository;
import com.springmvc.example.service.UserService;

@Component
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDTO getUser(UserDTO userDTO) throws SpringMVCException {

		UserDTO dto=null;
		User user = userRepository.findUserByEmailAndPassword(
				userDTO.getEmailId(), userDTO.getPassword());

		if (user != null) {
			dto = new UserDTO();
			dto.setEmailId(user.getEmail());
			dto.setFullName(user.getFullName());
			dto.setId(user.getId());
		}
		return dto;
	}

}
