package com.example.nombres;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MiTablaServicio {

    @Autowired
    private MiTablaRepositorio repositorio;

    public List<MiTabla> obtenerTodos() {
        return repositorio.findAll();
    }
}
