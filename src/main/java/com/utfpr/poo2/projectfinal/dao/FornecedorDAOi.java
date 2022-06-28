/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utfpr.poo2.projectfinal.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import com.utfpr.poo2.projectfinal.vo.Fornecedor;

public class FornecedorDAOi implements FornecedorDAO {

    EntityManager manager;
    
    public FornecedorDAOi() {
        manager = ConexaoHibernate.getInstance();
    }
    
    @Override
    public void salvar(Fornecedor fornecedor) {
        manager.getTransaction().begin();
        manager.persist(fornecedor);
        manager.getTransaction().commit();
    }

    @Override
    public void atualizar(Fornecedor fornecedor) {
        manager.getTransaction().begin();
        manager.merge(fornecedor);
        manager.getTransaction().commit();
    }

    @Override
    public void excluir(Fornecedor fornecedor) {
        manager.getTransaction().begin();
        manager.remove(fornecedor);
        manager.getTransaction().commit();
    }

    @Override
    public List<Fornecedor> listarTodos() {
        List<Fornecedor> fornecedors;
        
        Query query = manager.createQuery("SELECT fo FROM Fornecedor fo");
        fornecedors = query.getResultList();
        
        return fornecedors;
    }

    @Override
    public Fornecedor ListarUm(Long id) {
        Fornecedor fornecedor;
        
        Query query = manager.createQuery("SELECT fo FROM Fornecedor fo WHERE fo.codigo = " + id);
        fornecedor = (Fornecedor)query.getSingleResult();
        
        return fornecedor;
    }
    
    @Override
    public List<Fornecedor> ListarFiltroLike(String like) {
        List<Fornecedor> fornecedors;
        
        Query query = manager.createQuery("SELECT c FROM Fornecedor c WHERE c.nome_fantasia LIKE '%" + like + "%'");
        fornecedors = query.getResultList();
        return fornecedors;
    } 
}
