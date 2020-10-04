package com.ctrends.model;
import java.util.UUID;
import javax.persistence.Id;
import org.hibernate.annotations.Type;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "gis_country_level_4")
public class GisCountryLevel4Model{

 	@Id
	@Type(type = "org.hibernate.type.PostgresUUIDType")
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private UUID id;	//NOT NULL DEFAULT uuid_generate_v4() 

	@Column(name = "country_id")
	private UUID countryId;	//DEFAULT '0b631485-359f-412d-be3e-85a3ddd32ad6' 

	@Column(name = "country_code")
	private String countryCode;	//DEFAULT 'BD' 

	@Column(name = "country_name")
	private String countryName;	//DEFAULT 'Bangladesh' 

	@Column(name = "level1_id")
	private UUID level1Id;

	@Column(name = "level1_code")
	private String level1Code;	//DEFAULT '60' 

	@Column(name = "level1_name")
	private String level1Name;	//DEFAULT 'Sylhet Division' 

	@Column(name = "level2_id")
	private UUID level2Id;

	@Column(name = "level2_code")
	private String level2Code;

	@Column(name = "level2_name")
	private String level2Name;

	@Column(name = "level3_id")
	private UUID level3Id;

	@Column(name = "level3_code")
	private String level3Code;

	@Column(name = "level3_name")
	private String level3Name;

	@Column(name = "level_type")
	private String levelType;	//DEFAULT 'Union' 

	@Column(name = "level4_code")
	private String level4Code;

	@Column(name = "level4_name")
	private String level4Name;

	@Column(name = "area_skm")
	private double areaSkm;	//DEFAULT 0 

	@Column(name = "office_latitude")
	private double officeLatitude;	//DEFAULT 0 

	@Column(name = "office_longitude")
	private double officeLongitude;	//DEFAULT 0 

	@Column(name = "office_phone")
	private String officePhone;

	@Column(name = "office_email")
	private String officeEmail;

	@Column(name = "office_website")
	private String officeWebsite;

	@Column(name = "office_address")
	private String officeAddress;

	@Column(name = "local_lang_name")
	private String localLangName;

	@Column(name = "office_incharge")
	private String officeIncharge;

	@Column(name = "total_population")
	private long totalPopulation;	//DEFAULT 0 

	@Column(name = "population_male")
	private long populationMale;	//DEFAULT 0 

	@Column(name = "population_female")
	private long populationFemale;	//DEFAULT 0 

	@Column(name = "young_boys")
	private long youngBoys;	//DEFAULT 0 

	@Column(name = "young_girls")
	private long youngGirls;	//DEFAULT 0 

	@Column(name = "trans_gender")
	private long transGender;	//DEFAULT 0 

	@Column(name = "employed_male")
	private long employedMale;	//DEFAULT 0 

	@Column(name = "employed_female")
	private long employedFemale;	//DEFAULT 0 

	@Column(name = "unemployed_male")
	private long unemployedMale;	//DEFAULT 0 

	@Column(name = "unemployed_female")
	private long unemployedFemale;	//DEFAULT 0 

	@Column(name = "educated_male")
	private long educatedMale;	//DEFAULT 0 

	@Column(name = "educated_female")
	private long educatedFemale;	//DEFAULT 0 

	@Column(name = "density_per_skm")
	private long densityPerSkm;	//DEFAULT 0 

	@Column(name = "total_households")
	private long totalHouseholds;	//DEFAULT 0 

	@Column(name = "geography_polygon")
	private String geographyPolygon;

	@Column(name = "geography_point")
	private String geographyPoint;

	@Column(name = "level1_full_code")
	private String level1FullCode;

	@Column(name = "level2_full_code")
	private String level2FullCode;

	@Column(name = "level3_full_code")
	private String level3FullCode;

	@Column(name = "level4_full_code")
	private String level4FullCode;

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public UUID getCountryId() {
		return countryId;
	}

	public void setCountryId(UUID countryId) {
		this.countryId = countryId;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public UUID getLevel1Id() {
		return level1Id;
	}

	public void setLevel1Id(UUID level1Id) {
		this.level1Id = level1Id;
	}

	public String getLevel1Code() {
		return level1Code;
	}

	public void setLevel1Code(String level1Code) {
		this.level1Code = level1Code;
	}

	public String getLevel1Name() {
		return level1Name;
	}

	public void setLevel1Name(String level1Name) {
		this.level1Name = level1Name;
	}

	public UUID getLevel2Id() {
		return level2Id;
	}

	public void setLevel2Id(UUID level2Id) {
		this.level2Id = level2Id;
	}

	public String getLevel2Code() {
		return level2Code;
	}

	public void setLevel2Code(String level2Code) {
		this.level2Code = level2Code;
	}

	public String getLevel2Name() {
		return level2Name;
	}

	public void setLevel2Name(String level2Name) {
		this.level2Name = level2Name;
	}

	public UUID getLevel3Id() {
		return level3Id;
	}

	public void setLevel3Id(UUID level3Id) {
		this.level3Id = level3Id;
	}

	public String getLevel3Code() {
		return level3Code;
	}

	public void setLevel3Code(String level3Code) {
		this.level3Code = level3Code;
	}

	public String getLevel3Name() {
		return level3Name;
	}

	public void setLevel3Name(String level3Name) {
		this.level3Name = level3Name;
	}

	public String getLevelType() {
		return levelType;
	}

	public void setLevelType(String levelType) {
		this.levelType = levelType;
	}

	public String getLevel4Code() {
		return level4Code;
	}

	public void setLevel4Code(String level4Code) {
		this.level4Code = level4Code;
	}

	public String getLevel4Name() {
		return level4Name;
	}

	public void setLevel4Name(String level4Name) {
		this.level4Name = level4Name;
	}

	public double getAreaSkm() {
		return areaSkm;
	}

	public void setAreaSkm(double areaSkm) {
		this.areaSkm = areaSkm;
	}

	public double getOfficeLatitude() {
		return officeLatitude;
	}

	public void setOfficeLatitude(double officeLatitude) {
		this.officeLatitude = officeLatitude;
	}

	public double getOfficeLongitude() {
		return officeLongitude;
	}

	public void setOfficeLongitude(double officeLongitude) {
		this.officeLongitude = officeLongitude;
	}

	public String getOfficePhone() {
		return officePhone;
	}

	public void setOfficePhone(String officePhone) {
		this.officePhone = officePhone;
	}

	public String getOfficeEmail() {
		return officeEmail;
	}

	public void setOfficeEmail(String officeEmail) {
		this.officeEmail = officeEmail;
	}

	public String getOfficeWebsite() {
		return officeWebsite;
	}

	public void setOfficeWebsite(String officeWebsite) {
		this.officeWebsite = officeWebsite;
	}

	public String getOfficeAddress() {
		return officeAddress;
	}

	public void setOfficeAddress(String officeAddress) {
		this.officeAddress = officeAddress;
	}

	public String getLocalLangName() {
		return localLangName;
	}

	public void setLocalLangName(String localLangName) {
		this.localLangName = localLangName;
	}

	public String getOfficeIncharge() {
		return officeIncharge;
	}

	public void setOfficeIncharge(String officeIncharge) {
		this.officeIncharge = officeIncharge;
	}

	public long getTotalPopulation() {
		return totalPopulation;
	}

	public void setTotalPopulation(long totalPopulation) {
		this.totalPopulation = totalPopulation;
	}

	public long getPopulationMale() {
		return populationMale;
	}

	public void setPopulationMale(long populationMale) {
		this.populationMale = populationMale;
	}

	public long getPopulationFemale() {
		return populationFemale;
	}

	public void setPopulationFemale(long populationFemale) {
		this.populationFemale = populationFemale;
	}

	public long getYoungBoys() {
		return youngBoys;
	}

	public void setYoungBoys(long youngBoys) {
		this.youngBoys = youngBoys;
	}

	public long getYoungGirls() {
		return youngGirls;
	}

	public void setYoungGirls(long youngGirls) {
		this.youngGirls = youngGirls;
	}

	public long getTransGender() {
		return transGender;
	}

	public void setTransGender(long transGender) {
		this.transGender = transGender;
	}

	public long getEmployedMale() {
		return employedMale;
	}

	public void setEmployedMale(long employedMale) {
		this.employedMale = employedMale;
	}

	public long getEmployedFemale() {
		return employedFemale;
	}

	public void setEmployedFemale(long employedFemale) {
		this.employedFemale = employedFemale;
	}

	public long getUnemployedMale() {
		return unemployedMale;
	}

	public void setUnemployedMale(long unemployedMale) {
		this.unemployedMale = unemployedMale;
	}

	public long getUnemployedFemale() {
		return unemployedFemale;
	}

	public void setUnemployedFemale(long unemployedFemale) {
		this.unemployedFemale = unemployedFemale;
	}

	public long getEducatedMale() {
		return educatedMale;
	}

	public void setEducatedMale(long educatedMale) {
		this.educatedMale = educatedMale;
	}

	public long getEducatedFemale() {
		return educatedFemale;
	}

	public void setEducatedFemale(long educatedFemale) {
		this.educatedFemale = educatedFemale;
	}

	public long getDensityPerSkm() {
		return densityPerSkm;
	}

	public void setDensityPerSkm(long densityPerSkm) {
		this.densityPerSkm = densityPerSkm;
	}

	public long getTotalHouseholds() {
		return totalHouseholds;
	}

	public void setTotalHouseholds(long totalHouseholds) {
		this.totalHouseholds = totalHouseholds;
	}

	public String getGeographyPolygon() {
		return geographyPolygon;
	}

	public void setGeographyPolygon(String geographyPolygon) {
		this.geographyPolygon = geographyPolygon;
	}

	public String getGeographyPoint() {
		return geographyPoint;
	}

	public void setGeographyPoint(String geographyPoint) {
		this.geographyPoint = geographyPoint;
	}

	public String getLevel1FullCode() {
		return level1FullCode;
	}

	public void setLevel1FullCode(String level1FullCode) {
		this.level1FullCode = level1FullCode;
	}

	public String getLevel2FullCode() {
		return level2FullCode;
	}

	public void setLevel2FullCode(String level2FullCode) {
		this.level2FullCode = level2FullCode;
	}

	public String getLevel3FullCode() {
		return level3FullCode;
	}

	public void setLevel3FullCode(String level3FullCode) {
		this.level3FullCode = level3FullCode;
	}

	public String getLevel4FullCode() {
		return level4FullCode;
	}

	public void setLevel4FullCode(String level4FullCode) {
		this.level4FullCode = level4FullCode;
	}

	public GisCountryLevel4Model() {
	}



}
