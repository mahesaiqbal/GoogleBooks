package com.mahesaiqbal.googlebooks.models;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class SearchInfo{

	@SerializedName("textSnippet")
	private String textSnippet;

	public void setTextSnippet(String textSnippet){
		this.textSnippet = textSnippet;
	}

	public String getTextSnippet(){
		return textSnippet;
	}

	@Override
 	public String toString(){
		return 
			"SearchInfo{" + 
			"textSnippet = '" + textSnippet + '\'' + 
			"}";
		}
}