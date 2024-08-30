package com.takeoff.domain;

import java.io.Serializable;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class VendorCoupons implements Serializable {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 341650654510540114L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String header;
	String   body;
	String   footer;

	String   header_color;
	String   body_color;
	String   footer_color;

	String   header_align;
	String   body_align;
	String   footer_align;

	Long   header_size;
	Long   body_size;
	Long   footer_size;

	String   footer_font;
	String   header_font;
	String   body_font;

	String   footer_bold;
	String   header_bold;
	String   body_bold;

	String   footer_style;
	String   header_style;
	String   body_style;

	String   image_align;

	String   footer_decoration;
	String   header_decoration;
	String   body_decoration;

	String   profession;
	String   gender;

	
	
	@Column(columnDefinition="datetime")
	 Timestamp  fromDate;
	
	@Column(columnDefinition="datetime")
	Timestamp   toDate;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "imageId")
	ImageDetails   image;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "couponTypeId")
	CouponType  couponType;

	String   keywords;

	Integer rank1=0;
	Integer rating=0;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "vendorId")

	VendorDetails vendor;
	
	String description;
	
	String exclusiveFor;
	

	public String getExclusiveFor() {
		return exclusiveFor;
	}

	public void setExclusiveFor(String exclusiveFor) {
		this.exclusiveFor = exclusiveFor;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getHeader() {
		return header;
	}

	public void setHeader(String header) {
		this.header = header;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getFooter() {
		return footer;
	}

	public void setFooter(String footer) {
		this.footer = footer;
	}

	public String getHeader_color() {
		return header_color;
	}

	public void setHeader_color(String header_color) {
		this.header_color = header_color;
	}

	public String getBody_color() {
		return body_color;
	}

	public void setBody_color(String body_color) {
		this.body_color = body_color;
	}

	public String getFooter_color() {
		return footer_color;
	}

	public void setFooter_color(String footer_color) {
		this.footer_color = footer_color;
	}

	public String getHeader_align() {
		return header_align;
	}

	public void setHeader_align(String header_align) {
		this.header_align = header_align;
	}

	public String getBody_align() {
		return body_align;
	}

	public void setBody_align(String body_align) {
		this.body_align = body_align;
	}

	public String getFooter_align() {
		return footer_align;
	}

	public void setFooter_align(String footer_align) {
		this.footer_align = footer_align;
	}

	public Long getHeader_size() {
		return header_size;
	}

	public void setHeader_size(Long header_size) {
		this.header_size = header_size;
	}

	public Long getBody_size() {
		return body_size;
	}

	public void setBody_size(Long body_size) {
		this.body_size = body_size;
	}

	public Long getFooter_size() {
		return footer_size;
	}

	public void setFooter_size(Long footer_size) {
		this.footer_size = footer_size;
	}

	public String getFooter_font() {
		return footer_font;
	}

	public void setFooter_font(String footer_font) {
		this.footer_font = footer_font;
	}

	public String getHeader_font() {
		return header_font;
	}

	public void setHeader_font(String header_font) {
		this.header_font = header_font;
	}

	public String getBody_font() {
		return body_font;
	}

	public void setBody_font(String body_font) {
		this.body_font = body_font;
	}

	public String getFooter_bold() {
		return footer_bold;
	}

	public void setFooter_bold(String footer_bold) {
		this.footer_bold = footer_bold;
	}

	public String getHeader_bold() {
		return header_bold;
	}

	public void setHeader_bold(String header_bold) {
		this.header_bold = header_bold;
	}

	public String getBody_bold() {
		return body_bold;
	}

	public void setBody_bold(String body_bold) {
		this.body_bold = body_bold;
	}

	public String getFooter_style() {
		return footer_style;
	}

	public void setFooter_style(String footer_style) {
		this.footer_style = footer_style;
	}

	public String getHeader_style() {
		return header_style;
	}

	public void setHeader_style(String header_style) {
		this.header_style = header_style;
	}

	public String getBody_style() {
		return body_style;
	}

	public void setBody_style(String body_style) {
		this.body_style = body_style;
	}

	public String getImage_align() {
		return image_align;
	}

	public void setImage_align(String image_align) {
		this.image_align = image_align;
	}

	public String getFooter_decoration() {
		return footer_decoration;
	}

	public void setFooter_decoration(String footer_decoration) {
		this.footer_decoration = footer_decoration;
	}

	public String getHeader_decoration() {
		return header_decoration;
	}

	public void setHeader_decoration(String header_decoration) {
		this.header_decoration = header_decoration;
	}

	public String getBody_decoration() {
		return body_decoration;
	}

	public void setBody_decoration(String body_decoration) {
		this.body_decoration = body_decoration;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Timestamp getFromDate() {
		return fromDate;
	}

	public void setFromDate(Timestamp fromDate) {
		this.fromDate = fromDate;
	}

	public void setFromDate(String fromDate) {
		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		this.fromDate = Timestamp.valueOf(LocalDateTime.parse(fromDate,dateFormatter));
		//System.out.println(this.fromDate+" "+fromDate);
	}
	
	public void setToDate(String toDate) {
		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		this.toDate = Timestamp.valueOf(LocalDateTime.parse(toDate,dateFormatter));
		//System.out.println(this.toDate+" "+toDate);
	}

	
	public Timestamp getToDate() {
		return toDate;
	}

	public void setToDate(Timestamp toDate) {
		this.toDate = toDate;
	}

	public ImageDetails getImage() {
		return image;
	}

	public void setImage(ImageDetails image) {
		this.image = image;
	}
	



	public CouponType getCouponType() {
		return couponType;
	}

	public void setCouponType(CouponType couponType) {
		this.couponType = couponType;
	}
	

	public String getKeywords() {
		return keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public Integer getRank() {
		return rank1;
	}

	public void setRank(Integer rank) {
		this.rank1 = rank;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	public VendorDetails getVendor() {
		return vendor;
	}

	public void setVendor(VendorDetails vendor) {
		this.vendor = vendor;
	}

	

}
