package com.calevin.buscador.services;

import com.calevin.buscador.models.Club;
import com.calevin.buscador.repositories.ClubRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClubService {

    private final ClubRepository clubRepository;

    public ClubService(ClubRepository clubRepository) {
        this.clubRepository = clubRepository;
    }

    public List<Club> obtenerClubes(){
        return this.clubRepository.findAll();
    }

    public List<Club> obtenerClubesPorCategoria(Long categoriaId){
        return this.clubRepository.buscarPorCategoria(categoriaId);
    }

    public List<Club> obtenerClubesPorNombre(String nombre){
        return this.clubRepository.findByNombreContainingIgnoreCaseOrderByNombreAsc(nombre);
    }
}
