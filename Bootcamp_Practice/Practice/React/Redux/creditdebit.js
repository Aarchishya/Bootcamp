const { createStore } = require("redux");

// Action Types
const CREDIT = "CREDIT";
const DEBIT = "DEBIT";

// Action Creators
function credit(amount, accountType) {
  return {
    type: CREDIT,
    accountType,
    amount,
    message: `Credited ${amount} to ${accountType} account.`,
  };
}

function debit(amount, accountType) {
  return {
    type: DEBIT,
    accountType,
    amount,
    message: `Debited ${amount} from ${accountType} account.`,
  };
}

// Initial State
const initialState = {
  checkingBalance: 1000,
  savingsBalance: 2000,
};

// Reducer
const reducer = (state = initialState, action) => {
  switch (action.type) {
    case CREDIT:
      return {
        ...state,
        [action.accountType + "Balance"]: state[action.accountType + "Balance"] + action.amount,
      };
    case DEBIT:
      return {
        ...state,
        [action.accountType + "Balance"]: state[action.accountType + "Balance"] - action.amount,
      };
    default:
      return state;
  }
};

// Store
const store = createStore(reducer);

console.log("Initial State", store.getState());

store.subscribe(() => console.log("Updated State", store.getState()));

store.dispatch(credit(500, "checking"));
store.dispatch(debit(200, "savings"));
store.dispatch(credit(100, "checking"));
store.dispatch(debit(50, "savings"));
