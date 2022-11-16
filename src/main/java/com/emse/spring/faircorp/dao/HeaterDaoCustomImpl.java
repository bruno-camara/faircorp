package com.emse.spring.faircorp.dao;

import com.emse.spring.faircorp.model.Heater;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class HeaterDaoCustomImpl implements HeaterDaoCustom {

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Heater> findHeatersByRoom(String roomName){
        String jpql = "select h from Heater h where h.room.name = :roomName";
        return em.createQuery(jpql, Heater.class)
                .setParameter("roomName", roomName)
                .getResultList();
    }
}
