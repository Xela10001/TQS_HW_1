package alexandregazur.tqs_hw_1.model;


public class AirQuality {

	private final float co;
	private final float no2;
	private final float o3;
	private final float so2;
	private final float pm2_5;
	private final float pm10;
	private final int us_epa_index;
	private final int gb_defra_index;
	
	public AirQuality(float co, float no2, float o3, float so2, float pm2_5, float pm10, int us_epa_index, int gb_defra_index) {
		this.co = co;
		this.no2 = no2;
		this.o3 = o3;
		this.so2 = so2;
		this.pm2_5 = pm2_5;
		this.pm10 = pm10;
		this.us_epa_index = us_epa_index;
		this.gb_defra_index = gb_defra_index;
	}
	
	public float getCo() {
		return co;
	}
	
	public float getNo2() {
		return no2;
	}
	
	public float getO3() {
		return o3;
	}
	
	public float getSo2() {
		return so2;
	}
	
	public float getPm2_5() {
		return pm2_5;
	}
	
	public float getPm10() {
		return pm10;
	}
	
	public int getUs_epa_index() {
		return us_epa_index;
	}
	
	public int getGb_defra_index() {
		return gb_defra_index;
	}
}

