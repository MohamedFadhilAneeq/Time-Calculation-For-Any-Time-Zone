import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.ZoneId;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

// Base class for date-time handling
class DateTimeHandler {
    protected DateTimeFormatter formatter;

    public DateTimeHandler() {
        // Define the date-time format
        formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm VV");
    }

    // Method to parse a string into ZonedDateTime
    public ZonedDateTime parseDateTime(String input) throws DateTimeParseException {
        return ZonedDateTime.parse(input, formatter);
    }

    // Method to format ZonedDateTime as a string
    public String formatDateTime(ZonedDateTime dateTime) {
        return dateTime.format(formatter);
    }
}

// Derived class for time zone conversions
class TimeZoneConvertion extends DateTimeHandler {
    // Method to convert ZonedDateTime to a different time zone
    public ZonedDateTime convertTimeZone(ZonedDateTime sourceDateTime, String destinationZone) throws Exception {
        try {
            return sourceDateTime.withZoneSameInstant(ZoneId.of(destinationZone));
        } catch (Exception e) {
            throw new Exception("Invalid time zone: " + destinationZone);
        }
    }
}

public class Tmezoneconverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TimeZoneConvertion converter = new TimeZoneConvertion();

        try {
            System.out.print("Enter date and time with timezone (yyyy-MM-dd HH:mm VV): ");
            String inputDateTime = scanner.nextLine();

            // Parse the input
            ZonedDateTime zonedDateTime = converter.parseDateTime(inputDateTime);
            System.out.println("ZonedDateTime: " + converter.formatDateTime(zonedDateTime));

            System.out.print("Enter the destination timezone (e.g., Asia/Kolkata): ");
            String destinationTimezone = scanner.nextLine();

            // Convert to the destination time zone
            ZonedDateTime destinationZonedDateTime = converter.convertTimeZone(zonedDateTime, destinationTimezone);
            System.out.println("Converted Date and Time: " + converter.formatDateTime(destinationZonedDateTime));
        } catch (DateTimeParseException e) {
            System.err.println("Invalid date and time format. Please use 'yyyy-MM-dd HH:mm VV'.");
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
