/*
 * Given 2 strings, return their concatenation, except omit
 * the first char of each. The strings will be at least length 1.
 *   nonStart("Hello", "There") -> "ellohere"
 */
function nonStart(word1, word2) {
  let sub1 = word1.substring(1);
  let sub2 = word2.substring(1);

  return sub1+sub2;
}
