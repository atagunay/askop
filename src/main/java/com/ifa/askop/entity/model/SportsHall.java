package com.ifa.askop.entity.model;

import com.ifa.askop.core.entity.IEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "sports_halls")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SportsHall implements IEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @OneToMany(mappedBy = "sportsHall", fetch = FetchType.LAZY)
    private List<Team> teamList;

    @OneToMany(mappedBy = "sportsHall",fetch = FetchType.LAZY)
    private List<Inventory> inventoryList;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Announcement> announcements;



}
