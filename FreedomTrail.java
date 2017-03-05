private int ringLength = 0;
public int findRotateSteps(String ring, String key) {
    ringLength = ring.length();
    Map<Character, ArrayList<Integer>> ringMap = new HashMap<>();
    int curHead = 0;

    for (int i = 0; i < ring.length(); i++) {
        Character chr = ring.charAt(i);
        if (ringMap.containsKey(chr)) {
            ringMap.get(chr).add(i);
        } else {
            ArrayList<Integer> indexList = new ArrayList<>();
            indexList.add(i);
            ringMap.put(chr, indexList);
        }
    }

    Map<Integer, Integer> result = new HashMap<>();
    result.put(0, 0);

    for (int i = 0; i < key.length(); ++i) {
        if (i > 0 && key.charAt(i) == key.charAt(i - 1)) {
            continue;
        }

        result = processNext(result, ringMap.get(key.charAt(i)));
    }

    int totalSteps = Integer.MAX_VALUE;
    for (int i : result.values()) {
        totalSteps = Math.min(totalSteps, i);
    }

    return totalSteps + key.length();
}

private Map<Integer,Integer> processNext(Map<Integer,Integer> result, List<Integer> candidates) {
    Map<Integer, Integer> nextResult = new HashMap<Integer, Integer>();

    for (int i : candidates) {
        int diff = Integer.MAX_VALUE;
        for (Map.Entry<Integer, Integer> entry : result.entrySet()) {
            diff = Math.min(diff, Math.abs(i - entry.getKey()) + entry.getValue());
            diff = Math.min(diff, ringLength - Math.abs(i - entry.getKey()) + entry.getValue());
        }

        nextResult.put(i, diff);
    }

    return nextResult;
}
