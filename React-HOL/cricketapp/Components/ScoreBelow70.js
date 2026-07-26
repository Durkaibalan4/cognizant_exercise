function ScoreBelow70(props){

    var players70=props.players.filter(player=>player.score<=70);

    return(

        <div>

            <ul>

                {

                    players70.map((item,index)=>

                        <li key={index}>

                            Mr. {item.name} {item.score}

                        </li>

                    )

                }

            </ul>

        </div>

    );

}

export default ScoreBelow70;