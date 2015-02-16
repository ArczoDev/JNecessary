package com.arczo.jnecessary.basic.logging;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Log Class. Used for all logging events.
 * @author Jon McLean (jon@arczo.com)
 * @since 6/2/15
 */
public class Log {

    private Log() {

    }

    /**
     * This prints out the message as an info statement to the console using the info prefix "[INFO]".
     * @param message Message to print
     */
    public static void info(Object message) {
        String timecode = getCurrentTimecode();
        System.out.println(timecode + " - " + "[INFO]" + message);
    }

    /**
     * This prints out the message as  an info statement to the console using the info prefix "[INFO]" and app name allowing for easy reading.
     * @param message Message to print
     * @param appName Your program name
     */
    public static void info(Object message, String appName) {
        String timecode = getCurrentTimecode();
        System.out.println(timecode + " - " + "[" + appName +"]" + "[INFO]" + message);
    }

    /**
     * This prints out the message as a severe (usually an error) to the console using the severe prefix "[SEVERE]".
     * @param message Message to print
     */
    public static void severe(Object message) {
        String timecode = getCurrentTimecode();
        System.out.println(timecode + " - " + "[INFO]" + message);
    }

    /**
     * This prints out the message as a severe (usually an error) to the console using the severe prefix "[SEVERE]" and app name allowing for easy reading.
     * @param message Message to print
     * @param appName Your program name
     */
    public static void severe(Object message, String appName) {
        String timecode = getCurrentTimecode();
        System.out.println(timecode + " - " + "[" + appName +"]" + "[SEVERE]" + message);
    }

    /**
     * This prints out the message as a warning to the console using the warning prefix "[WARNING]"
     * @param message Message to print
     */
    public static void warning(Object message) {
        String timecode = getCurrentTimecode();
        System.out.println(timecode + " - " + "[WARNING]" + message);
    }

    /**
     * This prints out the message as a warning to the console using the warning prefix "[WARNING]" and app name for easy reading
     * @param message Message to print
     * @param appName Your program name
     */
    public static void warning(Object message, String appName) {
        String timecode = getCurrentTimecode();
        System.out.println(timecode + " - " + "[" + appName +"]" + "[WARNING]" + message);
    }

    /**
     * This prints out the message as a success to the console using the success prefix "[SUCCESS]"
     * @param message Message to print
     */
    public static void success(Object message) {
        String timecode = getCurrentTimecode();
        System.out.println(timecode + " - " + "[SUCCESS]" + message);
    }

    /**
     * This prints out the message as a success to the console using the success prefix "[SUCCESS]" and app name for easy reading
     * @param message Message to print
     * @param appName Your program name
     */
    public static void success(Object message, String appName) {
        String timecode = getCurrentTimecode();
        System.out.println(timecode + " - " + "[" + appName +"]" + "[SUCCESS]" + message);
    }

    /**
     * This prints out the message as a failure to the console using the failure prefix "[FAIL]"
     * @param message Message to print
     */
    public static void fail(Object message) {
        String timecode = getCurrentTimecode();
        System.out.println(timecode + " - " + "[FAIL]" + message);
    }

    /**
     * This prints out the message as a failure to the console using the failure prefix "[FAIL]" and app name for easy reading.
     * @param message Message to print
     * @param appName Your program name
     */
    public static void fail(Object message, String appName) {
        String timecode = getCurrentTimecode();
        System.out.println(timecode + " - " + "[" + appName + "]" + "[FAIL]" + message);
    }

    /**
     * Prints message according to stated log type
     * @param type LogType Type of logging
     * @param message Message to log
     * @deprecated This is no longer in use.
     */
    @Deprecated
    public static void log(LogType type, String message) {
        String timecode = getCurrentTimecode();
        switch (type) {
            case SUCCESS:
                System.out.println(timecode + " - " + "[SUCCESS]" + message);
                break;
            case FAIL:
                System.out.println(timecode + " - " + "[FAIL]" + message);
                break;
            case INFO:
                System.out.println(timecode + " - " + "[INFO]" + message);
                break;
            case SEVERE:
                System.out.println(timecode + " - " + "[SEVERE]" + message);
                break;
            case WARNING:
                System.out.println(timecode + " - " + "[WARNING]" + message);
                break;
            case DEFAULT:
                System.out.println(timecode + " - " + "[INFO]" + message);
                break;
        }
    }

    private static String getCurrentTimecode() {
        String time = new SimpleDateFormat("HH:MM:ss").format(Calendar.getInstance().getTime());
        return time;
    }


}
