import org.junit.Test;
import static org.mockito.Mockito.*;

public class MyServiceTest {

    @Test
    public void testVerifyInteraction() {

        // Step 1: Create mock object
        ExternalApi mockApi = mock(ExternalApi.class);

        // Step 2: Create service with mock
        MyService service = new MyService(mockApi);

        // Step 3: Call the service method
        service.fetchData();

        // Step 4: Verify that getData() was called
        verify(mockApi).getData();
    }
}
