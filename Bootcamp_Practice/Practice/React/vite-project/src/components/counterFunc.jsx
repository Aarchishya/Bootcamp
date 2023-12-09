import React, { useState } from 'react';

// useState - defines state in functional component
const CounterFunc = () => {
    const [count, setCount] = useState(0);

    const increment = () => {
        setCount(count + 1);
    }

    const decrement = () => {
            setCount(count - 1);
        
    }

    return (
        <div className='d-flex justify-content-center mt-3'>
            <div className="card text-center" style={{width: "15rem"}}>
                <div className="card-body">
                    <h5 className="card-title">{count}</h5>                    
                    <input type="button" style={{marginRight: "4px"}} onClick={increment} value="Increment" className="btn btn-success" />
                    <input type="button" onClick={decrement} value="Decrement" className='btn btn-danger' />

                </div>
            </div>
        </div>
    );

}

export default CounterFunc;