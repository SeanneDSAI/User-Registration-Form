# User Registration Form

A Java desktop application built with Swing that collects user registration details through a form and displays submitted users in a table. Developed as a college project at Technological University Dublin.

---

## What it does

The app has two screens:

1. **Registration Form** — a form where a new user fills in their details. Once submitted and validated, the user is recorded and can be passed to the table view.
2. **Table Frame** — displays registered users in a scrollable table with columns for name, address, email, age range, satisfaction score, gender, and how they heard about the service.

### Form fields
- Name
- Address (multi-line text area)
- Email
- Mobile number
- Username
- Password and repeat password (with match validation)
- Gender (Male / Female radio buttons)
- Age category (dropdown: 18-34, 35-50, 50-60, 60-70)
- Where they heard about the service (Social Media / TV checkboxes)
- Satisfaction with current provider (slider, 0-100)

### Validation
The Record button triggers form validation. If any required field is blank, passwords do not match, or age category is not selected, a popup lists what needs to be filled in before the user can be added.

---

## Project structure

```
src/
└── com/mycompany/registrationform/
    ├── RegistrationForm.java       # Entry point (main class)
    ├── registrationForm1.java      # Registration form GUI + validation logic
    ├── registrationForm1.form      # NetBeans form file for registration screen
    ├── User.java                   # User model (name, address, email, gender, etc.)
    ├── UserTableModel.java         # Custom table model for displaying users
    ├── TableFrame.java             # Table view GUI
    └── TableFrame.form             # NetBeans form file for table screen
```

---

## How to run

### Requirements
- Java 8 or higher
- NetBeans IDE (recommended, as the project uses NetBeans form files)

### Steps
1. Clone or download the repository
2. Open the project in NetBeans
3. Run `registrationForm1.java` to launch the registration form

---

## Built with

- Java
- Java Swing (GUI)
- NetBeans IDE (form-based GUI design)

---

## Author

Seanne Oriemo  
BSc Data Science and Artificial Intelligence, TU Dublin  
[LinkedIn](https://www.linkedin.com/in/seanne-oriemo-8937b5299/) | [GitHub](https://github.com/SeanneDSAI)
