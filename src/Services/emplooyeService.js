import axios from "axios"
export default class emplooyeService{
    getEmplooyes(){
        return axios.get("http://localhost:8080/api/emplooyes/getAll")
    }

}