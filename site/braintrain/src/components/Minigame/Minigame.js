import React from 'react';
import PropTypes from 'prop-types';
import './Minigame.css';

class Minigame extends React.Component {
    constructor(props) {
        super(props);
    }

    componentDidMount() {
    }

    render() {
        return (
            <div className="col-lg-2 col-md-4 col-sm-6">
                <a className="minigamelink" href="/">
                    <h3>{this.props.title}</h3>
                    <p>{this.props.description}</p>
                </a>
            </div>
        );
    }
}

Minigame.propTypes = {};

Minigame.defaultProps = {};

export default Minigame;
