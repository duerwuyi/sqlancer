package sqlancer.dbms;

public class TestConfig {
    public static final String NUM_QUERIES = "1000";
    public static final String SECONDS = "300";
    public static final String RANDOM_SEED = "0";
    public static final String TIMEOUT_ENV = "SQLANCER_TIMEOUT_SECONDS";
    public static final String NUM_QUERIES_ENV = "SQLANCER_NUM_QUERIES";
    public static final String RANDOM_SEED_ENV = "SQLANCER_RANDOM_SEED";

    public static final String CLICKHOUSE_ENV = "CLICKHOUSE_AVAILABLE";
    public static final String COCKROACHDB_ENV = "COCKROACHDB_AVAILABLE";
    public static final String DATABEND_ENV = "DATABEND_AVAILABLE";
    public static final String DATAFUSION_ENV = "DATAFUSION_AVAILABLE";
    public static final String DORIS_ENV = "DORIS_AVAILABLE";
    public static final String HIVE_ENV = "HIVE_AVAILABLE";
    public static final String SPARK_ENV = "SPARK_AVAILABLE";
    public static final String MARIADB_ENV = "MARIADB_AVAILABLE";
    public static final String MATERIALIZE_ENV = "MATERIALIZE_AVAILABLE";
    public static final String MYSQL_ENV = "MYSQL_AVAILABLE";
    public static final String OCEANBASE_ENV = "OCEANBASE_AVAILABLE";
    public static final String POSTGRES_ENV = "POSTGRES_AVAILABLE";
    public static final String PRESTO_ENV = "PRESTO_AVAILABLE";
    public static final String TIDB_ENV = "TIDB_AVAILABLE";
    public static final String YUGABYTE_ENV = "YUGABYTE_AVAILABLE";

    public static boolean isEnvironmentTrue(String key) {
        String value = System.getenv(key);
        return value != null && value.equalsIgnoreCase("true");
    }

    public static String getTimeoutSeconds() {
        return getEnvironmentOrDefault(TIMEOUT_ENV, SECONDS);
    }

    public static String getTimeoutSeconds(int totalInvocations) {
        int totalBudget = Integer.parseInt(getTimeoutSeconds());
        int perInvocationBudget = Math.max(1, totalBudget / totalInvocations);
        return String.valueOf(perInvocationBudget);
    }

    public static String getNumQueries() {
        return getEnvironmentOrDefault(NUM_QUERIES_ENV, NUM_QUERIES);
    }

    public static String getRandomSeed() {
        return getRandomSeed(0);
    }

    public static String getRandomSeed(int offset) {
        long baseSeed = Long.parseLong(getEnvironmentOrDefault(RANDOM_SEED_ENV, RANDOM_SEED));
        return String.valueOf(baseSeed + offset);
    }

    private static String getEnvironmentOrDefault(String key, String defaultValue) {
        String value = System.getenv(key);
        if (value == null || value.isBlank()) {
            return defaultValue;
        }
        return value;
    }
}
