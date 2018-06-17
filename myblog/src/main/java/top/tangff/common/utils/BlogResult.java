package top.tangff.common.utils;

public class BlogResult {
    // 响应业务状态
    private Integer status;

    // 响应消息
    private String msg;

    // 响应中的数据
    private Object data;

    
	public BlogResult() {
	}

	public BlogResult(Integer status, String msg, Object data) {
		super();
		this.status = status;
		this.msg = msg;
		this.data = data;
	}
	
	public BlogResult(Object data) {
		this.data = data;
	}
	
	//自定义的一些静态快速获得想要的BlogResult对象
	public static BlogResult ok(Object o) {
		return new BlogResult(200,"SUCCESS",o);
	}
	
	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
}
