package top.tangff.common.pojo;

import java.util.Date;

public class ArticleVo {
	private Long id;
	  
    private String useId;
    
    private String useName;
    
    private String articleCatName;
 
    private String title;
    
    private Date created;

    private Date updated;

    private String content;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUseId() {
		return useId;
	}

	public void setUseId(String useId) {
		this.useId = useId;
	}

	public String getUseName() {
		return useName;
	}

	public void setUseName(String useName) {
		this.useName = useName;
	}


	public String getArticleCatName() {
		return articleCatName;
	}

	public void setArticleCatName(String articleCatName) {
		this.articleCatName = articleCatName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getUpdated() {
		return updated;
	}

	public void setUpdated(Date updated) {
		this.updated = updated;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
    
}
