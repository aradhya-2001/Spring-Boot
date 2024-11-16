package spring;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class TestLog {

    private static final Log logger = LogFactory.getLog(TestLog.class);

    public static void print(){
        logger.warn("warning ...");
        logger.debug("debugging...");
        logger.info("info ... ");
        logger.error("error ...");
        logger.trace("tracing ...");

    }
}
