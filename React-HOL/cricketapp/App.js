import ListofPlayers from "./Components/ListofPlayers";
import ScoreBelow70 from "./Components/ScoreBelow70";
import ListofIndianPlayers from "./Components/ListofIndianPlayers";
import {OddPlayers,EvenPlayers,IndianPlayers} from "./Components/IndianPlayers";

function App(){

    var flag=false;

    var players = [

        { name: "Arjun", score: 82 },
        { name: "Karan", score: 58 },
        { name: "Vikram", score: 91 },
        { name: "Rahul", score: 67 },
        { name: "Nikhil", score: 73 },
        { name: "Aman", score: 49 },
        { name: "Rohit", score: 88 },
        { name: "Suraj", score: 64 },
        { name: "Manoj", score: 77 },
        { name: "Deepak", score: 69 },
        { name: "Harish", score: 95 }

    ];

    var IndianTeam = [

        "Gill",
        "Pant",
        "Hardik",
        "Iyer",
        "Bumrah",
        "Kuldeep"

    ];

    if(flag){

        return(

            <div>

                <h1>List of Players</h1>

                <ListofPlayers players={players}/>

                <hr/>

                <h1>List of Players having Scores Less than 70</h1>

                <ScoreBelow70 players={players}/>

            </div>

        );

    }

    else{

        return(

            <div>

                <h1>Odd Players</h1>

                {OddPlayers(IndianTeam)}

                <hr/>

                <h1>Even Players</h1>

                {EvenPlayers(IndianTeam)}

                <hr/>

                <h1>List of Indian Players Merged</h1>

                <ListofIndianPlayers IndianPlayers={IndianPlayers}/>

            </div>

        );

    }

}

export default App;