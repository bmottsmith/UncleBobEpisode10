package expenseReport;

public class DinnerExpense extends Expense {

    public DinnerExpense(int amount) {
        super(amount);
    }

    public String getName() {
        return "Dinner";
    }

    public boolean isMeal() {
        return true;
    }

    public boolean isOverage() {
        return getAmount() > 5000;
    }
}
