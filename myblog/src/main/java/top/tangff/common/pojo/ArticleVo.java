package top.tangff.common.pojo;

import java.util.Date;

public class ArticleVo {
	private Long id;
	  
    private String useId;
    
    private String useName;
    
    private String articleCatName;
 
    private String title;
    private String image;
    private String head;
    private Date created;

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

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getHead() {
		return head;
	}

	public void setHead(String head) {
		this.head = head;
	}
	
    
}
