/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utfpr.poo2.projectfinal.dao;

import java.util.List;
import com.utfpr.poo2.projectfinal.vo.Cliente;

public interface ClienteDAO {
    void salvar(Cliente cliente);
    
    void atualizar(Cliente cliente);
    
    void excluir(Cliente cliente);
    
    List<Cliente> listarTodos();
    
    Cliente ListarUm(Long id);
    
    List<Cliente> ListarFiltroLike(String like);
}
