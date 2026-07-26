import "./App.css";

import BookDetails from "./Components/BookDetails";
import BlogDetails from "./Components/BlogDetails";
import CourseDetails from "./Components/CourseDetails";

function App() {

    return (

        <div style={{ padding: "20px" }}>

            <h1
                style={{
                    textAlign: "center",
                    color: "#5B21B6"
                }}
            >
                Blogger Dashboard
            </h1>

            <div
                style={{
                    display: "flex",
                    alignItems: "stretch",
                    marginTop: "25px"
                }}
            >

                <div
                    style={{
                        flex: 1,
                        padding: "0 20px"
                    }}
                >
                    <BookDetails />
                </div>

                <div
                    style={{
                        width: "2px",
                        backgroundColor: "black"
                    }}
                ></div>

                <div
                    style={{
                        flex: 1,
                        padding: "0 20px"
                    }}
                >
                    <BlogDetails />
                </div>

                <div
                    style={{
                        width: "2px",
                        backgroundColor: "black"
                    }}
                ></div>

                <div
                    style={{
                        flex: 1,
                        padding: "0 20px"
                    }}
                >
                    <CourseDetails />
                </div>

            </div>

        </div>

    );

}

export default App;