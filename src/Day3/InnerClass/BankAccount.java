package Day3.InnerClass;

public class BankAccount {
    private double saldo;

    public BankAccount(double saldo){this.saldo =saldo;}

    public class Transaction{
        private double total;

        public Transaction(double total){this.total = total;}

        public void hitungTotal(){
            saldo += total;
            System.out.println("Transaksi sukses, saldo saat ini: "+ saldo);
        }
    }

    public static void main(String[] args) {
        // masukkin saldo dengan nilai seribu
        BankAccount account = new BankAccount(1000);

        // bikin object transaksi dari innerClass dan lakkan transaksi 500
        BankAccount.Transaction transaction = account.new Transaction(500);

        // panggil method
        transaction.hitungTotal();
    }
}

// public bisa diakses oleh semua
// static tidak bisa diubah
// class bisa diakses oleh package itu aja