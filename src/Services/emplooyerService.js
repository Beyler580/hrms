import axios  from "axios"
export default class emplooyerService{
    getEmplooyers(){
        return  axios.get("http://localhost:8080/api/emplooyers/getAll")
    }
    
}