package dev.Add.AgendaDeChamados.repository;

import dev.Add.AgendaDeChamados.model.Tecnico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer> {
}
