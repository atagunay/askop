package com.ifa.askop.entity.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.ifa.askop.core.entity.IEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name = "parents")
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "playerList"})
public class Parent implements IEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    @NotBlank
    @Min(2)
    private String p1Name;

    @NotNull
    @NotBlank
    @Min(2)
    private String p1Tel;

    @NotNull
    @NotBlank
    @Email
    private String p1Email;

    @NotNull
    @NotBlank
    private String p1Job;

    private String p2Name;
    private String p2Tel;

    @Email
    private String p2Email;
    private String p2Job;

    @OneToMany(mappedBy = "parent", fetch = FetchType.LAZY)
    private List<Player> playerList;

}
