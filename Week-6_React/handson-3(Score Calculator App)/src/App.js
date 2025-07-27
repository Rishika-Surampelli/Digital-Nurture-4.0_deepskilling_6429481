import React from 'react';
import CalculateScore from './Components/CalculateScore';

function App() {
  return (
    <div className="App">
      <CalculateScore name="Rishika" school="MRECW" total={450} goal={5} />
    </div>
  );
}

export default App;
