/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utfpr.poo2.projectfinal.dao;

import java.util.List;
import com.utfpr.poo2.projectfinal.vo.Compra;

public interface CompraDAO {
    void salvar(Compra compra);
    
    void atualizar(Compra compra);
    
    void excluir(Compra compra);
    
    List<Compra> listarTodos();
    
    Compra listarUm(Long id);
    
    List<Compra> ListarFiltroLike(String like); 
    
}
