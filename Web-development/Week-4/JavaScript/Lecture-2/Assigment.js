// Q1. Get the first n elements of an array

let arr = [7, 9, 0, -2];
let n = 3;

console.log("First", n, "elements:", arr.slice(0, n));


// Q2. Get the last n elements of an array

console.log("Last", n, "elements:", arr.slice(arr.length - n));


// Q3. Check whether a string is blank or not

let str = "";

if (str.length === 0) {
    console.log("String is blank");
} else {
    console.log("String is not blank");
}




// Q4. Check whether the character at the given index is lowercase

let text = "ApnaCollege";
let index = 4;

if (text[index] === text[index].toLowerCase()) {
    console.log("Character is lowercase");
} else {
    console.log("Character is not lowercase");
}


// Q5. Strip leading and trailing spaces from a string

let message = "   Hello JavaScript   ";

console.log("Before Trim:", message);
console.log("After Trim:", message.trim());



// Q6. Check if an element exists in an array

let numbers = [10, 20, 30, 40, 50];
let element = 30;

if (numbers.includes(element)) {
    console.log("Element exists in the array");
} else {
    console.log("Element does not exist in the array");
}



// Output
// First 3 elements: [7, 9, 0]
// Last 3 elements: [9, 0, -2]
// String is blank
// Character is lowercase
// Before Trim:    Hello JavaScript   
// After Trim: Hello JavaScript
// Element exists in the array