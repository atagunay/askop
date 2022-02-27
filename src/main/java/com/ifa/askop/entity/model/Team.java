package com.ifa.askop.entity.model;

import com.ifa.askop.core.entity.IEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "teams")
@AllArgsConstructor
@NoArgsConstructor
public class Team implements IEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "sports_hall_id", nullable = false)
    SportsHall sportsHall;

    //     @JoinTable(name = "player_team", joinColumns = @JoinColumn(name="player_id"))
    @ManyToMany(mappedBy = "teams",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Player> players;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "branch_id")
    Branch branch;

    @OneToMany(mappedBy = "team")
    private List<Assignment> assignments;
}
