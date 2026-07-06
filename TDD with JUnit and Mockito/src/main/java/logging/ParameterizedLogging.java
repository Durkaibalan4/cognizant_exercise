package logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ParameterizedLogging {

    private static final Logger logger =
            LoggerFactory.getLogger(ParameterizedLogging.class);

    public static void main(String[] args) {

        String studentName = "DB";
        int marks = 95;

        logger.info("Student Name : {}", studentName);
        logger.info("Marks : {}", marks);
        logger.info("Student {} scored {}", studentName, marks);

    }
}