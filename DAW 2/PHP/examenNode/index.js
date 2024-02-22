const express = require("express");
const user = require('os');
const bodyParser = require('body-parser');
const mongoose = require("mongoose");
mongoose.connect('mongodb://127.0.0.1:27017/examen');
const Author = require("./authors.js");

let app = express();
app.use(bodyParser.json()); // for parsing application/json
app.use(express.json())

app.get('/examen',(req,res)=>{
    Author.find().then(result => {
        if(result){
            res.status(200)
            .send({ok:true,result:result});
        }
        else
        {
            res.status(204).send({ok:false,message:"No se han encontrado peliculas"})
        }
        
    }).catch(error => {
        res.status(400)
        .send({ok:false , error: "Error llegint MongoDB"})
    });
    
});

app.get('/examen/:id',(req,res)=>{
    let id_author = req.params.id;
    Author.findById(id_author).then(result => {
        res.status(200)
        .send({ok:true,result:result});
    }).catch(error => {
        res.status(400)
        .send({ok:false , error: "Error llegint MongoDB"})
    });
    
});


app.post('/examen',(req,res)=>{
    let name = req.body.Name;
    let country = req.body.Country;
    let books = req.body.Books;
    let authors = new Author({
        "Name": name,
        "Country": country,
        "Books": books
    });
    authors.save().then(result => {
        res.status(201)
        .send({ok:true, result:result});
    }).catch(error => {
        res.status(500)
        .send({ok:false, error:"Can't insert the film"})
    });
});

app.post('/examen/bookToAuthor/:id',(req,res)=>{
    let id_author = req.params.id;
    let books = req.body.Books;
    Author.findByIdAndUpdate(id_author,{
        $push:{
                "Books" : books,
                
        }
    }, {new: true}).then(resultado =>{
        res.status(200)
        .send({ok:true,  resultado: resultado});
    }).catch(error => {
        res.status(400)
        .send({ok:false, error: 'No se ha podido actualizar la película.'});
    })
});

app.put('/examen/country/:id',(req,res)=>{
    let id_author = req.params.id;
    let country = req.body.Country;
    Author.findByIdAndUpdate(id_author,{
        $set:{
            "Country": country,
        }
    }, {new: true}).then(resultado =>{
        res.status(200)
        .send({ok:true,  resultado: resultado});
    }).catch(error => {
        res.status(400)
        .send({ok:false, error: 'No se ha podido actualizar la película.'});
    })
});

app.put('/examen/name/:id',(req,res)=>{
    let id_author = req.params.id;
    let name = req.body.Name;
    Author.findByIdAndUpdate(id_author,{
        $set:{
            "Name": name,
        }
    }, {new: true}).then(resultado =>{
        res.status(200)
        .send({ok:true,  resultado: resultado});
    }).catch(error => {
        res.status(400)
        .send({ok:false, error: 'No se ha podido actualizar la película.'});
    })
});

app.put('/examen/chapters/:id',(req,res)=>{
    let id_book = req.params.id;
    Author.Books.findByIdAndUpdate(id_book,{
        $inc:{
            "Books.Chapters" :  1  
        }
    }, {new: true}).then(resultado =>{
        res.status(200)
        .send({ok:true,  resultado: resultado});
    }).catch(error => {
        res.status(400)
        .send({ok:false, error: 'No se ha podido actualizar la película.'});
    })
});


app.delete('/examen/authorborrar/:id',(req,res)=>{
    let id_author = req.params.id;
    Author.findByIdAndDelete(id_author).then(result => {
        res.status(200)
        .send({ok:true,message:"film deleted"});
        }).catch (error => {
        res.status(500)
        .send({ok:false,message: "cant delete the film"})
    });
});

app.listen(8080);
