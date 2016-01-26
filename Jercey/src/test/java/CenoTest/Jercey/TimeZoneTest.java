package CenoTest.Jercey;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TimeZoneTest {
	@Test
	public void London(){
		TimeZoneResponse entity = TimeZoneHelper.getTimeZoneEntity(51.528308,-0.3845231, 1453678358);
		Assert.assertEquals(entity.getTimeZoneName(), "Greenwich Mean Time");
	}
	
    @Test
    public void FaildLocation () {
    	TimeZoneResponse entity = TimeZoneHelper.getTimeZoneEntity(151.528308,-0.3845231, 1453678358);
    	Assert.assertEquals(entity.getErrorMessage(), "Invalid request. Invalid 'location' parameter.");
    }
    
}