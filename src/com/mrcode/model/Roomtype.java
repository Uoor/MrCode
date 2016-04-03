package com.mrcode.model;

import java.util.HashSet;
import java.util.Set;


/**
 * Roomtype entity. @author MyEclipse Persistence Tools
 */

public class Roomtype  implements java.io.Serializable {


    // Fields    

     /**
	 * 
	 */
	private static final long serialVersionUID = 5526584811202240227L;
	private Integer id;
     private String typeName;
     private Float price;
     private String remark;
     private Hotel hotel;
     private String typeId;
     private String column1;
     private String column2;
     private Integer column4;
     private Float discount;
     private Set grouppurchasevouchers = new HashSet();
     private Set rooms = new HashSet();
     private Set pictures = new HashSet();


    // Constructors

    /** default constructor */
    public Roomtype() {
    }

	/** minimal constructor */
    public Roomtype(Integer id, String typeName) {
        this.id = id;
        this.typeName = typeName;
    }
    
    /** full constructor */
    public Roomtype(Integer id, String typeName, Float price, Float discount, String remark, Hotel hotel, String typeId, String column2, String column1, Integer column4, Set grouppurchasevouchers, Set rooms, Set pictures) {
        this.id = id;
        this.typeName = typeName;
        this.price = price;
        this.discount = discount;
        this.remark = remark;
        this.hotel = hotel;
        this.typeId = typeId;
        this.column1 = column1;
        this.column2 = column2;
        this.column4 = column4;
        this.grouppurchasevouchers = grouppurchasevouchers;
        this.rooms = rooms;
        this.pictures = pictures;
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public String getTypeName() {
        return this.typeName;
    }
    
    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public Float getPrice() {
        return this.price;
    }
    
    public void setPrice(Float price) {
        this.price = price;
    }

    public Float getDiscount() {
		return discount;
	}

	public void setDiscount(Float discount) {
		this.discount = discount;
	}

	public String getRemark() {
        return this.remark;
    }
    
    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Hotel getHotel() {
        return this.hotel;
    }
    
    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public String getTypeId() {
        return this.typeId;
    }
    
    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    public String getColumn1() {
		return column1;
	}

	public void setColumn1(String column1) {
		this.column1 = column1;
	}

	public String getColumn2() {
        return this.column2;
    }
    
    public void setColumn2(String column2) {
        this.column2 = column2;
    }

    public Integer getColumn4() {
        return this.column4;
    }
    
    public void setColumn4(Integer column4) {
        this.column4 = column4;
    }

    public Set getGrouppurchasevouchers() {
        return this.grouppurchasevouchers;
    }
    
    public void setGrouppurchasevouchers(Set grouppurchasevouchers) {
        this.grouppurchasevouchers = grouppurchasevouchers;
    }

    public Set getRooms() {
        return this.rooms;
    }
    
    public void setRooms(Set rooms) {
        this.rooms = rooms;
    }

    public Set getPictures() {
        return this.pictures;
    }
    
    public void setPictures(Set pictures) {
        this.pictures = pictures;
    }
   








}