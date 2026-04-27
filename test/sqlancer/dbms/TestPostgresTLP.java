package sqlancer.dbms;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.Test;

import sqlancer.Main;

public class TestPostgresTLP {

    @Test
    public void testTLP() {
        assumeTrue(TestConfig.isEnvironmentTrue(TestConfig.POSTGRES_ENV));
        assertEquals(0,
                Main.executeMain(new String[] { "--random-seed", TestConfig.getRandomSeed(2), "--timeout-seconds",
                        TestConfig.getTimeoutSeconds(), "--num-threads", "4", "--num-queries",
                        TestConfig.getNumQueries(), "postgres", "--test-collations", "false" }));
    }
}
