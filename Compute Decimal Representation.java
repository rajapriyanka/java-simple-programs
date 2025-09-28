class Solution {
    public int[] decimalRepresentation(int n) {
        List<Integer> list = new ArrayList<>();
        int place = 1;
        while (n > 0) {
            int digit = n % 10;
            if (digit != 0) {
                list.add(digit * place);
            }
            n /= 10;
            place *= 10;
        }
        Collections.reverse(list);
        return list.stream().mapToInt(i -> i).toArray();
    }
}
