package com.calevin.buscador.controller;

import com.calevin.buscador.models.Club;
import com.calevin.buscador.services.ClubService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ListadoController {

    private final ClubService clubService;

    public ListadoController(ClubService clubService) {
        this.clubService = clubService;
    }

    @RequestMapping("/")
    public String listarClubes(Model model){
        model.addAttribute("clubes", this.clubService.obtenerClubes());
        return "listado";
    }

    @RequestMapping("/clubesPorCategoria")
    public String listarClubesPorCategoria(Long categoriaId, Model model){
        model.addAttribute("clubes", this.clubService.obtenerClubesPorCategoria(categoriaId));
        return "listado";
    }

    @RequestMapping("/clubesPorNombre")
    public String listarClubesPorCategoria(String nombre, Model model){
        model.addAttribute("clubes", this.clubService.obtenerClubesPorNombre(nombre));
        return "listado";
    }
}
