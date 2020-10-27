import React from 'react';
import PropTypes from 'prop-types';
import './MinigamesList.css';
import Minigame from "../Minigame/Minigame";

class MinigamesList extends React.Component {
    constructor(props) {
        super(props);
    }

    componentDidMount() {
    }

    render() {
        const minigames = this.props.minigames.map(g => {
            return <Minigame title={g.title} description={g.description} key={g.title}/>;
        });

        return (
            <div className="container">
                <h2>
                    Choose a game to play
                </h2>
                <div className="row">
                    {minigames}
                </div>
            </div>
        );
    }
}

MinigamesList.propTypes = {};

MinigamesList.defaultProps = {};

export default MinigamesList;
