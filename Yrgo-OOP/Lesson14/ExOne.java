import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExOne {
    static final Logger logger = LoggerFactory.getLogger(ExOne.class);
    public static void main(String[] args) {
        logger.warn("This is a warning");
        logger.info("This is some info text");
        logger.debug("This is debug");
    }
}
//To run the debug poart of this program
//java "-Dorg.slf4j.simpleLogger.defaultLogLevel=debug" -cp "slf4j-api-1.7.36.jar;slf4j-simple-1.7.36.jar;." ExOne
