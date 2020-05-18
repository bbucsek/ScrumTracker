package com.codecool.scrumtracker.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Project {

    @GeneratedValue
    @Id
    private UUID id;

    private String title;

    @OneToOne
    private AppUser author;

    @OneToOne
    private ScrumTable table;

    @OneToMany
    private List<AppUser> participants;
}
