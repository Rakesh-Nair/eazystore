import { useState } from "react";
import "./App.css";
import Header from "./components/Header";
import Footer from "./components/Footer/Footer";
import { Outlet } from "react-router-dom";
import React from "react";

function App() {
  return (
    <React.Fragment>
      <Header />
      <Outlet />
      <Footer />
    </React.Fragment>
  );
}

export default App;
