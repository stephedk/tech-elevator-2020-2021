/*

function definition - fat arrow
parameters

array functions - fat arrow function
  - foreach - how to process each row
  - map - map each object to an new form (returns a new array)
  - filter - where clause return only the items that match your criteia (returns a new array)
  - reduce - aggregation function that returns a single value based on all items in the array

*/



/**
 * All named functions will have the function keyword and
 * a name followed by parentheses.
 * 
 * @returns {number} 1
 */
function returnOne()
{
  return 1;
}

/**
 * Functions can also take parameters. These are just variables that are filled
 * in by whoever is calling the function.
 *
 * Also, we don't *have* to return anything from the actual function.
 *
 * @param {any} value the value to print to the console
 */
function printToConsole(value)
{
  console.log(value);
}

/**
 * Write a function called multiplyTogether that multiplies two numbers together. But 
 * what happens if we don't pass a value in? What happens if the value is not a number?
 *
 * @param {number} firstParameter the first parameter to multiply
 * @param {number} secondParameter the second parameter to multiply
 */
const multiplyTogether = (firstParameter, secondParameter) =>
{
  return firstParameter * secondParameter;
}

/**
 * This version makes sure that no parameters are ever missing. If
 * someone calls this function without parameters, we default the
 * values to 0. However, it is impossible in JavaScript to prevent
 * someone from calling this function with data that is not a number.
 * Call this function multiplyNoUndefined
 *
 * @param {number} [firstParameter=0] the first parameter to multiply
 * @param {number} [secondParameter=0] the second parameter to multiply
 */
const multiplyNoUndefined = (firstParameter = 0, secondParameter = 0) =>
{
  return firstParameter * secondParameter;
}


/**
 * Functions can return earlier before the end of the function. This could be useful
 * in circumstances where you may not need to perform additional instructions or have to
 * handle a particular situation.
 * In this example, if the firstParameter is equal to 0, we return secondParameter times 2.
 * Observe what's printed to the console in both situations.
 * 
 * @param {number} firstParameter the first parameter
 * @param {number} secondParameter the second parameter
 */
function returnBeforeEnd(firstParameter, secondParameter)
{
  console.log("This will always fire.");

  if (firstParameter == 0)
  {
    console.log("Returning secondParameter times two.");
    return secondParameter * 2;
  }

  //this only runs if firstParameter is NOT 0
  console.log("Returning firstParameter + secondParameter.");
  return firstParameter + secondParameter;
}


/**
 * Scope is defined as where a variable is available to be used.
 *
 * If a variable is declare inside of a block, it will only exist in
 * that block and any block underneath it. Once the block that the
 * variable was defined in ends, the variable disappears.
 */
function scopeTest()
{
  // This variable will always be in scope in this function
  let inScopeInScopeTest = true;

  {
    // this variable lives inside this block and doesn't
    // exist outside of the block
    let scopedToBlock = inScopeInScopeTest;
  }

  // scopedToBlock doesn't exist here so an error will be thrown
  if (inScopeInScopeTest && scopedToBlock)
  {
    console.log("This won't print!");
  }
}

function createSentenceFromUser(name, age, listOfQuirks = [], separator = ', ')
{
  let description = `${ name } is currently ${ age } years old. Their quirks are: `;
  return description + listOfQuirks.join(separator);
}

/**
 * Takes an array and, using the power of anonymous functions, generates
 * their sum.
 *
 * @param {number[]} numbersToSum numbers to add up
 * @returns {number} sum of all the numbers
 */
function sumAllNumbers1(numbersToSum)
{
  let sum = 0;

  for (let i = 0; i < numbersToSum.length; i++)
  {
    const number = numbersToSum[i];
    sum += number;  
  }

  return sum;
}

function sumAllNumbers2(numbersToSum)
{
  // aggregation
  let aggregate = 0; //always need the aggregate

  numbersToSum.forEach((currentNumber) =>
  {
    aggregate += currentNumber;
  }
  );

  return aggregate;
}


function sumAllNumbers(numbersToSum)
{
  const answer = numbersToSum.reduce((aggregate, currentNumber) =>
                  {
                    return aggregate + currentNumber;
                  }
                );

  return answer;
}

// sum(2,4,6)
const sum = function (...numbers)
{
  // firstNumber = 2
  // numbers = [4,6]
  // to access ALL arguments
  // arguments = [2,4,6]

  console.log(arguments);

  const answer = numbers.reduce((aggregate, currentNumber) =>
  {
    return aggregate + currentNumber;
  }
  );

  return answer;
}

const getTotalSales = () =>
{
  const orders = [
    {
      id: 1,
      name: "John",
      product: "shoes",
      price: 49.99,
      quantity: 1
    },
    {
      id: 2,
      name: "Jane",
      product: "shoes",
      price: 2.99,
      quantity: 10
    }
  ];

  const totalSales = orders.reduce((sales, order) =>
  {
    const lineTotal = order.price * order.quantity;
    return sales + lineTotal;
  },
    0 // initial value of the the aggregate - can be of any type
  );

  return totalSales;
  
}

/**
 * Takes an array and returns a new array of only numbers that are
 * multiples of 3
 *
 * @param {number[]} numbersToFilter numbers to filter through
 * @returns {number[]} a new array with only those numbers that are
 *   multiples of 3
 */
// lambdas are the most flexible from the perspective of the developer
function allDivisibleByThree(numbersToFilter)
{
  const newArray = numbersToFilter.filter((number) => { return number % 3 === 0;});

  return newArray;
}


function filter(array, booleanLambdaFunction) // lambda is your custom where statement
{
  const newArray = [];

  for (let i = 0; i < array.length; i++) 
  {
    const element = array[i];
    if (booleanLambdaFunction(element))
    {
      newArray.push(element);
    }
    
  }

  return newArray;

}


 // better bun not very flexible
function allDivisibleByThree2(numbersToFilter)
{
  const newArray = numbersToFilter.filter(isDivisibleByThree);

  return newArray;
}

const isDivisibleByThree = (value) => {
  return value % 3 === 0;
}

const isDivisibleByFive = (value) =>
{
  return value % 5 === 0;
}




// old sad way of doing things
function allDivisibleByThree1(numbersToFilter)
{
  const newArray = [];

  numbersToFilter.forEach((currentNumber) =>
  {
    if (isDivisibleByThree(currentNumber))
    {
      newArray.push(currentNumber);
    }
  });

  return newArray;
}



const mapDemo = () =>
{
  const orders = [
    {
      id: 123,
      name: "John",
      product: "shoes",
      price: 49.99,
      quantity: 1
    },
    {
      id: 287,
      name: "Jane",
      product: "shoes",
      price: 2.99,
      quantity: 10
    }
  ];

  // for each item in the array
  // -> order
  // process that item and convert it to a different object (order v2) // sql row to java object
  // <- the result of the conversion
  // a new array of converted objects
  const newOrders = orders.map((order) =>
  {
    const newOrder = {
      ...order, // this is shorthand for copying all variables in the current order -- SELECT *
      lineTotal: order.price * order.quantity
    };

    return newOrder;
  })

  console.table(orders);
  console.table(newOrders);

  return newOrders;
  
}
