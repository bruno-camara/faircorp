package com.emse.spring.faircorp.dao;

import com.emse.spring.faircorp.model.Window;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface WindowDao extends JpaRepository<Window, Long>, WindowDaoCustom {

    @Query("select w from Window w where w.id=:id")
    Window findById(@Param("id") String id);

    @Modifying
    @Query("delete from Window w where w.room.id =:roomId")
    void deleteWindowsByRoom(@Param("roomId") Long roomId);
}
