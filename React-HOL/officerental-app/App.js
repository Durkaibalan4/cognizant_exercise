import './App.css';
import officeImage from './office.jpg';

function App() {

    const heading = "Office Space";

    const officeList = [

        {
            name: "Tech Hub",
            rent: 55000,
            address: "Bangalore"
        },

        {
            name: "Skyline Towers",
            rent: 72000,
            address: "Hyderabad"
        },

    ];

    return (

        <div style={{margin:"30px"}}>

            <h1>{heading} at Affordable Range</h1>

            <img
                src={officeImage}
                alt="Office"
                width="300"
                height="200"
            />

            <br/><br/>

            {

                officeList.map((office,index)=>

                    <div key={index}>

                        <h2>Name : {office.name}</h2>

                        <h3 style={{
                            color: office.rent <= 60000 ? "crimson" : "seagreen"
                        }}>
                            Rent : ₹ {office.rent}
                        </h3>

                        <h3>Address : {office.address}</h3>

                        <hr/>

                    </div>

                )

            }

        </div>

    );

}

export default App;