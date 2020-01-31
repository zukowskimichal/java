Shifted strings  - E

Description

 

Given two strings, the task is to determine if they are shifted versions of each other. Two string S and T are called shifted if: S.length = T.length and S[i] = T[i+k] when i+k < S.length and S[i] = T[i+k-length] when i+k > S.length. Given k is a constant integer < S.length. "bcda”, "cdab", "dabc" "abcd" are shifted versions of "abcd" where k is “3”, “2”, “1” and “0” respectively.

 

Input

 

The program must be able to read text from standard input. The input text will contain two strings separated by a coma. E.g: “abcd,bcda”

 

Output

 

The program must return “shifted” to indicated strings are shifted versions of each other or “not shifted” to indicate strings are not shifted versions of each other. For input: “abcd,bcda” output: “shifted”. For input: “abcd,bcdd” output: “not shifted”.
