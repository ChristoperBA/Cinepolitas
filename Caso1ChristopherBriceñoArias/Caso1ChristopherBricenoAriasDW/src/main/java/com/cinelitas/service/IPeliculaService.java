
package com.cinelitas.service;

import com.cinelitas.entity.Pelicula;
import java.util.List;
import org.springframework.stereotype.Service;
@Service
public interface IPeliculaService {
   public List<Pelicula> getAllPelicula();
    public Pelicula getpeliculaById(Long id);
    public void savePelicula(Pelicula pelicula);
    public void delete(long id);

    public Pelicula getPersonaById(Long id_Pelicula);
    
}
