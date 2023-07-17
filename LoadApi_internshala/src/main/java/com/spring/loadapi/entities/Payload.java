package com.spring.loadapi.entities;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Payload {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int payloadId;
	public int getPayloadId() {
		return payloadId;
	}
	public void setPayloadId(int payloadId) {
		this.payloadId = payloadId;
	}
	int shipperId;
	String loadingPoint;
	String unloadingPoint;
	String productType;
	String truckType;
	int noOfTrucks;
	int weight;
	String comment;
	@JsonFormat(pattern="dd-MM-yyyy")
	String date;
	public int getShipperId() {
		return shipperId;
	}
	public void setShipperId(int shipperId) {
		this.shipperId = shipperId;
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
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public Payload(int payloadId, int shipperId, String loadingPoint, String unloadingPoint, String productType,
			String truckType, int noOfTrucks, int weight, String comment, String date) {
		super();
		this.payloadId = payloadId;
		this.shipperId = shipperId;
		this.loadingPoint = loadingPoint;
		this.unloadingPoint = unloadingPoint;
		this.productType = productType;
		this.truckType = truckType;
		this.noOfTrucks = noOfTrucks;
		this.weight = weight;
		this.comment = comment;
		this.date = date;
	}
	public Payload() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Payload [payloadId=" + payloadId + ", shipperId=" + shipperId + ", loadingPoint=" + loadingPoint
				+ ", unloadingPoint=" + unloadingPoint + ", productType=" + productType + ", truckType=" + truckType
				+ ", noOfTrucks=" + noOfTrucks + ", weight=" + weight + ", comment=" + comment + ", date=" + date + "]";
	}
	
	
}
