import axios from "axios";

// configurando a API

const api = axios.create({
    baseURL: "https://viacep.com.br/ws/"
})

export default api; 