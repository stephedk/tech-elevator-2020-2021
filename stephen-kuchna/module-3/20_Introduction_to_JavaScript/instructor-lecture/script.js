/*
    Example of a multi-line comment just like in C#/Java
*/

// Single line comment

/**
 * Functions start with the word function.
 * They don't have a return type and the naming convention is camel-case.
 */
function variables()
{

  // Declares a variable where the value cannot be changed
  const daysOfTheWeek = 7;
  console.log('There are ' + daysOfTheWeek + ' days in the week.');
  const message = `There are ${ daysOfTheWeek } days in the week.`;
  console.log(message);


  // Declares a variable those value can be changed
  let daysOfMonth = 30;
  console.log(typeof daysOfMonth);
  console.log(`There are  ${ daysOfMonth } days in the month`);  

  daysOfMonth = "29";
  console.log(typeof daysOfMonth);
  console.log(`There are  ${ daysOfMonth } days in the month`);

  // Declares a variable that will always be an array
  const weekdays = [
    "Monday",
    "Tuesday",
    "Wednsday",
    "Thursday",
    "Friday",
    "Saturday",
    "Sunday"
  ];

  console.log(weekdays);
  console.table(weekdays);

}

/**
 * Functions can also accept parameters.
 * Notice the parameters do not have types.
 * @param {Number} param1 The first number to display
 * @param {Number} param2 The second number to display
 */
function printParameters(param1, param2)
{
  console.log(`The value of param1 is ${ param1 }`);
  console.log(`The value of param2 is ${ param2 }`);
}

/**
 * Compares two values x and y.
 * == is loose equality
 * === is strict equality
 * @param {Object} x
 * @param {Object} y
 */
function equality(x, y)
{

  console.log(`x is ${ typeof x }`);
  console.log(`y is ${ typeof y }`);
  // x = y
  // x == y
  // x === y - 0 strict equality
  console.log(`x == y : ${ x == y }`); // true
  console.log(`x === y : ${ x === y }`); // false
}

/**
 * Each value is inherently truthy or falsy.
 * false, 0, '', null, undefined, and NaN are always falsy
 * everything else is always truthy
 * @param {Object} x The object to check for truthy or falsy,
 */
function checkTheValueOfX(x)
{
  if (x)// is the value set  x != null; x != undefined ; x != false; x != 0
  {
    console.log(`${ x } is truthy`);
  }
  else
  {
    console.log(`${ x } is falsy`);
  }
}

/**
 *  Objects are simple key-value pairs
    - values can be primitive data types
    - values can be arrays
    - or they can be functions
*/
function objects()
{
  //JSON
  //JavaScript Object
  const person = {
    firstName: "Bill",
    lastName: "Lumbergh",
    age: 42,
    employees: [
      "Peter Gibbons",
      "Milton Waddams",
      "Samir Nagheenanajar",
      "Michael Bolton"
    ]
  };

  console.log(person);


  // Log the first and last name
  console.log(`Person name: ${person.firstName} ${person.lastName}`);

  // Log each employee
  for (let i = 0; i < person.employees.length; i++)
  {
    console.log(person.employees[i]);
  }


  // you can also create an empty object
  // and add the properties as you go
  const employee = {};
  employee.firstName = "Gregor";
  employee.lastName = "Dzierzon";

  // Log the object
  console.log(employee);
}

/*
########################
Function Overloading
########################

Function Overloading is not available in Javascript. If you declare a
function with the same name, more than one time in a script file, the
earlier ones are overriden and the most recent one will be used.
*/

// function Add(num1, num2)
// {
//   return num1 + num2;
// }

function Add(num1, num2, num3)
{
  let answer = num1;
  if (num2) answer += num2;
  if (num3) answer += num3;

  return answer;
}

/*
########################
Math Library
########################

A built-in `Math` object has properties and methods for mathematical constants and functions.
*/

function mathFunctions()
{
  console.log("Math.PI : " + Math.PI);
  console.log("Math.LOG10E : " + Math.LOG10E);
  console.log("Math.abs(-10) : " + Math.abs(-10));
  console.log("Math.floor(1.99) : " + Math.floor(1.99));
  console.log("Math.ceil(1.01) : " + Math.ceil(1.01));
  console.log("Math.random() : " + Math.random());

  console.log('Random number between 1 and 10');
  let number = 10 * Math.random();
  number = Math.round(number);
  console.log(number);
}

/*
########################
String Methods
########################

The string data type has a lot of properties and methods similar to strings in Java/C#
*/

function stringFunctions(value)
{
  console.log(`.length -  ${ value.length }`);
  console.log(`.endsWith('World') - ${ value.endsWith("World") }`);
  console.log(`.startsWith('Hello') - ${ value.startsWith("Hello") }`);
  console.log(`.indexOf('Hello') - ${ value.indexOf("Hello") }`);

  /*
    Other Methods
        - split(string)
        - substr(number, number)
        - substring(number, number)
        - toLowerCase()
        - trim()
        - https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String
    */
}
