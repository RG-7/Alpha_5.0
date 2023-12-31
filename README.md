﻿# Java Programming Concepts

Welcome to the Java Programming Concepts repository! This comprehensive guide covers fundamental and advanced topics in Java programming. Whether you're a beginner seeking to grasp the basics or an experienced developer diving into advanced concepts, this resource caters to your learning needs.

## Table of Contents

1. [Variables & Data Types](#1-variables--data-types)
2. [Time & Space Complexity](#2-time--space-complexity)
3. [Operators](#3-operators)
4. [ArrayLists](#4-arraylists)
5. [if-else Statements](#5-if-else-statements)
6. [Linked Lists](#6-linked-lists)
7. [Flow Control (Loops)](#7-flow-control-loops)
8. [Stacks](#8-stacks)
9. [Patterns](#9-patterns)
10. [Queues](#10-queues)
11. [Functions & Methods](#11-functions--methods)
12. [Greedy Algorithms](#12-greedy-algorithms)
13. [Arrays](#13-arrays)
14. [Binary Trees](#14-binary-trees)
15. [Sorting Algorithms](#15-sorting-algorithms)
16. [Binary Search Trees](#16-binary-search-trees)
17. [2D Arrays](#17-2d-arrays)
18. [Heaps/Priority Queues](#18-heapspriority-queues)
19. [Strings](#19-strings)
20. [Hashing](#20-hashing)
21. [Bit Manipulation](#21-bit-manipulation)
22. [Tries](#22-tries)
23. [OOPs](#23-oops)
24. [Graphs](#24-graphs)
25. [Recursion](#25-recursion)
26. [Dynamic Programming](#26-dynamic-programming)
27. [Divide & Conquer](#27-divide--conquer)
28. [Segment Trees](#28-segment-trees)

## 1. Variables & Data Types
Variables store data in Java. Learn about primitive data types (int, double, char) and objects (String, etc.). Examples:

```java
int age = 25;
double price = 29.99;
char grade = 'A';
String name = "John";
```

## 2. Time & Space Complexity
Understand the efficiency of algorithms in terms of time and space. Big O notation measures complexity. Examples:

```java
// O(1) - Constant Time
int getFirstElement(int[] array) {
    return array[0];
}

// O(n) - Linear Time
void printArray(int[] array) {
    for (int num : array) {
        System.out.print(num + " ");
    }
}
```

## 3. Operators
Java provides various operators for mathematical, logical, and bitwise operations. Examples:

```java
int a = 5, b = 3;
int sum = a + b;
boolean isEqual = (a == b);
```

## 4. ArrayLists
ArrayList is a dynamic array implementation in Java. Learn to use ArrayList for dynamic storage:

```java
import java.util.ArrayList;

ArrayList<String> names = new ArrayList<>();
names.add("Alice");
names.add("Bob");
```

## 6. Linked Lists
Linked lists are fundamental data structures. Learn about singly and doubly linked lists in Java:

```java
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Example of creating a linked list
Node head = new Node(1);
head.next = new Node(2);
head.next.next = new Node(3);
```

## 7. Flow Control (Loops)
Explore flow control in Java using loops (for, while, do-while). Examples:

```java
// For loop
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}

// While loop
int j = 0;
while (j < 5) {
    System.out.println(j);
    j++;
}
```

## 8. Stacks
Learn about the stack data structure and its implementation in Java:

```java
import java.util.Stack;

Stack<Integer> stack = new Stack<>();
stack.push(1);
stack.push(2);
int top = stack.pop(); // Removes and returns the top element (2)
```

## 9. Patterns
Explore various pattern printing in Java:

```java
// Print a pyramid pattern
int n = 5;
for (int i = 0; i < n; i++) {
    for (int j = 0; j < n - i - 1; j++)
        System.out.print(" ");
    for (int k = 0; k <= i; k++)
        System.out.print("* ");
    System.out.println();
}
```

## 10. Queues
Understand the concept of queues and their implementation in Java:

```java
import java.util.LinkedList;
import java.util.Queue;

Queue<String> queue = new LinkedList<>();
queue.add("Apple");
queue.add("Banana");
String frontElement = queue.peek(); // Retrieves but does not remove the head of the queue
```

## 11. Functions & Methods
Explore creating functions and methods in Java:

```java
// Function without parameters and return type
void greet() {
    System.out.println("Hello, welcome!");
}

// Method with parameters and return type
int add(int a, int b) {
    return a + b;
}
```

## 12. Greedy Algorithms
Learn about greedy algorithms and their application in problem-solving:

```java
// Example: Fractional Knapsack Problem
// (Pseudo-code)
sortItemsByRatio(); // Sort items by value-to-weight ratio
for (Item item : sortedItems) {
    if (item.weight <= remainingCapacity) {
        takeWholeItem(item);
        remainingCapacity -= item.weight;
    } else {
        takeFractionalItem(item, remainingCapacity);
        break;
    }
}
```

## 13. Arrays
Arrays are fundamental data structures in Java. Learn about one-dimensional and multi-dimensional arrays:

```java
// One-dimensional array
int[] numbers = {1, 2, 3, 4, 5};

// Two-dimensional array
int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
```

## 14. Binary Trees
Understand binary trees and their traversal in Java:

```java
class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

// Example of creating a binary tree
Node root = new Node(1);
root.left = new Node(2);
root.right = new Node(3);
```

## 15. Sorting Algorithms
Explore common sorting algorithms in Java, such as Bubble Sort, Selection Sort, and Merge Sort:

```java
// Example of Bubble Sort
void bubbleSort(int[] array) {
    int n = array.length;
    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (array[j] > array[j + 1]) {
                // Swap elements
                int temp = array[j];
                array[j] = array[j + 1];
                array[j + 1] = temp;
            }
        }
    }
}
```

## 16. Binary Search Trees
Learn about Binary Search Trees (BST) and their operations in Java:

```java
class TreeNode {
    int key;
    TreeNode left, right;

    public TreeNode(int item) {
        key = item;
        left = right = null;
    }
}

// Example of inserting a key into a BST
TreeNode insert(TreeNode root, int key) {
    if (root == null) {
        root = new TreeNode(key);
        return root;
    }
    if (key < root.key)
        root.left = insert(root.left, key);
    else if (key > root.key)
        root.right = insert(root.right, key);
    return root;
}
```

## 17. 2D Arrays
Learn about two-dimensional arrays and their applications in Java:

```java
// Creating a 2D array
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};

// Accessing elements in a 2D array
int element = matrix[1][2]; // Retrieves the element in the second row, third column (6)
```

## 18. Heaps/Priority Queues
Understand heaps and priority queues in Java:

```java
import java.util.PriorityQueue;

PriorityQueue<Integer> minHeap = new PriorityQueue<>();
minHeap.add(5);
minHeap.add(3);
minHeap.add(7);
int minElement = minHeap.poll(); // Retrieves and removes the minimum element (3)
```

## 19. Strings
Explore string manipulation and operations in Java:

```java
// Creating strings
String str1 = "Hello";
String str2 = new String("World");

// Concatenating strings
String result = str1 + " " + str2; // "Hello World"
```

## 20. Hashing
Learn about hashing and hash functions in Java:

```java
import java.util.HashMap;

// Creating a hash map
HashMap<String, Integer> hashMap = new HashMap<>();
hashMap.put("apple", 3);
hashMap.put("banana", 5);
int bananaCount = hashMap.get("banana"); // Retrieves the value associated with "banana" (5)
```

## 21. Bit Manipulation
Explore bit manipulation operations in Java:

```java
int x = 5; // Binary: 101
int y = 3; // Binary: 011

// Bitwise AND
int resultAnd = x & y; // 1 (Binary: 001)

// Bitwise OR
int resultOr = x | y; // 7 (Binary: 111)

// Bitwise XOR
int resultXor = x ^ y; // 6 (Binary: 110)
```

## 22. Tries
Learn about Tries (prefix trees) and their applications in Java:

```java
class TrieNode {
    TrieNode[] children = new TrieNode[26];
    boolean isEndOfWord;
}

// Example of inserting a word into a Trie
void insert(TrieNode root, String word) {
    TrieNode current = root;
    for (char ch : word.toCharArray()) {
        int index = ch - 'a';
        if (current.children[index] == null)
            current.children[index] = new TrieNode();
        current = current.children[index];
    }
    current.isEndOfWord = true;
}
```

## 23. OOPs (Object-Oriented Programming)
Understand Object-Oriented Programming concepts in Java:

```java
// Example of creating a class
class Car {
    String make;
    String model;

    Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    void displayInfo() {
        System.out.println("Make: " + make + ", Model: " + model);
    }
}

// Creating an instance of the class
Car myCar = new Car("Toyota", "Camry");
myCar.displayInfo();
```

## 24. Graphs
Explore graph representation and traversal in Java:

```java
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

// Example of an undirected graph
class Graph {
    int vertices;
    ArrayList<LinkedList<Integer>> adjacencyList;

    Graph(int vertices) {
        this.vertices = vertices;
        adjacencyList = new ArrayList<>(vertices);
        for (int i = 0; i < vertices; i++)
            adjacencyList.add(new LinkedList<>());
    }

    void addEdge(int source, int destination) {
        adjacencyList.get(source).add(destination);
        adjacencyList.get(destination).add(source);
    }

    void bfsTraversal(int startVertex) {
        // Implementation of Breadth-First Search (BFS)
    }
}

// Example of using the graph
Graph graph = new Graph(5);
graph.addEdge(0, 1);
graph.addEdge(0, 2);
graph.addEdge(1, 3);
graph.addEdge(2, 4);
graph.bfsTraversal(0);
```
## 25. Recursion
Understand recursion and recursive algorithms in Java:

```java
// Example of a recursive function to calculate factorial
int factorial(int n) {
    if (n == 0 || n == 1)
        return 1;
    else
        return n * factorial(n - 1);
}
```

## 26. Dynamic Programming
Explore the concept of dynamic programming and its applications in Java:

```java
// Example of solving the Fibonacci sequence using dynamic programming
int fibonacci(int n) {
    int[] dp = new int[n + 1];
    dp[0] = 0;
    dp[1] = 1;
    for (int i = 2; i <= n; i++)
        dp[i] = dp[i - 1] + dp[i - 2];
    return dp[n];
}
```

## 27. Divide & Conquer
Learn about the divide and conquer strategy and its applications in Java:

```java
// Example of Merge Sort using divide and conquer
void mergeSort(int[] array, int left, int right) {
    if (left < right) {
        int mid = left + (right - left) / 2;
        mergeSort(array, left, mid);
        mergeSort(array, mid + 1, right);
        merge(array, left, mid, right);
    }
}

void merge(int[] array, int left, int mid, int right) {
    // Implementation of the merge operation
}
```

## 28. Segment Trees
Understand segment trees and their applications in Java:

```java
// Example of constructing a segment tree for range sum queries
class SegmentTree {
    int[] st;

    SegmentTree(int[] array, int n) {
        int x = (int) Math.ceil(Math.log(n) / Math.log(2));
        int max_size = 2 * (int) Math.pow(2, x) - 1;
        st = new int[max_size];
        constructST(array, 0, n - 1, 0);
    }

    int constructST(int[] array, int start, int end, int index) {
        // Implementation of constructing the segment tree
        return 0;
    }
}
```

...

## Contributing
Contributions are welcome! Feel free to enhance existing content, add new topics, or suggest improvements.

```
