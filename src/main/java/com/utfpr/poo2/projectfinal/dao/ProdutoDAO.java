/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utfpr.poo2.projectfinal.dao;

import java.util.List;
import com.utfpr.poo2.projectfinal.vo.Produto;

public interface ProdutoDAO {
    void salvar(Produto produto);
    
    void atualizar(Produto produto);
    
    void excluir(Produto produto);
    
    List<Produto> listarTodos();
    
    Produto ListarUm(Long id);
    
    List<Produto> ListarFiltroLike(String like); 
}
