package es.daw.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import es.daw.app.repository.AlumnoRepository;

@Controller
public class AlumnoController {

    @Autowired
    private AlumnoRepository alumnoRepository;

    // Vista 1: Página inicial con el botón
    @GetMapping("/")
    public String index() {
        return "index"; // Busca templates/inicio.html
    }

    // Vista 2: Al pulsar el botón, busca en la BD y muestra la lista
    @GetMapping("/alumnos")
    public String listarAlumnos(Model model) {
        // Obtenemos los alumnos de la BD y los pasamos a la vista
        model.addAttribute("listaAlumnos", alumnoRepository.findAll());
        return "alumno"; // Busca templates/alumnos.html
    }
}