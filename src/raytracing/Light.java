package raytracing;

import raytracing.util.Vector3;

public class Light {
	private Vector3 position;
	private Vector3 color;
	private double specularIntensity;
	private double shadowIntensity;
	private double lightRadius;

	public Light() {
	}
	
	public Light(Vector3 position, Vector3 color, double specularIntensity, double shadowIntensity,
			double lightRadius) {
		this.position = position;
		this.color = color;
		this.specularIntensity = specularIntensity;
		this.shadowIntensity = shadowIntensity;
		this.lightRadius = lightRadius;
	}

	public Vector3 getPosition() {
		return position;
	}

	public void setPosition(Vector3 position) {
		this.position = position;
	}

	public Vector3 getColor() {
		return color;
	}

	public void setColor(Vector3 color) {
		this.color = color;
	}

	public double getSpecularIntensity() {
		return specularIntensity;
	}

	public void setSpecularIntensity(double specularIntensity) {
		this.specularIntensity = specularIntensity;
	}

	public double getShadowIntensity() {
		return shadowIntensity;
	}

	public void setShadowIntensity(double shadowIntensity) {
		this.shadowIntensity = shadowIntensity;
	}

	public double getLightRadius() {
		return lightRadius;
	}

	public void setLightRadius(double lightRadius) {
		this.lightRadius = lightRadius;
	}

		
}