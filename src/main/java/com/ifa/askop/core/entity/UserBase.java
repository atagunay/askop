package com.ifa.askop.core.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user_base")
@Inheritance(strategy = InheritanceType.JOINED)
public class UserBase implements IEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    @NotNull
    @NotBlank()
    @Column(unique = true)
    private String username;

    @Email
    @NotBlank()
    @NotNull
    @Column(unique = true)
    private String email;

    @NotNull
    @NotBlank()
    private String password;


    @NotNull
    private boolean status;

    @ManyToMany(fetch = FetchType.EAGER)
    private List<Role> roles = new ArrayList<>();

}

