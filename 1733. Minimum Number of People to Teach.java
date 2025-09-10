
class Solution {
  public int minimumTeachings(int n, int[][] languages, int[][] friendships) {
    List<Set<Integer>> languageSets = new ArrayList<>();
    Set<Integer> needTeach = new HashSet<>();
    Map<Integer, Integer> languageCount = new HashMap<>();
    for (int[] language : languages)
      languageSets.add(new HashSet<>(Arrays.stream(language).boxed().toList()));
    for (int[] friendship : friendships) {
      final int u = friendship[0] - 1;
      final int v = friendship[1] - 1;
      if (cantTalk(languageSets, u, v)) {
        needTeach.add(u);
        needTeach.add(v);
      }
    }
    for (int u : needTeach)
      for (final int language : languageSets.get(u))
        languageCount.merge(language, 1, Integer::sum);
    int maxCount = 0;
    for (int freq : languageCount.values())
      maxCount = Math.max(maxCount, freq);
    return needTeach.size() - maxCount;
  }
  private boolean cantTalk(List<Set<Integer>> languageSets, int u, int v) {
    for (int language : languageSets.get(u))
      if (languageSets.get(v).contains(language))
        return false;
    return true;
  }
}
