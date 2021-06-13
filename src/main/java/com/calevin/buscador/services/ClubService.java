package com.calevin.buscador.services;

import com.calevin.buscador.models.Club;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClubService {

    private List<Club> clubes = new ArrayList<>();

    public ClubService() {
        this.clubes.add(new Club("Club Atlético Boca Juniors","Some quick example text to build on the card title and make up the bulk of the card's content.","https://upload.wikimedia.org/wikipedia/commons/thumb/e/e3/Boca_Juniors_logo18.svg/1200px-Boca_Juniors_logo18.svg.png"));
        this.clubes.add(new Club("Club Atlético River Plate","Some quick example text to build on the card title and make up the bulk of the card's content.","https://upload.wikimedia.org/wikipedia/commons/thumb/f/f2/CA_river_plate_logo.svg/1200px-CA_river_plate_logo.svg.png"));
        this.clubes.add(new Club("Club Atlético Independiente","Some quick example text to build on the card title and make up the bulk of the card's content.","https://upload.wikimedia.org/wikipedia/commons/thumb/3/38/Escudo_del_Club_Atl%C3%A9tico_Independiente_de_Avellaneda.svg/1200px-Escudo_del_Club_Atl%C3%A9tico_Independiente_de_Avellaneda.svg.png"));
        this.clubes.add(new Club("Racing Club","Some quick example text to build on the card title and make up the bulk of the card's content.","https://upload.wikimedia.org/wikipedia/commons/thumb/5/56/Escudo_de_Racing_Club_%282014%29.svg/1200px-Escudo_de_Racing_Club_%282014%29.svg.png"));
    }

    public List<Club> obtenerClubes(){
        return this.clubes;
    }

    public List<Club> buscarClubes(String filtro){
        return this.clubes.stream().filter(c -> c.getNombre().equalsIgnoreCase(filtro)).collect(Collectors.toList());
    }

}
