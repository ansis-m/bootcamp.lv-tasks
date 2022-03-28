package Log4J_setup;

import org.apache.log4j.*;

public class Log4JExample {

    static final Logger logger = Logger.getLogger(Log4JExample.class);
    public static void main(String[] args){

        ConsoleAppender consoleAppender = new ConsoleAppender();
        consoleAppender.setThreshold(Level.TRACE);
        consoleAppender.setLayout(new PatternLayout("%d [%p|%c|%C{1}] %m%n"));
        consoleAppender.activateOptions();
        Logger.getRootLogger().addAppender(consoleAppender);
        //logger.info("Sum of variables is greater than 65.");

        int a = 6;
        int b = 60;

        if(a + b > 65)
            logger.error("Sum of variables a and b is greater than 65!", new Exception());
        else
            logger.info("Sum of variables a and b is less or equal to 65");

        int c = 1;
        int d = 60;

        if(c + d > 65)
            logger.error("Sum of variables c and d is greater than 65!", new Exception());
        else
            logger.info("Sum of variables c and d is less or equal to 65");

        System.out.println("test finished with exit code 0");
    }

}
