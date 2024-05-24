package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/books")
class BibliotecaController {
    private List<Livro> livros = new ArrayList<>();
    public BibliotecaController(){
        livros.addAll(List.of(
                new Livro(1, "Crepusculo","Stephenie Meyer"),
                new Livro(2, "Boa Noite Punpun", "Inio Asano"),
                new Livro(3, "A Culpa É das Estrelas", "John Green")
        ));
    }
    @GetMapping
    Iterable<Livro> getLivros(){
        return livros;
    }
    @GetMapping("/{id}")
    Optional<Livro> getLivro(@PathVariable int id){
        for (Livro livro : livros){
            if (livro.getId().equals(id)){
                return Optional.of(livro);
            }
        }
        return Optional.empty();
    }
    @PostMapping
    Livro postLivro(@RequestBody Livro livro){
        livros.add(livro);
        return livro;
    }
    @PutMapping("/{id}")
    public ResponseEntity<Livro> putLivro(@PathVariable Integer id, @RequestBody Livro livro) {
        int i = 0;
        for(Livro l: livros){
            if(l.getId().equals(id)){
                i = livros.indexOf(l);
                livros.set(i, livro);
            }
        }
        return (i == 0)?
                new ResponseEntity<>(postLivro(livro), HttpStatus.CREATED):
                new ResponseEntity<>(livro, HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    void deleteLivro(@PathVariable int id){
        livros.removeIf(c -> c.getId().equals(id));
    }
}
