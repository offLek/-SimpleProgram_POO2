/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utfpr.poo2.projectfinal.dao;

import java.util.List;
import com.utfpr.poo2.projectfinal.vo.Fornecedor;

public interface FornecedorDAO {
    void salvar(Fornecedor fornecedor);
    
    void atualizar(Fornecedor fornecedor);
    
    void excluir(Fornecedor fornecedor);
    
    List<Fornecedor> listarTodos();
    
    Fornecedor ListarUm(Long id);
    
    List<Fornecedor> ListarFiltroLike(String like); 
}
