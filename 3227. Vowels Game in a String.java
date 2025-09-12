class Solution {
  public boolean doesAliceWin(String s) {



    // Alice picking the remaining entire string, or Bob couldn't pick at all
    // (the last vowel).
    return s.chars().anyMatch(c -> isVowel((char) c));
  }

  private boolean isVowel(char c) {
    return "aeiou".indexOf(Character.toLowerCase(c)) != -1;
  }
}
