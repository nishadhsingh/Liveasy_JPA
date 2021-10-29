package com.liveasy.entites;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Random;
@Entity
public class load {
	
	/**
	 * 
	 */
	public load() {
	}


	Random randy = new Random(1111111111);
	
	/**
	 * @param loadingPoint
	 * @param unloadingPoint
	 * @param productType
	 * @param truckType
	 * @param noOfTrucks
	 * @param weight
	 * @param optional
	 * @param shipperId
	 * @param date
	 */
	public load(String loadingPoint, String unloadingPoint, String productType, String truckType, int noOfTrucks,
			double weight, String optional, long shipperId, String date) {
		this.Loadid = randy.nextLong();
		this.loadingPoint = loadingPoint;
		this.unloadingPoint = unloadingPoint;
		this.productType = productType;
		this.truckType = truckType;
		this.noOfTrucks = noOfTrucks;
		this.weight = weight;
		this.optional = optional;
		this.shipperId = shipperId;
		Date = date;
	}
	/**
	 * @param loadid
	 * @param loadingPoint
	 * @param unloadingPoint
	 * @param productType
	 * @param truckType
	 * @param noOfTrucks
	 * @param weight
	 * @param optional
	 * @param shipperId
	 * @param date
	 */
	public load(long loadid, String loadingPoint, String unloadingPoint, String productType, String truckType,
			int noOfTrucks, double weight, String optional, long shipperId, String date) {
		Loadid = loadid;
		this.loadingPoint = loadingPoint;
		this.unloadingPoint = unloadingPoint;
		this.productType = productType;
		this.truckType = truckType;
		this.noOfTrucks = noOfTrucks;
		this.weight = weight;
		this.optional = optional;
		this.shipperId = shipperId;
		Date = date;
	}
	
	
	@Id
	private long Loadid;
	private String loadingPoint;
	private String unloadingPoint;
	private String productType;
	private String truckType;
	private int noOfTrucks;
	private double weight;
	private String optional;
	private long shipperId;
	private String Date;
	public long getLoadid() {
		return Loadid;
	}
	public void setLoadid(long loadid) {
		Loadid = loadid;
	}
	public String getLoadingPoint() {
		return loadingPoint;
	}
	public void setLoadingPoint(String loadingPoint) {
		this.loadingPoint = loadingPoint;
	}
	public String getUnloadingPoint() {
		return unloadingPoint;
	}
	public void setUnloadingPoint(String unloadingPoint) {
		this.unloadingPoint = unloadingPoint;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public String getTruckType() {
		return truckType;
	}
	public void setTruckType(String truckType) {
		this.truckType = truckType;
	}
	public int getNoOfTrucks() {
		return noOfTrucks;
	}
	public void setNoOfTrucks(int noOfTrucks) {
		this.noOfTrucks = noOfTrucks;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getOptional() {
		return optional;
	}
	public void setOptional(String optional) {
		this.optional = optional;
	}
	public long getShipperId() {
		return shipperId;
	}
	public void setShipperId(long shipperId) {
		this.shipperId = shipperId;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	@Override
	public String toString() {
		return String.format(
				"load [Loadid=%s, loadingPoint=%s, unloadingPoint=%s, productType=%s, truckType=%s, noOfTrucks=%s, weight=%s, optional=%s, shipperId=%s, Date=%s]",
				Loadid, loadingPoint, unloadingPoint, productType, truckType, noOfTrucks, weight, optional, shipperId,
				Date);
	}

}
