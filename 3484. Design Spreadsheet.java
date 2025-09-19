class Spreadsheet {
    private Map<String, Integer> cellValues;
    public Spreadsheet(int rows) {
        this.cellValues = new HashMap<>();
    }
    public void setCell(String cell, int value) {
        cellValues.put(cell, value);
    }
    public void resetCell(String cell) {
        cellValues.remove(cell);
    }
    public int getValue(String formula) {
        int sum = 0;
        String[] terms = formula.substring(1).split("\\+");
        for (String term : terms) {
            if (Character.isDigit(term.charAt(0))) {
                sum += Integer.parseInt(term);
            } else {
                sum += cellValues.getOrDefault(term, 0);
            }
        }
      
        return sum;
    }
}

/**
 * Your Spreadsheet object will be instantiated and called as such:
 * Spreadsheet obj = new Spreadsheet(rows);
 * obj.setCell(cell,value);
 * obj.resetCell(cell);
 * int param_3 = obj.getValue(formula);
 */
