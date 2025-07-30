const findLongestWord = words => {
  return words.reduce((longest, current) => 
    current.length > longest.length ? current : longest
  , "");
};

console.log(findLongestWord(["hello", "world", "javascript", "fun"]));  // Output: "javascript"
