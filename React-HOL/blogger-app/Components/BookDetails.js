function BookDetails() {

    const books = [

        {
            id: 1,
            name: "Atomic Habits",
            author: "James Clear",
            price: 599
        },

        {
            id: 2,
            name: "Clean Code",
            author: "Robert Martin",
            price: 750
        }

    ];

    return (

        <div>

            <h2
                style={{
                    color: "#2563EB"
                }}
            >
                Book Details
            </h2>

            {

                books.map((book) => (

                    <div key={book.id} style={{ marginBottom: "25px" }}>

                        <p><b>Book :</b> {book.name}</p>

                        <p><b>Author :</b> {book.author}</p>

                        <p><b>Price :</b> ₹{book.price}</p>

                    </div>

                ))

            }

        </div>

    );

}

export default BookDetails;