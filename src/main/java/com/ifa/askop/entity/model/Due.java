package com.ifa.askop.entity.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.ifa.askop.core.entity.IEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "dues")
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "players"})
public class Due implements IEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    private int fee;

    @DateTimeFormat(pattern = "gg.MM.YYYY")
    @NotNull
    private LocalDateTime startDate;

    @OneToMany(mappedBy = "due", fetch = FetchType.LAZY)
    private List<Player> players;

}
