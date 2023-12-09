var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var x = 100;
x = 1000;
//x = "Hello"; 
console.log(x);
// Type annotations
var age = 30;
var name1 = "John";
var isStudent = true;
// Creating an object using the interface
var person = {
    firstName: "Jane",
    lastName: "Doe",
    age: 25,
};
// Function with type annotations
function greet(name) {
    return "Hello, ".concat(name, "!");
}
var greeting = greet("Aarchie");
console.log(greeting);
// Enums
var Color;
(function (Color) {
    Color[Color["Red"] = 0] = "Red";
    Color[Color["Green"] = 1] = "Green";
    Color[Color["Blue"] = 2] = "Blue";
})(Color || (Color = {}));
var favoriteColor = Color.Green;
console.log(favoriteColor);
console.log(typeof (favoriteColor));
//   Classes and Inheritance
var Animal = /** @class */ (function () {
    function Animal(name) {
        this.name = name;
    }
    Animal.prototype.makeSound = function () {
        console.log("Some general sound");
    };
    return Animal;
}());
var Dog = /** @class */ (function (_super) {
    __extends(Dog, _super);
    function Dog(name, breed) {
        var _this = _super.call(this, name) || this;
        _this.breed = breed;
        return _this;
    }
    Dog.prototype.makeSound = function () {
        console.log("Woof!");
    };
    return Dog;
}(Animal));
var dog = new Dog("Chilly", "Indie");
console.log(dog.name);
dog.makeSound();
// numbers
var hexaDec = 0X12B;
var octal = 44;
var binary = 10;
var price = 79.30;
console.log(hexaDec);
