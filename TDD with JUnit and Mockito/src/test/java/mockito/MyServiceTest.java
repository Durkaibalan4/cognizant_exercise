package mockito;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MyServiceTest {
    @Test
    public void testExternalAPI() {

        ExternalAPI mockAPI = mock(ExternalAPI.class);
        when(mockAPI.getData()).thenReturn("Mock Data");
        MyService service = new MyService(mockAPI);
        String result = service.fetchData();
        assertEquals("Mock Data", result);
    }
}