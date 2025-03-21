package com.example.dogsloversapp.data

//https://dog.ceo/api/breeds/
class DogResponse(
    val message: List<String>,
    val status: String
)
class Breed(
    val NameBreed: String,
    val status: String
)

class BreedsList (
    val message: String,
    val status: String
)


class SubBreed(
    val message: List<Breed>,
    val status: String
)

//https://dog.ceo/api/breed/ esta es la url base.
//https://dog.ceo/api/breed/####/images para que salgan todas las imagenes
//https://dog.ceo/api/breed/####/images/random si es aleatroia una imagen
// todas las razas https://dog.ceo/api/breeds/list/all
/*https://dog.ceo/api/breed/####/list devuelve un array(List) de todas las sub-razas de una raza

{
    "message": [
    "afghan",
    "basset",
    "blood",
    "english",
    "ibizan",
    "plott",
    "walker"
    ],
    "status": "success"
}
*/

class Images(
    val url: String
)