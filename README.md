
# Timezone Converter

A Java console application that converts a date and time from one timezone to another. This tool helps users work seamlessly with different timezones by providing an accurate conversion.

## Features

- Accepts date and time in a specific format with timezone.
- Converts the input to a destination timezone of the user's choice.
- Handles errors for invalid date-time formats or timezones.
- Displays clear, user-friendly output with timezone abbreviations.

## Prerequisites

- Java 8 or later
- A terminal or command-line interface

## Usage

1. **Clone the repository:**
   ```bash
   git clone https://github.com/MohamedFadhilAneeq/Time-Calculation-For-Any-Time-Zone.git
   cd Time-Calculation-For-Any-Time-Zone
   ```

2. **Compile the program:**
   ```bash
   javac Timezoneconverter.java
   ```

3. **Run the program:**
   ```bash
   java timezoneconverter
   ```

4. **Follow the prompts:**
   - Input the date and time with timezone in the format: `yyyy-MM-dd HH:mm VV`.
   - Example: `2024-11-15 13:30 America/New_York`
   - Input the destination timezone in the format: `Region/City`.
   - Example: `Asia/Kolkata`

## Input Format

- **Date and Time with Timezone:** `yyyy-MM-dd HH:mm VV`
  - Example: `2024-11-15 13:30 America/New_York`

- **Destination Timezone:** `Region/City`
  - Example: `Asia/Kolkata`

## Example Run

```plaintext
Enter date and time with timezone (yyyy-MM-dd HH:mm VV): 2024-11-15 13:30 America/New_York
Enter the destination timezone (e.g., Asia/Kolkata): Asia/Kolkata
ZonedDateTime: 2024-11-15 13:30 America/New_York
Converted Date and Time: 2024-11-15 23:00 IST
```

## Error Handling

- **Invalid Input Format:** The program will prompt the user to enter the correct format.
- **Invalid Timezone:** The program will display an error if the timezone is not recognized.

## License

This project is licensed under the CC License. See the [LICENSE] file for details.

## Contributing

Contributions are welcome! Please feel free to open issues or submit pull requests.
