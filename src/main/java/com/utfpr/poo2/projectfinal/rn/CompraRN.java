/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utfpr.poo2.projectfinal.rn;

import java.util.List;
import org.hibernate.HibernateException;

import com.utfpr.poo2.projectfinal.dao.CompraDAO;
import com.utfpr.poo2.projectfinal.dao.CompraDAOi;
import com.utfpr.poo2.projectfinal.vo.Compra;

public class CompraRN {
    
    private CompraDAO compraDao;
    
    public CompraRN() {
        compraDao = new CompraDAOi();
    }
        
    
    public void salvar(Compra compra) {
        // Validações antes de salvar compra
        try {
            compraDao.salvar(compra);
        } catch (HibernateException he) {
            System.out.println(he);
            
        }
        
    }
    
    public List<Compra> listaTodos() {
        return compraDao.listarTodos();
    }
    
    public Compra listarUm(Long id) {
        return compraDao.listarUm(id);
    }
    
    public List<Compra> listarFitroLike(String like) {
        return compraDao.ListarFiltroLike(like);
    }
    
    public void excluir(Compra compra) {
        compraDao.excluir(compra);
    }
    
    public void atualizar(Compra compra) {
        compraDao.atualizar(compra);
    }
        
}
