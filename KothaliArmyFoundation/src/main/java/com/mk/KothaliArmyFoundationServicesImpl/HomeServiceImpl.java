package com.mk.KothaliArmyFoundationServicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mk.KothaliArmyFoundationBO.HomeBO;
import com.mk.KothaliArmyFoundationDao.HomeDAO;
import com.mk.KothaliArmyFoundationServices.HomeService;

@Service("homeService")
public class HomeServiceImpl implements HomeService {
	@Autowired
	public HomeDAO homeDao;

	@Override
	public List<HomeBO> getKothaliFoundationDetails() {
		try {
			
			List<HomeBO> list=(List<HomeBO>) homeDao.findAll();
			if(list!=null) {
				return list;
			}
			return null;
			
		}catch(Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}

}
