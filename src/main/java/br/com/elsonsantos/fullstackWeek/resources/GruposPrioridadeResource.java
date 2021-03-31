package br.com.elsonsantos.fullstackWeek.resources;

import br.com.elsonsantos.fullstackWeek.domain.GruposPrioridades;
import br.com.elsonsantos.fullstackWeek.repository.GruposPrioridadesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/grupos")
public class GruposPrioridadeResource {

    @Autowired
    private GruposPrioridadesRepository grupoRepository;

    @GetMapping()
    public List<GruposPrioridades> listarTodos(){return grupoRepository.findAll();};

    @GetMapping("/{codigo}")
    public GruposPrioridades buscarPeloCodigo(@PathVariable Long codigo)
    {return grupoRepository.findById(codigo).orElse(null);}

}
