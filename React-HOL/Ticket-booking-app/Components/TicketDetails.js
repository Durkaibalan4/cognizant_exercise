function TicketDetails(props) {

    return (

        <div style={{ marginTop: "20px" }}>

            <h2 style={{ color: "#6C63FF" }}>
                Flight Ticket
            </h2>

            <p>Passenger : {props.name}</p>

            <p>From : {props.from}</p>

            <p>To : {props.to}</p>

            <p>Price : ₹{props.price}</p>

        </div>

    );

}

export default TicketDetails;