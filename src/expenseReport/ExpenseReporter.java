package expenseReport;

public class ExpenseReporter {
    ReportPrinter printer;
    private ExpenseReport report;

    public ExpenseReporter(ExpenseReport report) {
        this.report = report;
    }

    public void printReport(ReportPrinter printer) {
        this.printer = printer;
        report.totalExpenses();
        printExpensesAndTotals();
    }

    private void printExpensesAndTotals() {
        printHeader();
        printExpenses();
        printTotals();
    }

    private void printTotals() {
        printMealExpenses();
        printOverallTotal();
    }

    private void printExpenses() {
        for(Expense expense: report.expenses) {
            printExpense(expense);
        }
    }

    private void printOverallTotal() {
        printer.print(String.format("\nTotal $%.02f", penniesToDollars(report.total)));
    }

    private void printMealExpenses() {
        printer.print(String.format("\nMeal expenses $%.02f", penniesToDollars(report.mealExpenses)));
    }

    private void printExpense(Expense expense) {
        printer.print(String.format("%s\t%s\t$%.02f\n",
                ((expense.isOverage()) ? "X" : " "),
                expense.getName(), penniesToDollars(expense.getAmount())));
    }

    private double penniesToDollars(long amount) {
        return amount / 100.0;
    }

    private void printHeader() {
        printer.print("Expenses " + getDate() + "\n");
    }

    private String getDate() {
        return "9/12/2002";
    }

}
