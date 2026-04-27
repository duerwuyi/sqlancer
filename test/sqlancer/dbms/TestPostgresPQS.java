package sqlancer.dbms;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.Test;

import sqlancer.Main;

public class TestPostgresPQS {

    @Test
    public void testPQS() {
        assumeTrue(TestConfig.isEnvironmentTrue(TestConfig.POSTGRES_ENV));
        assertEquals(0,
                Main.executeMain(new String[] { "--random-seed", TestConfig.getRandomSeed(1), "--timeout-seconds",
                        TestConfig.getTimeoutSeconds(), "--num-threads", "4", "--num-queries",
                        TestConfig.getNumQueries(), "--random-string-generation", "ALPHANUMERIC_SPECIALCHAR",
                        "postgres", "--test-collations", "false", "--oracle", "pqs" }));
    }

}
