// 1.) reverse String

// import java.util.*;

// class Strings
// {
// public static void main(String []args)
//     {
//       StringBuilder sb = new StringBuilder("HeLlO");

//sb.append(" World");

//1.) reverse Method
// for(int i = sb.length() - 1 ; i>=0; i--){
//     System.out.print(sb.charAt(i));
// }

// 2nd Method
// for(int i=0; i<sb.length()/2; i++){
//     int front  = i;
//     int back = sb.length() -i - 1;

//     char frontChar  = sb.charAt(front);
//     char backChar = sb.charAt(back);

//     sb.setCharAt(front, backChar);
//     sb.setCharAt(back, frontChar);
// }

// 3rd Method

// for(int i=0; i<sb.length()/2; i++){
//   char temp = sb.charAt(i);
//   sb.setCharAt(i, sb.charAt(sb.length() - i -1));
//     sb.setCharAt(sb.length()-i-1, temp);
// }

//         System.out.println(sb);

//     }
// }

// 2.) UpperCase to LowerCase or Lower ->>> upper

// import java.util.*;

// class Strings
// {
// public static void main(String []args)
//     {
//     // take input 
//     Scanner sc = new Scanner(System.in);
//      String str = sc.nextLine();

// // convert to char array

// char[] arr = str.toCharArray();
// // print the array

// for(int i=0; i<arr.length; i++){
//     if(arr[i] >= 'a' && arr[i] <= 'z'){
//         arr[i] = (char)(arr[i] - 'a' + 'A');
//     }
//     else if(arr[i] >= 'A' && arr[i] <= 'Z'){
//         arr[i] = (char)(arr[i] - 'A' + 'a');
//     }
// }
// // print the array

// for(int i=0; i<arr.length; i++){
//     System.out.print(arr[i]);
// }

// without  convert into array

// for(int i=0; i<str.length(); i++){
//     char ch = str.charAt(i);
//     if(ch >= 'a' && ch <= 'z'){
//         ch = (char)(ch - 'a' + 'A');
//     }
//     else if(ch >= 'A' && ch <= 'Z'){
//         ch = (char)(ch - 'A' + 'a');
//     }
//     System.out.print(ch);
// }

//         }

//  }

// 3.)  Count the number of words in a string

// import java.util.*;

// class Strings
// {
// public static void main(String []args)
//     {
//    Scanner sc = new Scanner(System.in);

//     String str = sc.nextLine();

//     int count = 0;

//     for(int i=0; i<str.length(); i++){
//         char ch = str.charAt(i);
//         if(ch == ' '){
//             count++;
//         }

//     }
//     System.out.println(count+1);
//     }

// }

// 4.)  Count the number of vowels in a string

// import java.util.*;

// class Strings
// {
// public static void main(String []args)
//     {
//     Scanner sc = new Scanner(System.in);
//     String str = sc.nextLine();

//     int count = 0;

//     for(int i=0; i<str.length(); i++){

//        char ch = str.charAt(i);

//        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
//               count++;

//        }
//         }
//         System.out.println(count);

//     }

// }

// 5.)  Count the number of consonants in a string

// import java.util.*;

// class Strings
// {
// public static void main(String []args)
//     {
//     Scanner sc = new Scanner(System.in);
//     String str = sc.nextLine();

//     int count = 0;
//     for(int i=0; i<str.length(); i++){
//         char ch = str.charAt(i);
//         if(ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u'){
//             count++;
//         }
//         }
//         System.out.println(count);
//     }
// }

// 6.)  Count the number of digits in a string

// import java.util.*;

// class Strings
// {
// public static void main(String []args)
//     {
//         Scanner  sc  = new Scanner(System.in);

//         String str = sc.nextLine();
//         int count  = 0;

//         for(int i=0; i<str.length(); i++){
//             char ch = str.charAt(i);
//             if(ch >= '0' && ch <= '9'){
//                 count++;
//             }

//         }
//         System.out.println(count);

//     }
// }

// 7 .)Count the number of special characters in a string

// import java.util.*;

// class Strings

// {

// public static void main(String []args)

//     {

//         Scanner  sc  = new Scanner(System.in);

//         String str = sc.nextLine();

//         int count  = 0;

//         for(int i=0; i<str.length(); i++){

//             char ch = str.charAt(i);

//             if(ch >= '0' && ch <= '9'){

//                 count++;

//             }

//             else if(ch >= 'a' && ch <= 'z'){

//                 count++;

//             }

//             else if(ch >= 'A' && ch <= 'Z'){

//                 count++;

//             }

//             else{

//                 count++;

//             }

//         }

//         System.out.println(count);

//     }

// }

// 1.)Write a java program to find length of a string.

// import java.util.*;

// class Strings
// {
// public static void main(String []args)
//     {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();

//         int count = 0;

//         for(int i=0; i<str.length(); i++){
//             count++;
//         }
//         System.out.println(count);
//     }
// }

// 2.) Write a java program to copy one string to another string.

// import java.util.*;

// class Strings
// {
// public static void main(String []args)
//     {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();

//         String s = new String(str);

//         System.out.println(s);
//     }
// }

// 3.) Write a C program to concatenate two strings.

// import java.util.*;

// class Strings
// {
// public static void main(String []args)
//     {
//      Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();
//         String s = sc.nextLine();
//         String s1 = str + s;
//         System.out.println(s1);
//         }
//   }

// 4.) Write a java program to compare two strings.

// import java.util.*;

// class Strings
// {
// public static void main(String []args)
//     {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();
//         String s = sc.nextLine();

//         if(str.equals(s)){
//             System.out.println("Equal");
//         }
//         else{
//             System.out.println("Not Equal");
//         }
//     }
// }

// 5.) Write a java program to convert lowercase string to uppercase.

// import java.util.*;

// class Strings
// {
// public static void main(String []args)
//     {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();
//         for(int i=0; i<str.length(); i++){
//             char ch = str.charAt(i);
//             if(ch >= 'a' && ch <= 'z'){
//                 ch = (char)(ch - 32);
//                 System.out.print(ch);
//             }
//             else{
//                 System.out.print(ch);
//             }
//         }
//     }
// }

// 6.) Write a java program to convert uppercase string to lowercase.

// import java.util.*;

// class Strings
// {
// public static void main(String []args)
//     {
//     Scanner sc = new Scanner(System.in);
//     String str = sc.nextLine();

//     for(int i=0; i<str.length(); i++){
//         char ch = str.charAt(i);
//         if(ch>='A' && ch<='Z'){
//             ch = (char)(ch+32);
//             System.out.print(ch);
//         }
//         else{
//             System.out.print(ch);
//         }
//     }
//     }
// }

// 7.) Write a java program to toggle each characters in a string.

// import java.util.*;

// class Strings
// {
// public static void main(String []args)
//     {
//     Scanner sc = new Scanner(System.in);
//     String str = sc.nextLine();
//     String s = "";
//     for(int i=0; i<str.length(); i++){
//         char ch = str.charAt(i);
//         if(ch >= 'a' && ch <= 'z'){
//             ch = (char)(ch - 32);
//             s = s + ch;
//         }
//         else if(ch >= 'A' && ch <= 'Z'){
//             ch = (char)(ch + 32);
//             s = s + ch;
//         }
//         else{
//             s = s + ch;
//         }

//     }
//     System.out.println(s);
//     }
// }

// 8.) Write a java program to find total number of alphabets, digits or special character in a string.

// import java.util.*;

// class Strings
// {
// public static void main(String []args)
//     {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();
//         int count = 0;

//         for(int i=0; i<str.length(); i++){
//             char ch = str.charAt(i);
//             if(ch >= 'a' && ch <= 'z'){
//                 count++;
//             }
//             else if(ch >= 'A' && ch <= 'Z'){
//                 count++;
//             }
//             else if(ch >= '0' && ch <= '9'){
//                 count++;
//             }
//             else{
//                 count++;
//             }
//         }
//         System.out.println(count);

//     }
// }

// 9.) Write a java program to count total number of vowels and consonants in a string.

// import java.util.*;

// class Strings
// {
// public static void main(String []args)
//     {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();
//         int count1 = 0;
//         int count = 0;

//         for(int i=0; i<str.length(); i++){
//             char ch = str.charAt(i);
//             if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
//                 count++;
//             }
//             else if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
//                 count++;
//             }
// else{
//     count1++;
// }
//         }
//         System.out.println(count);
//         System.out.println(count1);
//     }
// }

// 10.) Write a java program to count total number of words in a string.

// import java.util.*;
// class Strings
// {
// public static void main(String []args)
//     {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();
//         int count = 0;
//         for(int i=0; i<str.length(); i++){
//             char ch = str.charAt(i);
//             if(ch == ' '){
//                 count++;
//             }
//         }
//         System.out.println(count+1);
//     }
// }

// 11.) Write a java program  to find reverse of a string.

// import java.util.*;
// class Strings

// {
// public static void main(String []args)
//     {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();

//         for(int i=str.length()-1; i>=0; i--){

//             System.out.print(str.charAt(i));
//         }

//     }
// }

// 12.) Write a java program to  check whether a string is palindrome or not

// import java.util.*;
// class Strings
// {

// public static void main(String []args)
//     {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();
//         String s = "";
//         for(int i=str.length()-1; i>=0; i--){
//             s = s + str.charAt(i);
//         }
//         if(str.equals(s)){
//             System.out.println("Palindrome");
//         }
//         else{
//             System.out.println("Not Palindrome");
//         }
//     }
// }

// 13.) Write a java program to reverse order of words in a given string.

// import java.util.*;

// class Strings
// {
// public static void main(String []args)
//     {
//         Scanner sc = new Scanner(System.in);
//         String str = new String();
//         str = sc.nextLine();
//         String s  = "";
//         String s1 = "";
//         for(int i=str.length()-1; i>=0; i--){
//             char ch = str.charAt(i);
//             if(ch == ' '){
//                 s1 =   s1 + s + ' ';
//                 s = "";
//             }
//             else{
//                 s = ch + s;
//             }
//         }
//         s1 = s1 + s;
//         System.out.println(s1);
//     }
// }

// 2nd Easy Method 

// import java.util.*;

// class Strings
// {
// public static void main(String []args)
//     {
//     Scanner sc = new Scanner(System.in);
//     String str  = sc.nextLine();
//     String s = "";

//     for(int i=str.length()-1; i>=0; i--){
//         if(str.charAt(i) == ' '){
//             s += str.substring(i+1, str.length()) + " ";
//             str = str.substring(0, i);
//         }

//     }

//     System.out.println(s + str);

// }

// }

// 14.) Write a java program  to find first occurrence of a character in a given string.

// import java.util.*;

// class Strings
// {
// public static void main(String []args)
//     {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();
//         char ch = sc.next().charAt(0);
//         int count = 0;
//         for(int i=0; i<str.length(); i++){
//             char ch1 = str.charAt(i);
//             if(ch == ch1){
//                 System.out.println(i);
//                 break;
//             }
//         }
//     }
// }

// 15.) Write a java program to find last occurrence of a character in a given string.

// import java.util.*;

// class Strings {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String s = sc.nextLine(); 
//         char ch = sc.next().charAt(0);
//         for(int i=s.length()-1; i>=0; i--){
//             char ch1 = s.charAt(i);
//             if(ch == ch1){
//                 System.out.println(i);
//                 break;
//             }
//         }     

//         }

// }

// 16.) Write a java program to search all occurrences of a character in a given string.

// import java.util.*;
// class Strings

// {
// public static void main(String []args)
//     {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();
//         char ch = sc.next().charAt(0);
//         for(int i=0; i<str.length(); i++){
//             char ch1 = str.charAt(i);
//             if(ch == ch1){
//                 System.out.println(i);
//             }
//         }
//     }
// }

// 17.) Write a java program to count occurrences of a character in a given string.

// import java.util.*;
// class Strings
// {
// public static void main(String []args)
//     {
//         Scanner sc = new Scanner(System.in);
//         String s = sc.nextLine();
//         char ch = sc.next().charAt(0);
//         int count = 0;
//         for(int i=0; i<s.length(); i++){
//             char ch1 = s.charAt(i);
//             if(ch == ch1){
//                 count++;
//             }
//             }
//             System.out.println(count);
//         }
// }

// 18.) Write a java program to find highest frequency character in a string.

// import java.util.*;

// class Strings
// {
// public static void main(String []args)
//     {
//         Scanner sc = new Scanner(System.in);
//         String s = sc.nextLine();

//         int max = 0;
//         char ch = ' ';

//         for(int i=0; i<s.length(); i++){
//             int count = 0;
//             for(int j=0; j<s.length(); j++){
//                 if(s.charAt(i) == s.charAt(j)){
//                     count++;
//                 }
//             }
//             if(count > max){
//                 max = count;
//                 ch = s.charAt(i);
//             }
//         }
//         System.out.println(ch);
//     }
// }

// 19.) Write a java program to find lowest frequency character in a string.

//  import java.util.*;

// class Strings
// {
// public static void main(String []args)
//     {
//         Scanner sc = new Scanner(System.in);
//         String s = sc.nextLine();

//         int min = 100000;
//         char ch = ' ';

//         for(int i=0; i<s.length(); i++){
//             int count = 0;
//             for(int j=0; j<s.length(); j++){
//                 if(s.charAt(i) == s.charAt(j)){
//                     count++;
//                 }
//             }
//             if(count < min){
//                 min = count;
//                 ch = s.charAt(i);
//             }
//         }
//         System.out.println(ch);
//     }
// }

// 20.) Write a java program to count frequency of each character in a string.

// import java.util.*;

// class Strings
// {
// public static void main(String []args)
//     {
//         Scanner sc = new Scanner(System.in);
//         String s = sc.nextLine();
//         int freq[] = new int[26];
//         for(int i=0; i<s.length(); i++){
//             freq[s.charAt(i) - 'a']++;
//         }
//         for(int i=0; i<26; i++){
//             if(freq[i] != 0){
//                 System.out.println((char)(i + 'a') + " " + freq[i]);
//             }

//         }

//     }
// }

// 2nd Method 

// import java.util.*;

// class Strings
// {
// public static void main(String []args)
//     {
//     Scanner sc = new Scanner(System.in);
//     String s = sc.nextLine();
//     int count = 0;
//     for(int i=0; i<s.length(); i++){
//         count = 0;
//         for(int j=0; j<s.length(); j++){
//             if(s.charAt(i) == s.charAt(j)){
//                 count++;
//             }
//         }
//         System.out.println(s.charAt(i) + " " + count);
//     }

//     }
// }

// import java.util.*;

// class Strings
// {
// public static void main(String []args)
//     {
//     Scanner sc = new Scanner(System.in);
//     String s = sc.nextLine();
//     int count = 0;
//     for(int i=0; i<s.length(); i++){
//         count = 0;
//         for(int j=0; j<s.length(); j++){
//             if(s.charAt(i) == s.charAt(j)){
//                 count++;
//             }
//         }
//         System.out.println(s.charAt(i) + " " + count);
//     }
//     }
// }

// 21.) Write a java program to remove first occurrence of a character from string.

// Input :  I love programming. I love Codeforwin.

// remove I 

// Output : love programming. I love Codeforwin.

// import java.util.Scanner;

// public class Strings {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         String str = scanner.nextLine();
//         char ch = scanner.next().charAt(0);
//         int index = str.indexOf(ch);
//         if (index != -1) {
//             String result = str.substring(0, index) + str.substring(index + 1);
//             System.out.println(result);
//         } 
//     }
// }

// import java.util.*;

// class Strings {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();
//         char ch = sc.next().charAt(0);
//         int index = str.indexOf(ch);
//         for (int i = 0; i < str.length(); i++) {
//             if (i == index) {
//                 continue;
//             }
//             System.out.print(str.charAt(i));
//         }

//     }
// }

// 22.) Write a java program to remove last occurrence of a character from string.

// import java.util.*;

// class Strings {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();
//         char ch = sc.next().charAt(0);
//         int index = str.lastIndexOf(ch);
//         for (int i = 0; i < str.length(); i++) {
//             if (i == index) {
//                 continue;
//             }
//             System.out.print(str.charAt(i));
//         }

//     }
// }

// 23.) Write a java program to remove all occurrences of a character from string.

// import java.util.*;
// class Strings {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();
//         char ch = sc.next().charAt(0);
//         for (int i = 0; i < str.length(); i++) {
//             if (str.charAt(i) == ch) {
//                 continue;
//             }
//             System.out.print(str.charAt(i));
//         }
//     }
// }

// 24.) Write a java program to remove all repeated characters from a given string.

// Input string: Programming in C.

// Output String after removing duplicate characters: Progamin C.

// import java.util.*;

// public class Strings {

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();
//         char[] chars = str.toCharArray();
//         Set<Character> charSet = new LinkedHashSet<Character>();

//         for (char c : chars) {
//             charSet.add(c);
//         }
//         String s = "";
//         for (char ch : charSet) {
//             s += ch;
//         }
//         System.out.println(s);

//     }

// }

// 25.) Write a java program to replace first occurrence of a character with another in a string.

// Input :  I_love_learning_at_Codeforwin.

// replace _ with space do for only first occurence 

// Output : I love_learning_at_Codeforwin.

// import java.util.*;

// public class Strings {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();
//         char ch1 = sc.next().charAt(0);
//         char ch2 = sc.next().charAt(0);
//         int index = str.indexOf(ch1);

//         for (int i = 0; i < str.length(); i++) {
//             if (i == index) {
//                 System.out.print(ch2);
//             } else {
//                 System.out.print(str.charAt(i));
//             }
//         }
//     }
// }

// 26.) Write a java program to replace last occurrence of a character with another in a string.

// import java.util.*;
// public class Strings {
// public static void main(String []args)
//     {
//     Scanner sc = new Scanner(System.in);
//     String str  = sc.nextLine();
//     char ch1 = sc.next().charAt(0);
// 
//     char ch2 = sc.next().charAt(0);
//     int index = str.lastIndexOf(ch1);
//     for(int i=0; i<str.length(); i++){
//         if(i == index){
//             System.out.print(ch2);
//         }
//         else{
//             System.out.print(str.charAt(i));
//         }
//     }
// }
// }

// 27.) Write a java program to replace all occurrences of a character with another in a string.

// import java.util.*;
// public class Strings {

// public static void main(String []args)
//     {
//     Scanner sc = new Scanner(System.in);
//     String str  = sc.nextLine();
//     char ch1 = sc.next().charAt(0);
//     char ch2 = sc.next().charAt(0);
//     for(int i=0; i<str.length(); i++){
//         if(str.charAt(i) == ch1){
//             System.out.print(ch2);
//         }
//         else{
//             System.out.print(str.charAt(i));
//         }
//     }
// }
// }

// 28.) Write a java program to find first occurrence of a word in a given string.

// import java.util.*;
// public class Strings {

// public static void main(String []args)
//     {
//     Scanner sc = new Scanner(System.in);
//     String str  = sc.nextLine();
//     String str1 = sc.nextLine();
//     int index = str.indexOf(str1);
//     System.out.println(index);

//     }
// }

// 29.) Write a java program to find last occurrence of a word in a given string.

// import java.util.*;
// public class Strings {

// public static void main(String []args)
//     {
//     Scanner sc = new Scanner(System.in);
//     String str  = sc.nextLine();
//     String str1 = sc.nextLine();
//     int index = str.lastIndexOf(str1);
//     System.out.println(index);

//     }
// }

// 30.) Write a java program to find all occurrences of a word in a given string.

// import java.util.*;

// public class Strings {

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();
//         String str1 = sc.nextLine();
//         int index = str.indexOf(str1);
//         while (index >= 0) {
//             System.out.println(index);
//             index = str.indexOf(str1, index + 1);
//         }
//     }
// }

// 31.) Write a java program to count occurrences of a word in a given string.

// import java.util.*;
// public class Strings {

// public static void main(String []args)
//     {
//     Scanner sc = new Scanner(System.in);
//     String str  = sc.nextLine();
//     String str1 = sc.nextLine();
//     int index = str.indexOf(str1);
//     int count = 0;
//     while(index >= 0){
//         count++;
//         index = str.indexOf(str1, index+1);
//     }
//     System.out.println(count);
// }
// }

// 32.) Write a java program to remove first occurrence of a word from string.

// Input  

// import java.util.*;
// public class Strings {

// public static void main(String []args)
//     {

//     Scanner sc = new Scanner(System.in);
//     String str  = sc.nextLine();
//     String str1 = sc.nextLine();
//     int index = str.indexOf(str1);
//     // if(index > -1)
//     // {
//     //     str = str.substring(0, index) + str.substring(index + str1.length());
//     // }
//     // System.out.println(str);
// // }
// // }
//     for(int i=0; i<str.length(); i++){
//         if(i == index){

//             while(str.charAt(i) != ' '){

//                 i++;
//             }

//         }
//         else{
//             System.out.print(str.charAt(i));
//         }
//     }
// }
// }

// 33.) Write a java program to remove last occurrence of a word from string.

// import java.util.*;
// public class Strings {

// public static void main(String []args)
//     {
//     Scanner sc = new Scanner(System.in);
//     String str  = sc.nextLine();
//     String str1 = sc.nextLine();
//     int index = str.lastIndexOf(str1);
//     if(index > -1)
//     {  
//         str = str.substring(0, index) + str.substring(index + str1.length());
//     }
//     System.out.println(str);
//     }
//     }

// 34.) Write a java program to remove all occurrences of a word from string.

// import java.util.*;
// public class Strings {

// public static void main(String []args)
//     {
//     Scanner sc = new Scanner(System.in);
//     String str  = sc.nextLine();
//     String str1 = sc.nextLine();
//     int index = str.indexOf(str1);
//     while(index >= 0){
//         str = str.substring(0, index) + str.substring(index + str1.length());
//         index = str.indexOf(str1);
//     }
//     System.out.println(str);
// }
// }

// 35.) Write a java program  to trim leading white spaces from a string

// import java.util.*;
// public class Strings {

// public static void main(String []args)
//     {
//     Scanner sc = new Scanner(System.in);
//     String str  = sc.nextLine();
//     int index = 0;
//     while(str.charAt(index) == ' '){
//         index++;
//         }
//     System.out.println(str.substring(index));
//     }
// }

// import java.util.*;

// class Strings
// {
// public static void main(String []args)
//     {
//     Scanner sc = new Scanner(System.in);
//     String str  = sc.nextLine();
//     System.out.println(str.trim());
//     }
// }

// 36.) Write a java program  to trim trailing white spaces from a string

// import java.util.*;
// public class Strings {
// public static void main(String []args)
//     {
//     Scanner sc = new Scanner(System.in);
//     String str  = sc.nextLine();
//     int index = str.length()-1;
//     while(str.charAt(index) == ' '){
//         index--;
//         }
//     System.out.println(str.substring(0, index+1));
//     }
// }

// 37.) Write a java program  to trim both leading and trailing white spaces from a string

// import java.util.*;
// public class Strings {

// public static void main(String []args)
//     {
//     Scanner sc = new Scanner(System.in);
//     String str  = sc.nextLine();
//     int index = 0;
//     while(str.charAt(index) == ' '){
//         index++;
//         }
//     int index1 = str.length()-1;
//     while(str.charAt(index1) == ' '){
//         index1--;
//         }
//     System.out.println(str.substring(index, index1+1));
//     }

// }

// 38.) Write a java program  to remove all extra blank spaces from given string.

// import java.util.*;
// public class Strings {
//     public static void main(String []args)
//     {
//     Scanner sc = new Scanner(System.in);
//     String str  = sc.nextLine();
//     int index = 0;
//     while(str.charAt(index) == ' '){
//         index++;
//         }
//     int index1 = str.length()-1;
//     while(str.charAt(index1) == ' '){
//         index1--;
//         }
//     String str1 = str.substring(index, index1+1);
//     int index2 = 0;
//     while(index2 < str1.length()){
//         if(str1.charAt(index2) == ' ' && str1.charAt(index2+1) == ' '){
//             str1 = str1.substring(0, index2) + str1.substring(index2+1);
//         }
//         else{
//             index2++;
//         }
//     }
//     System.out.println(str1);
//     }

// }

// practice

// import java.util.*;

// class Strings
// {
//     void repeated(String s){
//        int ans  = 0;
//        int n = s.length();
//        Map<Character , Integer>  m = new HashMap<>();
//        for(int i=0 , j=0; j<n; j++){
//         if(m.containsKey(s.charAt(j))){
//             i = Math.max(m.get(s.charAt(j)) , i);
//         }
//         ans = Math.max(ans , j - i + 1);
//         m.put(s.charAt(j) , j+1);
//        }
//          System.out.println(ans);
//     }
//     public static void main(String []args)
//     {
//     Scanner sc = new Scanner(System.in);
//     String str  = sc.nextLine();
//     Strings obj = new Strings();
//     obj.repeated(str);
//     }
// }


// Input : 
// 5
// Mahesh Sharma
// Aman Kumar
// Ashish Singla
// Rahul Kumar
// Rahul Sharma

// Output :
// Aman Kumar
// Ashish Singla
// Mahesh Sharma
// Rahul Kumar
// Rahul Sharma



// import java.util.*;

// class Strings
// {
// public static void main(String []args)
//     {
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     String s = sc.nextLine();
//     char []arr = new char[n];
//     for(int i=0; i<n; i++){
//         arr[i] = sc.nextLine().charAt(0);
//         }
//     Arrays.sort(arr);
//     for(int i=0; i<n; i++){
//         System.out.println(arr[i]);
//         }
        
//     }
// }


// write a code for anagram 

// secure resue



//  import java.util.*;

//     class Strings
//     {
//         void anagram(String s1 , String s2){
//             int n1 = s1.length();
//             int n2 = s2.length();
//             if(n1 != n2){
//                 System.out.println("Not anagram");
//                 return;
//             }
//             char []arr1 = s1.toCharArray();
//             char []arr2 = s2.toCharArray();
//             Arrays.sort(arr1);
//             Arrays.sort(arr2);
//             for(int i=0; i<n1; i++){
//                 if(arr1[i] != arr2[i]){
//                     System.out.println("Not anagram");
//                     return;
//                 }
//             }
//             System.out.println("Anagram");
//         }
//         public static void main(String []args)
//         {
//         Scanner sc = new Scanner(System.in);
//         String str1  = sc.nextLine();
//         String str2  = sc.nextLine();
//         Strings obj = new Strings();
//         obj.anagram(str1 , str2);
//         }

//     }

    


// write a code  for cross product number 

// Input aAbcdabebd
// 3
// a A b 

// Output :
// 533




// a = 97*2  ,  b = 98*3  , A = 65

// 194 + 294 + 65

// output : 553
// import java.util.Scanner;

// public class Strings {
//     public static int calculateAsciiSum(String string, char[] characters) {
//         int totalSum = 0;
//         for (char c : string.toCharArray()) {
//             for (char character : characters) {
//                 if (c == character) {
//                     totalSum += (int) c;
//                     break;
//                 }
//             }
//         }
//         return totalSum;
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter a string: ");
//         String input = scanner.nextLine();

//         System.out.print("Enter characters (separated by spaces): ");
//         String charactersInput = scanner.nextLine();
//         char[] characters = charactersInput.replaceAll("\\s+", "").toCharArray();

//         int result = calculateAsciiSum(input, characters);
//         System.out.println("The ASCII sum is: " + result);

//         scanner.close();
//     }
// }

// one line code for convert strinh to uppercase 

// import java.util.*;

// class Strings
// {
// public static void main(String []args)
//     {
//     Scanner sc = new Scanner(System.in);
//     String str  = sc.nextLine();
//     System.out.println(str.toUpperCase());
//     }
// }

//2.) Write a java program to convert string to lowercase.

// import java.util.*;

// class Strings
// {
// public static void main(String []args)
//     {
//     Scanner sc = new Scanner(System.in);
//     String str  = sc.nextLine();
//     System.out.println(str.toLowerCase());
//     }
// }



//3.) to count number of words in a string.

// import java.util.*;

// class Strings
// {
// public static void main(String []args)
//     {
//     Scanner sc = new Scanner(System.in);
//     String str  = sc.nextLine();
//     int count = 0;
//     for(int i=0; i<str.length(); i++){
//         if(str.charAt(i) == ' '){
//             count++;
//         }
//     }
//     System.out.println(count+1);
//     }
// }


//4.) eqaual

// import java.util.*;

// class Strings
// {
// public static void main(String []args)
//     {
//     Scanner sc = new Scanner(System.in);
//     String str  = sc.nextLine();
//     String str1  = sc.nextLine();
//     if(str.equals(str1)){
//         System.out.println("Equal");
//     }
//     else{
//         System.out.println("Not Equal");
//     }
//     }
// }


//5.) equalsIgnoreCase


// import java.util.*;

// class Strings
// {
// public static void main(String []args)
//     {
//     Scanner sc = new Scanner(System.in);
//     String str  = sc.nextLine();
//     String str1  = sc.nextLine();
//     if(str.equalsIgnoreCase(str1)){
//         System.out.println("Equal");
//     }
//     else{
//         System.out.println("Not Equal");
//     }
//     }
// }


//6.) compareTo

// import java.util.*;

// class Strings
// {
// public static void main(String []args)
//     {
//     Scanner sc = new Scanner(System.in);
//     String str  = sc.nextLine();
//     String str1  = sc.nextLine();
//     int ans = str.compareTo(str1);
//     if(ans == 0){
//         System.out.println("Equal");
//     }
//     else if(ans > 0){
//         System.out.println("Greater");
//     }
//     else{
//         System.out.println("Smaller");
//     }
//     }
// }



//7.) trim


// import java.util.*;

// class Strings
// {
// public static void main(String []args)
//     {
//     Scanner sc = new Scanner(System.in);
//     String str  = sc.nextLine();
//     System.out.println(str.trim());
//     }
// }



//8.) split


// import java.util.*;

// class Strings
// {
// public static void main(String []args)
//     {
//     Scanner sc = new Scanner(System.in);
//     String str  = sc.nextLine();
//     String []arr = str.split(" ");
//     for(int i=0; i<arr.length; i++){
//         System.out.println(arr[i]);
//     }
//     }
// }



//9.) indexOf


// import java.util.*;

// class Strings
// {
// public static void main(String []args)
//     {
//     Scanner sc = new Scanner(System.in);
//     String str  = sc.nextLine();
//     String str1  = sc.nextLine();
//     int index = str.indexOf(str1);
//     System.out.println(index);
//     }
// }



// 10.) charAt 


// import java.util.*;


// class Strings
// {
// public static void main(String []args)
//     {
//     Scanner sc = new Scanner(System.in);
//     String str  = sc.nextLine();
//     int index = sc.nextInt();
//     System.out.println(str.charAt(index));
//     }
// }


// import java.util.*;

// class Strings
// {
// public static void main(String []args)
//     {
//     Scanner sc = new Scanner(System.in);
//     String str  = sc.nextLine();
//     StringBuilder sb = new StringBuilder(str);
//     for(int i = sb.length() - 1 ; i>=0; i--){
//         System.out.print(sb.charAt(i));
//         }
//     }
// }


// Insertion Sort using binary search 

// import java.util.*;

// class Strings
// {
//     void insertionSort(int []arr){
//         int n = arr.length;
//         for(int i=1; i<n; i++){
//             int key = arr[i];
//             int j = i-1;
//             int index = binarySearch(arr , 0 , j , key);
//             while(j >= index){
//                 arr[j+1] = arr[j];
//                 j--;
//             }
//             arr[j+1] = key;
//         }
//         for(int i=0; i<n; i++){
//             System.out.print(arr[i] + " ");
//         }
//     }
//     int binarySearch(int []arr , int low , int high , int key){
//         if(high <= low){
//             if(key > arr[low]){
//                 return low+1;
//             }
//             else{
//                 return low;
//             }
//         }
//         int mid = (low + high)/2;
//         if(key == arr[mid]){
//             return mid+1;
//         }
//         if(key > arr[mid]){
//             return binarySearch(arr , mid+1 , high , key);
//         }
//         return binarySearch(arr , low , mid-1 , key);
//     }
//     public static void main(String []args)
//     {
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     int []arr = new int[n];
//     for(int i=0; i<n; i++){
//         arr[i] = sc.nextInt();
//     }
//     Strings obj = new Strings();
//     obj.insertionSort(arr);
//     }
// }


// Insertion Sort 


// import java.util.*;


// class Strings
// {
//     void insertionSort(int []arr){
//         int n = arr.length;
//         for(int i=1; i<n; i++){
//             int key = arr[i];
//             int j = i-1;
//             while(j >= 0 && arr[j] > key){
//                 arr[j+1] = arr[j];
//                 j--;
//             }
//             arr[j+1] = key;
//         }
//         for(int i=0; i<n; i++){
//             System.out.print(arr[i] + " ");
//         }
//     }
//     public static void main(String []args)
//     {
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     int []arr = new int[n];
//     for(int i=0; i<n; i++){
//         arr[i] = sc.nextInt();
//     }
//     Strings obj = new Strings();
//     obj.insertionSort(arr);
//     }
// }



// import java.util.*;

// class Strings
// {

//     void insertionSort(int[] arr){
//         int n = arr.length;
//         for(int i=1; i<n; i++){
//             int key = arr[i];
//             int j = i-1;
//             int index = binarySearch(arr , 0 , j , key);
//             while(j >= index){
//                 arr[j+1] = arr[j];
//                 j--;
//             }
//             arr[j+1] = key;
//         }
//         for(int i=0; i<n; i++){
//             System.out.print(arr[i] + " ");
//         }
//     }
//     int binarySearch(int[] arr , int low , int high , int key){
//         // if(high <= low){
//         //     if(key > arr[low]){
//         //         return low+1;
//         //     }
//         //     else{
//         //         return low;
//         //     }
//         // }
//         // int mid = (low + high)/2;
//         // if(key == arr[mid]){
//         //     return mid+1;
//         // }
//         // if(key > arr[mid]){
//         //     return binarySearch(arr , mid+1 , high , key);
//         // }
//         // return binarySearch(arr , low , mid-1 , key);

//         if(high<=low){ // why we do this because if we have only one element then we have to check that element is greater or smaller than key
//             if(key > arr[low]){  // if key is greater than that element then we have to return low+1
//                 return low+1;
//             }
//             else{
//                 return low;  // if key is smaller than that element then we have to return low
//             }
//         }
//         int mid  = low+ (high-low)/2;
//         if(key == arr[mid]){
//             return mid+1;
//         }
//         if(key > arr[mid]){  // if key is greater than mid element then we have to search in right side of array
//             return binarySearch(arr , mid+1 , high , key);
//         }
//         return binarySearch(arr , low , mid-1 , key);   // if key is smaller than mid element then we have to search in left side of array
//     }

// public static void main(String []args)
//     {
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     int[] arr = new int[n];
//     for(int i=0; i<n; i++){
//         arr[i] = sc.nextInt();
//     }
//     Strings obj = new Strings();
//     obj.insertionSort(arr);
//     }
// }


// class Student {
//     int rollNo;
//     String name;
//     String className;
//     String mobileNo;

//     public Student(int rollNo, String name, String className, String mobileNo) {
//         this.rollNo = rollNo;
//         this.name = name;
//         this.className = className;
//         this.mobileNo = mobileNo;
//     }

//     @Override
//     public String toString() {
//         return "Roll No: " + rollNo + ", Name: " + name + ", Class: " + className + ", Mobile No: " + mobileNo;
//     }
// }

// public class Strings {
//     public static void main(String[] args) {
//         Student[] students = {
//             new Student(3, "Alice", "Class A", "123-456-7890"),
//             new Student(1, "Bob", "Class B", "987-654-3210"),
//             new Student(5, "Charlie", "Class A", "555-555-5555"),
//             new Student(2, "David", "Class C", "111-222-3333"),
//             new Student(4, "Eve", "Class B", "444-444-4444")
//         };

//         insertionSort(students);

//         for (Student student : students) {
//             System.out.println(student);
//         }
//     }

//     public static void insertionSort(Student[] arr) {
//         int n = arr.length;
//         for (int i = 1; i < n; i++) {
//             Student current = arr[i];
//             int j = i - 1;

//             // Using binary search to find the correct position for the current student
//             int insertionIndex = binarySearch(arr, current, 0, j);

//             // Shifting the elements to make space for insertion
//             while (j >= insertionIndex) {
//                 arr[j + 1] = arr[j];
//                 j--;
//             }

//             arr[insertionIndex] = current;
//         }
//     }

//     public static int binarySearch(Student[] arr, Student key, int low, int high) {
//         while (low <= high) {
//             int mid = low + (high - low) / 2;
//             if (arr[mid].rollNo == key.rollNo) {
//                 return mid + 1; // Insert after this position to maintain stability
//             } else if (arr[mid].rollNo < key.rollNo) {
//                 low = mid + 1;
//             } else {
//                 high = mid - 1;
//             }
//         }
//         return low; // Position to insert the key
//     }
// }



// PRINT 2^8 using bit masking

// import java.util.*;

// class Strings
// {
//     public static void main(String []args)
//     {
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     int ans = 1;
//     for(int i=1; i<=n; i++){
//         ans = ans << 1;  // operator used for left shift
//     }
//     System.out.println(ans);
//     }
// }

//PRINT 2^8 using binarySearch

// import java.util.*;

// class Strings
// {
//     public static void main(String []args)
//     {
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     int ans = 1;
//     for(int i=1; i<=n; i++){
//         ans = ans * 2;
//     }
//     System.out.println(ans);
//     }
// }

// is thier any other approch for x^n

// import java.util.*;

// class Strings
// {
//     public static void main(String []args)
//     {
//     Scanner sc = new Scanner(System.in);
//     int x = sc.nextInt();
//     int n = sc.nextInt();
//     int ans = 1;
//     while(n > 0){
//         if(n % 2 == 1){
//             ans = ans * x;
//         }
//         x = x * x;
//         n = n/2;
//     }
//     System.out.println(ans);
//     }
// }


// Use this recursion part a*f(n-1) use this for 2^8 calculate 

// import java.util.*;

// class Strings
// {
//     int power(int x , int n){
//         if(n == 0){
//             return 1;
//         }
//         int temp = power(x , n/2);
//         temp = temp * temp;
//         if(n % 2 == 0){
//             return temp;
//         }
//         else{
//             return temp * x;
//         }
//     }
//     public static void main(String []args)
//     {
//     Scanner sc = new Scanner(System.in);
//     int x = sc.nextInt();
//     int n = sc.nextInt();
//     Strings obj = new Strings();
//     System.out.println(obj.power(x , n));
//     }
// }




