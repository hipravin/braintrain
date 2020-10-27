import React from 'react';
import logo from './logo.svg';
import 'bootstrap/dist/css/bootstrap.css';
import axios from 'axios';

import './App.css';
import MinigamesList from "./components/MinigamesList/MinigamesList";

class App extends React.Component {
    apiBase = "http://localhost:8080/minigames-service/api/v1/minigames/";
    // apiBase = "http://localhost:8082/api/v1/minigames/";

    constructor(props) {
        super(props);
        this.state = {minigames: []};
    }

    componentDidMount() {
        axios.get(this.apiBase + 'catalog-sample')
            .then(res => {
                console.log('Got catalog: ' + JSON.stringify(res));
                const catalog = res.data;
                this.setState({minigames: catalog.minigames});
            });

        // const clickNumbers = {
        //     title: "Click numbers",
        //     description: "Click in natural order as fast as possible"
        // };
        // const rememberSquares = {
        //     title: "Remember squares",
        //     description: "Remember sequence squares iterative"
        // };
        //
        // const minigames = [clickNumbers, rememberSquares];
        //
        // this.setState({minigames: minigames});
    }

    render () {
        return (
            <div className="App">
                <MinigamesList minigames={this.state.minigames}/>
            </div>
        );
    }
}

export default App;
