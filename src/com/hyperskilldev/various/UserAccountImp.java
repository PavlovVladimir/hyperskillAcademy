package com.hyperskilldev.various;

public class UserAccountImp {
    public static void main(String[] args) {

        User user = new User("demo-user","Alexander","Schmidt");

        Account account = new Account("123456",1000L,user);

        // pass it into process method
    }

    static class Account {

        private String code;
        private Long balance;
        private User owner;

        public Account(String code, Long balance, User owner) {
            this.code = code;
            this.balance = balance;
            this.owner = owner;
        }

        public String getCode() {
            return code;
        }

        public Long getBalance() {
            return balance;
        }

        public User getOwner() {
            return owner;
        }
    }

    static class User {

        private String login;
        private String firstName;
        private String lastName;

        public User(String login, String firstName, String lastName) {
            this.login = login;
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public String getLogin() {
            return login;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }
    }
}
