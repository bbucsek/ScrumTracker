package com.codecool.scrumtracker.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.data.annotation.CreatedBy;

import javax.persistence.*;
import java.util.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class AppUser {

    @GeneratedValue
    @Id
    private UUID id;

    @Column(unique = true)
    private String username;

    @Column(unique = true)
    private String email;

    @JsonIgnore
    private String password;

    @Column()
    private Integer projectsCount;

    @Column(columnDefinition = "integer default 0")
    private Integer participantCount;

    @Column(columnDefinition = "integer default 0")
    private Integer tasksCount;

    @Column(columnDefinition = "integer default 0")
    private Integer finishedTaskCount;


    @ElementCollection
    @Builder.Default
    @JsonIgnore
    private List<String> roles = new ArrayList<>();

}
