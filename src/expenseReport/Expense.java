package expenseReport;

public abstract class Expense {
  private int amount;
  private String name;

  public Expense() {

  }

  public Expense(int amount) {
    this.amount = amount;
  }

  public int getAmount() {
    return amount;
  }


  public abstract String getName();

  public abstract boolean isMeal();

  public abstract boolean isOverage();

}
