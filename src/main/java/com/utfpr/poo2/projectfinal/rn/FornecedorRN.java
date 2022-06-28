/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utfpr.poo2.projectfinal.rn;

import java.util.List;
import org.hibernate.HibernateException;

import com.utfpr.poo2.projectfinal.dao.FornecedorDAO;
import com.utfpr.poo2.projectfinal.dao.FornecedorDAOi;
import com.utfpr.poo2.projectfinal.vo.Fornecedor;

public class FornecedorRN {
    
    private FornecedorDAO fornecedorDao;
    
    public FornecedorRN() {
        fornecedorDao = new FornecedorDAOi();
    }
        
    
    public void salvar(Fornecedor fornecedor) {
        // Validações antes de salvar fornecedor
        try {
            fornecedorDao.salvar(fornecedor);
        } catch (HibernateException he) {
            System.out.println(he);
            
        }
        
    }
  
    public List<Fornecedor> listaTodos() {
        return fornecedorDao.listarTodos();
    }
    
    public Fornecedor listarUm(Long id) {
        return fornecedorDao.ListarUm(id);
    }
    
    public List<Fornecedor> listarFitroLike(String like) {
        return fornecedorDao.ListarFiltroLike(like);
    }
    
    public void excluir(Fornecedor fornecedor) {
        fornecedorDao.excluir(fornecedor);
    }
    
    public void atualizar(Fornecedor fornecedor) {
        fornecedorDao.atualizar(fornecedor);
    }
        
}
