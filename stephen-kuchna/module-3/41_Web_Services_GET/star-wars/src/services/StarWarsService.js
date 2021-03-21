import axios from 'axios';

const baseUrl = "https://swapi.dev/api/";
// axios is the http library to call APIs
const http = axios.create();

export default {

    getCharacters()
    {
        // define the actual endpoint url for the call
        const url = baseUrl + 'people/';
        return http.get(url);
    }
}