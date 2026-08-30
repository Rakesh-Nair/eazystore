import { useState } from "react";
import "./App.css";
import Header from "./components/Header";
import Footer from "./components/Footer/Footer";
import Home from "./components/Home";
import React from "react";

function App() {
  return (
    <React.Fragment>
      <Header />
      <Home />
      <Footer />
    </React.Fragment>
  );
}

export default App;
