1️⃣ 🟢
Users often makes random extra spaces in the input fields.
Create a global (i.e. static) function, that normalizes a string. The string is normalized, if:
– there are no spaces at the beginning and at the end of the string
– there are no consecutive 2 or more space characters in the string
Examples:
“  Hello     world   ” ➡️ “Hello world”
“   “ ➡️ “”

2️⃣ 🟢
Create a global function, that the bank card number (a number of 16 digits) leads to the string format “**** **** **** NNNN”, where NNNN – the last 4 digits of the number
Example:
1122334455667788 ➡️ “**** ** ** 7788”

3️⃣ 🟢
Create a global function, that contains 3 fields: surname, name, patronymic. The function converts them into a single string of the format “Surname N.P.”  Patronymic may not exist, then an empty string will come for him, and only the name should be in the initials.
Examples:
“Smit”, “James”, “” ➡️ “Smit J.”

4️⃣ 🟢
Create a global function, that checks, is the string the correct number of the Belarusian passport. We consider the passport number to be a string of 2 English uppercase letters and 7 digits.
Examples:
“MP1234567” ➡️ Yes
“MP123456” ➡️ No
“PPP234567” ➡️ No
“ЯЯ1234567” ➡️ No
“PP123456P” ➡️ No
“mp1234567" ➡️ No

5️⃣ 🟡
Create a global function, that checks, is the invented password reliable enough. Password is reliable, if:
– contains 8 or more characters
– contains at least one lowercase letter
– contains at least one uppercase letter
– contains at least one digit
Examples:
“aaHlo2pm” ➡️ Yes
“ouM-MLL23pm?Hlss” ➡️ Yes
“бянтык23длШ” ➡️ Yes
“dslfjdsljdslfjldsgjlgdsdsj” ➡️ No
“HHON83LD” ➡️ No
“aH3l” ➡️ No

6️⃣ 🟡
Create a global function, that checks, is the string similar to an email address. We consider a string to be similar to an email address if:
– does't contain spaces
– contains one and only one ‘@‘ character
– the ‘@’ character is surrounded by at least one character on each side.
Examples:
“oleg.grigorijan@gmail.com” ➡️ Yes
“a@a” ➡️ Yes
“@ab” ➡️ No
“ab@” ➡️ No
“abc“ ➡️ No
“a bc@gmail.com” ➡️ No
“abc@abc@gmail.com” ➡️ No
