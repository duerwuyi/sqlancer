package sqlancer.dbms;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.Test;

import sqlancer.Main;

public class TestClickHouse {

    private static final int INVOCATION_COUNT = 14;

    @Test
    public void testClickHouseTLPWhereGroupBy() {
        assumeTrue(TestConfig.isEnvironmentTrue(TestConfig.CLICKHOUSE_ENV));
        assertEquals(0, Main.executeMain("--random-seed", TestConfig.getRandomSeed(1), "--timeout-seconds",
                TestConfig.getTimeoutSeconds(INVOCATION_COUNT), "--num-queries", TestConfig.getNumQueries(),
                "--num-threads", "5", "--username", "default", "--password", "", "--database-prefix", "T1_",
                "clickhouse", "--oracle", "TLPWhere", "--oracle", "TLPGroupBy"));
    }

    @Test
    public void testClickHouseTLPWhere() {
        assumeTrue(TestConfig.isEnvironmentTrue(TestConfig.CLICKHOUSE_ENV));
        assertEquals(0, Main.executeMain("--random-seed", TestConfig.getRandomSeed(2), "--timeout-seconds",
                TestConfig.getTimeoutSeconds(INVOCATION_COUNT), "--num-queries", TestConfig.getNumQueries(),
                "--num-threads", "5", "--username", "default", "--password", "", "--database-prefix", "T2_",
                "clickhouse", "--oracle", "TLPWhere"));
    }

    @Test
    public void testClickHouseTLPHaving() {
        assumeTrue(TestConfig.isEnvironmentTrue(TestConfig.CLICKHOUSE_ENV));
        assertEquals(0, Main.executeMain("--random-seed", TestConfig.getRandomSeed(3), "--log-each-select", "true",
                "--print-failed", "false", "--timeout-seconds", TestConfig.getTimeoutSeconds(INVOCATION_COUNT),
                "--num-queries", TestConfig.getNumQueries(), "--num-threads", "1", "--username", "default",
                "--password", "", "--database-prefix", "T3_", "clickhouse", "--oracle", "TLPHaving"));
    }

    @Test
    public void testClickHouseTLPGroupBy() {
        assumeTrue(TestConfig.isEnvironmentTrue(TestConfig.CLICKHOUSE_ENV));
        assertEquals(0, Main.executeMain("--random-seed", TestConfig.getRandomSeed(4), "--log-each-select", "true",
                "--print-failed", "false", "--timeout-seconds", TestConfig.getTimeoutSeconds(INVOCATION_COUNT),
                "--num-queries", TestConfig.getNumQueries(), "--num-threads", "5", "--username", "default",
                "--password", "", "--database-prefix", "T4_", "clickhouse", "--oracle", "TLPGroupBy"));
    }

    @Test
    public void testClickHouseTLPDistinct() {
        assumeTrue(TestConfig.isEnvironmentTrue(TestConfig.CLICKHOUSE_ENV));
        assertEquals(0, Main.executeMain("--random-seed", TestConfig.getRandomSeed(5), "--log-each-select", "true",
                "--print-failed", "false", "--timeout-seconds", TestConfig.getTimeoutSeconds(INVOCATION_COUNT),
                "--num-queries", TestConfig.getNumQueries(), "--num-threads", "5", "--username", "default",
                "--password", "", "--database-prefix", "T5_", "clickhouse", "--oracle", "TLPDistinct"));
    }

    @Test
    public void testClickHouseTLPAggregate() {
        assumeTrue(TestConfig.isEnvironmentTrue(TestConfig.CLICKHOUSE_ENV));
        assertEquals(0, Main.executeMain("--random-seed", TestConfig.getRandomSeed(6), "--log-each-select", "true",
                "--print-failed", "false", "--timeout-seconds", TestConfig.getTimeoutSeconds(INVOCATION_COUNT),
                "--num-queries", TestConfig.getNumQueries(), "--num-threads", "5", "--username", "default",
                "--password", "", "--database-prefix", "T6_", "clickhouse", "--oracle", "TLPAggregate"));
    }

    @Test
    public void testClickHouseNoREC() {
        assumeTrue(TestConfig.isEnvironmentTrue(TestConfig.CLICKHOUSE_ENV));
        assertEquals(0, Main.executeMain("--random-seed", TestConfig.getRandomSeed(7), "--log-each-select", "true",
                "--print-failed", "false", "--timeout-seconds", TestConfig.getTimeoutSeconds(INVOCATION_COUNT),
                "--num-queries", TestConfig.getNumQueries(), "--num-threads", "1", "--username", "default",
                "--password", "", "--database-prefix", "T7_", "clickhouse", "--oracle", "NoREC"));
    }

    @Test
    public void testClickHouseTLPWhereGroupByWithJoins() {
        assumeTrue(TestConfig.isEnvironmentTrue(TestConfig.CLICKHOUSE_ENV));
        assertEquals(0, Main.executeMain("--random-seed", TestConfig.getRandomSeed(8), "--timeout-seconds",
                TestConfig.getTimeoutSeconds(INVOCATION_COUNT), "--num-queries", TestConfig.getNumQueries(),
                "--num-threads", "5", "--username", "default", "--password", "", "--database-prefix", "T8_",
                "clickhouse", "--oracle", "TLPWhere", "--oracle", "TLPGroupBy"));
    }

    @Test
    public void testClickHouseTLPWhereWithJoins() {
        assumeTrue(TestConfig.isEnvironmentTrue(TestConfig.CLICKHOUSE_ENV));
        assertEquals(0, Main.executeMain("--random-seed", TestConfig.getRandomSeed(9), "--timeout-seconds",
                TestConfig.getTimeoutSeconds(INVOCATION_COUNT), "--num-queries", TestConfig.getNumQueries(),
                "--num-threads", "5", "--username", "default", "--password", "", "--database-prefix", "T9_",
                "clickhouse", "--oracle", "TLPWhere"));
    }

    @Test
    public void testClickHouseTLPHavingWithJoins() {
        assumeTrue(TestConfig.isEnvironmentTrue(TestConfig.CLICKHOUSE_ENV));
        assertEquals(0, Main.executeMain("--random-seed", TestConfig.getRandomSeed(10), "--log-each-select", "true",
                "--print-failed", "false", "--timeout-seconds", TestConfig.getTimeoutSeconds(INVOCATION_COUNT),
                "--num-queries", TestConfig.getNumQueries(), "--num-threads", "1", "--username", "default",
                "--password", "", "--database-prefix", "T10_", "clickhouse", "--oracle", "TLPHaving"));
    }

    @Test
    public void testClickHouseTLPGroupByWithJoins() {
        assumeTrue(TestConfig.isEnvironmentTrue(TestConfig.CLICKHOUSE_ENV));
        assertEquals(0, Main.executeMain("--random-seed", TestConfig.getRandomSeed(11), "--log-each-select", "true",
                "--print-failed", "false", "--timeout-seconds", TestConfig.getTimeoutSeconds(INVOCATION_COUNT),
                "--num-queries", TestConfig.getNumQueries(), "--num-threads", "5", "--username", "default",
                "--password", "", "--database-prefix", "T11_", "clickhouse", "--oracle", "TLPGroupBy"));
    }

    @Test
    public void testClickHouseTLPDistinctWithJoins() {
        assumeTrue(TestConfig.isEnvironmentTrue(TestConfig.CLICKHOUSE_ENV));
        assertEquals(0, Main.executeMain("--random-seed", TestConfig.getRandomSeed(12), "--log-each-select", "true",
                "--print-failed", "false", "--timeout-seconds", TestConfig.getTimeoutSeconds(INVOCATION_COUNT),
                "--num-queries", TestConfig.getNumQueries(), "--num-threads", "5", "--username", "default",
                "--password", "", "--database-prefix", "T12_", "clickhouse", "--oracle", "TLPDistinct"));
    }

    @Test
    public void testClickHouseTLPAggregateWithJoins() {
        assumeTrue(TestConfig.isEnvironmentTrue(TestConfig.CLICKHOUSE_ENV));
        assertEquals(0, Main.executeMain("--random-seed", TestConfig.getRandomSeed(13), "--log-each-select", "true",
                "--print-failed", "false", "--timeout-seconds", TestConfig.getTimeoutSeconds(INVOCATION_COUNT),
                "--num-queries", TestConfig.getNumQueries(), "--num-threads", "5", "--username", "default",
                "--password", "", "--database-prefix", "T13_", "clickhouse", "--oracle", "TLPAggregate"));
    }

    @Test
    public void testClickHouseNoRECWithJoins() {
        assumeTrue(TestConfig.isEnvironmentTrue(TestConfig.CLICKHOUSE_ENV));
        assertEquals(0, Main.executeMain("--random-seed", TestConfig.getRandomSeed(14), "--log-each-select", "true",
                "--print-failed", "false", "--timeout-seconds", TestConfig.getTimeoutSeconds(INVOCATION_COUNT),
                "--num-queries", TestConfig.getNumQueries(), "--num-threads", "1", "--username", "default",
                "--password", "", "--database-prefix", "T14_", "clickhouse", "--oracle", "NoREC"));
    }

}
