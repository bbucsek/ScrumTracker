package com.codecool.scrumtracker.repository;

import com.codecool.scrumtracker.model.AppUser;
import com.codecool.scrumtracker.model.Project;
import com.codecool.scrumtracker.model.ScrumTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;
import java.util.Set;
import java.util.UUID;

public interface ProjectRepository extends JpaRepository<Project, UUID> {

    Set<Project> getProjectByAuthor(AppUser author);

    Set<Project> getByAuthorAndArchiveIsFalse(AppUser appUser);

    Set<Project> findProjectByParticipantsContains(AppUser user);

    Set<Project> findProjectsByParticipantsContainsAndAndArchiveIsFalse(AppUser user);

    Set<Project> getProjectByAuthorAndArchiveIsTrue(AppUser author);

    Set<Project> getProjectByParticipantsContainsAndArchiveIsTrue(AppUser appUser);

    Optional<Project> getProjectByTable(ScrumTable table);
}
