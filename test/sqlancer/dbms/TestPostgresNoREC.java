package sqlancer.dbms;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.Test;

import sqlancer.Main;

public class TestPostgresNoREC {

    @Test
    public void testNoREC() {
        assumeTrue(TestConfig.isEnvironmentTrue(TestConfig.POSTGRES_ENV));
        assertEquals(0,
                Main.executeMain(new String[] { "--random-seed", TestConfig.getRandomSeed(3), "--timeout-seconds",
                        TestConfig.getTimeoutSeconds(), "--num-threads", "4", "--num-queries",
                        TestConfig.getNumQueries(), "postgres", "--test-collations", "false", "--oracle", "NOREC" }));
    }
}
