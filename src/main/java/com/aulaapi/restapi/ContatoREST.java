package com.aulaapi.restapi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


import org.springframework.web.bind.annotation.RestController;

import com.aulaapi.restapi.database.RepositorioContato;
import com.aulaapi.restapi.entidadae.Contato;

@RestController
public class ContatoREST {
    @Autowired
    private RepositorioContato repositorio;
    
    @GetMapping("/contato")
    public List<Contato> listar(){
        return repositorio.findAll();
    }

    @PostMapping("/contato")
    public void salvar(@RequestBody Contato contato){
        repositorio.save(contato);
    }
    @PutMapping("/contato")
    public void alterar(@RequestBody Contato contato){
        if(contato.getId()!=null){
            repositorio.save(contato);
        }

    }
    @DeleteMapping("/contato/{id}")
    public void apagarContato(@PathVariable Integer id){
        Contato numero= new Contato();
        numero.setId(id);
        
        if(numero.getId()!=null){
            repositorio.deleteById(id);
        System.out.println(" ta funcionando");
        }

        else{System.out.println("não ta funcionando");}
            
       

    }


    
}
