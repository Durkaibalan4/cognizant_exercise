package mockito;

import org.junit.Test;
import static org.mockito.Mockito.*;

public class VerifyTest {

    @Test
    public void testVerifyInteraction() {

        ExternalAPI mockAPI = mock(ExternalAPI.class);
        MyService service = new MyService(mockAPI);
        service.fetchData();
        verify(mockAPI).getData();
    }
}