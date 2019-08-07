package com.example.StudentInfoBackend.api;


import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping(value = "/students")
public class StudentApi {


    //{ "token":"", "type":"1", "message":{ "type":1, "message":"message" } }
    String jsonString = "{\n" +
            "    \"ime\": \"Petar\",\n" +
            "    \"prezime\": \"Peric\",\n" +
            "    \"mestoRodjenja\": \"Beograd\",\n" +
            "    \"datumRodjenja\": \"2000-11-09T10:30\",\n" +
            "    \"telefon\": \"063123123\",\n" +
            "    \"osnovnaSkola\": \"Neka osnovna\",\n" +
            "    \"srednjaSkola\": \"Neka srednja\",\n" +
            "    \"fakultet\": null,\n" +
            "    \"godine\": 28,\n" +
            "    \"jezici\": {\n" +
            "        \"italijanski\": \"ne\",\n" +
            "        \"engleski\": \"da\",\n" +
            "        \"nemacki\": \"da\",\n" +
            "        \"ruski\": \"da\",\n" +
            "        \"francuski\": \"ne\",\n" +
            "        \"srpski\": \"da\"\n" +
            "    },\n" +
            "    \"tehnickoZnanje\": {\n" +
            "        \"word\": \"ne\",\n" +
            "        \"excel\": \"da\",\n" +
            "        \"powerpoint\": \"da\",\n" +
            "        \"java\": \"da\",\n" +
            "        \"python\": \"ne\",\n" +
            "        \"html\": \"da\"\n" +
            "    },\n" +
            "    \"radnoIskustvo\": {\n" +
            "        \"firmaA\": \"naziv firme A\",\n"     +
            "        \"firmaB\": \"naziv firme B\",\n"     +
            "        \"pozicijaA\": \"praksa\",\n"     +
            "        \"pozicijaB\": \"praksa\"\n" +
            "    },\n" +
            "    \"email\": \"petar@gmail.com\",\n" +
            "    \"skype\":\"skypeeee\",\n" +
            "    \"brojSertifikata\":12,\n" +
            "    \"brojNagrada\":0,\n" +
            "    \"brojNaucnihRadova\":0\n" +
            "}";

    @RequestMapping(value = "/findAll", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public String findAll() {
        JSONObject jsonObject = null;
        try {
            jsonObject = new JSONObject(jsonString);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        String jsonString = jsonObject.toString();
//        System.out.println(jsonString);
        return jsonString;
    }
}
