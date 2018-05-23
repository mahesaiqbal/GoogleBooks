package com.mahesaiqbal.googlebooks.models;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class SaleInfo{

	@SerializedName("offers")
	private List<OffersItem> offers;

	@SerializedName("country")
	private String country;

	@SerializedName("isEbook")
	private boolean isEbook;

	@SerializedName("saleability")
	private String saleability;

	@SerializedName("buyLink")
	private String buyLink;

	@SerializedName("retailPrice")
	private RetailPrice retailPrice;

	@SerializedName("listPrice")
	private ListPrice listPrice;

	public void setOffers(List<OffersItem> offers){
		this.offers = offers;
	}

	public List<OffersItem> getOffers(){
		return offers;
	}

	public void setCountry(String country){
		this.country = country;
	}

	public String getCountry(){
		return country;
	}

	public void setIsEbook(boolean isEbook){
		this.isEbook = isEbook;
	}

	public boolean isIsEbook(){
		return isEbook;
	}

	public void setSaleability(String saleability){
		this.saleability = saleability;
	}

	public String getSaleability(){
		return saleability;
	}

	public void setBuyLink(String buyLink){
		this.buyLink = buyLink;
	}

	public String getBuyLink(){
		return buyLink;
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
			"SaleInfo{" + 
			"offers = '" + offers + '\'' + 
			",country = '" + country + '\'' + 
			",isEbook = '" + isEbook + '\'' + 
			",saleability = '" + saleability + '\'' + 
			",buyLink = '" + buyLink + '\'' + 
			",retailPrice = '" + retailPrice + '\'' + 
			",listPrice = '" + listPrice + '\'' + 
			"}";
		}
}