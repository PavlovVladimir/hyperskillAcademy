package com.hyperskilldev.numericalSystems;
/**
 Theory: Converting from binary to decimal
 12 minutes
 0 / 5 problems solved

 There are 10 types of people: those who know how to convert from binary to decimal and those who don't. Let's become the ones that do!
 Binary post office

 Imagine we are at a post office to send some apples. There we can find an infinite amount of boxes. The first box can contain only one apple, the second fits two apples, the third fits four apples, the fourth holds eight and so on… We don't want to spend a lot of money on paper and air, so each box can be either completely full or completely empty. We ask the mail carrier to fill the boxes.

 The mail carrier shows the check where we can see how many boxes of each capacity are filled, starting from the biggest one: 10011000. How can we find out the initial number of apples?

 Let's write down our "check" and the powers of 2 under it: 128, 64, 32, 16, 8, 4, 2, and 1.
 1 	0 	0 	1 	1 	0 	0 	0
 128 	64 	32 	16 	8 	4 	2 	1

 The biggest box is the one that can contain 272^727 = 128 apples. The next box can contain 64 apples, but it is left empty, as well as the one for 32. The next (16 apples) is full, and so is the next box, which can contain 8 apples. The rest are left empty.

 We are interested only in those boxes that are full, so we pay attention to the powers of 2 that correspond to them:

 Now we know that we need to pay for the boxes of these volumes: 128, 16 and 8 apples.

 Only one easy step is left: add up all the apples that are in the boxes. The sum is 152, we did it!
 The formal method

 Let's put it more formally. To choose the correct powers of two, we can multiply the binary digits to the corresponding powers :

 1 * 128 + 0 * 64 + 0 * 32 + 1 * 16 + 1 * 8 + 0 * 4 + 0 * 2 + 0 * 1 = 152.

 The steps are as follows:

 write down the binary number
 list the powers of 2 from right to left
 highlight the powers that correspond to the "1" in the initial binary number;
 add the highlighted values.

 This is how we convert from binary to decimal!



 Theory: Hexadecimal numbers
 8 minutes
 0 / 5 problems solved

 Anyone who spends enough time with a computer or other digital devices is likely to come across mysterious records consisting of numbers and Latin letters, such as 10FEF. For uninitiated people, they may seem like some kind of cipher. What is behind these symbols? It turns out that these are simply numbers that are used in a HEX (Hexadecimal Number System). HEX is an alternative way to represent numbers.
 Where did it come from?

 People use the decimal system for counting. It's probably due to the number of fingers on their hands. Computers, however, only have on and off, called a binary digit or bit, for short. For convenience, engineers working with computers tend to group bits together. In earlier days, such as the 1960s, they would group 3 bits at a time. As computers got bigger, it was more convenient to group bits by four instead of three. This doubles the numbers that the symbol would represent; it can have 16 values instead of eight. Hex = 6 and Decimal = 10, so it is called hexadecimal. They are more compact than decimal and binary.
 HEX and other numeral systems

 HEX is widely used in computer science due to the ease of translation of binary numbers into it, because 16 is 242^424.

 The hexadecimal number system uses numbers from 0 to 9 and six first Latin letters: A, B, C, D, E, F, corresponding to decimal, 10, 11, 12, 13, 14 and 15. Check it in the table below.
 Binary 	Decimal 	Hexadecimal
 0000 	0 	0
 0001 	1 	1
 0010 	2 	2
 0011 	3 	3
 0100 	4 	4
 0101 	5 	5
 0110 	6 	6
 0111 	7 	7
 1000 	8 	8
 1001 	9 	9
 1010 	10 	A
 1011 	11 	B
 1100 	12 	С
 1101 	13 	D
 1110 	14 	E
 1111 	15 	F

 So, as you see, when we are run out of digits, we start using letters in HEX. And how the decimal number 16 is represented in HEX? The answer is 10! It's better to write it with its base, so you wouldn't confuse it with a decimal number:  101610_{16}1016​

 The other ways to avoid confusion include writing a HEX number with h after it or 0x before it. For instance, 63h, 0x63 and 631663_{16}6316​ are different ways to represent 63 hexadecimal.
 Converting binary numbers to HEX and vice versa

 Binary numbers are easily convertible into hexadecimal numbers because HEX is actually a simplified way to represent binary numbers. We can split it into a 4-digit sequence, starting at the end, and then check with our table above. Let's try it with the number 1110011001110001:

 11100110011100012=1110 0110 0111 0001=E671161110011001110001_{2} = 1110\ 0110\ 0111\ 0001 = E671_{16}11100110011100012​=1110 0110 0111 0001=E67116​

 In case the digits of a number cannot be completely divided into four, the necessary number of zeros is written in front of the first digits:

 1011002=10 1100 =0010 1100 =2C16101100_{2} = 10\ 1100\ = 0010\ 1100\ = 2C_{16}1011002​=10 1100 =0010 1100 =2C16​

 Converting hexadecimal numbers into a binary system is even less difficult. Each character in a hexadecimal number record corresponds to four characters in a binary writing. All you have to do is check the table by character:

 BE16=1011 1110=101111102BE_{16} = 1011\ 1110 = 10111110_{2}BE16​=1011 1110=101111102​
 Usage of HEX

 A hexadecimal system is used to record error codes during the work of various software products. For example, operating system errors are encoded in this way. You can easily find out what an exact error occurred during the work, decrypting it using the instructions. Besides, in URLs, character codes are written as hexadecimal pairs prefixed with %. You can check it by googling a symbol @, the link in the address bar of your browser would look like that:

 https://www.google.com/search?q=%40

 The HEX numbers are also used for writing programs in low-level languages, and some encodings. For example, in Unicode (a computer standard for symbols encoding) every symbol is represented as a hexadecimal number. HEX numbers encode even color schemes. Thus, in RGB encoding every color can be represented as 3 hexadecimal numbers, each for red, green, or blue color components. As you can see, a lot of things use HEX. There is no doubt that this knowledge gained today will be useful for you in the future!
 */