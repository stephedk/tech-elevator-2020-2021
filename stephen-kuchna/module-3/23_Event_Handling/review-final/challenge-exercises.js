/*
1. **iqTest** Bob is preparing to pass an IQ test. The most frequent task in this test 
    is to find out which one of the given numbers differs from the others. Bob observed
    that one number usually differs from the others in evenness. Help Bob — to check his 
    answers, he needs a program that among the given numbers finds one that is different in 
    evenness, and return the position of this number. _Keep in mind that your task is to help 
    Bob solve a real IQ test, which means indexes of the elements start from 1 (not 0)_

		iqTest("2 4 7 8 10") → 3 //third number is odd, while the rest are even
		iqTest("1 2 1 1") → 2 // second number is even, while the rest are odd
		iqTest("") → 0 // there are no numbers in the given set
        iqTest("2 2 4 6") → 0 // all numbers are even, therefore there is no position of an odd number
        iqTest("2 3 5 7")
*/

function iqTest2(numbers)
{
    const nums = numbers.split(" ").map(x => x % 2);
    const sum = nums.reduce((a, b) => a + b);
    const target = sum > 1 ? 0 : 1;
    return nums.indexOf(target) + 1;
}


const iqTest = (numberString) => 
{
    const values = numberString ? numberString.split(' ') : [];
    const evens = values.map(score =>  score % 2 === 0);
    const evenCount = evens.reduce( (count, value) =>  count + (value ? 1 : 0), 0 );
    const searchForEven = evenCount <= 1;
    return evens.indexOf(searchForEven) + 1;
}


const iqTest3 = (numberString) => 
{
    const values = numberString ? numberString.split(' ') : []; 

    const evens = values.map(score =>
    {
        return score % 2 === 0;
    });

    const evenCount = evens.reduce(
        (count, value) => { return count + (value ? 1 : 0); }
        , 0 // default initial value
    );

    const searchForEven = evenCount <= 1;

    // // this is ugly - it's basically a hack re-write of evens.indexOf()
    // let position = 0
    // for (let i = 0; i < evens.length; i++) 
    // {
    //     const value = evens[i];
    //     if (value === searchForEven)
    //     {
    //         position = i + 1;
    //         break;
    //     }
    // }
    // return position;

    // using indexof is much cleaner
    return evens.indexOf(searchForEven) + 1;   
}
