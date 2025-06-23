package dev.Add.AgendaDeChamados.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_tecnico")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tecnico {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name="nome")
    private String nome;



}
