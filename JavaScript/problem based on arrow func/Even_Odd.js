const groupEvenOdd = numbers => {
  return numbers.reduce((acc, num) => {
    num % 2 === 0 ? acc.even.push(num) : acc.odd.push(num);
    return acc;
  }, { even: [], odd: [] });
};

console.log(groupEvenOdd([1, 2, 3, 4, 5, 6]));
// Output: { even: [2, 4, 6], odd: [1, 3, 5] }
