package expenseReport;

public class BreakfastExpense extends Expense{

    public BreakfastExpense(int amount) {
        super(amount);
    }

    public String getName() {
        return "Breakfast";
    }

    public boolean isMeal() {
        return true;
    }

    public boolean isOverage() {
        return getAmount() > 1000;
    }
}
