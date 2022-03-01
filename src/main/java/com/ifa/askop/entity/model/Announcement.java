package com.ifa.askop.entity.model;


import com.ifa.askop.core.entity.IEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "announcements")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Announcement implements IEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    @NotNull
    private String content;

    @NotNull
    @NotBlank
    private String fromUser;

    @DateTimeFormat(pattern = "gg.MM.YYYY")
    @NotNull
    private LocalDateTime date;

    @ManyToMany(mappedBy = "announcements",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<SportsHall> sportsHalls;
}
