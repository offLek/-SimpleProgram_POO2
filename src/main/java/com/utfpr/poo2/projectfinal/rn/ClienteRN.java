/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utfpr.poo2.projectfinal.rn;

import java.util.List;
import org.hibernate.HibernateException;

import com.utfpr.poo2.projectfinal.dao.ClienteDAO;
import com.utfpr.poo2.projectfinal.dao.ClienteDAOi;
import com.utfpr.poo2.projectfinal.vo.Cliente;

public class ClienteRN {
    
    private ClienteDAO clienteDao;
    
    public ClienteRN() {
        clienteDao = new ClienteDAOi();
    }
        
    
    public void salvar(Cliente cliente) {
        // Validações antes de salvar cliente
        try {
            clienteDao.salvar(cliente);
        } catch (HibernateException he) {
            System.out.println(he);
            
        }
        
    }

    
    public List<Cliente> listaTodos() {
        return clienteDao.listarTodos();
    }
    
    public Cliente listarUm(Long id) {
        return clienteDao.ListarUm(id);
    }
    
    public List<Cliente> listarFitroLike(String like) {
        return clienteDao.ListarFiltroLike(like);
    }
    
    public void excluir(Cliente cliente) {
        clienteDao.excluir(cliente);
    }
    
    public void atualizar(Cliente cliente) {
        clienteDao.atualizar(cliente);
    }
        
}
