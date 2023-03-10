package com.cinelitas.controller;

import com.cinelitas.entity.Pelicula;
import com.cinelitas.entity.Sala;
import com.cinelitas.service.IPeliculaService;
import com.cinelitas.service.ISalasService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class PeliculasController {

    @Autowired
    private IPeliculaService peliculaService;
    @Autowired
    private ISalasService salaService;

    @GetMapping("/peliculas")
    public String index(Model model) {
        List<Pelicula> listaPeliculas = peliculaService.getAllPelicula();
        model.addAttribute("titulo", "Tabla Peliculas");
        model.addAttribute("peliculas", listaPeliculas);
        return "pelicula";
    }

    @GetMapping("/peliculaN")
    public String crearPelicula(Model model) {
        List<Sala> listaSalas = salaService.listSalas();
        model.addAttribute("pelicula", new Pelicula());
        model.addAttribute("salas", listaSalas);
        return "crear";
    }
    @GetMapping("/delete/{id}")
    public String eliminarPelicula(@PathVariable("id")Long idPelicula){
        peliculaService.delete(idPelicula);
        return "redirect:/pelicula";
    }
    @PostMapping("/save")
    public String guardarPelicula(@ModelAttribute Pelicula pelicula){
        peliculaService.savePelicula(pelicula);
        return "redirect:/pelicula";
    }
    @GetMapping("/editPelicula/{id}")
    public String editarPelicula(@PathVariable("id") Long idPelicula, Model model){
        Pelicula pelicula = peliculaService.getpeliculaById(idPelicula);
        List<Sala> listaSalas = salaService.listSalas();
        model.addAttribute("peliculas",pelicula);
        model.addAttribute("salas", listaSalas);
        return "crear";
    }
    
}
