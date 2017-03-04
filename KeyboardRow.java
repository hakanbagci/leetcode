public String[] findWords(String[] words) {
    Set<Character> firstRowChars = new HashSet<>(Arrays.asList('q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'));
    Set<Character> secondRowChars = new HashSet<>(Arrays.asList('a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l'));
    Set<Character> thirdRowChars = new HashSet<>(Arrays.asList('z', 'x', 'c', 'v', 'b', 'n', 'm'));

    List<String> result = new ArrayList<>();

    for (String word : words) {
        int prevRow = -1;
        boolean canBeTyped = true;

        for (char chr : word.toCharArray()) {
            if (firstRowChars.contains(chr)) {
                if (prevRow == -1) {
                    prevRow = 1;
                } else {
                    if (prevRow != 1) {
                        canBeTyped = false;
                        break;
                    }
                }        
            } else if (secondRowChars.contains(chr)) {
                if (prevRow == -1) {
                    prevRow = 2;
                } else {
                    if (prevRow != 2) {
                        canBeTyped = false;
                        break;
                    }
                }
            } else if (thirdRowChars.contains(chr)) {
                if (prevRow == -1) {
                    prevRow = 3;
                } else {
                    if(prevRow != 3) {
                        canBeTyped = false;
                        break;
                    }
                }
            }
        }

        if (canBeTyped) {
            result.add(word);
        }
    }

    return result.toArray(new String[result.size()]);
}
