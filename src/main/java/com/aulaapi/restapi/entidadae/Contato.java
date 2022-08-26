package com.aulaapi.restapi.entidadae;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "contato") // torno explicito o nome da tabela
public class Contato {
    @Column(name = "id") 
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nome",length = 50, nullable = false)
    private String nome;

    @Column(name = "telefone",length = 20, nullable = false)
    private String telefone;

    @Column(name = "email",length = 20, nullable = false)
    private String email;

     @Column(name = "urlavatar",length = 100, nullable = false )
    private String urlavatar;

    public String getUrlavatar() {
        return urlavatar;
    }
    public void setUrlavatar(String urlavatar) {
        this.urlavatar = urlavatar;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
   
    
}
