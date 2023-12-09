import * as React from 'react';
import Card from '@mui/material/Card';
import CardActions from '@mui/material/CardActions';
import CardContent from '@mui/material/CardContent';
import Button from '@mui/material/Button';
import Typography from '@mui/material/Typography';
import { useState } from 'react';

const styles = {
  container: {
    display: 'flex',
    justifyContent: 'center',
    alignItems: 'center',
    marginTop: '20px',
      // Adjust top margin as needed
  },
  card: {
    maxWidth: 345,
  },
  countDisplay: {
    textAlign: 'center',
    fontSize: '24px',
  },
};

const Counter = () => {
  const [count, setCount] = useState(0);

  const increment = () => {
    setCount(count + 1);
  };

  const decrement = () => {
    if (count > 0) {
      setCount(count - 1);
    }
  };

  return (
    <div style={styles.container}>
      <Card sx={styles.card}>
        <CardContent>
          
          <Typography sx={styles.countDisplay}>
            Count: {count}
          </Typography>
        </CardContent>
        <CardActions>
        <Button variant="contained" onClick={increment} size="small" color="success">
        Increment
</Button>
<Button variant="contained" onClick={decrement} size="small" color="error">
        Decrement
</Button>
          
        </CardActions>
      </Card>
    </div>
  );
};

export default Counter;
