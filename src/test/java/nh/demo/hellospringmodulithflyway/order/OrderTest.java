package nh.demo.hellospringmodulithflyway.order;

import nh.demo.hellospringmodulithflyway.TestcontainersConfiguration;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.Import;
import org.springframework.modulith.test.ApplicationModuleTest;

@ApplicationModuleTest(mode = ApplicationModuleTest.BootstrapMode.DIRECT_DEPENDENCIES)
@Import(TestcontainersConfiguration.class)

public class OrderTest {

    @Test
    void testName() {
        System.out.println();
    }

}
