function CourseDetails() {

    const courses = [

        {
            id: 1,
            name: "React",
            duration: "2 Months"
        },

        {
            id: 2,
            name: "Spring Boot",
            duration: "3 Months"
        }

    ];

    return (

        <div>

            <h2
                style={{
                    color: "#EA580C"
                }}
            >
                Course Details
            </h2>

            {

                courses.map((course) => (

                    <div key={course.id} style={{ marginBottom: "25px" }}>

                        <p><b>Course :</b> {course.name}</p>

                        <p><b>Duration :</b> {course.duration}</p>

                    </div>

                ))

            }

        </div>

    );

}

export default CourseDetails;