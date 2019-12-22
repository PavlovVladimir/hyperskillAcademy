package com.hyperskilldev.regexp;

/**
 * [abc] - any character from set
 * [^abc] - not any character from set
 *
 *
 \\d - any digit, short for [0-9];
 \\D - a non-digit, short for [^0-9];
 \\s - a whitespace character (including tab and newline), short for [ \\t\\n\\x0B\\f\\r].
 \\S - a non-whitespace character, short for [^\\s];
 \\w - an alphanumeric character (word), short for [a-zA-Z_0-9];
 \\W - a non-alphanumeric character, short for [^\\w].


 The list of quantifiers

 There is a list of quantifiers to be remembered.

 + matches one or more repetitions of the preceding character;
 * matches zero or more repetitions of the preceding character;
 {n} matches exactly n repetitions of the preceding character;
 {n,m} matches at least n but not more than m repetitions of the preceding character;
 {n, } matches at least n repetitions of the preceding character;
 { ,m} matches not more than m repetitions of the preceding character.

 Note, there is another quantifier ? that makes the preceding character optional.
 It is short for {0,1}. We will not consider the quantifier here, because you should already know it.


 The plus quantifier

 In the following example, we demonstrate the plus character that matches one or more repetitions of the preceding character.

 String regex = "ca+b";

 "cab".matches(regex); // true
 "caaaaab".matches(regex); // true
 "cb".matches(regex); // false, because it does not have at least one repetition of 'a'

 As you can see, it matches only those strings which have one or more repetition of the 'a' character.
 The star quantifier

 The example below demonstrates the star character that matches zero or more repetitions of the preceding character

 String regex = "A[0-3]*";

 "A".matches(regex);  // true, because it matches zero or more repetitions
 "A0".matches(regex); // true
 "A000111222333".matches(regex); // true

 As you can see, the digits are optional.

 In the following example, there is a pattern which describes the string "John" between any characters in a text.

 String johnRegex = ".*John.*"; // it matches all strings containing the substring "John"

 String textWithJohn = "My friend John is a computer programmer";

 textWithJohn.matches(johnRegex); // true

 String john = "John";

 john.matches(johnRegex); // true

 String textWithoutJohn = "My friend is a computer programmer";

 textWithoutJohn.matches(johnRegex); // false

 So, the star quantifier can be used to check whether a substring of a string matches a pattern.
 Using it, we can skip spaces, any unsuitable characters and so on.

 Specifying the number of repetitions

 Both previous quantifiers are widely used but do not allow you to specify how many times a character can be repeated. Fortunately, there is a group of quantifiers which can specify the number of repetitions in the braces {n}, {n, m}, {n, }, { ,m}.

 The following example demonstrates how to match exactly n repetitions of the preceding character using the {n} quantifier.

 String regex = "[0-9]{4}"; // four digits

 "6342".matches(regex);  // true
 "9034".matches(regex);  // true

 "182".matches(regex);   // false
 "54312".matches(regex); // false

 The example below shows you how to match from n to m repetitions using the {n, m} quantifier.

 String regex = "1{2,3}";

 "1".matches(regex);    // false
 "11".matches(regex);   // true
 "111".matches(regex);  // true
 "1111".matches(regex); // false

 The last example demonstrates how to match at least n repetitions using the {n, } quantifier.


 String regex = "ab{4,}";

 "abb".matches(regex); // false, not enough 'b'
 "abbbb".matches(regex); // true
 "abbbbbbb".matches(regex); // true

 The quantifier that matches not more than m repetitions works in a similar way.
 */
public class Regexp {
}
