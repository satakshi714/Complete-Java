/*
========================================
JAVASCRIPT PRACTICE FILE (FULL EXECUTION)
========================================

Run this with your HTML file open.
Open console to see outputs.

Flow:
Basics → Types → Operators → Control → Functions → Arrays → Objects → Async → DOM
*/


// =====================
// 1. VARIABLES
// =====================
console.log("=== VARIABLES ===");

var a = 10;
let b = 20;
const c = 30;

console.log(a, b, c);


// =====================
// 2. DATA TYPES
// =====================
console.log("\n=== DATA TYPES ===");

let num = 10;
let str = "hello";
let bool = true;
let und;
let nul = null;

console.log(typeof num, typeof str, typeof bool, typeof und, typeof nul);


// =====================
// 3. TYPE COERCION
// =====================
console.log("\n=== TYPE COERCION ===");

console.log("5" + 2);  // 52
console.log("5" - 2);  // 3


// =====================
// 4. TRUTHY / FALSY
// =====================
console.log("\n=== TRUTHY FALSY ===");

console.log(Boolean(0));
console.log(Boolean(""));
console.log(Boolean("hi"));
console.log(Boolean([]));
console.log(Boolean({}));


// =====================
// 5. OPERATORS
// =====================
console.log("\n=== OPERATORS ===");

console.log(10 > 5);
console.log(10 === "10");
console.log(10 == "10");

console.log(10 < 20 || "hi");
console.log(10 < 20 && "hi");


// =====================
// 6. CONTROL FLOW
// =====================
console.log("\n=== CONTROL FLOW ===");

let marks = 75;

if (marks > 90) console.log("A");
else if (marks > 60) console.log("B");
else console.log("C");


// =====================
// 7. LOOPS
// =====================
console.log("\n=== LOOPS ===");

for (let i = 0; i < 3; i++) {
    console.log("for:", i);
}

let i = 0;
while (i < 2) {
    console.log("while:", i);
    i++;
}


// =====================
// 8. FUNCTIONS
// =====================
console.log("\n=== FUNCTIONS ===");

function greet(name) {
    return "Hello " + name;
}

console.log(greet("Sam"));

// Arrow
let sum = (a, b) => a + b;
console.log(sum(10, 20));

// Callback
function operate(a, b, fn) {
    return fn(a, b);
}
console.log(operate(10, 5, (x, y) => x - y));


// =====================
// 9. HOISTING
// =====================
console.log("\n=== HOISTING ===");

console.log(x);
var x = 5;


// =====================
// 10. ARRAYS
// =====================
console.log("\n=== ARRAYS ===");

let arr = [10, 20, 30];

arr.push(40);
console.log(arr);

arr.forEach(val => console.log("forEach:", val));

let mapped = arr.map(v => v * 2);
console.log("map:", mapped);

let filtered = arr.filter(v => v > 20);
console.log("filter:", filtered);


// =====================
// 11. OBJECTS
// =====================
console.log("\n=== OBJECTS ===");

let obj = {
    name: "Sam",
    age: 25,
    greet() {
        return "Hi " + this.name;
    }
};

console.log(obj.name);
console.log(obj.greet());

for (let key in obj) {
    console.log(key, obj[key]);
}


// =====================
// 12. DESTRUCTURING
// =====================
console.log("\n=== DESTRUCTURING ===");

let [d1, d2] = [100, 200];
console.log(d1, d2);

let { name } = obj;
console.log(name);


// =====================
// 13. SPREAD & REST
// =====================
console.log("\n=== SPREAD & REST ===");

let arr2 = [...arr];
console.log(arr2);

function restDemo(...args) {
    console.log(args);
}
restDemo(1, 2, 3);


// =====================
// 14. PROMISE
// =====================
console.log("\n=== PROMISE ===");

let p = new Promise((res, rej) => {
    res("Success");
});

p.then(data => console.log(data));


// =====================
// 15. FETCH API
// =====================
console.log("\n=== FETCH ===");

fetch("https://dummyjson.com/products")
    .then(res => res.json())
    .then(data => {
        console.log("Product:", data.products[0].title);

        document.getElementById("output").innerText =
            data.products[0].title;
    });


// =====================
// 16. ASYNC / AWAIT
// =====================
async function load() {
    let res = await fetch("https://dummyjson.com/products");
    let data = await res.json();
    console.log("Async:", data.products[1].title);
}
load();


// =====================
// 17. DOM
// =====================
console.log("\n=== DOM ===");

let el = document.getElementById("output");
el.style.color = "yellow";


// =====================
// 18. EVENTS
// =====================
console.log("\n=== EVENTS ===");

let btn = document.getElementById("btn");

btn.addEventListener("click", () => {
    alert("Clicked!");
});