package sqlancer.dbms;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.Test;

import sqlancer.Main;

public class TestTiDBTLP {

    @Test
    public void testTLP() {
        assumeTrue(TestConfig.isEnvironmentTrue(TestConfig.TIDB_ENV));
        String seed = System.getenv("RANDOM_SEED");
        assumeTrue(seed != null && !seed.isBlank(), "RANDOM_SEED must be set");
        assertEquals(0, Main.executeMain(new String[] { "--random-seed", seed, "--timeout-seconds", TestConfig.SECONDS,
                "--num-queries", TestConfig.NUM_QUERIES, "tidb" }));
    }

}
