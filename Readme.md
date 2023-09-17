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