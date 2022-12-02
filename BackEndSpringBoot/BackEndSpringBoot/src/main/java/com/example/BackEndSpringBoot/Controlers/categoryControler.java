package com.example.BackEndSpringBoot.Controlers;

import com.example.BackEndSpringBoot.Entities.category;
import com.example.BackEndSpringBoot.Entities.livre;
import com.example.BackEndSpringBoot.Repositorirs.categoryRepository;
import com.example.BackEndSpringBoot.Repositorirs.livreRepository;
import com.example.BackEndSpringBoot.Response.response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
@CrossOrigin("*")
public class categoryControler {

    @Autowired
    private categoryRepository CategoryRepository;


    @GetMapping
    public List<category> getAllcategory(){
        return CategoryRepository.findAll();
    }

    @GetMapping("/{id}")
    public category getOnecategory(@PathVariable("id") Long categoryId){
        return CategoryRepository.findById(categoryId).orElse(null);
    }

    @PostMapping
    public category postcategory(@RequestBody category category){
        return  CategoryRepository.save(category);
    }

    @DeleteMapping("/{id}")
    public response deletecategory(@PathVariable("id") Long categoryId){
        CategoryRepository.deleteById(categoryId);
        return  new response("deleted category was succussfully !!! ");
    }

    @PutMapping("/{id}")
    public response updatecategory(@PathVariable("id") Long categoryId ,@RequestBody category category){
        category.setId(categoryId);
        CategoryRepository.save(category);
        return  new response("updated category was succussfully !!! ");
    }
}
