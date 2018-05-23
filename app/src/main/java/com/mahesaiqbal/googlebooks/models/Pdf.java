package com.mahesaiqbal.googlebooks.models;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class Pdf{

	@SerializedName("isAvailable")
	private boolean isAvailable;

	@SerializedName("acsTokenLink")
	private String acsTokenLink;

	public void setIsAvailable(boolean isAvailable){
		this.isAvailable = isAvailable;
	}

	public boolean isIsAvailable(){
		return isAvailable;
	}

	public void setAcsTokenLink(String acsTokenLink){
		this.acsTokenLink = acsTokenLink;
	}

	public String getAcsTokenLink(){
		return acsTokenLink;
	}

	@Override
 	public String toString(){
		return 
			"Pdf{" + 
			"isAvailable = '" + isAvailable + '\'' + 
			",acsTokenLink = '" + acsTokenLink + '\'' + 
			"}";
		}
}