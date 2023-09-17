ABSTRACTION
 Hide internal implementation and just highlight the set of services, is called 
abstraction.
 By using abstract classes and interfaces we can implement abstraction.
Real-Life Example:

Consider a common real-life example of abstraction: a remote control for a television. The remote control abstracts the complex functionality of the television into a simple interface with a few buttons (like power, volume, and channel buttons). Users do not need to understand the inner workings of the television to use the remote control effectively; they only interact with the abstracted buttons.

In this example:

The television is like the abstract class or interface, representing the underlying functionality.
The remote control is like the abstraction. It provides a simplified interface (the buttons) to interact with the television.
The buttons on the remote control are similar to the abstract methods defined in an abstract class or interface. They represent actions that can be performed (e.g., changing channels or adjusting volume).
By using the remote control, users can abstract away the complexity of the television and perform actions without needing to know how the television's internal circuits and components work. This is a practical application of abstraction in everyday life and can be related to the concept of abstraction in Java and OOP.


In this code:

We define an interface RemoteControl that specifies the methods a remote control should have: powerOnOff, changeChannel, and adjustVolume.

We create a Television class that implements the RemoteControl interface. It represents a television with methods to power it on/off, change channels, and adjust the volume.