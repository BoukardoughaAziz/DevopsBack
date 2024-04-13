import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import tn.esprit.devops_project.DevOps_ProjectSpringBootApplication;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest(classes = DevOps_ProjectSpringBootApplication.class)
public class devops_projectTests {
    @Test
    void contextLoads() {
        assertTrue(true);
    }
}
