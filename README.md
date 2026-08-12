# 📱 Social Media Management System For learning.

A **console-based Social Media Management System** developed in Java.

This project demonstrates how Java **Collections Framework**, particularly `HashMap` and `HashSet`, can be used to manage users and their **followers/following relationships**.

The application provides a simple menu-driven interface where users can be added, followed, unfollowed, and their follower/following lists can be retrieved.

---

## 📌 Project Overview

The application maintains a collection of users using a `HashMap`.

Each user contains:

* User ID
* Name
* Email
* Followers
* Following

The relationships between users are maintained using `HashSet`, which helps store unique user IDs.

```text
                    Social Media App
                           │
                           ▼
                     ┌───────────┐
                     │  HashMap  │
                     │  Users    │
                     └─────┬─────┘
                           │
              ┌────────────┴────────────┐
              ▼                         ▼
        ┌───────────┐             ┌───────────┐
        │   User    │             │   User    │
        ├───────────┤             ├───────────┤
        │ ID        │             │ ID        │
        │ Name      │             │ Name      │
        │ Email     │             │ Email     │
        │ Followers │             │ Followers │
        │ Following │             │ Following │
        └───────────┘             └───────────┘
```

---

## ✨ Features

### 👤 Add User

Add a new user by providing:

* User ID
* Name
* Email

The application validates whether the user ID already exists before adding the user.

```text
Enter the id:
Enter the name:
Enter the email id:

User added successfully!
```

---

### ➕ Follow User

A user can follow another registered user.

When a user follows someone:

```text
User A
  │
  │ follows
  ▼
User B
```

The relationship is maintained in both users' collections:

```text
User A → Following → User B

User B → Followers → User A
```

---

### ➖ Unfollow User

The application provides an option to unfollow another user.

The intended relationship is:

```text
User A
  │
  │ unfollows
  ▼
User B
```

The user relationship can then be removed from the corresponding follower/following collections.

---

### 👥 Retrieve Followers

Enter a user ID to retrieve the list of users who follow that user.

Example:

```text
Enter the id:
101

The follower list is : [102, 103]
```

---

### 👤 Retrieve Following

Enter a user ID to retrieve the list of users that the user follows.

Example:

```text
Enter the user id:
101

The followed list is : [102, 105]
```

---

## 🖥️ Console Menu

The application provides the following menu:

```text
Press 1 : Add the user
Press 2 : Follow the user
Press 3 : UnFollow the user
Press 4 : Retrieve followers list
Press 5 : Retrieve following list
Press 6 : Exit

Enter your choice:
```

---

## 🛠️ Technologies Used

* ☕ Java
* 🗺️ `HashMap`
* 🔹 `HashSet`
* ⌨️ `Scanner`
* 🔄 Switch statement
* 🧱 Object-Oriented Programming
* 💻 Console-based application

---

## 🧠 Data Structures Used

### HashMap

The application uses:

```java
HashMap<String, User> users
```

The user ID acts as the key, while the `User` object is stored as the value.

```text
User ID
   ↓
HashMap
   ↓
User Object
```

This allows users to be retrieved using their unique ID.

---

### HashSet

Each `User` object contains two `HashSet` collections:

```java
HashSet<String> followers;
HashSet<String> following;
```

They store the IDs of users who:

* Follow the current user
* Are followed by the current user

Using a `HashSet` also helps maintain **unique relationships**.

---

## 🏗️ Project Structure

```text
Social-Media-Java/
│
├── Main.java
├── Social_Media.java
├── User.java
└── README.md
```

### `Main.java`

Responsible for:

* Starting the application
* Displaying the menu
* Taking user choices
* Calling the required operations

### `Social_Media.java`

Contains the main social-media operations:

* `addUser()`
* `followUser()`
* `unfollowUser()`
* `followerList()`
* `followingList()`
* `exit()`

### `User.java`

Represents a social-media user.

Contains:

```java
String id;
String name;
String email;

HashSet<String> followers;
HashSet<String> following;
```

---

## 🔄 Application Flow

```text
Start
  │
  ▼
Display Menu
  │
  ├── 1 → Add User
  │
  ├── 2 → Follow User
  │
  ├── 3 → Unfollow User
  │
  ├── 4 → View Followers
  │
  ├── 5 → View Following
  │
  └── 6 → Exit
          │
          ▼
         End
```

---

## 🚀 How to Run

### 1. Clone the Repository

```bash
git clone <your-repository-url>
```

### 2. Open the Project

Open the project using:

* IntelliJ IDEA
* Eclipse
* VS Code
* NetBeans

### 3. Compile

```bash
javac Main.java Social_Media.java User.java
```

### 4. Run

```bash
java Main
```

---

## 💻 Example

### Add Users

```text
Press 1 : Add the user

Enter the id:
101

Enter the name:
Shripad

Enter the email id:
example@gmail.com

User added successfully!
```

Add another user:

```text
ID: 102
Name: Rahul
Email: rahul@gmail.com
```

### Follow

```text
Enter the user id:
101

Enter the user id to follow:
102

User 101 is now following the user 102
```

The relationship becomes:

```text
101
 │
 │ follows
 ▼
102
```

And internally:

```text
101.following = [102]

102.followers = [101]
```

---

## ⏱️ Time Complexity

| Operation          | Average Complexity |
| ------------------ | -----------------: |
| Add User           |             `O(1)` |
| Check User Exists  |             `O(1)` |
| Follow User        |             `O(1)` |
| Unfollow User      |             `O(1)` |
| Retrieve Followers |             `O(1)` |
| Retrieve Following |             `O(1)` |

The complexity is based on the average-case performance of `HashMap` and `HashSet`.

---

## 🎯 Learning Objectives

This project helped me practice:

* Java Collections Framework
* `HashMap`
* `HashSet`
* Classes and Objects
* Constructors
* Encapsulation concepts
* Object relationships
* User input using `Scanner`
* Menu-driven applications
* Switch-case statements
* Basic data-structure design
* Managing many-to-many relationships

---

## 🔮 Future Improvements

Possible improvements for this project:

* 🔐 Add user authentication
* 📝 Add posts and comments
* ❤️ Add likes
* 🔔 Add notifications
* 👤 Display complete user profiles
* 🔎 Search users
* 📊 Display follower/following counts
* 💾 Store users permanently using a database
* 🌐 Convert the console application into a REST API using Spring Boot
* 🖥️ Create a web interface using React.js

---

## 👨‍💻 Author

**Shripad Bhagaywant**

Java Full Stack Developer

`Java` • `Spring Boot` • `React.js` • `REST APIs` • `MySQL`

📍 Pune, India

---

⭐ If you found this project useful for learning Java Collections and Data Structures, consider giving the repository a star!
