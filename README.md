# Java_week_4

Create a  public class named Publication. It should contain:
[1 point] private fields + getters + setters for: Title (a string), Price (a decimal).

[1 point] two constructors (a default and a non-default one).

[1 point] A method toString (that returns a string value containing the values of the two fields)


[1 points] Then, a public class  called Book derived from Publication. It should contain:

[1 point] private fields + getters + setters for: ISBN (a string), Author (a string).

[1 point] Two constructors (a default and a non-default one).
Hint: make use of base!

[1 point] A method toString (that returns a string value containing the values of the two fields from this class and the two field from the base class!)
Hint: make use of base!


Create a public class called Library that contains: 

[1 point] a private field, call it Books, an array with 5 Book objects. 

[1 point] a method public Book get(int index) that will return each a book from the array Books defined above.

[1 point] a default constructor (use this to initialize/put some Books with values of your choice) into Books. 


In Main
create an instance of the class Library. 

[1 point] use a for loop to go over each book from the library and display to the console the results of the toString method called on each Book object.
