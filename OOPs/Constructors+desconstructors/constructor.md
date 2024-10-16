## constructor

<pre>
A constructor is a special member function automatically called when an object is created. In C++, the constructor is automatically 
called when an object is created. It is a special class method because it does not have any return type. It has the same name as the 
class itself.
 
A constructor initializes the class data members with garbage value if we don’t put any value to it explicitly.
The constructor must be placed in the public section of the class because we want the class to be instantiated anywhere. For every object in its lifetime constructor is called only once at the time of creation.
 
Example:![image](https://github.com/user-attachments/assets/170b62c3-c08f-4b81-be01-d9d0f2834971)


Here, the function class_name() is a constructor of the class ‘class_name’. Notice that the constructor
• has the same name as the class,
• does not have any return type, and
• it is public
 
If we do not specify a constructor, the C++ compiler generates a default constructor for an object 
(which expects no parameters and has an empty body).

</pre>


```c++
class class_name
{    
int data_member1;    
string data_member2;        
//creating constructor    
public:    
class_name()
{        
// initialize data members with garbage value    
}
}![image](https://github.com/user-attachments/assets/b709b799-f364-4b97-ad58-e17d7cbb59a0)

```

---


<pre>
  Types of Constructors:
 
There are three types of constructors in C++:
• Default constructor
• Parameterized Constructor
• Copy Constructor
</pre>


---

<pre>
Default constructor:- 
 
A constructor that doesn't take any argument or has no parameters is known as a default constructor. In the example above, class_name() 
is a default constructor.
 
Syntax:

class class_name{  
  
int data_member1;    
string data_member2;        
//default constructor 
   
public:    
class_name()
{        
// initializing data members with their default values        
data_member1 = 69;        
data_member2 = "Coding Ninjas";    
}
};
 
Here, the class_name() constructor will be called when the object is created. This sets the data_member1 variable of the object to 69 
and the data_member2 variable of the object to “Coding Ninjas”.
 
Note: If we have not defined a constructor in our class, the C++ compiler will automatically create a default constructor with an empty 
code and no parameters, which will initialize data members with garbage values.
 
When we write our constructor explicitly, the inbuilt constructor will not be available for us.

</pre>

---

<pre>
Parameterized Constructor:-
 
This is another type of Constructor with parameters. The parameterized constructor takes its arguments provided by the programmer. 
These arguments help initialize an object when it is created.
 
To create a parameterized constructor, simply add parameters to it the way you would to any other function. When defining the
constructor’s body, use the parameters to initialize the object. 
 
Using this Constructor, you can provide different values to data members of different objects by passing the appropriate values as 
arguments.
 
Syntax:

class class_name {
    int data_member1;
    string data_member2;
    // parameterized constructor
public:
    class_name(int num, string str) {
        // initializing data members with values provided
        data_member1 = num;
        data_member2 = str;
    }
};
 
Here, we have created a parameterized constructor class_name() that has 2 parameters: int num and string str. The values contained in these parameters are used to initialize the member variables data_member1 and data_member2.

</pre>

---

<pre>
  @this
Purpose: A pointer to the current object instance.
Usage: Used within member functions to refer to the instance of the object on which the function is called.
@this
This->prop is same as  *(this).prop![image](https://github.com/user-attachments/assets/b217297d-5148-499b-b9a6-f16629eb4818)

</pre>


<img width="450" alt="image" src="https://github.com/user-attachments/assets/abe8d490-800a-46c4-9ba0-83c9be9116ef">


<pre>
  name=name; mae kon sa parameter name h ar kon sa class ka name h iss
Chiz ko distinguish krne ke liye this keyword use krte h 
This->name mtlab ye name class ka name h 

"This" obj ke address ko store kr ke rkta h 
![image](https://github.com/user-attachments/assets/9748083c-916c-4416-9a78-da2834c8108a)

</pre>

<p>
  this Pointer
 
this pointer holds the address of the current object. In simple words, you can say that this pointer points to the current object of 
the class. 
 
There can be three main usages of this keyword in C++.
• It can be used to refer to a current class instance variable.
• It can be used to pass the current object as a parameter to another method.
• It can be used to declare indexers.
 
Let’s take an example to understand this concept.

</p>

```c++
#include <bits/stdc++.h>
using namespace std;
class mobile
{
    string model;
    int year_of_manufacture;
    
public:
    void set_details(string model, int year_of_manufacture)
    {
        this->model = model;
        this->year_of_manufacture = year_of_manufacture;
    }
    
    void print()
    {
        cout << this->model << endl;
        cout << this->year_of_manufacture << endl;
    }
};
int main()
{
    mobile redmi;
    redmi.set_details("Note 7 Pro", 2019);
    redmi.print();
}
 
Output:
Note 7 Pro2019
 
//Here you can see that we have two data members model and year_of_manufacture. In member function set_details(), we have two local
//variables with the same name as the data members’ names. Suppose you want to assign the local variable value to the data members. In
//that case, you won’t be able to do until unless you use this pointer because the compiler won’t know that you are referring to the
//object’s data members unless you use this pointer. This is one of example where you must use this pointer.
```

<pre>
  Constructor Overloading
 
Constructor overloading can be defined as the concept of having more than one constructor with different parameters so that every 
constructor can perform a different task.
 
As there is a concept of function overloading, similarly constructor overloading is applied when we overload a constructor more than a purpose.
The declaration is the same as the class name, but there is no return type as they are constructors.
 
The criteria to overload a constructor is to differ the number of arguments or the type of arguments. The corresponding constructor is 
called depending on the number and type of arguments passed.

</pre>
  
```c++
class smartphone {    
    // Data Members (Properties)    
    string model;    
    int year_of_manufacture;    
    bool _5g_supported;        
public:    
    // Constructor with 0 parameter   
    smartphone() {       
        model = "unknown";        
        year_of_manufacture = 0;        
        _5g_supported = false;   
    }     
    // Constructor with 2 parameters   
    smartphone(string model_string, bool _5g_) {        
        model = model_string;       
        _5g_supported = _5g_;    
    }    
    // Constructor with 3 parameters    
    smartphone(string model_string, int manufacture, bool _5g_) {        
        // Initializing data members        
        model = model_string;        
        year_of_manufacture = manufacture;        
        _5g_supported = _5g_;    
    }
};
int main() {    
    // Creating objects of smartphone class        
    // Using constructor with 0 parameters    
    smartphone unknown;        
    // Using constructor with 2 parameters    
    smartphone redmi("Note 7 Pro", false);
    // Using constructor with 3 parameters    
    smartphone iphone("iphone 11", 2019, false);
}
```





<pre>
  inline constructor
An inline constructor in C++ refers to defining a constructor directly within the class definition, which implicitly suggests that the compiler should try to expand the constructor "inline" to optimize performance by avoiding the overhead of a function call.

Key Points:
	1. Inline Suggestion: The constructor Rectangle(int w, int h) is defined within the class body, making it inline by default.
	2. Optimization: The inline keyword is a suggestion to the compiler, not a command. The compiler may ignore the request if inlining isn't beneficial (e.g., if the constructor is too complex).
	3. Efficiency: Inlining functions can improve efficiency by reducing the function call overhead, though it's typically beneficial for small functions like constructors.

</pre>

```c++
#include <iostream>
class Rectangle {
    int width, height;
    
public:
    // Inline constructor defined within the class
    Rectangle(int w, int h) : width(w), height(h) {}
    // Member function to calculate the area
    int area() {
        return width * height;
    }
};
int main() {
    Rectangle rect(10, 5);
    std::cout << "Area: " << rect.area() << std::endl;
    return 0;
}
```

---

<pre>
  Copy Constructor:-
 
These are a particular type of constructor that takes an object as an argument and copies values of one object’s data members into 
another object. We pass the class object into another object of the same class in this constructor. As the name suggests, you Copy 
means to copy the values of one Object into another Object of Class. This is used for Copying the values of a class object into another 
object of a class, so we call them Copy constructor and for copying the values.
 
We have to pass the object’s name whose values we want to copy, and when we are using or passing an object to a constructor, we must 
use the & ampersand or address operator.
 
</pre>

```c++
#include <iostream>
using namespace std;
class Example {
public:
    int x;
    // Default constructor
    Example(int a) : x(a) {}
    // Copy constructor
    Example(const Example &obj) {
        x = obj.x;
        cout << "Copy constructor called" << endl;
    }
};
int main() {
    Example obj1(10);      // Calls default constructor
    Example obj2 = obj1;   // Calls copy constructor
    cout << "obj2.x = " << obj2.x << endl;
    return 0;
}
Output
Copy constructor called 
obj2.x = 10
```

<pre>
  Why Pass by Reference in the Copy Constructor?
Passing by reference is necessary in the copy constructor for several reasons:
	1. Avoid Infinite Recursion: If the argument is passed by value (i.e., ClassName old_obj), it would call the copy constructor again 
  to pass old_obj to the copy constructor, leading to infinite recursion and a stack overflow. Passing by reference prevents this 
  because it passes a reference to the original object, avoiding another copy constructor call.
	
  2. Efficiency: Passing objects by reference avoids copying the entire object, which can be inefficient, especially for large objects. 
  By passing a reference, you directly use the original object, making it faster and less resource-intensive.
	
  3. Const Reference: The const keyword ensures that the original object won't be modified inside the copy constructor, maintaining the 
  integrity of the original object. This is essential because the purpose of a copy constructor is to make a copy, not modify the 
  original.

</pre>


```c++
class class_name {
    int data_member1;
    string data_member2;
    // copy constructor
public:
    class_name(class_name& obj) {
        // copies data of the obj parameter
        data_member1 = obj.data_member1;
        data_member2 = obj.data_member2;
    }
};
In this program,
    we have used a copy constructor to copy the contents of one object of
        the class ‘class_name’ to another.The code of the copy constructor is
    : class_name(class_name& obj) {
    // copies data of the obj parameter
    data_member1 = obj.data_member1;
    data_member2 = obj.data_member2;
}
 
If we don’t define our own copy constructor, the C++ compiler creates a default copy constructor for each class which does a memberwise copy between objects.
 
Example using smartphone class:

class smartphone {
    // Data Members(Properties)
    string model;
    int year_of_manufacture;
    bool _5g_supported;
public:
    // Default constructor
    smartphone() {
        model = "unknown";
        year_of_manufacture = 0;
        _5g_supported = false;
    }
    // Parameterized constructor
    smartphone(string model_string, int manufacture, bool _5g_) {
        // Initialising data members
        model = model_string;
        year_of_manufacture = manufacture;
        _5g_supported = _5g_;
    }
    // Copy constructor
    smartphone(smartphone& obj) {
        // Copies data of the obj parameter
        model = obj.model;
        year_of_manufacture = obj.year_of_manufacture;
        _5g_supported = obj._5g_supported;
    }
};
int main() {
    // Creating objects of smartphone class
    // Using default constructor
    smartphone unknown;
    // Using parameterized constructor
    smartphone iphone("iphone 11", 2019, false);
    // Using copy constructor
    smartphone iphone_2(iphone);
}
```
































