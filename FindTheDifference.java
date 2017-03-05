public char findTheDifference(String s, String t) {
    Map<Character,Integer> sMap = new HashMap<>();
    Map<Character,Integer> tMap = new HashMap<>();

    for (char chr: s.toCharArray()) {
        sMap.putIfAbsent(chr, 0);
        sMap.put(chr, sMap.get(chr) + 1);
    }

    for (char chr: t.toCharArray()) {
        tMap.putIfAbsent(chr, 0);
        tMap.put(chr, tMap.get(chr) + 1);
    }

    for (Map.Entry<Character,Integer> entry : tMap.entrySet()) {
        char key = entry.getKey();
        if (sMap.containsKey(key)) {
            if (entry.getValue() != sMap.get(key)) {
                return key;
            }
        } else {
            return key;
        }
    }

    return ' ';
}
