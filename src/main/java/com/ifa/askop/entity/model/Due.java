package com.ifa.askop.entity.model;

import com.ifa.askop.core.entity.IEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "dues")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Due implements IEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int fee;
    private LocalDateTime startDate;


    @OneToMany(mappedBy = "due", fetch = FetchType.LAZY)
    private List<Player> players;

}
