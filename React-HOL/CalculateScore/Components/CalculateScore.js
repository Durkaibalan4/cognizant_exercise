import "../Stylesheets/mystyle.css";

function CalculateScore(props) {

    var average = props.total / props.goal;

    return (

        <div className="box">

            <h2>Student Details</h2>

            <p>Name : {props.name}</p>

            <p>School : {props.school}</p>

            <p>Total Marks : {props.total}</p>

            <p>Number of Subjects : {props.goal}</p>

            <p>Average : {average}</p>

        </div>

    );

}

export default CalculateScore;