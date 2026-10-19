# 🏎️ F1 Ticket Booking System

A simple Formula 1 ticket booking application built using Java Swing as a student project.

## About the Project

This project was created to practise Java programming and explore how graphical user interfaces work. It allows users to select ticket types, choose a race time, enter their details, calculate ticket prices, and generate a receipt.

I built this project with the knowledge I had at the time, focusing on getting the application working and understanding the basics of Java, object-oriented programming, and file handling.

Looking back, there are definitely things I would approach differently today. However, this project represents an important part of my learning journey and my early experience with software development.

## Features

- **Graphical User Interface:** Built using Java Swing and AWT.
- **Ticket Selection:** Choose between VIP, Standard, and Youth tickets.
- **Ticket Pricing:**
  - VIP: AED 5,000
  - Standard: AED 3,500
  - Youth: AED 1,500
- **Race Timings:** Select from available showtimes.
- **Seat Booking:** Enter the number of seats required.
- **Price Calculation:** Calculate the ticket price based on the selected ticket type and number of seats.
- **Customer Details:** Enter an Emirates ID.
- **Receipt Generation:** View booking details and save a receipt to a text file.
- **Visual Design:** Includes an F1-themed GIF in the interface.

## Technologies Used

- Java
- Java Swing
- Java AWT
- File Handling (`java.io`)
- Object-Oriented Programming fundamentals

## Requirements

- Java Development Kit (JDK)
- A Java IDE, such as IntelliJ IDEA, Eclipse, or NetBeans, or a terminal
- The `f1.gif` image file used by the application

No external libraries are required.

## How to Run

1. Clone or download this repository.
2. Make sure the Java source file and `f1.gif` are in the appropriate project directory.
3. Open the project in your preferred Java IDE.
4. Compile and run the application.

If using a terminal, navigate to the project directory and run:

```bash
javac Ticketbooking.java
java ticketbooking
```

**Note:** Java is case-sensitive. The source filename shown above is `Ticketbooking.java`, while the main class is named `ticketbooking`. If your actual file has a different name, use that filename when compiling.

## Project Structure

```text
F1-Ticket-Booking-System/
├── Ticketbooking.java
├── f1.gif
└── README.md
```

## Limitations

This was an early student project, so it has some limitations:

- Emirates ID input is not fully validated against the actual Emirates ID format.
- Seat quantities are not comprehensively validated.
- The application uses a fixed-size array to store tickets.
- The total price handling has limitations when multiple ticket entries are submitted.
- The payment process is a simulation; no actual payment is processed.
- Booking information is stored temporarily in memory rather than in a database.
- Receipts are saved as text files.

These are areas I would look to improve as I continue developing my programming skills.

## Future Improvements

- Improve input validation and error handling.
- Calculate totals correctly across multiple ticket bookings.
- Introduce a database to store booking information.
- Improve the interface and overall user experience.
- Add proper seat availability management.
- Implement a more structured booking and payment workflow.

## What I Learned

Working on this project helped me practise Java syntax, classes and objects, GUI development, event handling, basic calculations, and writing information to files.

It also helped me understand that building a working application is only one part of software development. Code organisation, validation, reliability, and user experience are equally important.

---

**Built as a student project, with the knowledge I had at the time.**

One project at a time. 🏎️