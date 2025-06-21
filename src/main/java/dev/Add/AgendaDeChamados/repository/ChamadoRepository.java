package dev.Add.AgendaDeChamados.repository;

import dev.Add.AgendaDeChamados.model.Chamado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChamadoRepository extends JpaRepository<Chamado, Long> {


}
