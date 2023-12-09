let x: number = 100;
x = 1000;
//x = "Hello"; 
console.log(x);

// Type annotations
let age: number = 30;
let name1: string = "John";
let isStudent: boolean = true;

// Interfaces
interface Person {
  firstName: string;
  lastName: string;
  age: number;
}

// Creating an object using the interface
let person: Person = {
  firstName: "Jane",
  lastName: "Doe",
  age: 25,
};

// Function with type annotations
function greet(name: string): string {
    return `Hello, ${name}!`;
  }
  
  let greeting: string = greet("Aarchie");
  console.log(greeting);
  
  // Enums
enum Color {Red,Green,Blue,}
  
  let favoriteColor: Color = Color.Green;
  console.log(favoriteColor);
  console.log(typeof(favoriteColor));
  
//   Classes and Inheritance
  class Animal {
    constructor(public name: string) {}
    makeSound(): void {
      console.log("Some general sound");
    }
  }
  
  class Dog extends Animal {
    constructor(name: string, public breed: string) {
      super(name);
    }
    makeSound(): void {
      console.log("Woof!");
    }
  }
  
  let dog: Dog = new Dog("Chilly", "Indie");
  console.log(dog.name); 
  dog.makeSound(); 

// numbers
let hexaDec: number = 0X12B;
let octal: number = 0o54;
let binary: number = 0b1010;
let price: number = 79.30;

console.log(hexaDec);
  
