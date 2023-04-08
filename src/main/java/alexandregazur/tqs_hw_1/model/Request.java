package alexandregazur.tqs_hw_1.model;

public class Request {
	
	private String city;
	private String region;
	private String country;
	private String localTime;
	private AirQuality airQuality;
	
	public Request() {}
	
	public Request(String city, String region, String country, String localTime) {
		this.city = city;
		this.region = region;
		this.country = country;
		this.localTime = localTime;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getRegion() {
		return region;
	}
	
	public void setRegion(String region) {
		this.region = region;
	}
	
	public String getCountry() {
		return country;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getLocalTime() {
		return localTime;
	}
	
	public void setLocalTime(String localTime) {
		this.localTime = localTime;
	}
	
	public AirQuality getAirQuality() {
		return airQuality;
	}
	
	public void setAirQuality(AirQuality airQuality) {
		this.airQuality = airQuality;
	}
}

