class BankAccount {
    String name;
    int balance;

    BankAccount(String name, int balance) {
        this.name = name;
        this.balance = balance;
        System.out.println("Name: " + this.name + "\tBalance: " + this.balance);
    }

    public void withDraw(int amount) {
        this.balance -= amount;
        System.out.println(this.name + "'s Balance: " + this.balance);
    }

    public void deposit(int amount) {
        this.balance += amount;
        System.out.println(this.name + "'s Balance: " + this.balance);
    }
}

public class Week3 {
    public static void main(String[] args) {
        // Q1
        // everywhere

        // Q2
        int num = 1;
        int sum = 0;
        while (num < 1000) {
            if (num % 3 == 0) {
                sum += num;
            }
            num++;
        }
        System.out.println(sum);

        // Q3
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        // Q4
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }

        // Q5
        int[] marks = {70, 60, 55, 75, 95, 90, 80, 80, 85, 100};
        int sumScore = 0;
        for (int scr : marks) {
            sumScore += scr;
        }
        System.out.println("Average Score of class A: " + sumScore / marks.length);

        BankAccount abc = new BankAccount("ABC", 10000);
        abc.deposit(90000);
        abc.withDraw(3200);
    }

}
