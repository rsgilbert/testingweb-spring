package net.passioncloud.testingweb;


        import org.junit.jupiter.api.Assertions;
        import org.junit.jupiter.api.Test;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.boot.test.context.SpringBootTest;
        import org.springframework.boot.test.web.client.TestRestTemplate;
        import org.springframework.boot.test.web.server.LocalServerPort;
        import org.springframework.util.Assert;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HttpRequestTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;


    @Test
    public void greetingShouldReturnMessage() throws Exception {
        String msg = this.restTemplate.getForObject("http://localhost:" + port, String.class);
        System.out.println(msg);
        System.out.println(port);
        Assertions.assertTrue(msg.contains("Hello"), "Failed");
    }
}
