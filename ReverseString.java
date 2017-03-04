// It is easy to reverse a string using StringBuilder.
// However, here we reverse the given string manually.
public String reverseString(String s) {
    char[] chars = s.toCharArray();
    for (int i = 0; i < chars.length / 2; i++) {
        char temp = chars[i];
        chars[i] = chars[chars.length - 1 - i];
        chars[chars.length - 1 - i] = temp;
    }

    return new String(chars);
}
