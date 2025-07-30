const countVowels = str => {
  const vowels = 'aeiouAEIOU';
  return [...str].filter(char => vowels.includes(char)).length;
};

console.log(countVowels("JavaScript Arrow Functions"));  // Output: 8
