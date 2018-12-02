package edu.srh.bikehire.dto.impl;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Bike")
public class BikeDTOImpl implements edu.srh.bikehire.dto.BikeDTO{
	
	@Id
	@Column(name="BikeId")
	private String bikeId;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "BikeTypeId")
	private BikeTypeDTOImpl bikeType;
	
	@Column(name = "Manufacturer")
	private String manufacturer;
	
	@Column(name = "YearOfManufacture")
	private int yearOfManufacture;
	
	@Column(name = "BikeTitle")
	private String bikeTitle;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "WareHouseId")
	private WareHouseDTOImpl warehouse;
	
	@Column(name = "DepositAmount")
	private int depositAmount;
	
	@Column(name = "CreationTimeStamp")
	private Calendar creationTimeStamp;

	public String getBikeId() {
		return bikeId;
	}

	public void setBikeId(String bikeId) {
		this.bikeId = bikeId;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public int getYearOfManufacture() {
		return yearOfManufacture;
	}

	public void setYearOfManufacture(int yearOfManufacture) {
		this.yearOfManufacture = yearOfManufacture;
	}

	public String getBikeTitle() {
		return bikeTitle;
	}

	public void setBikeTitle(String bikeTitle) {
		this.bikeTitle = bikeTitle;
	}

	public int getDepositAmount() {
		return depositAmount;
	}

	public void setDepositAmount(int depositAmount) {
		this.depositAmount = depositAmount;
	}

	public Calendar getCreationTimeStamp() {
		return creationTimeStamp;
	}

	public void setCreationTimeStamp(Calendar creationTimeStamp) {
		this.creationTimeStamp = creationTimeStamp;
	}

	public BikeTypeDTOImpl getBikeType() {
		return bikeType;
	}

	public void setBikeType(BikeTypeDTOImpl bikeType) {
		this.bikeType = bikeType;
	}

	public WareHouseDTOImpl getWarehouse() {
		return warehouse;
	}

	public void setWarehouse(WareHouseDTOImpl warehousr) {
		this.warehouse = warehousr;
	}

	public String getBikeTypeId() {
		return getBikeType().getBikeTypeId();
	}

	public String getWareHouseID() {
		return getWarehouse().getWarehouseId();
	}

}