package br.com.liferay.frequencycontrol.vo;

public class MessageResponse {
	private String code;
	private String description;
	private Object objectResult;
	
	public MessageResponse() {
		this.code = "00";
		this.description = "Success";
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Object getObjectResult() {
		return objectResult;
	}

	public void setObjectResult(Object objectResult) {
		this.objectResult = objectResult;
	}

}
