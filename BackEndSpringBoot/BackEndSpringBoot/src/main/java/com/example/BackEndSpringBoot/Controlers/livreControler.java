package com.example.BackEndSpringBoot.Controlers;


import com.example.BackEndSpringBoot.Entities.livre;
import com.example.BackEndSpringBoot.Repositorirs.livreRepository;
import com.example.BackEndSpringBoot.Response.response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livre")
@CrossOrigin("*")
public class livreControler {

    @Autowired
    private livreRepository LivreRepository;


    @GetMapping
    public List<livre> getAllLivre(){
        return LivreRepository.findAll();
    }

    @GetMapping("/{id}")
    public livre getOneLivre(@PathVariable("id") Long livreId){
        return LivreRepository.findById(livreId).orElse(null);
    }

    @PostMapping
    public livre postLivre(@RequestBody livre livre){
        return  LivreRepository.save(livre);
    }

    @DeleteMapping("/{id}")
    public response deleteLivre(@PathVariable("id") Long livreId){
        LivreRepository.deleteById(livreId);
        return  new response("deleted livre was succussfully !!! ");
    }

    @PutMapping("/{id}")
    public response updateLivre(@PathVariable("id") Long livreId ,@RequestBody livre livre){
        livre.setId(livreId);
        LivreRepository.save(livre);
        return  new response("updated livre was succussfully !!! ");
    }
}
