package es.daw.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import es.daw.app.model.Alumno;

@Repository
public interface AlumnoRepository extends JpaRepository<Alumno, Long> {
    // Hereda findAll(), findById(), save(), etc. No necesitas escribir nada más aquí.
}