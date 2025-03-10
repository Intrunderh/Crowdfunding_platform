package com.example.demo.model;

import com.example.demo.dto.CreateUserDto;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
@Table(name = "users")
public class UserHibernate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;


    @Column(name = "name")
    @NotNull(message = "Имя пользователя должно быть заполнено")
    @Min(value = 3, message = "Имя пользователя не может быть меньше 3 символов")
    private String name;


    @Column(name = "age", columnDefinition = "integer")
    @Min(value = 14, message = "Возраста пользователя не может быть меньше 14")
    private int age = 0;


    @Column(name = "sex")
    private boolean sex;

    @Column(name = "email", updatable = false)
    @Email(message = "Email address has invalid format: ${validatedValue}",
            regexp = "^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+$")
    private String email;
    // нашел в интернете как можно сделать валидацию по почте
    // и не менять ее при обновлении updatable = false

    @Column(name = "create_time")
    @CreationTimestamp
    private LocalDateTime currentTimeCreate;
    // нужно ли добавлять в какой-нибудь конструктор,
    // чтобы, например, в CreateUserDto добавлялось currentTimeCreate,
    // а в UpdateUserDto менялось только currentTimeUpdate

    // Нашел аннотации для сохранений и обновлений

    @Column(name = "update_time")
    @UpdateTimestamp
    private LocalDateTime currentTimeUpdate;


//    public UserHibernate(int id, String name, int age, boolean sex, String email, LocalDateTime currentTimeCreate, LocalDateTime currentTimeUpdate) {
//        this.id = id;
//        this.name = name;
//        this.age = age;
//        this.sex = sex;
//        this.email = email;
//        this.currentTimeCreate = currentTimeCreate;
//        this.currentTimeUpdate = currentTimeUpdate;
//    }
//    public static UserHibernate createByDto(CreateUserDto createUserDto){
//        return new UserHibernate()
//    } // доделать

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isSex() {
        return sex;
    }

    public String getEmail() {
        return email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public void setEmail(String email) { this.email = email; }

}
