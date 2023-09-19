comparison of classes and objects :

| Aspect                                      | Class                                            | Object                                              |
|---------------------------------------------|--------------------------------------------------|-----------------------------------------------------|
| **Definition**                              | A class is a blueprint or template that defines the structure and behavior of objects. | An object is an instance of a class, representing a specific realization of the class. |
| **Existence**                               | Classes are static entities that provide definitions but do not exist as physical entities in memory during program execution. | Objects are dynamic entities that exist in memory during program execution, representing instances of a class. |
| **Creation**                                | Classes are used to create objects. You can create multiple objects of the same class. | Objects are created based on class blueprints. Each object has its own set of attributes and can perform actions independently. |
| **Attributes and Methods**                  | Classes define attributes (fields/variables) and methods (functions) that objects of the class will have. | Objects have specific values for attributes and can invoke methods defined in their class. |
| **Static vs. Dynamic**                      | Classes are static, providing a blueprint for objects. | Objects are dynamic and can change state during program execution. |
| **Example**                                 | If you have a `Car` class, it defines the properties and behaviors shared by all cars. | If you create an object `myCar` based on the `Car` class, it represents a specific car with its own attributes and behavior. |
| **Memory Allocation**                       | No memory is allocated for a class during program execution. | Objects are allocated memory in the heap during their creation. |
| **Interactions**                            | Classes can interact with other classes and define relationships (e.g., inheritance, composition). | Objects can interact with other objects and invoke methods defined in other classes. |
| **Role**                                    | Classes provide the structure and blueprint for creating objects. | Objects represent specific instances of classes and perform tasks in a program. |

This table summarizes the key differences between classes and objects, highlighting their roles and characteristics in object-oriented programming.
comparison of encapsulation and abstraction in a column format:

| Aspect               | Encapsulation                         | Abstraction                            |
|----------------------|--------------------------------------|----------------------------------------|
| **Definition**       | Bundling data and methods into a class, controlling access. | Simplifying complex systems, focusing on essential details. |
| **Purpose**          | Hide internal details, provide controlled access to data. | Provide a simplified view, emphasizing essential characteristics. |
| **Access Control**   | Uses access modifiers (e.g., private, public) to control visibility. | Primarily focuses on exposing essential behaviors, not access control. |
| **Implementation**   | Private variables, getter/setter methods for data access. | Abstract classes, interfaces to define blueprints and contracts. |
| **Example**          | Bank account (hide balance, control deposits/withdrawals). | Car (focus on driving, hide engine/transmission complexities). |


comparison of methosHiding and overriding in a column format:


| Aspect                                       | Overriding Method (Runtime Polymorphism)         | Method Hiding (Compile-Time Polymorphism)    |
|----------------------------------------------|---------------------------------------------------|---------------------------------------------|
| **Method Type**                              | Both Parent and Child class methods should be non-static.   | Both Parent and Child class methods should be static. |
| **Method Resolution**                        | Method resolution is always taken care of by JVM based on the runtime object.  | Method resolution is always taken care of by the compiler based on the reference type. |
| **Terminology**                              | Overriding is also considered as runtime polymorphism (or) dynamic polymorphism (or) late binding. | Method hiding is also considered as compile-time polymorphism (or) static polymorphism (or) early binding. |

comparison of method overloading and method overriding presented in a column format:

| Property               | Overloading                                       | Overriding                                       |
|------------------------|--------------------------------------------------|--------------------------------------------------|
| **Method Names**      | Must be the same.                                | Must be the same.                                |
| **Argument Types**    | Must be different (at least in order).           | Must be the same, including order.               |
| **Method Signature**  | Must be different.                               | Must be the same.                               |
| **Return Types**      | No restrictions (until Java 1.4), co-variant return types allowed from 1.5 onwards. | Must be the same (until Java 1.4), co-variant return types allowed from 1.5 onwards. |
| **Private, Static, Final Methods** | Can be overloaded.                        | Cannot be overridden.                            |
| **Access Modifiers**  | No restrictions.                                 | Access weakening/reduction is not allowed.       |
| **Throws Clause**     | No restrictions.                                 | Checked exceptions in child class must match or be a subclass of those thrown by the parent class, but no restrictions for unchecked exceptions. |
| **Method Resolution**  | Always taken care of by the compiler based on the reference type. | Always taken care of by the JVM based on the runtime object. |
| **Also Known As**     | Compile-time polymorphism (or) static (or) early binding. | Runtime polymorphism (or) dynamic (or) late binding. |

This table summarizes the key differences between method overloading and method overriding based on various properties and characteristics.