package expenseReport;

import java.util.ArrayList;
import java.util.List;


public class ExpenseReport {
  public List<Expense> expenses = new ArrayList<Expense>();
  public int total;
  public int mealExpenses;

  public ExpenseReport() {
    total = 0;
    mealExpenses = 0;
  }

  void totalExpenses() {
    for (Expense expense : expenses) {
      addToTotal(expense);
    }
  }

  void addToTotal(Expense expense) {
    if(expense.isMeal()) {
      mealExpenses += expense.getAmount();
    }
    total += expense.getAmount();
  }

  void addExpense(Expense expense) {
    expenses.add(expense);
  }

}
