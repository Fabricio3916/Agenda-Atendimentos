package dev.Add.AgendaDeChamados.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_chamado")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Chamado {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "Cliente")
    private Cliente cliente;

    @Column(name = "descrição")
    private String descricao;

    @Column(name = "solução")
    private String solucao;

    @Column(name = "tecnico_atribuido")
    private Tecnico tecnico;

    @Column(name = "status")
    private boolean status;


}
