package com.ifa.askop.entity.model;

import com.ifa.askop.core.entity.IEntity;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Entity
@Table(name = "teams")
@AllArgsConstructor
@NoArgsConstructor
public class Team implements IEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    @NotBlank()
    @Min(2)
    private String name;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "sports_hall_id", nullable = false)
    private SportsHall sportsHall;

    @ManyToMany(mappedBy = "teams",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Player> players;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "branch_id")
    private Branch branch;

    @OneToMany(mappedBy = "team",fetch = FetchType.LAZY)
    private List<Assignment> assignments;
}
