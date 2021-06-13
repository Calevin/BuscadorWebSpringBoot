package com.calevin.buscador.services;

import com.calevin.buscador.models.Club;
import com.calevin.buscador.repositories.ClubRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClubService {

    private final ClubRepository clubRepository;

    public ClubService(ClubRepository clubRepository) {
        this.clubRepository = clubRepository;
    }

    public List<Club> obtenerClubes(){
        return this.clubRepository.findAll();
    }

    public List<Club> buscarClubes(String filtro){
        return null;//this.clubes.stream().filter(c -> c.getNombre().equalsIgnoreCase(filtro)).collect(Collectors.toList());
    }

}
