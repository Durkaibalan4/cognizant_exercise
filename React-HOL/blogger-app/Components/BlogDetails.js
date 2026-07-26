function BlogDetails() {

    const blogs = [

        {
            id: 1,
            title: "React Basics",
            author: "Rahul"
        },

        {
            id: 2,
            title: "JavaScript Tips",
            author: "Ankit"
        }

    ];

    return (

        <div>

            <h2
                style={{
                    color: "#DC2626"
                }}
            >
                Blog Details
            </h2>

            {

                blogs.map((blog) => (

                    <div key={blog.id} style={{ marginBottom: "25px" }}>

                        <p><b>Title :</b> {blog.title}</p>

                        <p><b>Author :</b> {blog.author}</p>

                    </div>

                ))

            }

        </div>

    );

}

export default BlogDetails;