package com.ifa.askop.entity.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.ifa.askop.core.entity.IEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.List;

@Entity
@Table(name = "parents")
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "playerList"})
public class Parent implements IEntity {

    @NotNull
    @NotBlank
    @Size(min = 2)
    public String p1Name;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull
    @NotBlank
    @Size(min = 2)
    @Pattern(regexp = "^[+]*[(]{0,1}[0-9]{1,4}[)]{0,1}[-\\s\\./0-9]*$",message = "Düzgün biçimli bir numara değil")
    private String p1Tel;

    @NotNull
    @NotBlank
    @Email
    private String p1Email;

    @NotNull
    @NotBlank
    @Size(min = 2)
    private String p1Job;

    private String p2Name;
    private String p2Tel;

    private String p2Email;
    private String p2Job;

    @OneToMany(mappedBy = "parent", fetch = FetchType.LAZY)
    @JsonIgnore
    private List<Player> playerList;

}
