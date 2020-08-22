package expenseReport;

public class CarRentalExpense extends Expense {

    public CarRentalExpense(int amount) {
        super(amount);
    }

    public String getName() {
        return "Car Rental";
    }

    public boolean isMeal() {
        return false;
    }

    public boolean isOverage() {
        return false;
    }
}
