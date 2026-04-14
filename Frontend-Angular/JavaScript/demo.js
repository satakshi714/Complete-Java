// Developerd by Brendan eich in 1995 by netscape navigator
// Later collaborated with ECMA(European Computer Manufacturer Association) to make it work for all the browsers.
// FIrst it was called mocha, then live script and then javascript to gain more popularity
// Current version ES21
// Most stable version ES6

// Application of JS-
// Multipage application
// Single page application
// Backend
// Desktop Application
// Game development
// AI/ML
// Mobile Application

// Run time environment - Platform to execute javascript code
// Browser (Client Side) - Window is an object present in broswer runtime environment.
// Non-Browser (Server Side) - Global object present in non-browser runtime environment.

// Features of JS-
// High level programming language
// Scripting(not-compiled) language - Subset of programming language
// Dynamic nature - It will identify thr type of data at runtime
// Losely typed - Don't need to specify the type of data.
// Interpreted - Line by line code execution.
// Single threaded - It will execute one task at a time.
// Blocking in nature - When one line is getting executed all the other lines will get blocked.
// Automatic garbage collecion - Automatically clears memory after use.
// Synchronus -Synchronous means code runs line by line, one at a time, in order. But with certain methods and functions it can be made asynchronus.
// Object based programming(Not oops) - All the things used in js are objects.

// Advantage
// Huge community support
// Versatile
// Fast in speed

// Disadvantages
// Weekly typed programming language - Automatically change the datatype.
// XSS(Cross Site Scripting) - Hackers can hack and change the data.

// Tokens - Smallest unit of program
// Types of token - 
// Identifiers - Name given by programmer
    // Must not be keyword
    // Not start with a number
    // Not contain any special characters and space except _ and $
    // Case sesitive
    
// Keywords - Predefined words which have their own meaning
// Literals - Values that are added by developer or programmer
// Operators - Predefined symbols used to perform operations on operands
// Separators/Punctuators - , : () {}
// Comments - Message to document inside program that does not affect the code (not a funtional token)
    // Single Line - //
    // Multi line - /*multiline text*/


// Variables - Containers to store data.
    // Var - All is possible( dec, init, etc)
    // let - all possible except redeclaration and redeclaration + reinitialization (ES6)
    // Const - only declaration+initialization possible(ES6)

    // Declaration - keyword identifier;
    // Initialization - identifier = literal;
    // Declaration + Initialization - keyword identifier = literal;
    // Redeclaration - Recreating same container with same identifier
    // Reinitialization - Using container with same identifier but different literal
    // Redeclaration + Reinitialization 

// Datatype
    // Primitive - Immutable, 
        // Number - Integer + Decimal
        var a = 10;
        console.log(a);
        console.log(typeof a);
        // String - "string" + 'string' + `string`-multiline string(template literal)
        var b = "String";
        console.log(b);
        console.log(typeof b);
        // boolean - true(1)/false(0)
        var c = true
        console.log(c);
        console.log(typeof c);
        // bigint - bigint cannot mix with other types
        var d = 10n;
        console.log(d);
        console.log(typeof d);
        // null - implicitly never returns null values.It is displayed by programmer in case of intentional absence of value.
        var e = null;
        console.log(e);
        console.log(typeof e);
        // undefined - When value is not initialized the value given by js is undefined
        var a = 10;
        console.log(a);
        console.log(typeof a);
        // Symbol - To uniquely identify values we use symbol
        var a = 10;
        console.log(a);
        console.log(typeof a);
    // Non-primitive - Mutable,
        // Function
        // Array
        // Object

// Hoisting - Hoisting is JavaScript’s behavior of moving declarations to the top of their scope before execution
// var = undefined, let/const = TDZ, functions fully hoisted
// TDZ - Temporal Dead Zone. Variable exists but you can't use it before declaration
// let and const comes under a script scope and not in global scope, thats why it give not reference error.
// Call stack is a stack (LIFO) where JavaScript keeps track of function calls during execution
// Callstack have 2 execution context
    // Global
        // Declaration - Hositing happens in declaration all the declarations are moved to top of the scope.
        // Execution phase - It will assign all the values we have to the declerations.
    // Functional
    // When we load a file in js a global exexution context in call stack and when a function is called  functional ec is in call stack when the function retruns something the fec is removed from call stack na d gec will remain After compeltion of js file gec is also removed form callstack.
// console.log(a); 
// var a = 10;
// output - undefined
// JS internally treats it like:
// var a;        // hoisted (moved up)
// console.log(a); // undefined
// a = 10;

// Debugger is a keyword that pauses your code execution so you can inspect what’s happening step by step.

// Truthy and falsy value - In JavaScript, every value is treated as either true (truthy) or false (falsy) in conditions.
//  Falsy values - 0, false, "", null, undefined, NaN, 0n
let val = Boolean(0);
console.log(val);



// Operators - Predefined symbols used to perform operations on operand
// Arithmetic - +, =, *,/,%, **
// Assignment - ==, +=, -=, *=, /=, %=
// Logical - &&, ||, !
// Comparision  - <, >, <=, >=, ==(checks only value), ===(checks value as well as datatype), !=(checks only value), !==(checks value as well as datatype)
// Unary - ++, --, typeof, delete
// Ternary - 
console.log(10 < 20 || "hii"); //true
console.log("hii" || 10 < 20 ); //hii
console.log(10 < 20 && "hii"); //hii
console.log("hii" && 10 < 20 ); //hii
console.log(10 === "10") //false 
console.log(10 == "10") //true
console.log(10 !== "10"); //true
console.log(10 != "10"); // false
console.log(10 + "hii") //10hi(concatenation)
console.log(10 - true);  // 9
console.log(10 - false); //10
console.log(10 - "hii") //NAN
console.log(10 - "20");  //-10 (example of weakly type - js automatically converts the datatype) - This is called Type Coercion
// Type Conversion - Developer changes the datatype explicitly
// Type Coersion - JS changes the datatype inplicitly

// Control Flow - Statements that control the flow of execution of program
    // if 
    // if else
    // if else if else
    // switch 

// Loops
    // for
    // while
    // ḍo while
    // for of
    // for in

// Funtion - Reusable block of code.
// by default every return value of every function is undefined.
    // Named function - Funtion with a name. Can be called using its name    
    let demo = () =>{
        console.log("hii");
    };
    console.log(demo()); 

    // Anonymous function - A function without a name. Used in: variables, callbacks, event handlers
    // (ES6) Arrow funtion (=>) - Less code than normal funtion, More readable, argument object is not present inside arrow function as it is in normal function
        // Value afetr the => is the return value.
        // One parameter - const square = x => x * x;
        // More than one parameter - const square = (x,y) => x * y;
    // Higer order function- A funtion which accepts another funtion as its parameter
    // Callback funtion - A function passed as an argument/callback is callback funtion
    // callabck and higer order funtion increase code reusability.
    function demo(a,b,c){ //higer order funtion
        console.log(a,b,c);
        console.log(c(a,b));
    }
    let add =(x,y) =>{ //callback funtion
        return x+y;
    };
    let sub =(x,y) =>{ //callback funtion
        return x-y;
    };
    let mul =(x,y) =>{ //callback funtion
        return x*y;
    };
    demo(10,20,add);  //or
    demo(10,30, (x,y)=> {   //callback funtion inside higher order function
        return x+y;
    });

    demo(30,20,sub);
    demo(10,30, (x,y)=> {   //callback funtion inside higher order function
        return x*y;
    });

    // Nested funtion
    // Closure - Whenever a child funtion want to acess teh variable of parent member. It will create a closure in the heap memory to store the variable
    function Bank(){
        let cb = 100;
        function credit(){
            let creditb = 500;
            function total(){
                let tb = cb + creditb;
                console.log(tb);
            }
        }
    }
    Bank();

    // Scope - Accesibility of a value. There are 3 types of scopes
        // Global - A variable in the program which can be accessed from anywhere is global (var, let, const)
        // Block - A variable that can be accessd only in a block.(let, const)
        // Funtional - A variable that can be accessd only in a funtion.(var)
        // Let and const have block scope
        // Var has funtional scope.

    // String Interpolation (``)(ES6)
    console.log(`this is addition of two numbers "10 + 10" = ${10+10}`);    
    console.log(`${10<20?"yes":"false"}`);    
    var name = "sam";
    var age = 12;
    console.log(`my name is ${name} and age is ${age}`);
    // All data types entered in string interpolation is converted in string

    // Properties and Methods
    // Properties are present inside an object
    // Methods are pre defined function
    var user = "  A-BC";
    console.log(user.length);
    console.log(user.toUpperCase());
    console.log(user.toLowerCase());
    console.log(user.split("-"));
    console.log(user.replace("-","!"));
    console.log(user.indexOf("C"));
    console.log(user.charCodeAt(2));
    console.log(user.at(2));
    console.log(user.includes('C'));
    console.log(user.trimStart());
    console.log(user.slice(0,3));
    console.log(user.substring(2,3));

//  object
// Object Methods

    let user = {
        name: "sam",
        age: 36,
        isAlive: false,
        salary:undefined,
        height: null,
        sub:["html", "css"],
        address:{
            state:"DC",
            pincode:345456
        }
    };

    console.log(user.address.pincode);

    console.log(Object.keys(user));
    console.log(Object.values(user));
    console.log(Object.entries(user));
    console.log(Object.seal(user));
    // user.address="NYC";

    console.log(Object.isSealed(user));
    Object.freeze(user);
    console.log(Object.isFrozen(user));

    //Nested object
    console.log(user.address.pincode);

// for of and for in
    // for of -  it is only holding the values. only for iterating, never goes into infinite loop
    let arr = [10,20,30,40,50, 60];
    console.log(arr);
    for(let a of arr){console.log(a);}
    // for in -  it holds the iteration index value. Wecan only iterate an object using for in. It will always return key/index of object or array. ALl the keys are stored in string.
    let arr1 = [10,20,30,40,50, 60];
    console.log(arr1);
    for(let a in arr1){console.log(a);}
     let obj = {
            username:"abc",
            lastname:"xyz",
            age:21
        }
        for(let a in obj){
            console.log(a);
        }

 // Rest - Packing (...a). It should be at the last. Stores in array(ES6)
    function demo(x,y,...a){
        console.log(x,a,y);
    }
    demo("hello", "hi", "bye");
// Spread - Unpack an array.(ES6)
    let ar1=[10,20,30,40,50];
    console.log(...ar1);

// Destructuring - Removing a structure and storing in a variable. It is usefyl in case of nested data.
let [a,b,b] = [10,20,30,40,50];
console.log(a,b,c);


// ES Module - Improves the code reusability. We can reuse functions of one file inside another
    // default module - there will be only one default export will be allowed
    // named module -

// Asyncronus JS - An asynchronous operation is a task that runs in the background and does not block the execution of the rest of the program (e.g., API calls, timers).
// Heap- Function Execution
// Micro tast - Promise
// Webs API - All the ApIs
// CallStack - 
// Macro task - Low priority asynchronus tasks
// First priority is always Synchronus Tasks and then Asnynchronus tasks
// In ansyc - First priority is promises then Low priority async tasks
// setTimeout - It will execute the block of code once after a set time
// setTimeout(callBack Function, how much time later we want to execute the funtion, function arguments)

setTimeout(()=>{
    console.log("timing function");
},5000)

function demo(){
    console.log("demo funtion");
}
setTimeout(demo, 10000);

let data=(a,b)=>{
    console.log("hello");
    console.log(a,b);
}
let a = 5;
console.log(a);
setTimeout(data,10000, "hi", "bye");
let b = 6;
console.log(b);
console.log(a);

// setInerval - it will execute the block of code after a certain time againa and again. It will also go itno infinite loop if not set time
// clearInterval - Method used to stop the execution of code
// setInterval(function, time, funtion arguments)

let count = 0;
let va = setInterval(()=>{
    console.log("interval function");
    console.log(count);
    if(count >= 10){
        clearInterval(va);
    }
    count++;
},0)

// Promise -  A Promise is an object in JavaScript that represents the eventual completion or failure of an asynchronous operation and its resulting value.
    // Pending - The Pending state means the promise is still executing and the result is not yet available.
    // Fulfilled/Resolved - The Fulfilled (Resolved) state means the promise has completed successfully and returned a value using resolve().
    // Reject - The Rejected state means the promise has failed and returned an error using reject().
    // .resolve() - A function used to mark the promise as fulfilled and pass the result to .then().
    // .reject() - A function used to mark the promise as rejected and pass the error to .catch().
    // .then() - A method used to handle the successful result of a promise.
    // .catch() - A method used to handle errors or rejection of a promise.
    // finally() - A method that executes after the promise is settled (either fulfilled or rejected), regardless of the outcome.

    // A Promise starts in the pending state as soon as an asynchronous operation begins. While pending, it is neither completed 
    // nor failed. Once the operation finishes, the promise becomes settled in one of two ways: it is fulfilled if the operation 
    // succeeds (via resolve()), or rejected if it fails (via reject()). After settling, any functions attached using .then() are
    // executed if the promise is fulfilled, while .catch() handles any rejection or errors. Regardless of the outcome, .finally() 
    // runs at the end for cleanup or common actions. Importantly, once a promise is settled, its state is immutable—it cannot 
    // change again—and all attached handlers execute asynchronously in the order they were added.

let promiseData = new Promise((res, rej) => {
    const success = false;
    setTimeout(() => {
        if(success){
            res("success in fetching data");
        }else{
            rej("Error");
        }
    }, 2000);
});
promiseData.then((a) => {
    console.log(a);
    console.log("then block");
});

promiseData.catch((b) => {
    console.log(b);
    console.log("catch block");
});

promiseData.finally(() => {
    console.log("Success");
    console.log("finally block");
});

promiseData.then((a) => {
    console.log(a);
}).catch().finally();


// API
// -fetch() - fetch() is a built-in JavaScript function used to send a request to a server and retrieve data. It returns a Promise that resolves to a Response object.
// A Response object is the result returned by fetch() that contains information about the HTTP response (status, headers, body, etc.), but not the actual usable data directly.
// .json() is a method of the Response object used to convert the response body into a JavaScript object. It returns a Promise.
// JSON is a lightweight data format used to store and exchange data between a server and a client. It is converted into JavaScript objects using .json().

// When an API is called in JavaScript, the request is sent to a server and the operation starts asynchronously, 
// meaning the program does not wait for the response and continues executing other lines. At this point,
// a promise is returned in a pending state. Once the server processes the request, the promise gets 
// settled—either fulfilled if the request is successful or rejected if an error occurs. If fulfilled, 
// the initial response received is not directly usable data, so it is converted into a structured format 
// (like a JavaScript object) through another asynchronous step, which again returns a promise. After this 
// conversion is complete, the actual data becomes available and can be accessed, processed, or iterated over 
// as needed. If any step fails during this process, the error is handled separately. Finally, any cleanup or 
// common logic can be executed regardless of success or failure.

let data = fetch("https://dummyjson.com/products")
data
    .then((a) => {
        return a.json();
    })
    .then((b)=> { 
        let val = b;
        console.log(val.products);

        val.products.forEach((a) => {
            console.log(a);
            console.log(a.title);
        });
    })
    .catch((er) =>{
        console.log(er);
    });
console.log(data);

// Asyncronus Function - An asynchronous function is a function that runs without blocking the program and allows other code to execute while it waits for a result.
// A Promise is an object that represents the future result of an asynchronous operation (either success or failure).
// async function always returns a Promise
// await can only be used inside an async function
// await makes async code look synchronous (but it’s not actually blocking)

async function demo() {
    try{
        let val = await fetch("https://dummyjson.com/products");
        let data = await val.json();
        console.log(val);
        console.log(data);            
    }catch(error){
        console.log(error);
    }
    finally{
        console.log("finally");
    }
}
demo();

// BOM - The Browser Object Model (BOM) is a set of objects that lets JavaScript interact with the browser itself, not the webpage content.
// Prompt - It is a method that takes data from user
// Alert - Send a message to the user
// Confirm - Validate a condition with user
let a = prompt("enter")
console.log(a);

// DOM -The DOM is a programming interface that represents an HTML document as a tree of objects, so JavaScript can read, change, add, or delete elements on a webpage.
// Browser will create a dom tree and all the tags are node .For each and every html element it will creates its own object.
// Document → whole webpage
// Element → HTML tag
// Node → any item in DOM tree
// Tree structure → parent-child relation
// Query Selector - selects all css selector to target the element

// select elements
// document.getElementById("id");
// document.querySelector(".class");

// Change content
// element.innerText = "New Text";

// Change style
// element.style.color = "red";

// Add elements
// let newEl = document.createElement("div");
// document.body.appendChild(newEl);

// Remove elements
// element.remove();

// console.dir(windows);
// let val = document.getElementById("link");
// let cl = document.getElementsByClassName("inp");

// let out[...cl];
// console.log(out);