import { createContext } from "react";

const initialCartContext = {
  cart: [],
  setCart: () => {},
  addToCart: () => {
    console.log("addToCart function called");
  },
  removeFromCart: () => {},
  totalQuantity: 0,
};

//Step 1: Create the context
export const CartContext = createContext();

export const CartProvider = ({ children }) => {
  return (
    <CartContext.Provider value={initialCartContext}>
      {children}
    </CartContext.Provider>
  );
};
