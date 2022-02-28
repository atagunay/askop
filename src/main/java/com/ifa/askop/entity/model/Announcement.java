package com.ifa.askop.entity.model;


import com.ifa.askop.core.entity.IEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "announcements")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Announcement implements IEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String context;
    private String fromUser;
    private LocalDateTime date;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<SportsHall> sportsHalls;
}
