<pre>
Single Inheritance
Single inheritance is one in which the derived class inherits the single base class either public, private, or 
protected access specifier. In single inheritance, the derived class uses the features or members of the single 
base class. These base class members can be accessed by a derived class or child class according to the access 
specifier specified while inheriting the parent class or base class.
</pre>


```c++
// C++ program to illustrate Single Inheritance 
#include <iostream> 
using namespace std; 
class A { 
public: 
	int k = 1000; 
	float salary = 80000; 
}; 
class B : public A { 
public: 
	float bonus = 8000; 
	void ts() 
	{ 
		cout << "Total salary.." << (salary + bonus) 
			<< endl; 
	} 
}; 
int main() 
{ 
	B b1; 
	cout << "Salary:" << b1.salary << endl; 
	cout << "Bonus:" << b1.bonus << endl; 
	b1.ts(); 
	return 0; 
}
//Salary:80000
//Bonus:8000
//Total salary..88000

```

---
