import axios from "axios";
export default class jobadvertService{
    getJobadverts(){
        return axios.get("http://localhost:8080/api/jobadviserments/getAll")
    }

}