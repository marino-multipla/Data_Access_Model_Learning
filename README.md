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
They move data back and forth between objects and database records



