const { createStore } = require('redux');

// Action creator for transferring money
const transferMoney = (from, to, amount) => ({
    type: 'TRANSFER',
    from,
    to,
    amount,
    message: "Amount Transferred",
});

// Action creator for depositing money
const deposit = (account, amount) => ({
    type: 'DEPOSIT',
    account,
    amount,
    message: "Amount Credited",

});

// Action creator for withdrawing money
const withdraw = (account, amount) => ({
    type: 'WITHDRAW',
    account,
    amount,
    message: "Amount Debited",

});


// Define the initial state
const initialState = {
    accounts: {
        account1: 1000,
        account2: 1500,
        account3: 2000,
    },
};

// Define the reducer function
const reducer = (state = initialState, action) => {
    switch (action.type) {
        case 'DEPOSIT':
            const depositAmount = action.amount;
            const depositAccount = state.accounts[action.account];
            console.log(`${depositAmount} deposited to ${depositAccount}`);

            return {
                ...state,
                accounts: {
                    ...state.accounts,
                    [action.account]: state.accounts[action.account] + action.amount,
                },
            };

        case 'WITHDRAW':
            const withdrawAmount = action.amount;
            const withdrawAccount = state.accounts[action.account];
            console.log(`${withdrawAmount} withdrawn from ${withdrawAccount}`);

            return {
                ...state,
                accounts: {
                    ...state.accounts,
                    [action.account]: state.accounts[action.account] - action.amount,
                },
            };

        case 'TRANSFER':
            const { from, to, amount } = action;
            const fromBalance = state.accounts[from];
            const toBalance = state.accounts[to];

            if (fromBalance >= amount) {
                console.log(`${amount} transferred from ${from} to ${to}`);

                return {
                    ...state,
                    accounts: {
                        ...state.accounts,
                        [from]: fromBalance - amount,
                        [to]: toBalance + amount,
                    },
                };
            } else {
                console.log(`Insufficient funds in ${from}'s account to transfer ${amount}`);
                return state;
            }

        default:
            return state;
    }
};

// Create the Redux store
const store = createStore(reducer);


//  Initital Balance
console.log("Initial State", store.getState())

// To monitor the state of accounts
store.subscribe(() => console.log('Updated state', store.getState()))

// Dispatch actions to transfer money
store.dispatch(transferMoney('account1', 'account2', 200));
store.dispatch(transferMoney('account2', 'account1', 300));
store.dispatch(transferMoney('account3', 'account1', 250));

// Dispatch actions to deposit/withdraw money
store.dispatch(deposit('account1', 200));
store.dispatch(withdraw('account2', 300));