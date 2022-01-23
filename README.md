# design-principles-and-patterns
A repository for quick access to SOLID Design Principles and Design Patters.

# SOLID design principles

This repository contains examples of the five SOLID design principles of object-oriented programming. The examples are written in Java. Each example has a "good" and "bad" version to demonstrate adherence to and violation of the principle, respectively.

- Single Responsibility Principle
- Open/Closed Principle
- Liskov Substitution Principle
- Interface Segregation Principle
- Dependency Inversion Principle


# Single Responsibility Principle

**Every class should have a single responsibility. There should never be more than one reason for a class to change.**
The single responsibility principle (SRP) is probably the most misunderstood of the SOLID principles. According to Martin, software developers tend to assume that each module should only perform one task. There is a principle of refactoring and splitting to the lowest level for functions with a large scope, but this isn’t what SRP is about. The general description of the SRP is:

‘There should never be more than one reason to modify a class.’
However, since software is written for customers/stakeholders or users in most cases and the notion of classes is too specific at this point, we recommend following Martin’s logic:

‘A module should be responsible for one actor and only one.’
As an example, you could take a class or module that provides functions for different business areas. If a change occurs in a business area that means that the structure of the class needs to change, this could impact the part of the class that is required by another part of the organisation. This creates dependencies that can get in the way of software development. This means it would make sense to design classes and methods in a way that results in only one actor being responsible for requirements and adaptations.

In summary, the SRP is mainly about functions and classes and their connection to actors that create requirements.


# Open/Closed Principle

**Software entitites should be open for extension, but closed for modification**

The open-closed Principle (OCP) was formulated by Bertrand Meyer:

‘A software entity should be open to extensions, but at the same time closed to modifications.’
Or in other words, the behaviour of a software entity should be able to be extended in a way that means it doesn’t need to be modified. You could now say that if a modification to the software leads to the need for massive intervention in it, then the architecture of the software has failed.

So how do you extend software without modifying it? When Martin applied Meyer’s principle in the 1990s, he implemented it using a different technical approach. Meyer’s solution was to use inheritance, which is well known in the object-oriented world. This was an important factor in terms of being able to maintain and extend software at the time. Let’s take two classes of car as an example – the passenger car and the sports car. The sports car would inherit all of the important properties and functionalities of the passenger car. Specific functionalities and properties would then be added to the sports car. The dependency here only goes in one direction and that’s a good thing.

To go a step further, you can extend this example by using interfaces, which is exactly what Martin does in his.

OCP, in its extended version, is thus a useful and now widely used principle. Although inheritance results in partitioning, there is no true multiple inheritance in Java, for example. Instead, interfaces are used, which in turn can be increasingly implemented in a class. The aim and purpose should always be to protect classes of a higher hierarchy from modifications in classes of a lower hierarchy.                                        


# Liskov Substitution Principle

**Functions that use pointers or references to base classes must be able to use objects of derived classes without knowing it.**

LSP was defined by Barbara Liskov as follows:

‘If for every object o1 of type S there exists an object o2 of type T such that for all programs P defined in T the behaviour of P is unchanged when o1 is substituted for o2, then S is a subtype of T.’
In principle, this means that with inheritance, the subclass must contain all of the properties of the superclass at all times and can be used by the superclass. The subclass must not contain any modifications to the functionalities of the superclass, but new functionalities can be added to it.

Let’s go back to the passenger car example. We have the superclass passenger car, which provides functions such as acceleration and braking. We now also have two subclasses such as the sports car and the compact car. Both subclasses must be able to use the methods of the superclasses at any time. However, the subclass may have extended properties. For instance, the sports car could still have the ‘Enable sports mode’ function, which manipulates the driving properties of the vehicle.

LSP thus goes one step further than OCP and imposes conditions on subclasses through the superclass in the case of multiple inheritance. You can delve deeper into the different variances here (invariance, covariance and so on) to get a better understanding of LSP.


# Interface Segregation Principle

**Clients should not be forced to depend on interfaces they do not use.**

The ISP is used to avoid forcing users to implement parts of interfaces that aren’t needed. This should result in interfaces not becoming too large and shrinking to fit a specific use.

# Dependency Inversion Principle

**High-level modules should not depend on low-level modules. Both should depend on abstractions.**

**Abstractions should not depend on details. Details should depend on abstractions.**

The last of the five SOLID principles is the dependency inversion principle (DIP). DIP is designed to make clear that systems in which source code dependencies refer exclusively to abstractions rather than to concretions are the most flexible.

In Java, this means that statements should only refer to source modules – such as interfaces, abstract classes or modules that provide any other form of abstraction – when using use, import and include. This is to ensure that dependencies on concrete modules are not created.

However, using this principle as a rule is anything but realistic, as software systems also depend on concrete entities. In Java, for instance, the string class is designed to be very concrete. Trying to make them abstract wouldn’t make much sense. The dependency on the string object shouldn’t be avoided here either.

Based on this argument, DIP should mainly refer to the parts of the software that are being worked on and are obviously accessible for modification.
The DIP is concerned with reusability. The high-level modules or interfaces of an application should only be describing the "general flow" of behavior. In some cases this may be considered "business logic". Meanwhile, the low-level modules are written in such a way to apply their concrete details to the abstraction. (The Adapter Pattern is a good example of DIP.)
