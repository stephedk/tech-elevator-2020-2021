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

function iqTest(numbers)
{
    const nums = numbers.split(" ").map(x => x % 2);
    const sum = nums.reduce((a, b) => a + b);
    const target = sum > 1 ? 0 : 1;
    return nums.indexOf(target) + 1;
}

const iqTest2 = (numberString) => 
{
    const scores = numberString.split(' '); // array of strings
    let position = 0;

    let evenCount = 0;
    let oddCount = 0;

    const opposites = [];

    // evaluates evenness
    for (let i = 0; i < scores.length; i++)
    {
        const isEven = scores[i] % 2 == 0;  
        opposites.push(isEven);

        if (isEven)
        {
            evenCount++;    
        }
        else
        {
            oddCount++;    
        }
    }

    // if all numbers are the same return 0
    if (evenCount === 0 || oddCount === 0)
    {
        return 0;
    }
    else if (evenCount > oddCount)
    {
        // return the position of the odd
        for (let i = 0; i < opposites.length; i++)
        {
            position = i + 1;
            if (!opposites[i])
            {
                return position;
            }
        }
    }
    else
    {
        //return the position of the even
        for (let i = 0; i < opposites.length; i++)
        {
            position = i + 1;
            if (opposites[i])
            {
                return position;
            }
        }
    }

}
