package com.ctrends.dao;

import java.util.List;
import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ctrends.model.AgenciesModel;

@Repository
@Transactional
public interface IAgenciesDao extends JpaRepository<AgenciesModel, UUID> {

	@Query(value ="SELECT agency_code, ST_AsGeoJSON(geography_point) FROM agencies", nativeQuery = true)
	public Object[] getAllAgencyUsingSelectQuery();
	
}
