//package com.example.demo.repository;
//
//import com.example.demo.model.User;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.dao.IncorrectResultSizeDataAccessException;
//import org.springframework.jdbc.core.BeanPropertyRowMapper;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//
//@Repository
//public class JdbcUserRepository implements UserRepository {
//
//    @Autowired
//    private JdbcTemplate jdbcTemplate;
//
//    @Override
//    public int save(User user) {
//        return jdbcTemplate.update("INSERT INTO users (name, age, sex) VALUES(?,?,?)",
//                new Object[] {user.getName(), user.getAge(), user.isSex()});
//    }
//
//    @Override
//    public int update(User user) {
//        return jdbcTemplate.update("UPDATE users SET name=?, age=?, sex=? WHERE id=?",
//                new Object[] {user.getName(), user.getAge(), user.isSex(), user.getId()});
//    }
//
//    @Override
//    public User findById(Long id) {
//        try {
//            User user = jdbcTemplate.queryForObject("SELECT * FROM users WHERE id=?",
//                    BeanPropertyRowMapper.newInstance(User.class), id);
//            return user;
//        } catch (IncorrectResultSizeDataAccessException e){
//            return null;
//        }
//    }
//
//    @Override
//    public int deleteById(Long id) {
//        return jdbcTemplate.update("DELETE FROM users WHERE id=?", id);
//    }
//
//    @Override
//    public List<User> findAll() {
//        return jdbcTemplate.query("SELECT * from users", BeanPropertyRowMapper.newInstance(User.class));
//    }
//
//    @Override
//    public List<User> findBySex(boolean sex) {
//        return jdbcTemplate.query("SELECT * from users WHERE sex=?",
//                BeanPropertyRowMapper.newInstance(User.class), sex);
//    }
//
//    @Override
//    public List<User> findByNameContaining(String name) {
//        String q = "SELECT * from users WHERE name ILIKE '%" + name + "%'";
//
//        return jdbcTemplate.query(q, BeanPropertyRowMapper.newInstance(User.class));
//    }
//
//    @Override
//    public int deleteAll() {
//        return jdbcTemplate.update("DELETE from users");
//    }
//}
