package com.calevin.buscador.repositories;

import com.calevin.buscador.models.Club;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ClubRepository extends JpaRepository<Club, Long> {

    @Query("from Club c where c.categoria.id = ?1 order by c.nombre")
    List<Club> buscarPorCategoria(Long categoriaId);

    List<Club> findByNombreContainingIgnoreCaseOrderByNombreAsc(String nombre);
}
