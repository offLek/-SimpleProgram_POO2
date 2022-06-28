/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utfpr.poo2.projectfinal.dao;

import java.util.List;
import com.utfpr.poo2.projectfinal.vo.Funcionario;

public interface FuncionarioDAO {
    void salvar(Funcionario funcionario);
    
    void atualizar(Funcionario funcionario);
    
    void excluir(Funcionario funcionario);
    
    List<Funcionario> listarTodos();
    
    Funcionario ListarUm(Long id);
    
    List<Funcionario> ListarFiltroLike(String like); 
}
