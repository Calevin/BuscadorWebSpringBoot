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
    public String listarVidejuegos(Model model){
        model.addAttribute("clubes", this.clubService.obtenerClubes());
        return "listado";
    }
}
