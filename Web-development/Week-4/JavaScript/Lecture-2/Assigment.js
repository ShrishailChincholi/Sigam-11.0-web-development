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