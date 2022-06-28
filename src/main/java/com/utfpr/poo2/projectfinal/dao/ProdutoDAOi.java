/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utfpr.poo2.projectfinal.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import com.utfpr.poo2.projectfinal.vo.Produto;

public class ProdutoDAOi implements ProdutoDAO {

    EntityManager manager;
    
    public ProdutoDAOi() {
        manager = ConexaoHibernate.getInstance();
    }
    
    @Override
    public void salvar(Produto produto) {
        manager.getTransaction().begin();
        manager.persist(produto);
        manager.getTransaction().commit();
    }

    @Override
    public void atualizar(Produto produto) {
        manager.getTransaction().begin();
        manager.merge(produto);
        manager.getTransaction().commit();
    }

    @Override
    public void excluir(Produto produto) {
        manager.getTransaction().begin();
        manager.remove(produto);
        manager.getTransaction().commit();
    }

    @Override
    public List<Produto> listarTodos() {
        List<Produto> produtos;
        
        Query query = manager.createQuery("SELECT p FROM Produto p");
        produtos = query.getResultList();
        
        return produtos;
    }

    @Override
    public Produto ListarUm(Long id) {
        Produto produto;
        
        Query query = manager.createQuery("SELECT p FROM Produto p WHERE p.codigo = " + id);
        produto = (Produto)query.getSingleResult();
        
        return produto;
    }
    
    @Override
    public List<Produto> ListarFiltroLike(String like) {
        List<Produto> produtos;
        
        Query query = manager.createQuery("SELECT c FROM Produto c WHERE c.nome LIKE '%" + like + "%'");
        produtos = query.getResultList();
        return produtos;
    } 
}
