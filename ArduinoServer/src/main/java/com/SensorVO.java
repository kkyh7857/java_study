package com;

public class SensorVO {
	private int mysensor;

	public SensorVO() {
	}

	public SensorVO(int mysensor) {
		this.mysensor = mysensor;
	}

	public int getMysensor() {
		return mysensor;
	}

	public void setMysensor(int mysensor) {
		this.mysensor = mysensor;
	}

	@Override
	public String toString() {
		return "SensorVO [mysensor=" + mysensor + "]";
	}
	
}
