package com.mahesaiqbal.googlebooks.models;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class RetailPrice{

	@SerializedName("amount")
	private int amount;

	@SerializedName("currencyCode")
	private String currencyCode;

	public void setAmount(int amount){
		this.amount = amount;
	}

	public int getAmount(){
		return amount;
	}

	public void setCurrencyCode(String currencyCode){
		this.currencyCode = currencyCode;
	}

	public String getCurrencyCode(){
		return currencyCode;
	}

	@Override
 	public String toString(){
		return 
			"RetailPrice{" + 
			"amount = '" + amount + '\'' + 
			",currencyCode = '" + currencyCode + '\'' + 
			"}";
		}
}