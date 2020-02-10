//package com.codegym.service.Impl;
//
//import com.codegym.dao.DTO.UserDTO;
//import com.codegym.dao.entity.User;
//import com.codegym.dao.repository.UserRepository;
//import com.codegym.service.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Service
//public class UserDTOServiceImpl implements UserService {
//    @Autowired
//    UserRepository userRepository;
//
//    @Override
//    public UserDetails loadUserByUsername(String userName) {
//        return null;
//    }
//
//    @Override
//    public List<UserDTO> findAll() {
//        List<User> users = (List<User>) userRepository.findAll();
//        List<UserDTO> userDTOS = new ArrayList<>();
//        if(users != null){
//            for(User user:users){
//                UserDTO userDTO = new UserDTO();
//                userDTO.setUsername(user.getUserName());
//                userDTO.setPassword(user.getPassword());
//                userDTOS.add(userDTO);
//            }
//            return userDTOS;
//        }
//        return null;
//    }
//
//}
