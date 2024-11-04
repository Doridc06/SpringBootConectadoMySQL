package com.example.nombres;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MiTablaControlador {

    @Autowired
    private MiTablaServicio servicio;

    @GetMapping("/mi-tabla")
    public String verMiTabla(Model modelo) {
        List<MiTabla> datos = servicio.obtenerTodos();
        System.out.println("Datos obtenidos: " + datos); // Agrega esto para verificar
        modelo.addAttribute("datos", datos);

        return "mi_tabla"; // Asegúrate de que este es el nombre correcto de tu archivo HTML
    }

    @GetMapping("/")
    public String redirigirAMiTabla() {
        return "redirect:/mi-tabla";
    }
}
