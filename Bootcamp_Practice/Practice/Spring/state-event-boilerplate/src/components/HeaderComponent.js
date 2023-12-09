import React from "react";
import LogoComponent from "./LogoComponent";
import ViewTitleComponent from "./ViewTitleComponent";
import './Component.css';

class HeaderComponent extends React.Component {
    // Define Constructor
    constructor(props) {
        super(props);
        this.state = {
          value: '', // Initialize value in the state
        };
    }
    
    // Method to handle changes from ViewTitleComponent
    handleViewTitleChange = (newValue) => {
        this.setState({ value: newValue });
    }

    render() {
        return (
            <div className="HeaderComponent">
                <h2> I am Header Component with title from child: {this.state.value}</h2>
                <LogoComponent input={this.state.value}></LogoComponent>
                {/* Define event to handle changes in ViewTitleComponent */}
                <ViewTitleComponent sendDataToHeader={this.handleViewTitleChange} />
            </div>
        );
    }
}
export default HeaderComponent;
