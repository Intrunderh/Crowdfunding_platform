//package com.example.demo.service;
//
//import com.example.demo.model.User;
//import com.example.demo.repository.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Component;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Component
//public class UserService {
//
//    @Autowired
//    UserRepository userRepository;
//
//
//    public List<User> getAllUsers(String name) {
//        List<User> users = new ArrayList<User>();
//
//        if (name == null) {
//            users.addAll(userRepository.findAll());
//        } else {
//            users.addAll(userRepository.findByNameContaining(name));
//        }
//        return users;
//    }
//
//    public User getUserById(long id) {
//        User user = userRepository.findById(id);
//        return user;
//    }
//
//    public User createUser(User user) {
//        userRepository.save(new User(user.getName(), user.getAge(), user.isSex()));
//        return user;
//    }
//
//    public User updateUser(long id, User user) {
//        User _user = userRepository.findById(id);
//
//        _user.setId(id);
//        _user.setName(user.getName());
//        _user.setAge(user.getAge());
//        _user.setSex(user.isSex());
//
//        userRepository.update(_user);
//        return _user;
//    }
//
//    public int deleteUser(long id) {
//        int result = userRepository.deleteById(id);
//        return result;
//    }
//
//    public String deleteAllUsers() {
//        int numRows = userRepository.deleteAll();
//        return String.valueOf(numRows);
//    }
//
//    public List<User> findByGender() {
//        List<User> users = userRepository.findByGender(true);
//        return users;
//    }
//
//
//}
