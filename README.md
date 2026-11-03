# Low-Level Design (LLD) Practice in Java

Hands-on practice repo for a 20-lecture LLD curriculum plus 2 bonus concurrency modules. Every topic gets runnable code, not just notes.


## Tech stack

- Java 17+
- Maven (or Gradle)
- JUnit 5
- PlantUML / Mermaid for diagrams

## Progress tracker

| # | Module | Topics | Status |
|---|--------|--------|--------|
| 01 | Intro to LLD & Java Essentials | LLD vs HLD vs DSA, classes, objects, constructors, access modifiers, `static`, `final`, enums | ⬜ |
| 02 | OOP Pillars | Encapsulation, abstraction, inheritance, polymorphism, interface vs abstract class | ⬜ |
| 03 | Java Toolkit & Object Relationships | Collections, generics, exceptions, lambdas, association, aggregation, composition | ⬜ |
| 04 | UML Diagrams | Class diagrams, relationships, multiplicity, sequence diagrams | ⬜ |
| 05 | SOLID Principles | SRP, OCP, LSP, ISP, DIP (bad vs refactored) | ⬜ |
| 06 | Design Principles & Pattern Intro | DRY, KISS, YAGNI, composition over inheritance, program to interfaces | ⬜ |
| 07 | Approaching an LLD Problem | Evaluation criteria, step-by-step approach, Tic-Tac-Toe | ⬜ |
| 08 | Creational I | Singleton, Simple Factory, Factory Method | ⬜ |
| 09 | Creational II | Abstract Factory, Builder, Prototype | ⬜ |
| 10 | Structural I | Adapter, Facade, Proxy | ⬜ |
| 11 | Structural II | Decorator, Composite | ⬜ |
| 12 | Behavioral I | Strategy, Observer | ⬜ |
| 13 | Behavioral II | State, Template Method | ⬜ |
| 14 | Behavioral III | Command, Chain of Responsibility, Iterator, Mediator, Memento | ⬜ |
| 15 | Case Study: Parking Lot | Singleton, Factory, Strategy, Decorator | ⬜ |
| 16 | Case Study: Snake & Ladder | Polymorphic cells, Strategy for dice | ⬜ |
| 17 | Case Study: ATM Machine | State, Chain of Responsibility | ⬜ |
| 18 | Case Study: BookMyShow | Facade, Builder, Strategy, Adapter, Observer | ⬜ |
| 19 | Case Study: Splitwise | Strategy, Factory, balance tracking | ⬜ |
| 20 | Mock Interview: Elevator System | Timed design, mistakes review | ⬜ |
| B1 | Java Concurrency Basics | Threads, synchronization, locks, atomics, concurrent collections | ⬜ |
| B2 | Concurrency in LLD | Race conditions in Parking Lot / BookMyShow, Rate Limiter | ⬜ |

Legend: ⬜ not started · 🟨 in progress · ✅ done and reviewed

## Repository structure

```
.
├── README.md
├── 01-intro-java/
├── 02-oop-pillars/
├── 03-java-toolkit-relationships/
├── 04-uml/
├── 05-solid/
│   ├── srp/ ├── ocp/ ├── lsp/ ├── isp/ └── dip/
├── 06-design-principles/
├── 07-approach-tic-tac-toe/
├── 08-creational-1/
├── 09-creational-2/
├── 10-structural-1/
├── 11-structural-2/
├── 12-behavioral-1/
├── 13-behavioral-2/
├── 14-behavioral-3/
├── 15-case-parking-lot/
├── 16-case-snake-and-ladder/
├── 17-case-atm/
├── 18-case-bookmyshow/
├── 19-case-splitwise/
├── 20-mock-elevator-system/
├── bonus-1-java-concurrency/
└── bonus-2-concurrency-in-lld/
```


## Pattern quick index

| Category | Patterns |
|----------|----------|
| Creational | Singleton, Simple Factory, Factory Method, Abstract Factory, Builder, Prototype |
| Structural | Adapter, Facade, Proxy, Decorator, Composite |
| Behavioral | Strategy, Observer, State, Template Method, Command, Chain of Responsibility, Iterator, Mediator, Memento |


## Contributing / Notes

Personal learning repo. Code is for practice, not production.