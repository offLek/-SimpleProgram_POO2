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
import com.utfpr.poo2.projectfinal.vo.Cargo;

public class CargoDAOi implements CargoDAO{
    
    EntityManager manager;
    
    public CargoDAOi() {
        manager = ConexaoHibernate.getInstance();
    }

    @Override
    public void salvar(Cargo cargo) {
        manager.getTransaction().begin();
        manager.persist(cargo);
        manager.getTransaction().commit();
    }

    @Override
    public void atualizar(Cargo cargo) {
        manager.getTransaction().begin();
        manager.merge(cargo);
        manager.getTransaction().commit();
    }

    @Override
    public void excluir(Cargo cargo) {
        manager.getTransaction().begin();
        manager.remove(cargo);
        manager.getTransaction().commit();
    }

    @Override
    public List<Cargo> listarTodos() {
        List<Cargo> cargos;
        
        TypedQuery<Cargo> query = manager.createQuery("SELECT c FROM Cargo c", Cargo.class);
        
        cargos = query.getResultList();
        
        return cargos;
    }

    @Override
    public Cargo listarUm(Long id) {
        Cargo cargo;
        
        Query query = manager.createQuery("SELECT c FROM Cargo c WHERE c.codigo = " + id);
        cargo = (Cargo)query.getSingleResult();
        
        return cargo;
    }
    
    @Override
    public List<Cargo> ListarFiltroLike(String like) {
        List<Cargo> cargos;
        
        Query query = manager.createQuery("SELECT c FROM Cargo c WHERE c.nome LIKE '%" + like + "%'");
        cargos = query.getResultList();
        return cargos;
    } 
}
