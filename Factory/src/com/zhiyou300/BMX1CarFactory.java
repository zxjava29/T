package com.zhiyou300;

public class BMX1CarFactory implements BMCarFactory{

	@Override
	public BMCar getBMCar() {
		BMCar bm = new BMCar();
		bm.setEngine(getEngine());
		bm.setVrv(getVRV());
		bm.setName("X1�ͱ���");
		return bm;
	}

	public Engine getEngine() {		
		return new Engine();
	}
	public VRV getVRV() {		
		return new VRV();
	}

}
