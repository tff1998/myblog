package top.tangff.pojo;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class ArticleCat implements Serializable,Cloneable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	@JsonIgnore
	private Long parent_id;
	private String code;
	private String url;
	private String name;
	@JsonIgnore
	private Boolean is_parent;//0不是，1是
	
	public Object clone() throws CloneNotSupportedException {
		ArticleCat articleCat = new ArticleCat(); 
		articleCat.setId(this.getId());
		articleCat.setCode(this.getCode());
		articleCat.setIs_parent(this.getIs_parent());
		articleCat.setName(this.getName());
		articleCat.setParent_id(this.getParent_id());
		articleCat.setUrl(this.getUrl());
		return articleCat;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getParent_id() {
		return parent_id;
	}
	public void setParent_id(Long parent_id) {
		this.parent_id = parent_id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Boolean getIs_parent() {
		return is_parent;
	}
	public void setIs_parent(Boolean is_parent) {
		this.is_parent = is_parent;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
