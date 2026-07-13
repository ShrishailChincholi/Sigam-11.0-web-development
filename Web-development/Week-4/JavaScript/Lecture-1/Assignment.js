// Q1. Check if a number is divisible by 10

let num = 50;

if (num % 10 === 0) {
    console.log("good");
} else {
    console.log("bad");
}


// Q2. Take user's name & age as input and display using template literals

let name = prompt("Enter your name:");
let age = prompt("Enter your age:");

alert(`${name} is ${age} years old.`);


// Q3. Print months in a quarter using switch statement

let quarter = 2;

switch (quarter) {
    case 1:
        console.log("January, February, March");
        break;

    case 2:
        console.log("April, May, June");
        break;

    case 3:
        console.log("July, August, September");
        break;

    case 4:
        console.log("October, November, December");
        break;

    default:
        console.log("Invalid Quarter");
}
