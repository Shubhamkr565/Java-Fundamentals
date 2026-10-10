# ☕ Java Fundamentals

A hands-on collection of Java examples and notes covering the core concepts every Java developer should know. Each topic has its own folder with small, runnable programs.

## 📚 Topics Covered

| # | Topic | What you'll learn |
|---|-------|-------------------|
| 1 | **Java Fundamentals** | Syntax, data types, variables, operators, control flow, loops, arrays, methods |
| 2 | **Classes and Objects** | Defining classes, fields, constructors, methods, `this`, static members, object creation |
| 3 | **OOP Concepts** | Encapsulation, Inheritance, Polymorphism, Abstraction |
| 4 | **Interfaces and Abstract Classes** | Differences, default/static methods, when to use which |
| 5 | **Exception Handling** | `try-catch-finally`, `throw`/`throws`, checked vs unchecked, custom exceptions, try-with-resources |
| 6 | **Collections Framework** | `List`, `Set`, `Map`, iteration, sorting, `Comparable` vs `Comparator` |
| 7 | **Generics** | Generic classes/methods, bounded types, wildcards |
| 8 | **Java 8+ Features** | Lambda expressions, Stream API, `Optional`, functional interfaces |
| 9 | **Enums and Annotations** | Enum with fields/methods, built-in and custom annotations |
| 10 | **File Handling Basics** | Reading/writing files with `File`, `FileReader`, `BufferedReader`, `Files`, `Path` |

## 🗂️ Project Structure

```
Java-Fundamentals/
├── 01-java-basics/
├── 02-classes-and-objects/
├── 03-oops/
│   ├── encapsulation/
│   ├── inheritance/
│   ├── polymorphism/
│   └── abstraction/
├── 04-interfaces-and-abstract-classes/
├── 05-exception-handling/
├── 06-collections/
│   ├── list/
│   ├── set/
│   └── map/
├── 07-generics/
├── 08-java8-features/
│   ├── lambda/
│   ├── streams/
│   └── optional/
├── 09-enums-and-annotations/
├── 10-file-handling/
└── README.md
```

## 🚀 Getting Started

### Prerequisites

- **JDK 17 or later** (JDK 8+ works for most examples)
- Any IDE (IntelliJ IDEA, Eclipse, VS Code) or just a terminal

Check your Java version:

```bash
java -version
```

### Clone the Repository

```bash
git clone https://github.com/<your-username>/Java-Fundamentals.git
cd Java-Fundamentals
```

### Compile and Run an Example

```bash
cd 02-classes-and-objects
javac Main.java
java Main
```

Or in JDK 11+, run a single file directly:

```bash
java Main.java
```

## 🧠 Quick Concept Cheat Sheet

### OOP Pillars

- **Encapsulation** – Bundle data and methods together; hide internal state using `private` fields with getters/setters.
- **Inheritance** – A child class reuses and extends a parent class using `extends`.
- **Polymorphism** – One interface, many forms: method overloading (compile-time) and overriding (runtime).
- **Abstraction** – Expose *what* an object does, hide *how* it does it, using abstract classes and interfaces.

### Interface vs Abstract Class

| Feature | Interface | Abstract Class |
|---------|-----------|----------------|
| Multiple inheritance | Yes (a class can implement many) | No (single `extends`) |
| Constructors | No | Yes |
| Fields | `public static final` only | Any type |
| Methods | abstract, `default`, `static` | abstract and concrete |

### Collections at a Glance

| Type | Implementations | Key trait |
|------|-----------------|-----------|
| `List` | `ArrayList`, `LinkedList` | Ordered, allows duplicates |
| `Set` | `HashSet`, `LinkedHashSet`, `TreeSet` | No duplicates |
| `Map` | `HashMap`, `LinkedHashMap`, `TreeMap` | Key-value pairs, unique keys |

### Java 8+ Snippet

```java
List<String> names = List.of("Anna", "Bob", "Charlie", "Alex");

names.stream()
     .filter(n -> n.startsWith("A"))
     .map(String::toUpperCase)
     .forEach(System.out::println);
```

## ✅ Learning Path

- [ ] Java Fundamentals
- [ ] Classes and Objects
- [ ] OOPs (Encapsulation, Inheritance, Polymorphism, Abstraction)
- [ ] Interfaces and Abstract Classes
- [ ] Exception Handling
- [ ] Collections Framework
- [ ] Generics
- [ ] Java 8+ (Lambda, Streams, Optional)
- [ ] Enums and Annotations
- [ ] File Handling

## 🤝 Contributing

Contributions are welcome!

1. Fork the repository
2. Create a branch: `git checkout -b feature/new-example`
3. Commit your changes: `git commit -m "Add new example"`
4. Push the branch: `git push origin feature/new-example`
5. Open a Pull Request

## 📖 Resources

- [Oracle Java Tutorials](https://docs.oracle.com/javase/tutorial/)
- [Java SE Documentation](https://docs.oracle.com/en/java/javase/)
- [Baeldung](https://www.baeldung.com/)
- [Java Code Geeks](https://www.javacodegeeks.com/)



⭐ If you find this repo helpful, consider giving it a star!
