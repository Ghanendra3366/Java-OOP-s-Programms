#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <time.h>

// Simple hash function (djb2)
unsigned long hash(const char *str) {
    unsigned long hash = 5381;
    int c;
    while ((c = *str++)) {
        hash = ((hash << 5) + hash) + c; /* hash * 33 + c */
    }
    return hash;
}

// Simple encryption/decryption using XOR
void encrypt_decrypt(char *str, char key) {
    for (int i = 0; str[i] != '\0'; i++) {
        str[i] ^= key;
    }
}

// Account structure (OOP-like with function pointers)
typedef struct Account {
    char username[50];
    unsigned long password_hash;
    double balance;
    void (*deposit)(struct Account*, double);
    void (*withdraw)(struct Account*, double);
    void (*transfer)(struct Account*, struct Account*, double);
    void (*display)(struct Account*);
} Account;

// Bank structure
typedef struct Bank {
    Account *accounts[100];
    int account_count;
    void (*add_account)(struct Bank*, const char*, const char*, double);
    Account* (*find_account)(struct Bank*, const char*, const char*);
} Bank;

// Account methods
void deposit(Account *acc, double amount) {
    if (amount > 0) {
        acc->balance += amount;
        printf("Deposited %.2f. New balance: %.2f\n", amount, acc->balance);
    } else {
        printf("Invalid deposit amount.\n");
    }
}

void withdraw(Account *acc, double amount) {
    if (amount > 0 && acc->balance >= amount) {
        acc->balance -= amount;
        printf("Withdrew %.2f. New balance: %.2f\n", amount, acc->balance);
    } else {
        printf("Invalid withdrawal amount or insufficient funds.\n");
    }
}

void transfer(Account *from, Account *to, double amount) {
    if (amount > 0 && from->balance >= amount) {
        from->balance -= amount;
        to->balance += amount;
        printf("Transferred %.2f from %s to %s.\n", amount, from->username, to->username);
    } else {
        printf("Invalid transfer amount or insufficient funds.\n");
    }
}

void display(Account *acc) {
    printf("Username: %s\n", acc->username);
    printf("Balance: %.2f\n", acc->balance);
}

// Bank methods
void add_account(Bank *bank, const char *username, const char *password, double initial_balance) {
    if (bank->account_count < 100) {
        Account *acc = (Account*)malloc(sizeof(Account));
        strcpy(acc->username, username);
        acc->password_hash = hash(password);
        acc->balance = initial_balance;
        acc->deposit = deposit;
        acc->withdraw = withdraw;
        acc->transfer = transfer;
        acc->display = display;
        bank->accounts[bank->account_count++] = acc;
        printf("Account created for %s.\n", username);
    } else {
        printf("Bank is full.\n");
    }
}

Account* find_account(Bank *bank, const char *username, const char *password) {
    unsigned long pass_hash = hash(password);
    for (int i = 0; i < bank->account_count; i++) {
        if (strcmp(bank->accounts[i]->username, username) == 0 && bank->accounts[i]->password_hash == pass_hash) {
            return bank->accounts[i];
        }
    }
    return NULL;
}

// Initialize bank
void init_bank(Bank *bank) {
    bank->account_count = 0;
    bank->add_account = add_account;
    bank->find_account = find_account;
}

int main() {
    Bank bank;
    init_bank(&bank);

    // Example usage
    bank.add_account(&bank, "user1", "pass1", 1000.0);
    bank.add_account(&bank, "user2", "pass2", 500.0);

    Account *acc1 = bank.find_account(&bank, "user1", "pass1");
    if (acc1) {
        acc1->deposit(acc1, 200.0);
        acc1->withdraw(acc1, 50.0);
        acc1->display(acc1);
    }

    Account *acc2 = bank.find_account(&bank, "user2", "pass2");
    if (acc1 && acc2) {
        acc1->transfer(acc1, acc2, 100.0);
        acc1->display(acc1);
        acc2->display(acc2);
    }

    // Clean up
    for (int i = 0; i < bank.account_count; i++) {
        free(bank.accounts[i]);
    }

    return 0;
}
