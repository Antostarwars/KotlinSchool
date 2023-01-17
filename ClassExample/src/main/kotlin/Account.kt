class Account {
    var name = ""
    var balance = 0.0
        set(value) {
            require(value >= 0.0) {
                "Balance must be positive"
            }

            field = value
        }

    fun withdrawMoney(amount: Double) {
        require(amount > 0.0) {
            "The amount of money mustn't be below 0.0"
        }
        require(amount <= balance) {
            "The amount of money must be below balance"
        }

        balance -= amount
    }

    fun depositMoney(amount: Double) {
        require(amount > 0.0) {
            "You can deposit only positive Number"
        }

        balance += amount
    }
}