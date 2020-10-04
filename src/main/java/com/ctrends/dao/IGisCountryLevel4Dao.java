package com.ctrends.dao;

import java.util.List;
import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ctrends.model.GisCountryLevel4Model;

@Repository
@Transactional
public interface IGisCountryLevel4Dao extends JpaRepository<GisCountryLevel4Model, UUID> {

	@Query(value ="SELECT * FROM gis_country_level_4 where level4_code='51' and level1_code='45'", nativeQuery = true)
	public Object[] getAllUnionpolygon();
	
	@Query(value ="SELECT ST_AsGeoJSON(geography_polygon) FROM gis_country_level_4  limit 2", nativeQuery = true)
	public Object[] getAllUnionsUsingSelectQuery();
	
	@Query(value ="select level1_code, level1_name from gis_country_level_4 where  st_covers(geography_polygon,'point(90.334647 22.716148)')=true", nativeQuery = true)
	public Object[] isExists();
	
}
