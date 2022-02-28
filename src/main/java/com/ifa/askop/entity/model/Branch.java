package com.ifa.askop.entity.model;

import com.ifa.askop.core.entity.IEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "branches")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Branch implements IEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @OneToMany(mappedBy = "branch", fetch = FetchType.LAZY)
    private List<Team> teamList;

}
