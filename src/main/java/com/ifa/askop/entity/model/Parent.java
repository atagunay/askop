package com.ifa.askop.entity.model;

import com.ifa.askop.core.entity.IEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "parents")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Parent implements IEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String p1Name;
    private String p1Tel;
    private String p1Email;
    private String p1Job;

    private String p2Name;
    private String p2Tel;
    private String p2Email;
    private String p2Job;

    @OneToMany(mappedBy = "parent", fetch = FetchType.LAZY)
    private List<Player> playerList;

}
