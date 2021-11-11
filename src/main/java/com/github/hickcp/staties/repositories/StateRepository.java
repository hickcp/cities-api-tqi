package com.github.hickcp.staties.repositories;

import com.github.hickcp.staties.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
