package com.ctrends.model;
import java.util.UUID;
import javax.persistence.Id;
import org.hibernate.annotations.Type;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import java.sql.Date;
import java.sql.Timestamp;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "agencies")
public class AgenciesModel{

	@Id
	@Type(type = "org.hibernate.type.PostgresUUIDType")
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private UUID id;	//NOT NULL DEFAULT uuid_generate_v4() 

	@Column(name = "agency_code")
	private String agencyCode;	//COLLATE pg_catalog."default" DEFAULT 'RJSC'::character varying 

	@Column(name = "agency_name")
	private String agencyName;	//COLLATE pg_catalog."default" DEFAULT 'Register of Joint Stock Companies'::character varying 

	@Column(name = "agency_type")
	private String agencyType;	//COLLATE pg_catalog."default" DEFAULT 'Government'::character varying 

	@Column(name = "legal_type")
	private String legalType;	//COLLATE pg_catalog."default" DEFAULT 'Government'::character varying 

	@Column(name = "agency_owner_name")
	private String agencyOwnerName;	//COLLATE pg_catalog."default" DEFAULT 'Government'::character varying 

	@Column(name = "industry_sector")
	private String industrySector;	//COLLATE pg_catalog."default" DEFAULT 'Government'::character varying 

	@Column(name = "business_nature")
	private String businessNature;	//COLLATE pg_catalog."default" DEFAULT 'Company Registration'::character varying 

	@Column(name = "currency")
	private String currency;	//COLLATE pg_catalog."default" DEFAULT 'BDT'::character varying 

	@Column(name = "office_latitude")
	private double officeLatitude;	//DEFAULT 23.00 

	@Column(name = "office_longitude")
	private double officeLongitude;	//DEFAULT 90.00 

	@Column(name = "geography_point")
	private String geographyPoint;

	@Column(name = "geography_polygon")
	private String geographyPolygon;

	@Column(name = "office_address")
	private String officeAddress;	//COLLATE pg_catalog."default" 

	@Column(name = "geography_type")
	private String geographyType;	//COLLATE pg_catalog."default" DEFAULT 'Urban'::character varying 

	@Column(name = "country_id")
	private UUID countryId;	//DEFAULT '0b631485-359f-412d-be3e-85a3ddd32ad6'::uuid 

	@Column(name = "country_code")
	private String countryCode;	//COLLATE pg_catalog."default" DEFAULT 'BD'::character varying 

	@Column(name = "country_name")
	private String countryName;	//COLLATE pg_catalog."default" DEFAULT 'Bangladesh'::character varying 

	@Column(name = "geo_level1_id")
	private UUID geoLevel1Id;	//DEFAULT 'cc8c22e3-8fee-448d-b5a5-52b611ce1fdf'::uuid 

	@Column(name = "geo_level1_code")
	private String geoLevel1Code;	//COLLATE pg_catalog."default" DEFAULT '55'::character varying 

	@Column(name = "geo_level1_name")
	private String geoLevel1Name;	//COLLATE pg_catalog."default" DEFAULT 'Rangpur'::character varying 

	@Column(name = "geo_level2_id")
	private UUID geoLevel2Id;	//DEFAULT 'c2ca0894-703e-464a-995c-5bd3f82af235'::uuid 

	@Column(name = "geo_level2_code")
	private String geoLevel2Code;	//COLLATE pg_catalog."default" DEFAULT '85'::character varying 

	@Column(name = "geo_level2_name")
	private String geoLevel2Name;	//COLLATE pg_catalog."default" DEFAULT 'Rangpur'::character varying 

	@Column(name = "geo_level3_id")
	private UUID geoLevel3Id;	//DEFAULT '53de4dce-51ab-4064-aee2-6237042c57ee'::uuid 

	@Column(name = "geo_level3_code")
	private String geoLevel3Code;	//COLLATE pg_catalog."default" DEFAULT '27'::character varying 

	@Column(name = "geo_level3_name")
	private String geoLevel3Name;	//COLLATE pg_catalog."default" DEFAULT 'Gangachara'::character varying 

	@Column(name = "geo_level4_id")
	private UUID geoLevel4Id;	//DEFAULT '894360d0-4525-434d-944a-e2c7b4c2f435'::uuid 

	@Column(name = "geo_level4_code")
	private String geoLevel4Code;	//COLLATE pg_catalog."default" DEFAULT '31'::character varying 

	@Column(name = "geo_level4_name")
	private String geoLevel4Name;	//COLLATE pg_catalog."default" DEFAULT 'Gangachara'::character varying 

	@Column(name = "use_google_maps")
	private boolean useGoogleMaps;	//DEFAULT false 

	@Column(name = "google_maps_api_key")
	private String googleMapsApiKey;	//COLLATE pg_catalog."default" DEFAULT 'AIzaSyB_qsP8AOP_P0MdlPz-48TDaJYjTP3vbjo'::character varying 

	@Column(name = "use_osm_maps")
	private boolean useOsmMaps;	//DEFAULT true 

	@Column(name = "osm_maps_api_key")
	private String osmMapsApiKey;	//COLLATE pg_catalog."default" DEFAULT 'pk.eyJ1IjoibWFwYm94IiwiYSI6ImNpejY4NXVycTA2emYycXBndHRqcmZ3N3gifQ.rJcFIG214AriISLbB6B5aw'::character varying 

	@Column(name = "phone")
	private String phone;	//COLLATE pg_catalog."default" 

	@Column(name = "website")
	private String website;	//COLLATE pg_catalog."default" 

	@Column(name = "email")
	private String email;	//COLLATE pg_catalog."default" 

	@Column(name = "linkedin_page")
	private String linkedinPage;	//COLLATE pg_catalog."default" 

	@Column(name = "facebook_page")
	private String facebookPage;	//COLLATE pg_catalog."default" 

	@Column(name = "twitter_page")
	private String twitterPage;	//COLLATE pg_catalog."default" 

	@Column(name = "admin_username")
	private String adminUsername;	//COLLATE pg_catalog."default" DEFAULT 'CTS200001'::character varying 

	@Column(name = "admin_fullname")
	private String adminFullname;	//COLLATE pg_catalog."default" DEFAULT 'Mamunur Rahman'::character varying 

	@Column(name = "admin_mobile")
	private String adminMobile;	//COLLATE pg_catalog."default" DEFAULT '8801610006106'::character varying 

	@Column(name = "admin_email")
	private String adminEmail;	//COLLATE pg_catalog."default" DEFAULT 'mrahman2k4@gmail.com'::character varying 

	@Column(name = "created_by_username")
	private String createdByUsername;	//COLLATE pg_catalog."default" DEFAULT 'CTS200001'::character varying 

	@Column(name = "created_by_fullname")
	private String createdByFullname;	//COLLATE pg_catalog."default" DEFAULT 'Mamunur Rahman'::character varying 

	@Column(name = "created_by_email")
	private String createdByEmail;	//COLLATE pg_catalog."default" DEFAULT 'mrahman2k4@gmail.com'::character varying 

	@Column(name = "created_on")
	private Date createdOn;	//DEFAULT CURRENT_DATE 

	@Column(name = "created_at")
	private Timestamp createdAt;	//DEFAULT LOCALTIMESTAMP 

	@Column(name = "license_authority")
	private String licenseAuthority;	//COLLATE pg_catalog."default" DEFAULT 'Dhaka South City Corporation'::character varying 

	@Column(name = "license_no")
	private String licenseNo;	//COLLATE pg_catalog."default" 

	@Column(name = "license_issue_date")
	private Date licenseIssueDate;

	@Column(name = "license_expired_date")
	private Date licenseExpiredDate;

	@Column(name = "license_type")
	private String licenseType;	//COLLATE pg_catalog."default" 

	@Column(name = "is_license_doc_uploaded")
	private boolean isLicenseDocUploaded;	//DEFAULT false 

	@Column(name = "is_license_no_verified")
	private boolean isLicenseNoVerified;	//DEFAULT false 

	@Column(name = "license_doc_verified_date")
	private Date licenseDocVerifiedDate;

	@Column(name = "license_doc_verification_response")
	private String licenseDocVerificationResponse;	//COLLATE pg_catalog."default" 

	@Column(name = "tax_authority")
	private String taxAuthority;	//COLLATE pg_catalog."default" DEFAULT 'National Board of Revenue'::character varying 

	@Column(name = "tax_no")
	private String taxNo;	//COLLATE pg_catalog."default" 

	@Column(name = "tax_reg_date")
	private Date taxRegDate;

	@Column(name = "tax_zone")
	private String taxZone;	//COLLATE pg_catalog."default" 

	@Column(name = "tax_circle")
	private String taxCircle;	//COLLATE pg_catalog."default" 

	@Column(name = "is_tax_doc_uploaded")
	private boolean isTaxDocUploaded;	//DEFAULT false 

	@Column(name = "is_tax_no_verified")
	private boolean isTaxNoVerified;	//DEFAULT false 

	@Column(name = "tax_doc_verified_date")
	private Date taxDocVerifiedDate;

	@Column(name = "tax_doc_verification_response")
	private String taxDocVerificationResponse;	//COLLATE pg_catalog."default" 

	@Column(name = "vat_authority")
	private String vatAuthority;	//COLLATE pg_catalog."default" DEFAULT 'National Board of Revenue'::character varying 

	@Column(name = "vat_no")
	private String vatNo;	//COLLATE pg_catalog."default" 

	@Column(name = "vat_reg_date")
	private Date vatRegDate;

	@Column(name = "vat_zone")
	private String vatZone;	//COLLATE pg_catalog."default" 

	@Column(name = "vat_circle")
	private String vatCircle;	//COLLATE pg_catalog."default" 

	@Column(name = "is_vat_doc_uploaded")
	private boolean isVatDocUploaded;	//DEFAULT false 

	@Column(name = "is_vat_no_verified")
	private boolean isVatNoVerified;	//DEFAULT false 

	@Column(name = "vat_doc_verified_date")
	private Date vatDocVerifiedDate;

	@Column(name = "vat_doc_verification_response")
	private String vatDocVerificationResponse;	//COLLATE pg_catalog."default" 

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getAgencyCode() {
		return agencyCode;
	}

	public void setAgencyCode(String agencyCode) {
		this.agencyCode = agencyCode;
	}

	public String getAgencyName() {
		return agencyName;
	}

	public void setAgencyName(String agencyName) {
		this.agencyName = agencyName;
	}

	public String getAgencyType() {
		return agencyType;
	}

	public void setAgencyType(String agencyType) {
		this.agencyType = agencyType;
	}

	public String getLegalType() {
		return legalType;
	}

	public void setLegalType(String legalType) {
		this.legalType = legalType;
	}

	public String getAgencyOwnerName() {
		return agencyOwnerName;
	}

	public void setAgencyOwnerName(String agencyOwnerName) {
		this.agencyOwnerName = agencyOwnerName;
	}

	public String getIndustrySector() {
		return industrySector;
	}

	public void setIndustrySector(String industrySector) {
		this.industrySector = industrySector;
	}

	public String getBusinessNature() {
		return businessNature;
	}

	public void setBusinessNature(String businessNature) {
		this.businessNature = businessNature;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
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

	public String getGeographyPoint() {
		return geographyPoint;
	}

	public void setGeographyPoint(String geographyPoint) {
		this.geographyPoint = geographyPoint;
	}

	public String getGeographyPolygon() {
		return geographyPolygon;
	}

	public void setGeographyPolygon(String geographyPolygon) {
		this.geographyPolygon = geographyPolygon;
	}

	public String getOfficeAddress() {
		return officeAddress;
	}

	public void setOfficeAddress(String officeAddress) {
		this.officeAddress = officeAddress;
	}

	public String getGeographyType() {
		return geographyType;
	}

	public void setGeographyType(String geographyType) {
		this.geographyType = geographyType;
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

	public UUID getGeoLevel1Id() {
		return geoLevel1Id;
	}

	public void setGeoLevel1Id(UUID geoLevel1Id) {
		this.geoLevel1Id = geoLevel1Id;
	}

	public String getGeoLevel1Code() {
		return geoLevel1Code;
	}

	public void setGeoLevel1Code(String geoLevel1Code) {
		this.geoLevel1Code = geoLevel1Code;
	}

	public String getGeoLevel1Name() {
		return geoLevel1Name;
	}

	public void setGeoLevel1Name(String geoLevel1Name) {
		this.geoLevel1Name = geoLevel1Name;
	}

	public UUID getGeoLevel2Id() {
		return geoLevel2Id;
	}

	public void setGeoLevel2Id(UUID geoLevel2Id) {
		this.geoLevel2Id = geoLevel2Id;
	}

	public String getGeoLevel2Code() {
		return geoLevel2Code;
	}

	public void setGeoLevel2Code(String geoLevel2Code) {
		this.geoLevel2Code = geoLevel2Code;
	}

	public String getGeoLevel2Name() {
		return geoLevel2Name;
	}

	public void setGeoLevel2Name(String geoLevel2Name) {
		this.geoLevel2Name = geoLevel2Name;
	}

	public UUID getGeoLevel3Id() {
		return geoLevel3Id;
	}

	public void setGeoLevel3Id(UUID geoLevel3Id) {
		this.geoLevel3Id = geoLevel3Id;
	}

	public String getGeoLevel3Code() {
		return geoLevel3Code;
	}

	public void setGeoLevel3Code(String geoLevel3Code) {
		this.geoLevel3Code = geoLevel3Code;
	}

	public String getGeoLevel3Name() {
		return geoLevel3Name;
	}

	public void setGeoLevel3Name(String geoLevel3Name) {
		this.geoLevel3Name = geoLevel3Name;
	}

	public UUID getGeoLevel4Id() {
		return geoLevel4Id;
	}

	public void setGeoLevel4Id(UUID geoLevel4Id) {
		this.geoLevel4Id = geoLevel4Id;
	}

	public String getGeoLevel4Code() {
		return geoLevel4Code;
	}

	public void setGeoLevel4Code(String geoLevel4Code) {
		this.geoLevel4Code = geoLevel4Code;
	}

	public String getGeoLevel4Name() {
		return geoLevel4Name;
	}

	public void setGeoLevel4Name(String geoLevel4Name) {
		this.geoLevel4Name = geoLevel4Name;
	}

	public boolean isUseGoogleMaps() {
		return useGoogleMaps;
	}

	public void setUseGoogleMaps(boolean useGoogleMaps) {
		this.useGoogleMaps = useGoogleMaps;
	}

	public String getGoogleMapsApiKey() {
		return googleMapsApiKey;
	}

	public void setGoogleMapsApiKey(String googleMapsApiKey) {
		this.googleMapsApiKey = googleMapsApiKey;
	}

	public boolean isUseOsmMaps() {
		return useOsmMaps;
	}

	public void setUseOsmMaps(boolean useOsmMaps) {
		this.useOsmMaps = useOsmMaps;
	}

	public String getOsmMapsApiKey() {
		return osmMapsApiKey;
	}

	public void setOsmMapsApiKey(String osmMapsApiKey) {
		this.osmMapsApiKey = osmMapsApiKey;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLinkedinPage() {
		return linkedinPage;
	}

	public void setLinkedinPage(String linkedinPage) {
		this.linkedinPage = linkedinPage;
	}

	public String getFacebookPage() {
		return facebookPage;
	}

	public void setFacebookPage(String facebookPage) {
		this.facebookPage = facebookPage;
	}

	public String getTwitterPage() {
		return twitterPage;
	}

	public void setTwitterPage(String twitterPage) {
		this.twitterPage = twitterPage;
	}

	public String getAdminUsername() {
		return adminUsername;
	}

	public void setAdminUsername(String adminUsername) {
		this.adminUsername = adminUsername;
	}

	public String getAdminFullname() {
		return adminFullname;
	}

	public void setAdminFullname(String adminFullname) {
		this.adminFullname = adminFullname;
	}

	public String getAdminMobile() {
		return adminMobile;
	}

	public void setAdminMobile(String adminMobile) {
		this.adminMobile = adminMobile;
	}

	public String getAdminEmail() {
		return adminEmail;
	}

	public void setAdminEmail(String adminEmail) {
		this.adminEmail = adminEmail;
	}

	public String getCreatedByUsername() {
		return createdByUsername;
	}

	public void setCreatedByUsername(String createdByUsername) {
		this.createdByUsername = createdByUsername;
	}

	public String getCreatedByFullname() {
		return createdByFullname;
	}

	public void setCreatedByFullname(String createdByFullname) {
		this.createdByFullname = createdByFullname;
	}

	public String getCreatedByEmail() {
		return createdByEmail;
	}

	public void setCreatedByEmail(String createdByEmail) {
		this.createdByEmail = createdByEmail;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public Timestamp getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	public String getLicenseAuthority() {
		return licenseAuthority;
	}

	public void setLicenseAuthority(String licenseAuthority) {
		this.licenseAuthority = licenseAuthority;
	}

	public String getLicenseNo() {
		return licenseNo;
	}

	public void setLicenseNo(String licenseNo) {
		this.licenseNo = licenseNo;
	}

	public Date getLicenseIssueDate() {
		return licenseIssueDate;
	}

	public void setLicenseIssueDate(Date licenseIssueDate) {
		this.licenseIssueDate = licenseIssueDate;
	}

	public Date getLicenseExpiredDate() {
		return licenseExpiredDate;
	}

	public void setLicenseExpiredDate(Date licenseExpiredDate) {
		this.licenseExpiredDate = licenseExpiredDate;
	}

	public String getLicenseType() {
		return licenseType;
	}

	public void setLicenseType(String licenseType) {
		this.licenseType = licenseType;
	}

	public boolean isLicenseDocUploaded() {
		return isLicenseDocUploaded;
	}

	public void setLicenseDocUploaded(boolean isLicenseDocUploaded) {
		this.isLicenseDocUploaded = isLicenseDocUploaded;
	}

	public boolean isLicenseNoVerified() {
		return isLicenseNoVerified;
	}

	public void setLicenseNoVerified(boolean isLicenseNoVerified) {
		this.isLicenseNoVerified = isLicenseNoVerified;
	}

	public Date getLicenseDocVerifiedDate() {
		return licenseDocVerifiedDate;
	}

	public void setLicenseDocVerifiedDate(Date licenseDocVerifiedDate) {
		this.licenseDocVerifiedDate = licenseDocVerifiedDate;
	}

	public String getLicenseDocVerificationResponse() {
		return licenseDocVerificationResponse;
	}

	public void setLicenseDocVerificationResponse(String licenseDocVerificationResponse) {
		this.licenseDocVerificationResponse = licenseDocVerificationResponse;
	}

	public String getTaxAuthority() {
		return taxAuthority;
	}

	public void setTaxAuthority(String taxAuthority) {
		this.taxAuthority = taxAuthority;
	}

	public String getTaxNo() {
		return taxNo;
	}

	public void setTaxNo(String taxNo) {
		this.taxNo = taxNo;
	}

	public Date getTaxRegDate() {
		return taxRegDate;
	}

	public void setTaxRegDate(Date taxRegDate) {
		this.taxRegDate = taxRegDate;
	}

	public String getTaxZone() {
		return taxZone;
	}

	public void setTaxZone(String taxZone) {
		this.taxZone = taxZone;
	}

	public String getTaxCircle() {
		return taxCircle;
	}

	public void setTaxCircle(String taxCircle) {
		this.taxCircle = taxCircle;
	}

	public boolean isTaxDocUploaded() {
		return isTaxDocUploaded;
	}

	public void setTaxDocUploaded(boolean isTaxDocUploaded) {
		this.isTaxDocUploaded = isTaxDocUploaded;
	}

	public boolean isTaxNoVerified() {
		return isTaxNoVerified;
	}

	public void setTaxNoVerified(boolean isTaxNoVerified) {
		this.isTaxNoVerified = isTaxNoVerified;
	}

	public Date getTaxDocVerifiedDate() {
		return taxDocVerifiedDate;
	}

	public void setTaxDocVerifiedDate(Date taxDocVerifiedDate) {
		this.taxDocVerifiedDate = taxDocVerifiedDate;
	}

	public String getTaxDocVerificationResponse() {
		return taxDocVerificationResponse;
	}

	public void setTaxDocVerificationResponse(String taxDocVerificationResponse) {
		this.taxDocVerificationResponse = taxDocVerificationResponse;
	}

	public String getVatAuthority() {
		return vatAuthority;
	}

	public void setVatAuthority(String vatAuthority) {
		this.vatAuthority = vatAuthority;
	}

	public String getVatNo() {
		return vatNo;
	}

	public void setVatNo(String vatNo) {
		this.vatNo = vatNo;
	}

	public Date getVatRegDate() {
		return vatRegDate;
	}

	public void setVatRegDate(Date vatRegDate) {
		this.vatRegDate = vatRegDate;
	}

	public String getVatZone() {
		return vatZone;
	}

	public void setVatZone(String vatZone) {
		this.vatZone = vatZone;
	}

	public String getVatCircle() {
		return vatCircle;
	}

	public void setVatCircle(String vatCircle) {
		this.vatCircle = vatCircle;
	}

	public boolean isVatDocUploaded() {
		return isVatDocUploaded;
	}

	public void setVatDocUploaded(boolean isVatDocUploaded) {
		this.isVatDocUploaded = isVatDocUploaded;
	}

	public boolean isVatNoVerified() {
		return isVatNoVerified;
	}

	public void setVatNoVerified(boolean isVatNoVerified) {
		this.isVatNoVerified = isVatNoVerified;
	}

	public Date getVatDocVerifiedDate() {
		return vatDocVerifiedDate;
	}

	public void setVatDocVerifiedDate(Date vatDocVerifiedDate) {
		this.vatDocVerifiedDate = vatDocVerifiedDate;
	}

	public String getVatDocVerificationResponse() {
		return vatDocVerificationResponse;
	}

	public void setVatDocVerificationResponse(String vatDocVerificationResponse) {
		this.vatDocVerificationResponse = vatDocVerificationResponse;
	}

	public AgenciesModel() {}
	
	
	
}