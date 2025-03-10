package com.example.demo.service;

import com.example.demo.dto.CreateUserDto;
import com.example.demo.dto.UpdateUserDto;
import com.example.demo.readmodel.UserReadModel;
import com.example.demo.model.UserHibernate;
import com.example.demo.repository.UserHibernateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class UserHibernateService {

    private final UserHibernateRepository userHibernateRepository;
    private final UserReadModelFactory userReadModelFactory;

    @Autowired
    public UserHibernateService(UserHibernateRepository userHibernateRepository, UserReadModelFactory userReadModelFactory) {
        this.userHibernateRepository = userHibernateRepository;
        this.userReadModelFactory = userReadModelFactory;
    }


    public List<UserReadModel> getAllUsers() {
        return userHibernateRepository.findAll().stream().
                map(userHibernate -> userReadModelFactory.createByUserHibernate(userHibernate)).toList();
    }

    public UserReadModel getUserById(long id) {
         UserHibernate userHibernate = userHibernateRepository.findById(id).orElseThrow(NoSuchElementException::new);
         return userReadModelFactory.createByUserHibernate(userHibernate);
    }

    public int createUser(CreateUserDto createUserDto) throws Exception {
        UserHibernate userHibernate = new UserHibernate();
        userHibernate.setName(createUserDto.name);
        userHibernate.setAge(createUserDto.age);
        userHibernate.setSex(createUserDto.sex);
        userHibernate.setEmail(createUserDto.email);
        userHibernateRepository.save(userHibernate);
        return userHibernate.getId();
    }

    public void updateUser(long id, UpdateUserDto updateUserDto) {
        UserHibernate userHibernate = userHibernateRepository.getById(id);
        userHibernate.setName(updateUserDto.name);
        userHibernate.setAge(updateUserDto.age);
        userHibernate.setSex(updateUserDto.sex);
        userHibernateRepository.save(userHibernate);
    }

    public void deleteUser(long id) {
        userHibernateRepository.deleteById(id);
    }

    public void deleteAllUsers() {
        userHibernateRepository.deleteAll();
    }

    public List<UserReadModel> findByGender() {
        return userHibernateRepository.findBySex(true).stream()
                .map(userHibernate -> userReadModelFactory.createByUserHibernate(userHibernate)).toList();
    }

    public List<UserReadModel> findByEmailAddress(String email){
        return userHibernateRepository.findByEmail(email).stream()
                .map(userHibernate -> userReadModelFactory.createByUserHibernate(userHibernate)).toList();
    }

}
