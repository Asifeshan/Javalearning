package testng;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import utilities.ReadConfigFiles;

public class TestNgMavenExampleTest {
    // How to declare a logger basically Logger is a Logger class with obj LOGGER then using the log manager
    // capturing the logger with getLogger for class TestNgMavenExampleTest
    private static final Logger LOGGER = LogManager.getLogger(TestNgMavenExampleTest.class);

    public void run() {
        LOGGER.debug("This is a debug message");
        LOGGER.info("This is info message");
        LOGGER.warn("This is a warning");
        LOGGER.error("This is an error");
        LOGGER.fatal("This is dangerous");
        LOGGER.trace("General Information");
    }

    @Test
    public void testPropertyFile(){
        LOGGER.info(ReadConfigFiles.getPropertyValues("DbUser"));
    }
}
// To see the log go to the  JavaProject > logs > App.log, its stored here.
