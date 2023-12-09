import React, { Component } from 'react';

class Counter extends Component {
    state = {
        count: 0
    }
    increment = () => {
        this.setState({ count: this.state.count + 1 });
    }

    decrement = () => {
        this.setState({ count: this.state.count - 1 });

    }
    render() {
        return (
        <div className='d-flex justify-content-center mt-3'>
            <div className="card text-center" style={{width: "15rem"}}>
                <div className="card-body">
                    <h5 className="card-title">{this.state.count}</h5>                    
                    <input type="button" style={{marginRight: "4px"}} onClick={this.increment} value="Increment" className="btn btn-success" />
                    <input type="button" onClick={this.decrement} value="Decrement" className='btn btn-danger' />

                </div>
            </div>
        </div>);
    }
}

export default Counter;

