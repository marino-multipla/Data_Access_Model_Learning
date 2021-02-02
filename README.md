# Data_Access_Model_Learning
This repository contains an overview on Data Access Model DAO

Data access object(https://en.wikipedia.org/wiki/Data_access_object)

In computer software, a data access object (DAO) is a pattern that provides an abstract interface to some type of database or other persistence mechanism.
By mapping application calls to the persistence layer, the DAO provides some specific data operations without exposing details of the database. 
This isolation supports the single responsibility principle. 
It separates what data access the application needs, in terms of domain-specific objects and data types (the public interface of the DAO), 
from how these needs can be satisfied with a specific DBMS, database schema, etc. (the implementation of the DAO). 
All details of storage are hidden from the rest of the application (see information hiding). 
Thus, possible changes to the persistence mechanism can be implemented by just modifying one DAO implementation while 
the rest of the application isn't affected.
DAOs act as an intermediary between the application and the database. 
They move data back and forth between objects and database records.

Single-responsibility principle(https://en.wikipedia.org/wiki/Single-responsibility_principle)
Martin defines a responsibility as a reason to change, and concludes that a class or module should have one, and only one, reason to be changed (e.g. rewritten).

As an example, consider a module that compiles and prints a report.
Imagine such a module can be changed for two reasons. 
First, the content of the report could change. 
Second, the format of the report could change. 
These two things change for very different causes; one substantive, and one cosmetic. 
The single-responsibility principle says that these two aspects of the problem are really two separate responsibilities, 
and should, therefore, be in separate classes or modules. 
It would be a bad design to couple two things that change for different reasons at different times.

The reason it is important to keep a class focused on a single concern is that it makes the class more robust. 

Continuing with the foregoing example, if there is a change to the report compilation process, 
there is a greater danger that the printing code will break if it is part of the same class. 

Information Hiding (https://en.wikipedia.org/wiki/Information_hiding)
Encapsulation
In his book on object-oriented design, Grady Booch defined encapsulation as 
the process of compartmentalizing the elements of an abstraction that constitute its structure and behavior; 
encapsulation serves to separate the contractual interface of an abstraction and its implementation.

The purpose is to achieve the potential for change: the internal mechanisms of the component can be improved without impact on other components, or the component can be replaced with a different one that supports the same public interface. Encapsulation also protects the integrity of the component, by preventing users from setting the internal data of the component into an invalid or inconsistent state. Another benefit of encapsulation is that it reduces system complexity and thus increases robustness, by limiting the interdependencies between software components.

Example of information hiding
Information hiding serves as an effective criterion for dividing any piece of equipment, software, or hardware, into modules of functionality. For instance, a car is a complex piece of equipment. In order to make the design, manufacturing, and maintenance of a car reasonable, the complex piece of equipment is divided into modules with particular interfaces hiding design decisions. By designing a car in this fashion, a car manufacturer can also offer various options while still having a vehicle that is economical to manufacture.

For instance, a car manufacturer may have a luxury version of the car as well as a standard version. The luxury version comes with a more powerful engine than the standard version. The engineers designing the two different car engines, one for the luxury version and one for the standard version, provide the same interface for both engines. Both engines fit into the engine bay of the car which is the same between both versions. Both engines fit the same transmission, the same engine mounts, and the same controls. The differences in the engines are that the more powerful luxury version has a larger displacement with a fuel injection system that is programmed to provide the fuel-air mixture that the larger displacement engine requires. 

As can be seen by this example, information hiding provides flexibility. This flexibility allows a programmer to modify the functionality of a computer program during normal evolution as the computer program is changed to better fit the needs of users. When a computer program is well designed decomposing the source code solution into modules using the principle of information hiding, evolutionary changes are much easier because the changes typically are local rather than global changes. 





