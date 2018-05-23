package com.mahesaiqbal.googlebooks.models;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class OffersItem{

	@SerializedName("finskyOfferType")
	private int finskyOfferType;

	@SerializedName("retailPrice")
	private RetailPrice retailPrice;

	@SerializedName("listPrice")
	private ListPrice listPrice;

	public void setFinskyOfferType(int finskyOfferType){
		this.finskyOfferType = finskyOfferType;
	}

	public int getFinskyOfferType(){
		return finskyOfferType;
	}

	public void setRetailPrice(RetailPrice retailPrice){
		this.retailPrice = retailPrice;
	}

	public RetailPrice getRetailPrice(){
		return retailPrice;
	}

	public void setListPrice(ListPrice listPrice){
		this.listPrice = listPrice;
	}

	public ListPrice getListPrice(){
		return listPrice;
	}

	@Override
 	public String toString(){
		return 
			"OffersItem{" + 
			"finskyOfferType = '" + finskyOfferType + '\'' + 
			",retailPrice = '" + retailPrice + '\'' + 
			",listPrice = '" + listPrice + '\'' + 
			"}";
		}
}