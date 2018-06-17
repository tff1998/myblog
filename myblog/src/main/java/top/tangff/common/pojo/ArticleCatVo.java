package top.tangff.common.pojo;

import java.io.Serializable;
import java.util.Set;

import top.tangff.pojo.ArticleCat;

public class ArticleCatVo implements Serializable{
	private Long id;
	//private Long parent_id;
	private String code;
	private String url;
	private String name;
	//private Boolean is_parent;//0不是，1是
	private Set<ArticleCat> chilren;//最多支持两级目录
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public Set<ArticleCat> getChilren() {
		return chilren;
	}
	public void setChilren(Set<ArticleCat> chilren) {
		this.chilren = chilren;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
}
