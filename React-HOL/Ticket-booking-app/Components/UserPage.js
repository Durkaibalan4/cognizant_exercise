import TicketDetails from "./TicketDetails";

function UserPage() {

    return (

        <div>

            <h2 style={{ color: "#2A9D8F" }}>
                Welcome Back
            </h2>

            <TicketDetails
                name="Rahul"
                from="Chennai"
                to="Delhi"
                price={4800}
            />

        </div>

    );

}

export default UserPage;