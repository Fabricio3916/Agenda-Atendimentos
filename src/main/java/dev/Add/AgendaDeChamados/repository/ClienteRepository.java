package dev.Add.AgendaDeChamados.repository;

import dev.Add.AgendaDeChamados.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
