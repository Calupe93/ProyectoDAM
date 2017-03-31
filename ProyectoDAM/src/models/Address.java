package models;
/**
 *@author Camila
 *@since 1.0 
 * */
public class Address {
	private String road_type;
	private String road_name;
	private int road_num;
	private String stair;
	private String floor;
	private String door;
	private String postal_code;
	private String city;
	private String province;
	private String country;
	Address() {
		super();
	}
	public String getRoad_type() {
		return road_type;
	}
	public void setRoad_type(String road_type) {
		this.road_type = road_type;
	}
	public String getRoad_name() {
		return road_name;
	}
	public void setRoad_name(String road_name) {
		this.road_name = road_name;
	}
	public int getRoad_num() {
		return road_num;
	}
	public void setRoad_num(int road_num) {
		this.road_num = road_num;
	}
	public String getStair() {
		return stair;
	}
	public void setStair(String stair) {
		this.stair = stair;
	}
	public String getFloor() {
		return floor;
	}
	public void setFloor(String floor) {
		this.floor = floor;
	}
	public String getDoor() {
		return door;
	}
	public void setDoor(String door) {
		this.door = door;
	}
	public String getPostal_code() {
		return postal_code;
	}
	public void setPostal_code(String postal_code) {
		this.postal_code = postal_code;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
}	

