package com.testjson;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.testjson.Models.Products;
import jdk.nashorn.api.scripting.JSObject;
import jdk.nashorn.internal.parser.JSONParser;
import org.junit.Test;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void debeDevolverJSONEnUnProperties() {
        final String json = "{\"id\":46,\"nombre\":\"Miguel\",\"empresa\":\"Autentia\"}";
        final Gson gson = new Gson();
        final Properties properties = gson.fromJson(json, Properties.class);
        assertEquals("46", properties.getProperty("id"));
        assertEquals("Miguel", properties.getProperty("nombre"));
        assertEquals("Autentia", properties.getProperty("empresa"));
        assertNull(properties.getProperty("propiedadInexistente"));
    }

    @Test
    public void deserializeFromJsonToJavaObject(){
        final String json = "{\"id\"=32,\"nombre\"=\"Giovanni\", \"empresa\"=\"DigitalFactory\"}";
        Gson gson = new Gson();
        Empleado empleado = gson.fromJson(json,Empleado.class);
        assertEquals(32,empleado.getId());
        assertEquals("Giovanni".toLowerCase(),empleado.getNombre().toLowerCase());
        assertEquals("digitalfactory".toLowerCase(),empleado.getEmpresa().toLowerCase());
    }

    @Test
    public void deserialiazeObjectJSONWithObjectListsInOneJavaObject(){
        final String empleadoJSON = "{\"id\":46,\"nombre\":\"Miguel\",\"empresa\":\"Autentia\"," +
                "\"vacaciones\":[{\"inicio\":\"06/08/2012\",\"fin\":\"10/08/2012\"," +
                "\"d\":5},{\"inicio\":\"23/08/2012\",\"fin\":\"29/08/2012\",\"d\":7}]}";
        final Gson gson = new Gson();
        Empleado empleado = gson.fromJson(empleadoJSON,Empleado.class);
        //System.out.println(empleado.getVacaciones().size());
        //System.out.println(empleado.getVacaciones().get(0).getInicio());
        int i;
        for (i=0; i< empleado.getVacaciones().size();i++){
            System.out.println("Vacaciones: " + "\n" +
                            "Fecha Inicio: " + empleado.getVacaciones().get(i).getInicio() + " " +
                            "Fecha Final: " + empleado.getVacaciones().get(i).getFin() + " " +
                            "dias: " + empleado.getVacaciones().get(i).getD() + " ");
            assertEquals(Integer.toString(5),empleado.getVacaciones().get(0).getD().toString());
        }
    }

    @Test
    public void readJSONFromFile(){
        System.out.println("Reading JSON file from Java program");
        FileReader fileReader = new FileReader("/root/IdeaProjects/project_json_java/src/test/java/com/testjson/Data/pruebaJSON.json");
        JsonObject json = (JsonObject) parser.parse(fileReader);


        Read more: http://javarevisited.blogspot.com/2014/12/how-to-read-write-json-string-to-file.html#ixzz5C8RgWuAe


        JSONParser jsonParser = new JSONParser();
        FileReader reader = new FileReader();

        //Read JSON file
            Object obj = jsonParser.parse(reader);

        JsonArray ProductsList = (JsonArray) obj;
            System.out.println(ProductsList);

            //Iterate over employee array

        /*
        Type collectionType = new TypeToken<Collection<Products>>(){}.getType();
        Collection<Products> products = gson.fromJson(br, collectionType);
        productsList.addAll(products);
        */

    }


}
