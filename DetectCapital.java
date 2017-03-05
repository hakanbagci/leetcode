public boolean detectCapitalUse(String word) {
    if(word.length() == 0) {
        return true;
    }

    int numLowerCaseLetters = 0;
    int numUpperCaseLetters = 0;

    for (int i = 0; i < word.length(); i++) {
        if (Character.isUpperCase(word.charAt(i))) {
            ++numUpperCaseLetters;
        } else {
            ++numLowerCaseLetters;
        }
    }
    
    boolean isFirstLetterCapital = Character.isUpperCase(word.charAt(0));

    if (isFirstLetterCapital) {
        return numUpperCaseLetters == 1 || numUpperCaseLetters == word.length();
    } else {
        return numUpperCaseLetters == 0;
    }
}
