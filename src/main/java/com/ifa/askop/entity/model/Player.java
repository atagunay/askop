package com.ifa.askop.entity.model;

import com.ifa.askop.core.entity.IEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "players")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Player implements IEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;
    private String surname;
    private LocalDateTime dob;
    private String identificationNumber;
    private String bloodGroup;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
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
