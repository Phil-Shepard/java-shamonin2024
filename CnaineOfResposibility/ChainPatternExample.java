package CnaineOfResposibility;

// Клиентский код
public class ChainPatternExample {
    private static Logger getChainOfLoggers() {
        Logger consoleLogger = new ConsoleLogger(Logger.INFO);
        Logger fileLogger = new FileLogger(Logger.DEBUG);

        consoleLogger.setNextLogger(fileLogger);

        return consoleLogger;
    }

    public static void main(String[] args) {
        Logger loggerChain = getChainOfLoggers();

        loggerChain.logMessage(Logger.INFO, "This is an information.");
        loggerChain.logMessage(Logger.DEBUG, "This is a debug level message.");
    }
}
