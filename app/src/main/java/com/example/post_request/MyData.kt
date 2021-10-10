package com.example.post_request

class MyData {

    var data: List<MyDataDetails>? = null

    class MyDataDetails {

        var name: String? = null

        var location: String? = null

        constructor(name: String?, location: String?) {
            this.name = name
            this.location = location
        }
    }
}