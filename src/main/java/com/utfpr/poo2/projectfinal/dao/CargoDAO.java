/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utfpr.poo2.projectfinal.dao;

import java.util.List;
import com.utfpr.poo2.projectfinal.vo.Cargo;

public interface CargoDAO {
    void salvar(Cargo cargo);
    
    void atualizar(Cargo cargo);
    
    void excluir(Cargo cargo);
    
    List<Cargo> listarTodos();
    
    Cargo listarUm(Long id);
    
    List<Cargo> ListarFiltroLike(String like); 
    
}
