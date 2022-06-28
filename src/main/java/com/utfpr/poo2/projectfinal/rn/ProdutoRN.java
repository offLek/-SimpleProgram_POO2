/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utfpr.poo2.projectfinal.rn;

import java.util.List;
import org.hibernate.HibernateException;

import com.utfpr.poo2.projectfinal.dao.ProdutoDAO;
import com.utfpr.poo2.projectfinal.dao.ProdutoDAOi;
import com.utfpr.poo2.projectfinal.vo.Produto;

public class ProdutoRN {
    
    private ProdutoDAO produtoDao;
    
    public ProdutoRN() {
        produtoDao = new ProdutoDAOi();
    }
        
    
    public void salvar(Produto produto) {
        // Validações antes de salvar produto
        try {
            produtoDao.salvar(produto);
        } catch (HibernateException he) {
            System.out.println(he);
            
        }
        
    }
    
    
    public List<Produto> listaTodos() {
        return produtoDao.listarTodos();
    }
    
    public Produto listarUm(Long id) {
        return produtoDao.ListarUm(id);
    }
    
    public List<Produto> listarFitroLike(String like) {
        return produtoDao.ListarFiltroLike(like);
    }
    
    public void excluir(Produto produto) {
        produtoDao.excluir(produto);
    }
    
    public void atualizar(Produto produto) {
        produtoDao.atualizar(produto);
    }
        
}
