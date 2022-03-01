package com.ifa.askop.entity.model;

import com.ifa.askop.core.entity.UserBase;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
@PrimaryKeyJoinColumn(name = "user_base_id", referencedColumnName = "id")
public class User extends UserBase {

    @NotNull
    @NotBlank
    @Min(2)
    private String name;

    @NotNull
    @NotBlank
    @Min(2)
    private String surname;

    @NotNull
    @NotBlank
    private String bloodGroup;

    @NotNull
    @NotBlank
    private String phoneNumber;

    @NotNull
    @NotBlank
    private String closeFriendPhoneNumber;


    @NotBlank
    @NotNull
    private String gender;

    @DateTimeFormat(pattern = "dd.MM.yyyy")
    @NotNull
    private LocalDateTime dob;


}
