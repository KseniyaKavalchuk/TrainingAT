package CenoTest.Jercey;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class TimeZoneResponse {
	private Integer dstOffset;
	private Integer rawOffset;
	private String status;
	private String timeZoneId;
	private String timeZoneName;
	private String errorMessage;
	
	
	public Integer getDstOffset() {
		
		return dstOffset;
	}
	public void setDstOffset(Integer dstOffset) {
		this.dstOffset = dstOffset;
	}
	public Integer getRawOffset() {
		return rawOffset;
	}
	public void setRawOffset(Integer rawOffset) {
		this.rawOffset = rawOffset;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getTimeZoneId() {
		return timeZoneId;
	}
	public void setTimeZoneId(String timeZoneId) {
		this.timeZoneId = timeZoneId;
	}
	public String getTimeZoneName() {
		return timeZoneName;
	}
	public void setTimeZoneName(String timeZoneName) {
		this.timeZoneName = timeZoneName;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
	
}
