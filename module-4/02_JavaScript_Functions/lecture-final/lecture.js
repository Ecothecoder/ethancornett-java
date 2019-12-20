/**
 * All named functions will have the function keyword and
 * a name followed by parentheses.
 */
function returnOne() {
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
function printToConsole(value) {
  console.log(value);
}

/**
 * Write a function called multiplyTogether that multiplies two numbers together. But 
 * what happens if we don't pass a value in? What happens if the value is not a number?
 *
 * @param {number} firstParameter the first parameter to multiply
 * @param {number} secondParameter the second parameter to multiply
 */
function multiplyTogether(firstParameter, secondParameter) {
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
function multiplyNoUndefined(firstParameter = 0, secondParameter = 0) {
  return firstParameter * secondParameter;
}

/**
 * Scope is defined as where a variable is available to be used.
 *
 * If a variable is declare inside of a block, it will only exist in
 * that block and any block underneath it. Once the block that the
 * variable was defined in ends, the variable disappears.
 */
function scopeTest() {
  // This variable will always be in scope in this function
  let inScopeInScopeTest = true;

  {
    // this variable lives inside this block and doesn't
    // exist outside of the block
    let scopedToBlock = inScopeInScopeTest;
  }

  // scopedToBlock doesn't exist here so an error will be thrown
  if (inScopeInScopeTest && scopedToBlock) {
    console.log("This won't print!");
  }
}



/**
 * JSDoc Example
 * 
 * This method takes information about a person and creates a sentence.
 * We join the list of quirks with the specified separator or comma by default.
 * 
 * @param {string} name the name of the person
 * @param {number} age 
 * @param {string[]} listOfQuirks 
 * @param {string} [separator = ',']
 * @returns {string} the full sentence about the person
 */
function createSentenceFromUser(name, age, listOfQuirks = [], separator = ', ') {
  let description = `${name} is currently ${age} years old. Their quirks are: `;
  return description + listOfQuirks.join(separator);
}


function imperativeForEach() {
  let myArray = [1, 2, 3, 4, 5];

  for (let n of myArray) {
    console.log(n *2);
  }
}

function multiplyByTwo(x) {
  console.log(x * 2);
}

function declarativeForEach() {
  let myArray = [1, 2, 3, 4, 5];

  //myArray.forEach(multiplyByTwo);
  myArray.forEach(x => console.log(x * 2));
}



function filterDemo() {
  let myArray = [1, 2, 3, 4, 5];

  return myArray.filter(n => n % 2 === 0);
  //return myArray.filter((n, index) => index % 2 === 0);

}


function mapDemo() {
  let myArray = ['red', 'blue', 'green'];

  return myArray.map(str => str.substring(1));
}

function mapWithObjects() {
  let objArray = [
    {name: 'Steve', bankBalance: 100},
    {name: 'Mary', bankBalance: 500},
    {name: 'TE Student', bankBalance: 10}
  ];

  return objArray.map(person => person.name);
}

function mapWithNumbers() {
  let myArray = [1, 2, 3, 4, 5];

  return myArray.map(n => n * 2);
}

function reduceDemo() {
  let myArray = [1, 2, 3, 4, 5];

  return myArray.reduce((acc, n) => n + acc);
}

function reduceWithObjects() {
  let objArray = [
    {name: 'Steve', bankBalance: 100},
    {name: 'Mary', bankBalance: 500},
    {name: 'TE Student', bankBalance: 10}
  ];

  let totalBalance = objArray.reduce((acc, person) => acc + person.bankBalance, 0);
  let maxBalance = objArray.reduce((acc, person) => person.bankBalance > acc? person.bankBalance : acc, 0);
  let richestPerson = objArray.reduce((richest, person) => person.bankBalance > richest.bankBalance? person : richest);
  let avgBalance = totalBalance / objArray.length;

  return richestPerson;
}

function reduceWithStrings() {
  let myArray = ['red', 'blue', 'green', ''];

  return myArray.reduce((acc, str) => acc.toUpperCase() + ' ' + str.toUpperCase());

  //return myArray.join(' ').toUpperCase();
}


/**
 * Takes an array and, using the power of anonymous functions, generates
 * their sum.
 *
 * @param {number[]} numbersToSum numbers to add up
 * @returns {number} sum of all the numbers
 */
function sumAllNumbers(numbersToSum) {
  return numbersToSum.reduce((acc, n) => acc + n);
}

function sumAllArguments() {
  return Array.from(arguments).reduce((acc, n) => acc + n);
}

/**
 * Takes an array and returns a new array of only numbers that are
 * multiples of 3
 *
 * @param {number[]} numbersToFilter numbers to filter through
 * @returns {number[]} a new array with only those numbers that are
 *   multiples of 3
 */
function allDivisibleByThree(numbersToFilter) {
  return numbersToFilter.filter(n => n % 3 === 0);
}

function allDivisibleByX(numbersToFilter, x) {
  return numbersToFilter.filter(n => n % x === 0);
}