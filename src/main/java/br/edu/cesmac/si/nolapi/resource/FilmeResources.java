package br.edu.cesmac.si.nolapi.resource;

import br.edu.cesmac.si.nolapi.domain.Filme;
import br.edu.cesmac.si.nolapi.domain.Genero;
import br.edu.cesmac.si.nolapi.repository.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/filmes")

public class FilmeResources {

    @Autowired
    private FilmeRepository filmeRepository;

    @GetMapping(value = "/filmes")
    public List<Filme> listarTodas() {
        return filmeRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<Void> salvar(@RequestBody Filme filme) {
        filmeRepository.save(filme);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(filme.getIdFilme()).toUri();

        return ResponseEntity.created(uri).build();
    }

    @PutMapping
    public void alterar(@RequestBody Filme filme){ filmeRepository.save(filme); }

    @DeleteMapping
    public void deletar(@RequestBody Filme filme){ filmeRepository.delete(filme); }

    @GetMapping(value ="/{id}")
    public ResponseEntity<Filme> buscarPorId(@PathVariable("id") Long id) {
        return filmeRepository.findById(id).map(filme ->
                ResponseEntity.ok(filme)).orElse(ResponseEntity.notFound().build());
    }
}