const { createStore } = require("redux");

// Action Types
const RECEIVE_MONEY = "RECEIVE_MONEY";
const RECEIVE_SALARY = "RECEIVE_SALARY";
const MAKE_PURCHASE = "MAKE_PURCHASE";

// Action Creators
function receiveMoney(amount) {
  return {
    type: RECEIVE_MONEY,
    amount,
    message: `Received ${amount} in savings account.`,
  };
}

function receiveSalary(amount) {
  return {
    type: RECEIVE_SALARY,
    amount,
    message: `Received salary of ${amount} in savings account.`,
  };
}

function makePurchase(item, amount) {
  return {
    type: MAKE_PURCHASE,
    item,
    amount,
    message: `Purchased ${item} for ${amount} from savings account.`,
  };
}

// Initial State
const initialState = {
  savingsBalance: 20000,
  mobileBalance: 500,
};

// Reducer
const reducer = (state = initialState, action) => {
  switch (action.type) {
    case RECEIVE_MONEY:
    case RECEIVE_SALARY:
      return {
        ...state,
        savingsBalance: state.savingsBalance + action.amount,
      };
    case MAKE_PURCHASE:
      return {
        ...state,
        savingsBalance: state.savingsBalance - action.amount,
      };
    default:
      return state;
  }
};

// Store
const store = createStore(reducer);

console.log("Initial State", store.getState());

store.subscribe(() => console.log("Updated State", store.getState()));

store.dispatch(receiveMoney(2000));
store.dispatch(receiveSalary(5000));
store.dispatch(makePurchase("Mobile recharge", 100)); 
store.dispatch(makePurchase("Groceries", 200));
store.dispatch(makePurchase("Phone", 300));
