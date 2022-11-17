package com.emse.spring.faircorp.dao;

import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@DataJpaTest
public class BuildingDaoTest {

    @Autowired
    private BuildingDao buildingDao;

//    @Test
//    public void shouldListAllWindowsByBuilding() {
//        List<Window> result = buildingDao.findAllWindowsByBuilding(-10L);
//        Assertions.assertThat(result)
//                .hasSize(4)
//                .extracting("id", "windowStatus")
//                .containsExactly(
//                        Tuple.tuple(-10L, WindowStatus.CLOSED),
//                        Tuple.tuple(-9L, WindowStatus.CLOSED),
//                        Tuple.tuple(-8L, WindowStatus.OPEN),
//                        Tuple.tuple(-7L, WindowStatus.CLOSED));
//    }
//
//    @Test
//    public void shouldListAllHeatersByBuilding() {
//        List<Heater> result = buildingDao.findAllHeatersByBuilding(-10L);
//        Assertions.assertThat(result)
//                .hasSize(2)
//                .extracting("id", "name")
//                .containsExactly(
//                        Tuple.tuple(-10L, "Heater1"),
//                        Tuple.tuple(-9L, "Heater2"));
//    }
}
