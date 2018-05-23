package com.mahesaiqbal.googlebooks.models;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class VolumeInfo{

	@SerializedName("industryIdentifiers")
	private List<IndustryIdentifiersItem> industryIdentifiers;

	@SerializedName("pageCount")
	private int pageCount;

	@SerializedName("printType")
	private String printType;

	@SerializedName("readingModes")
	private ReadingModes readingModes;

	@SerializedName("previewLink")
	private String previewLink;

	@SerializedName("canonicalVolumeLink")
	private String canonicalVolumeLink;

	@SerializedName("description")
	private String description;

	@SerializedName("language")
	private String language;

	@SerializedName("title")
	private String title;

	@SerializedName("imageLinks")
	private ImageLinks imageLinks;

	@SerializedName("subtitle")
	private String subtitle;

	@SerializedName("averageRating")
	private Double averageRating;

	@SerializedName("panelizationSummary")
	private PanelizationSummary panelizationSummary;

	@SerializedName("publisher")
	private String publisher;

	@SerializedName("ratingsCount")
	private int ratingsCount;

	@SerializedName("publishedDate")
	private String publishedDate;

	@SerializedName("categories")
	private List<String> categories;

	@SerializedName("maturityRating")
	private String maturityRating;

	@SerializedName("allowAnonLogging")
	private boolean allowAnonLogging;

	@SerializedName("contentVersion")
	private String contentVersion;

	@SerializedName("authors")
	private List<String> authors;

	@SerializedName("infoLink")
	private String infoLink;

	public void setIndustryIdentifiers(List<IndustryIdentifiersItem> industryIdentifiers){
		this.industryIdentifiers = industryIdentifiers;
	}

	public List<IndustryIdentifiersItem> getIndustryIdentifiers(){
		return industryIdentifiers;
	}

	public void setPageCount(int pageCount){
		this.pageCount = pageCount;
	}

	public int getPageCount(){
		return pageCount;
	}

	public void setPrintType(String printType){
		this.printType = printType;
	}

	public String getPrintType(){
		return printType;
	}

	public void setReadingModes(ReadingModes readingModes){
		this.readingModes = readingModes;
	}

	public ReadingModes getReadingModes(){
		return readingModes;
	}

	public void setPreviewLink(String previewLink){
		this.previewLink = previewLink;
	}

	public String getPreviewLink(){
		return previewLink;
	}

	public void setCanonicalVolumeLink(String canonicalVolumeLink){
		this.canonicalVolumeLink = canonicalVolumeLink;
	}

	public String getCanonicalVolumeLink(){
		return canonicalVolumeLink;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setLanguage(String language){
		this.language = language;
	}

	public String getLanguage(){
		return language;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setImageLinks(ImageLinks imageLinks){
		this.imageLinks = imageLinks;
	}

	public ImageLinks getImageLinks(){
		return imageLinks;
	}

	public void setSubtitle(String subtitle){
		this.subtitle = subtitle;
	}

	public String getSubtitle(){
		return subtitle;
	}

	public Double getAverageRating() {
		return averageRating;
	}

	public void setAverageRating(Double averageRating) {
		this.averageRating = averageRating;
	}

	public void setPanelizationSummary(PanelizationSummary panelizationSummary){
		this.panelizationSummary = panelizationSummary;
	}

	public PanelizationSummary getPanelizationSummary(){
		return panelizationSummary;
	}

	public void setPublisher(String publisher){
		this.publisher = publisher;
	}

	public String getPublisher(){
		return publisher;
	}

	public void setRatingsCount(int ratingsCount){
		this.ratingsCount = ratingsCount;
	}

	public int getRatingsCount(){
		return ratingsCount;
	}

	public void setPublishedDate(String publishedDate){
		this.publishedDate = publishedDate;
	}

	public String getPublishedDate(){
		return publishedDate;
	}

	public void setCategories(List<String> categories){
		this.categories = categories;
	}

	public List<String> getCategories(){
		return categories;
	}

	public void setMaturityRating(String maturityRating){
		this.maturityRating = maturityRating;
	}

	public String getMaturityRating(){
		return maturityRating;
	}

	public void setAllowAnonLogging(boolean allowAnonLogging){
		this.allowAnonLogging = allowAnonLogging;
	}

	public boolean isAllowAnonLogging(){
		return allowAnonLogging;
	}

	public void setContentVersion(String contentVersion){
		this.contentVersion = contentVersion;
	}

	public String getContentVersion(){
		return contentVersion;
	}

	public void setAuthors(List<String> authors){
		this.authors = authors;
	}

	public List<String> getAuthors(){
		return authors;
	}

	public void setInfoLink(String infoLink){
		this.infoLink = infoLink;
	}

	public String getInfoLink(){
		return infoLink;
	}

	@Override
 	public String toString(){
		return 
			"VolumeInfo{" + 
			"industryIdentifiers = '" + industryIdentifiers + '\'' + 
			",pageCount = '" + pageCount + '\'' + 
			",printType = '" + printType + '\'' + 
			",readingModes = '" + readingModes + '\'' + 
			",previewLink = '" + previewLink + '\'' + 
			",canonicalVolumeLink = '" + canonicalVolumeLink + '\'' + 
			",description = '" + description + '\'' + 
			",language = '" + language + '\'' + 
			",title = '" + title + '\'' + 
			",imageLinks = '" + imageLinks + '\'' + 
			",subtitle = '" + subtitle + '\'' + 
			",averageRating = '" + averageRating + '\'' + 
			",panelizationSummary = '" + panelizationSummary + '\'' + 
			",publisher = '" + publisher + '\'' + 
			",ratingsCount = '" + ratingsCount + '\'' + 
			",publishedDate = '" + publishedDate + '\'' + 
			",categories = '" + categories + '\'' + 
			",maturityRating = '" + maturityRating + '\'' + 
			",allowAnonLogging = '" + allowAnonLogging + '\'' + 
			",contentVersion = '" + contentVersion + '\'' + 
			",authors = '" + authors + '\'' + 
			",infoLink = '" + infoLink + '\'' + 
			"}";
		}
}