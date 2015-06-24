package client.locationrequest.model;

import org.json.JSONObject;

import android.net.wifi.ScanResult;

public class WiFiInfo {
	
	public WiFiInfo(ScanResult mResult) throws NullPointerException{
		if (mResult == null) throw new NullPointerException("You sholdn't pass null ScanResult object");
		this.mac = mResult.BSSID;
		this.signalStrength = mResult.level;
	}
	
	/**
	 * MAC-����� � ���������� �������������. 
	 * ����� ����� ����������� �������, ������, ���������� ��� ����������� ������ ��� �����������, 
	 * ��������: �12-34-56-78-9A-BC�, �12:34:56:78:9A:BC�, �12.34.56.78.9A.BC�, �123456789ABC�.
	 */
	private String mac;
	/**
	 * ������� �������, ���������� � ����� ���������� ���������� ����������. 
	 * ������������� �����, ���������� � ���������� � ���������� � dBm.
	 */
	private int signalStrength;
	/**
	 * ����� � �������������, ��������� � ������� ��������� ������ ����� ����������� ��������� ���������� ����������.
	 */
	private long age;
	
	public JSONObject toJSONObject(){
		return new CustomJSONObject	.Bulider()
									.set("mac", mac)
									.set("signal_strength", signalStrength)
									.set("age", age)
									.get();
	}
}