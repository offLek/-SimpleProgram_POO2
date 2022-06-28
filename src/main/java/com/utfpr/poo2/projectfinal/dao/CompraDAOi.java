/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utfpr.poo2.projectfinal.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import com.utfpr.poo2.projectfinal.vo.Compra;

public class CompraDAOi implements CompraDAO{
    
    EntityManager manager;
    
    public CompraDAOi() {
        manager = ConexaoHibernate.getInstance();
    }

    @Override
    public void salvar(Compra compra) {
        manager.getTransaction().begin();
        manager.persist(compra);
        manager.getTransaction().commit();
    }

    @Override
    public void atualizar(Compra compra) {
        manager.getTransaction().begin();
        manager.merge(compra);
        manager.getTransaction().commit();
    }

    @Override
    public void excluir(Compra compra) {
        manager.getTransaction().begin();
        manager.remove(compra);
        manager.getTransaction().commit();
    }

    @Override
    public List<Compra> listarTodos() {
        List<Compra> compra;
        
        TypedQuery<Compra> query = manager.createQuery("SELECT com FROM Compra com", Compra.class);
        
        compra = query.getResultList();
        
        return compra;
    }

    @Override
    public Compra listarUm(Long id) {
        Compra compra;
        
        Query query = manager.createQuery("SELECT com FROM Compra com WHERE com.codigo = " + id);
        compra = (Compra)query.getSingleResult();
        
        return compra;
    }
    
    @Override
    public List<Compra> ListarFiltroLike(String like) {
        List<Compra> compras;
        
        Query query = manager.createQuery("SELECT c FROM Compra c WHERE c.codigo LIKE '%" + like + "%'");
        compras = query.getResultList();
        return compras;
    } 
}
