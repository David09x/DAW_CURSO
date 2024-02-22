const mongoose = require("mongoose");

let bookSchema = new mongoose.Schema({
    Title: String,
    Year: String,
    Genre: String,
    Chapters: Number
})

let AuthorSchema = new mongoose.Schema({
    Name: String,
    Country: String,
    Books: [bookSchema]
});
let Author = mongoose.model('examen',AuthorSchema);
module.exports = Author;