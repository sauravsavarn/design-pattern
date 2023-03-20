Intro

* Observer is a behavioral Design Pattern that lets you define a subscription mechanism to notify multiple objects about any events that happen to the Object they are observing
* Analogy can be the newspaper subscription, which is pretty good example of Observer Pattern, where we call the PUBLISHER the <i>SUBJECT</i> & the SUBSCRIBERS the <i>OBSERVERS</i>
* The Observer Pattern defines a one-to-many dependency between a set of Objects so that when one Object changes state, all of its dependents are notified and updated automatically.

Structure/Call Diagram for the Observer Pattern

![img.png](docs/assets/images/structure.png)

Benefits & Drawbacks

![img.png](docs/assets/images/benefits-drawbacks.png)

    Advantages:
Provides a loosely coupled design between objects that interact. Loosely coupled objects are flexible with changing requirements. Here loose coupling means that the interacting objects should have less information about each other.

Observer pattern provides this loose coupling as:

Subject only knows that observer implement Observer interface.Nothing more.
There is no need to modify Subject to add or remove observers.
We can reuse subject and observer classes independently of each other.

    Disadvantages:

Memory leaks caused by <font color="yellow"><u>Lapsed listener problem</u></font> because of explicit register and unregistering of observers.
