
package com.cinelitas.service;

import com.cinelitas.entity.Pelicula;
import com.cinelitas.repository.PeliculaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class PeliculaService implements IPeliculaService{

    @Autowired
    private PeliculaRepository peliculaRepository;
    
    @Override
    public List<Pelicula> getAllPelicula() {
       return (List<Pelicula>) peliculaRepository.findAll(); 
    }

    @Override
    public Pelicula getpeliculaById(Long id) {
        return peliculaRepository.findById(id).orElse(null);
    }

    @Override
    public void savePelicula(Pelicula pelicula) {
        peliculaRepository.save(pelicula);
    }

    @Override
    public void delete(long id) {
        peliculaRepository.deleteById(id);
    }

    @Override
    public Pelicula getPersonaById(Long id_Pelicula) {
        return peliculaRepository.findById(id_Pelicula).orElse(null);
    }
    
    

   
    
    
}
