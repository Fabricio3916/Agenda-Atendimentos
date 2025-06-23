package dev.Add.AgendaDeChamados.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "tb_chamado")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Chamado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;

    @Column(name = "descrição")
    private String descricao;

    @Column(name = "solução")
    private String solucao;

    @ManyToMany
    @JoinTable(name = "chamado_tecnico",
            joinColumns = @JoinColumn(name= "id_chamado"),
            inverseJoinColumns = @JoinColumn(name = "id_tecnico")
    )
    private Set<Tecnico> tecnicos;

    @Column(name = "status")
    private boolean status;

    private LocalDateTime data_abertura;

    private LocalDateTime data_resolucao;


}
