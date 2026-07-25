import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;
import static org.mockito.AdditionalMatchers.*;

class MyServiceTest {

    @Test
    public void testArgumentMatching(){
        ExternalAPI mockAPI = mock(ExternalAPI.class);

        MyService service = new MyService(mockAPI);

        service.setData("swati", 20);

        verify(mockAPI).send("swati", 20);
        verify(mockAPI).send(eq("swati"), anyInt());
        verify(mockAPI).send(anyString(), anyInt());
        verify(mockAPI).send(startsWith("swati"), anyInt());
        verify(mockAPI).send(endsWith("vel"), gt(15));

        System.out.println();
    }
}