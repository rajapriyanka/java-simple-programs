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

