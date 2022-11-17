package com.emse.spring.faircorp.dao;

import com.emse.spring.faircorp.model.Heater;
import com.emse.spring.faircorp.model.Window;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class BuildingDaoCustomImpl implements BuildingDaoCustom {

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Heater> findAllHeatersByBuilding(Long buildingId){
        String jpql = "select h from Heater h where h.room.building.id = :buildingId";
        return em.createQuery(jpql, Heater.class)
                .getResultList();
    }

    @Override
    public List<Window> findAllWindowsByBuilding(Long buildingId) {
        String jpql = "select w from Window w where w.room.building.id = :buildingId";
        return em.createQuery(jpql, Window.class)
                .getResultList();
    }
}
