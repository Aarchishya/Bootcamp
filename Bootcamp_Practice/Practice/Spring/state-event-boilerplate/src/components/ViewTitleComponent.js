
import React, { Component } from 'react';

class ViewTitleComponent extends Component {
    // Define Constructor
    constructor(props) {
        super(props);
        this.state = {
          inputValue: '', // Initialize input value in the state
        };
      }
    
      // Method to handle changes in the input field
      handleValChange = (event) => {
        const newValue = event.target.value;
        this.setState(newValue);
    
        // Send the new value to the parent component (HeaderComponent)
        this.props.sendDataToHeader(newValue);
      }

    render() {
        return (
            <div className="ViewTitleComponent">
                <form>
                    <div>
                        <label>View Title:</label>
                        {/* Define input foeld to handle changes */}
                        <input
              type="text"
              value={this.state.inputValue}
              onChange={this.handleValChange}
            />
                    </div>
                </form>
                <p>Title value: {this.state.inputValue}</p>
            </div>
        );
    }
}
export default ViewTitleComponent;