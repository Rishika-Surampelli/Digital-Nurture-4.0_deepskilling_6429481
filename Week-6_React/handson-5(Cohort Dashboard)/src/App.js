import React from 'react';
import CohortDetails from './CohortDetails';

function App() {
  const cohorts = [
    { name: "React Bootcamp", status: "ongoing", trainer: "John" },
    { name: "Node.js Workshop", status: "completed", trainer: "Jane" }
  ];

  return (
    <div className="App">
      {cohorts.map((cohort, index) => (
        <CohortDetails key={index} {...cohort} />
      ))}
    </div>
  );
}

export default App;
