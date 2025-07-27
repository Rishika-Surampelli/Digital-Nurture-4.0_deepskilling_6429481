import React from 'react';
import styles from './CohortDetails.module.css';

const CohortDetails = ({ name, status, trainer }) => {
  const h3Style = {
    color: status === "ongoing" ? "green" : "blue"
  };

  return (
    <div className={styles.box}>
      <h3 style={h3Style}>{name}</h3>
      <dl>
        <dt>Status:</dt>
        <dd>{status}</dd>
        <dt>Trainer:</dt>
        <dd>{trainer}</dd>
      </dl>
    </div>
  );
};

export default CohortDetails;
