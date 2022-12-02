package com.example.BackEndSpringBoot.Entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class livre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String Titre;

    private String Auteur;

    private String Description;

    private String Contenue;

    @ManyToOne
    private category categoryLivre;
}
