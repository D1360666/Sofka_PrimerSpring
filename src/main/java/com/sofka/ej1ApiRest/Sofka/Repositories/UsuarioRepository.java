package com.sofka.ej1ApiRest.Sofka.Repositories;

import com.sofka.ej1ApiRest.Sofka.Models.UsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;
import java.util.List;

public interface UsuarioRepository extends JpaRepository<UsuarioModel, Long> {
    public abstract ArrayList<UsuarioModel> findByPrioridad(Integer prioridad);
}
