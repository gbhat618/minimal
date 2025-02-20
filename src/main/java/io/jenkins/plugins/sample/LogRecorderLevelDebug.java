package io.jenkins.plugins.sample;

import hudson.Extension;
import hudson.model.PeriodicWork;
import java.util.logging.Level;
import java.util.logging.Logger;

@Extension
public class LogRecorderLevelDebug extends PeriodicWork {

    private static final Logger LOGGER = Logger.getLogger(LogRecorderLevelDebug.class.getName());

    @Override
    public long getRecurrencePeriod() {
        // execute every 5 seconds
        return MIN / 12;
    }

    @Override
    protected void doRun() {
        LOGGER.info("Current log level: " + LOGGER.getLevel());
        LOGGER.finest("FINEST level log");

        if (LOGGER.isLoggable(Level.FINE)) {
            LOGGER.fine("FINE level log inside the if block");
            LOGGER.info("INFO level log inside the if block");
        } else {
            LOGGER.info("INFO level log inside the else block");
        }
    }
}
