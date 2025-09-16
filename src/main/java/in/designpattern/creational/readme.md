These patterns deal with object creation mechanisms, trying to create objects in a manner suitable to the situation.
<p>**Singleton:**<p>
Ensures that only one instance of a class is created and provides a global point of access to it.
<p>**Factory Method:**<p>
Defines an <u>interface</u> for creating an object, but lets subclasses decide which class to instantiate.
<p>**Abstract Factory:**<p>
Creates families of related objects without specifying their concrete classes.
<p>**Builder:**<p>
Constructs complex objects step by step, <u>allowing for different representations</u>.
<p>**Prototype:**<p>
Creates new objects by copying an existing object.

---
**Builder Design Pattern**

The Builder design pattern is a creational pattern that simplifies the construction of complex objects **_by separating the object's construction from its representation_**. 
<u>It is particularly useful when dealing with objects that have a large number of optional parameters or configurations</u>.

***Key Components***
- **Product:** The complex object to be constructed.
- **Builder:** An interface or abstract class that defines the methods for building parts of the product.
- **Concrete Builder:** Concrete implementations of the builder interface, each responsible for building a specific representation of the product.
- **Director (Optional):** A class that orchestrates the construction process by using a builder.

***How it Works:***
- The client creates a concrete builder object.
- The client calls methods on the builder to set the attributes or parts of the product.
- The builder returns the product object after all the necessary steps are completed.
- The director (if present) guides the builder through the construction process.

***Benefits:***
- **Improved Readability:**
The pattern makes the code more readable by separating the construction logic from the object's representation.
- **Flexibility:**
It allows for creating different representations of the same object using the same construction process.
- **Reduced Complexity:**
It avoids the need for multiple constructors with varying parameters.
- **Step-by-Step Construction:**
It enables step-by-step construction of complex objects, making it easier to manage the process.

```declarative
// Product
class Computer {
    private String cpu;
    private String ram;
    private String storage;

    public Computer(String cpu, String ram, String storage) {
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
    }
    // Getters for cpu, ram and storage
    public String getCpu() {
        return cpu;
    }
    public String getRam() {
        return ram;
    }
    public String getStorage() {
        return storage;
    }
}

// Builder interface
interface ComputerBuilder {
    void setCpu(String cpu);
    void setRam(String ram);
    void setStorage(String storage);
    Computer build();
}

// Concrete Builder
class GamingComputerBuilder implements ComputerBuilder {
    private String cpu;
    private String ram;
    private String storage;
    @Override
    public void setCpu(String cpu) {
        this.cpu = cpu;
    }
    @Override
    public void setRam(String ram) {
        this.ram = ram;
    }
    @Override
    public void setStorage(String storage) {
        this.storage = storage;
    }
    @Override
    public Computer build() {
        return new Computer(cpu, ram, storage);
    }
}

// Director (Optional)
class ComputerDirector {
    private ComputerBuilder builder;
    public ComputerDirector(ComputerBuilder builder) {
        this.builder = builder;
    }
    public void constructGamingComputer(){
        builder.setCpu("Gaming CPU");
        builder.setRam("16GB");
        builder.setStorage("1TB SSD");
    }
}

// Client
public class Main {
    public static void main(String[] args) {
        GamingComputerBuilder gamingBuilder = new GamingComputerBuilder();
        ComputerDirector director = new ComputerDirector(gamingBuilder);
        director.constructGamingComputer();
        Computer gamingComputer = gamingBuilder.build();
        System.out.println("CPU: " + gamingComputer.getCpu());
        System.out.println("RAM: " + gamingComputer.getRam());
        System.outbeam.println("Storage: " + gamingComputer.getStorage());
    }
}
```
***When to Use:***
- When an object has many optional parameters.
- When you need to create different representations of an object using the same construction process.
- When you want to improve code readability and reduce complexity.

***Alternatives:***
- ***Telescoping Constructors:*** Not recommended for complex objects with many optional parameters.
- ***Factory Pattern:*** Used for creating objects of different types but does not handle complex object construction as well as the Builder pattern.

---

**Prototype Design Pattern**

The Prototype design pattern is a creational pattern that enables the creation of new objects by cloning an existing object, known as the prototype. This pattern is useful when creating objects is expensive or complex, and you have similar objects already available. Instead of creating new objects from scratch, you can copy an existing one and modify it as needed.

***Key Components***
- **Prototype Interface/Abstract Class:** 
Declares the clone() method, which is used to create a copy of the object.

- **Concrete Prototypes:** 
Implement the clone() method to return a copy of themselves.

- **Client:** 
Creates new objects by calling the clone() method on a prototype.

---
    // Prototype interface
    interface Shape extends Cloneable {
        Shape clone();
        void draw();
    }
    
    // Concrete prototype class
    class Circle implements Shape {
        private int radius;
    
        public Circle(int radius) {
            this.radius = radius;
        }
    
        // Copy constructor
        public Circle(Circle source) {
            this.radius = source.radius;
        }
    
    
        @Override
        public Shape clone() {
            return new Circle(this); // Uses copy constructor for cloning
        }
    
        @Override
        public void draw() {
            System.out.println("Drawing a circle with radius: " + radius);
        }
    }

    // Client class
    class PrototypeDemo {
        public static void main(String[] args) {
            Circle circlePrototype = new Circle(5);
            Shape clonedCircle = circlePrototype.clone();
            clonedCircle.draw(); // Output: Drawing a circle with radius: 5
        }
    }
---

Use Cases
- When creating instances of a class is resource-intensive.
- When the exact type of object to create is determined at runtime.
- When you need to avoid the creation of a hierarchy of factory classes.

Advantages
- Reduces the need for subclassing.
- Simplifies the creation of complex objects.
- Improves performance by cloning objects instead of creating them from scratch.

Disadvantages
- Cloning complex objects with circular references can be tricky.
- Requires implementing the Cloneable interface or a custom clone method.
- Can be less efficient than using a factory method if object creation is not expensive.

**When to use the Prototype Design Pattern**
<p>Below is when to use prototype design pattern:

- Use the Prototype pattern when creating new objects is more complex or costly than copying existing ones. Cloning can be more efficient if significant resources are needed.
- The Prototype pattern is helpful for managing various objects with minor differences. Instead of creating multiple classes, you can clone and modify prototypes.
- Consider the Prototype pattern for **dynamic configurations** where you need to create objects at runtime. You can clone a base configuration and adjust it as necessary.
- The Prototype pattern can lower initialization costs, as cloning is often faster than building a new object from scratch, especially if initialization is resource-intensive.

**When not to use the Prototype Design Pattern**
<p>Below is when not to use Prototype design pattern:

- Avoid using the Prototype pattern when your application predominantly deals with unique object instances, and the overhead of implementing the pattern outweighs its benefits.
- If object creation is simple and does not involve significant resource consumption, and there are no variations of objects, using the Prototype pattern might be unnecessary complexity.
- **If your objects are immutable (unchangeable) and do not need variations**, the benefits of cloning may not be significant.
- If your system has a clear and straightforward object creation process that is easy to understand and manage, introducing the Prototype pattern may add unnecessary complexity.

