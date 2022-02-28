package com.ifa.askop.entity.model;

import com.ifa.askop.core.entity.Role;
import com.ifa.askop.core.entity.UserBase;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;


@Entity
@Table(name = "users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User extends UserBase {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;
    private String surName;
    private String bloodGroup;
    private String phoneNumber;
    private String closeFriendPhoneNumber;
    private LocalDateTime dob;

    @ManyToMany(fetch = FetchType.LAZY)
    private List<Role> roles;

}
