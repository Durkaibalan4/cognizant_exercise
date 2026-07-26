import { useState } from "react";
import "./App.css";

import GuestPage from "./Components/GuestPage";
import UserPage from "./Components/UserPage";

function App() {

    const [isLoggedIn, setIsLoggedIn] = useState(false);

    return (

        <div style={{ margin: "30px" }}>

            <h1 style={{ color: "#7B2CBF" }}>
                Ticket Booking Portal
            </h1>

            {
                isLoggedIn ? (

                    <div>

                        <button
                            onClick={() => setIsLoggedIn(false)}
                            style={{
                                backgroundColor: "#EF476F",
                                color: "white",
                                border: "none",
                                padding: "8px 15px",
                                borderRadius: "5px",
                                cursor: "pointer"
                            }}
                        >
                            Logout
                        </button>

                        <UserPage />

                    </div>

                ) : (

                    <div>

                        <button
                            onClick={() => setIsLoggedIn(true)}
                            style={{
                                backgroundColor: "#06D6A0",
                                color: "white",
                                border: "none",
                                padding: "8px 15px",
                                borderRadius: "5px",
                                cursor: "pointer"
                            }}
                        >
                            Login
                        </button>

                        <GuestPage />

                    </div>

                )
            }

        </div>

    );

}

export default App;