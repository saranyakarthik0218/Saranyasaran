package com.OPenmrs;

public interface OpenmrsElements {

	String username_id="username";
	String password_id="password";
	String location_xpath="//li[text()='Inpatient Ward']";
	String loginbutton_id="loginButton";
	String registerpatient_xpath="/html/body/div/div[3]/div[3]div/a[4]/i";
	String patientfirst_name="givenName";
	String patientfamily_name="familyname";
	
	String Nextbutton_id="next-button";
	String gender_="genderLabel";
	String confirmbutton_id="submit";
	String Birthdate_id="birthdateDay-field";
	String Birthmonth_id="birthdateMonth-field";
	String Birthyear_id="birthdateYear-field";
	
	String address1_name="address1";
	String address2_name_="address2";
	String cityvillage_id="cityVillage";
	String Stateprovince_id="stateProvince";
	String country_id="country";
	String postalcode_id="postalCode";
	String mobilenumber_name="phonenumber";
	
	String perviousbutton_id="prev-button";
	String patientrelative_id="relationship_type";
	String patientrelativename_xpath="(//input[@type='text')[15]";
	String confirmbutton_xpath_id="submit";
	
	
	
	
	
}
