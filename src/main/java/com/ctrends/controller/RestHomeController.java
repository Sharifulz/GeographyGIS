package com.ctrends.controller;


import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ctrends.dao.IAgenciesDao;
import com.ctrends.dao.IGisCountryLevel4Dao;
import com.ctrends.model.AgenciesModel;
import com.ctrends.model.GisCountryLevel4Model;




@RestController
public class RestHomeController {

/*
	search_police_locations
	search_lea_stations
	
	get_police_station_from_point
	get_police_stations_within_km_radius
	get_nearest_police_station
	
	get_lea_locations_within_km_radius
	get_nearest_lea_location
*/
	
	@Autowired
	IAgenciesDao agencyDao;
	
	@Autowired
	IGisCountryLevel4Dao level4Dao;
	
	@GetMapping("/agency_as_binary")
	public Object[] getAllAgenciesWithBinaryPolygon() throws Exception {
		//Point p = new Point(Integer.parseInt("90"), Integer.parseInt("22"));
		Object[] agencyList = level4Dao.isExists();
		//level4Dao.getAllUnionpolygon();
		//agencyList.add(objList);
		return agencyList;
	}
	
	@GetMapping("/agency_as_json")
	public List<AgenciesModel> getAllAgenciesWithJsonPolygon() throws Exception {
		
		List<AgenciesModel> agencyList = agencyDao.findAll();
		
		return agencyList;
	}

	
	
}
