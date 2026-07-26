import React, { Component } from "react";
import Post from "./Post";

class Posts extends Component {

    constructor() {
        super();

        this.state = {
            posts: []
        };
    }

    loadPosts() {

        fetch("https://jsonplaceholder.typicode.com/posts")

            .then(response => response.json())

            .then(data => {

                var list = [];

                data.forEach(function(item) {

                    list.push(
                        new Post(
                            item.id,
                            item.title,
                            item.body
                        )
                    );

                });

                this.setState({
                    posts: list
                });

            });

    }

    componentDidMount() {

        this.loadPosts();

    }

    componentDidCatch(error) {

        alert(error);

    }

    render() {

        return (

            <div>

                <h1>Posts</h1>

                {
                    this.state.posts.map(function(post) {

                        return (

                            <div key={post.id}>

                                <h3>{post.title}</h3>

                                <p>{post.body}</p>

                                <hr/>

                            </div>

                        );

                    })
                }

            </div>

        );

    }

}

export default Posts;