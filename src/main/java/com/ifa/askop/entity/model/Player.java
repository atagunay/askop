package com.ifa.askop.entity.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.ifa.askop.core.entity.IEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "players")
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "teams"})
public class Player implements IEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    @NotBlank
    @Min(2)
    private String name;

    @NotNull
    @NotBlank
    @Min(2)
    private String surname;

    @DateTimeFormat(pattern = "dd.MM.yyyy")
    @NotNull
    private LocalDateTime dob;

    @NotNull
    @NotBlank
    @Pattern(regexp="^[0-9]{10}[02468]{1}$",message="please enter valid id number")
    private String nationalityId;

    @NotNull
    @NotBlank
    private String bloodGroup;

    @ManyToOne(fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "parent_id", nullable = false)
    private Parent parent;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Team> teams;

    @OneToMany(mappedBy = "player", fetch = FetchType.LAZY)
    private List<Assignment> assignments;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "due_id")
    private Due due;

    @OneToMany(mappedBy = "player", fetch = FetchType.LAZY)
    private List<DueInfo> dueInfos;

}
