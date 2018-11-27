package com.mk.KothaliArmyFoundationDao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mk.KothaliArmyFoundationBO.HomeBO;

@Repository
public interface HomeDAO extends CrudRepository<HomeBO, Integer> {

}
