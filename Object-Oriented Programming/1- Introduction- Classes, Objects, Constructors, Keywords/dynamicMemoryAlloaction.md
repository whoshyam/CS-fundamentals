# Dynamic Memory Allocation in Java

Dynamic Memory Allocation in Java is the process of allocating memory to objects and data structures during the runtime of a program, rather than at compile time. Java manages memory dynamically with the help of the Java Virtual Machine (JVM). Here's an overview of how it works:

## Key Concepts

1. **Heap Memory**:
   - This is the region where all Java objects are stored.
   - Memory for new objects is allocated on the heap.
   - Java's gař̌bage collector automatically reclaims heap memory when objects are no longer needed.

2. **Stack Memory**:
   - Stack memory is used for static memory allocation. It stores primitive data types and references to objects in heap memory.
   - Each thread has its own stack, which stores method frames (local variables, method calls, etc.).

3. **Garbage Collection**:
   - Java uses an automatic garbage collection mechanism to manage memory.
   - The garbage collector identifies and removes objects that are no longer referenced, freeing up memory.

4. **`new` Keyword**:
   - Memory is allocated for objects dynamically using the `new` keyword.
   - Example: `MyClass obj = new MyClass();` allocates memory for an object of `MyClass` on the heap.

5. **Memory Leaks**:
   - Though Java has garbage collection, memory leaks can still occur if objects are unintentionally kept in memory by references, even when they are no longer needed.

## Example

```java
public class Example {
    public static void main(String[] args) {
        // Dynamic memory allocation for an integer array
        int[] numbers = new int[5];  // Allocates memory for 5 integers
        
        // Dynamic memory allocation for an object
        MyClass obj = new MyClass(); // Allocates memory for a MyClass object

        // Memory for the array and object is managed by the JVM and will be freed when no longer referenced
    }
}

class MyClass {
    int x;
    String y;
    
    // Constructor
    MyClass() {
        x = 10;
        y = "Hello";
    }
}
