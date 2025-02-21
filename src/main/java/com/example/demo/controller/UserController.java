//package com.example.demo.controller;
//
//import com.example.demo.model.User;
//import com.example.demo.repository.UserRepository;
////import com.example.demo.service.UserHibernateService;
//import com.example.demo.service.UserService;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@CrossOrigin(origins = "http://localhost:8081")
//@RestController
//@RequestMapping("/api")
//public class UserController {
//
//    @Autowired
//    UserService userService;
//
////    @Autowired
////    UserHibernateService userHibernateService;
//
//
//    @GetMapping("/users")
//    public ResponseEntity<List<User>> getAllUsers(@RequestParam(required = false) String name) {
//        try {
//            List<User> users = userService.getAllUsers(name);
//            if (users.isEmpty()) {
//                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//            } else {
//                return new ResponseEntity<>(users, HttpStatus.OK);
//            }
//
//        } catch (Exception e) {
//            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }
//
//    @GetMapping("/users/{id}")
//    public ResponseEntity<User> getUserById(@PathVariable("id") long id) {
//        if (userService.getUserById(id) != null) {
//            return new ResponseEntity<>(userService.getUserById(id), HttpStatus.OK);
//        } else {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//    }
//
//    @PostMapping("/users")
//    public ResponseEntity<String> createUser(@RequestBody User user) {
//        try {
//            userService.createUser(user);
//            return new ResponseEntity<>("User was created successfully.", HttpStatus.CREATED);
//        } catch (Exception e) {
//            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }
//
//    @PutMapping("/users/{id}")
//    public ResponseEntity<String> updateUser(@PathVariable("id") long id, @RequestBody User user) {
//        if (userService.updateUser(id, user) != null) {
//            return new ResponseEntity<>("User was updated successfully", HttpStatus.OK);
//        } else {
//            return new ResponseEntity<>("Cannot find User with id=" + id, HttpStatus.NOT_FOUND);
//        }
//    }
//
//    @DeleteMapping("/users/{id}")
//    public ResponseEntity<String> deleteUser(@PathVariable("id") long id) {
//        try {
//            if (userService.deleteUser(id) == 0) {
//                return new ResponseEntity<>("Cannot find User with id=" + id, HttpStatus.OK);
//            }
//            return new ResponseEntity<>("User was deleted successfully.", HttpStatus.OK);
//        } catch (Exception e) {
//            return new ResponseEntity<>("Cannot delete user.", HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }
//
//    @DeleteMapping("/users")
//    public ResponseEntity<String> deleteAllUsers() {
//        try {
//            return new ResponseEntity<>("Deleted " + userService.deleteAllUsers() + " User(s) successfully.", HttpStatus.OK);
//        } catch (Exception e) {
//            return new ResponseEntity<>("Cannot delete users.", HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }
//
//    @GetMapping("/users/sex")
//    public ResponseEntity<List<User>> findByGender() {
//        try {
//            if (userService.findByGender().isEmpty()) {
//                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//            }
//            return new ResponseEntity<>(userService.findByGender(), HttpStatus.OK);
//        } catch (Exception e) {
//            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }
//}