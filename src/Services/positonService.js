import axios  from "axios";

export default class positonService{
    getPositions(){
        return axios.get("http://localhost:8080/api/positions/getAll")
    }



}