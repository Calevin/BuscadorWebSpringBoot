package com.calevin.buscador.repositories;

import com.calevin.buscador.models.Club;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClubRepository extends JpaRepository<Club, Long> {
}
