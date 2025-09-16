OPEN-CLOSED PRINCIPLE
-----------------------------

 >  _**INTRODUCTION**_
 * This Design Pattern is not a <u>GANG Of Four Pattern</u> but is a pattern of enterprise engineering and it's called specification. 
 * The principle states that software entities like class, modules, functions, etc., should be able to extend a class behavior without modifying it. This principle separates the existing code from modified mode to provide better stability, maintainability and minimizes the changes in the code. In a nutshell, the developer must need to change only a specific part of the code (a class or a function) every time a requirement changes.
 * Using a statically typed language like Java, etc. the open/closed principle is generally achieved by using inheritance and polymorphism
 * The open/closed principle is a guideline for the overall design of classes and interfaces and how developers can build code that allows changes over time. 
   > Now when most organizations are adopting agile practices, with each passing sprint, new requirements are inevitable and should be embraced. If the code designed, is not built to enable change, change will be difficult, time-consuming, error-prone, and costly.

   > By ensuring that the code is open to extension but closed to modification using OPEN_CLOSED PRINCIPLE, we effectively disallow future changes to existing classes and assemblies, which forces programmers to create new classes that can be plugged into as extension points.

   > <b><i><font color="red">A suggested approach is to identify parts of the requirements that are likely to change or that are particularly troublesome to implement and factor these out behind extension points.</font></i></b>

 > PROBLEM STATEMENT
 * Let's suppose that you decide to make a website where you're selling different products, something like Amazon, for example, and you want to allow your users to filter products by a specific criteria, say both the COLOR & SIZE.
    
 * NOTE: Implement this example using both the OOPS and OCP.

 > _**REFERENCES**_
 1.  https://www.javabrahman.com/programming-principles/open-closed-principle-with-examples-in-java/
 2.  https://howtodoinjava.com/best-practices/open-closed-principle/
 3. 