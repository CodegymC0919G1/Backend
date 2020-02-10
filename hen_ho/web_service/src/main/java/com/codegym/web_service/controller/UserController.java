//package com.codegym.web_service.controller;
//
//
//import com.codegym.dao.DTO.JwtResponse;
//import com.codegym.dao.DTO.UserDTO;
//import com.codegym.dao.entity.User;
//import com.codegym.service.Impl.UserServiceImpl;
//import com.codegym.service.UserService;
//import com.codegym.web_service.security.JwtRequestFilter;
//import com.codegym.web_service.security.JwtTokenUtil;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpRequest;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@CrossOrigin(origins = "*",allowedHeaders = "*")
//@RequestMapping("")
//public class UserController {
//    @Autowired(required = false)
//    AuthenticationManager authenticationManager;
//    @Autowired
//    JwtTokenUtil jwtTokenUtil;
//    @Autowired(required = false)
//    UserServiceImpl userServiceImpl;
//    @Autowired
//    UserService userService;
//    @Autowired
//    JwtRequestFilter jwtRequestFilter;
//
//    @GetMapping("/test")
//    public ResponseEntity<?> sayHello() {
//        System.out.println("abc");
//        return new ResponseEntity<>("ok", HttpStatus.OK);
//    }
//
//    @GetMapping("/users")
//    public List<UserDTO> getAllUser() {
//        List<UserDTO> users;
//        users = userService.findAll();
//        return users;
//    }
//
//    @PostMapping("/login")
//    public ResponseEntity<?> login(@RequestBody UserDTO user){
//        Authentication authentication = authenticationManager.authenticate(
//                new UsernamePasswordAuthenticationToken(user.getUsername(),user.getPassword())
//        );
//        UserDetails userDetails = userServiceImpl
//                .loadUserByUsername(authentication.getName());
//        String jwtToken=jwtTokenUtil.generateToken(userDetails);
//        return ResponseEntity.ok( new JwtResponse(jwtToken));
//    }
//}
