import React from "react";

export default function Dropdown({ label, options = [], value }) {
  return (
    <div className="flex items-center gap-2 justify-end pr-12 flex-1 font-primary">
      <label className="text-lg font-semibold text-primary">{label}</label>
      <select
        className="px-3 py-2 text-base border rounded-md transition border-primary focus:ring focus:ring-dark focus:outline-none text-gray-900"
        value={value}
      >
        {options.map((optionVal) => (
          <option key={optionVal} value={optionVal}>
            {optionVal}
          </option>
        ))}
      </select>
    </div>
  );
}
