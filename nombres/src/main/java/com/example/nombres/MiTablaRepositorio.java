package com.example.nombres;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MiTablaRepositorio extends JpaRepository<MiTabla, Long> {
}
