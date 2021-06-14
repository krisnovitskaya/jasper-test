package ru.test;

import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.springframework.util.ResourceUtils;

import java.io.*;
import java.util.*;

public class App
{
    // name and destination of output file e.g. "report.pdf"
    private static String destFileName = "report.pdf";

    public static void main( String[] args ) throws FileNotFoundException, JRException {

        System.out.println( "generating jasper report..." );

        // 1. compile template ".jrxml" file
        JasperReport jasperReport = getJasperReport();

        // 2. parameters "empty"
        Map<String, Object> parameters = getParameters();

        // 3. datasource "java object"
        JRDataSource dataSource = getDataSource();

        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport,
                parameters,
                dataSource);
        JasperExportManager.exportReportToPdfFile(jasperPrint, destFileName);

    }

    private static JasperReport getJasperReport() throws FileNotFoundException, JRException {
        //File template = ResourceUtils.getFile("classpath:report.jrxml");
        return JasperCompileManager.compileReport("D:\\java\\jasper\\src\\main\\resources\\report.jrxml");
    }
    private static Map<String, Object> getParameters(){
//        Map<String, Object> parameters = new HashMap<>();
//        parameters.put("createdBy", "hmkcode");
        return null;
    }

    private static JRDataSource getDataSource(){

        List<Product> products = new LinkedList<>();


        products.add(new Product("name1name1name1name1 name1name1", "8", "1"));
        products.add(new Product("name12", null, "0"));
        products.add(new Product("name13", null, "0"));
        products.add(new Product("name14", null, "0"));
        products.add(new Product("name15", "", "0"));
        products.add(new Product("name16", "asddddd fdsfsdfsdfsdfsdf sdfdsfsdfdsfsdfsdf sdfsdfsdfdsf sdfdsfsdfds sdfdsff", "0"));
        products.add(new Product("name2", "8", "1"));
        products.add(new Product("name21", null, "0"));
        products.add(new Product("name22", "adsssssss", "0"));
        products.add(new Product("name23", "dssdfsd", "0"));
        products.add(new Product("name3", null, "1"));
        products.add(new Product("name31", "fsfdf dsfdsfs 23213", "0"));
        products.add(new Product("name4", "8", "1"));
        products.add(new Product("name41", "32323", "0"));
        products.add(new Product("name42", "fdsa", "0"));
        products.add(new Product("Kreditnuyu liniyu", null, "1"));
        products.add(new Product("name51", "dsadsada asdsadsad asd sadsad asdsadsadsa asd", "0"));
        products.add(new Product("name52", "dsadsad ", "0"));
        products.add(new Product("name53", "fsfdf dsfdsfs 23213", "0"));
        products.add(new Product("name54", "fsfdf dsfdsfs 23213dsa", "0"));
        products.add(new Product("name55", "fsfdf dsfdsfs 23213", "0"));
        products.add(new Product("Generalnoe soglashenie", null, "1"));
        products.add(new Product("name61", "fsfdf dsfdsfs 23213", "0"));
        products.add(new Product("name62", "выfsfdf dsfdsfs 23213фвф", "0"));
        products.add(new Product("name63", "fsfdf dsfdsfs 23213", "0"));
        products.add(new Product("name7", null, "1"));
        products.add(new Product("name71", "fsfdf dsfdsfs 23213", "0"));
        products.add(new Product("name8", "", "1"));
        products.add(new Product("name81", "fsfdf dsfdsfs 23213", "0"));
        products.add(new Product("name82", "fsfdf dsfdsfs 23213", "0"));
        products.add(new Product("name9", null, "1"));
        products.add(new Product("name91", "fsfdf dsfdsfs 23213", "0"));
        products.add(new Product("name92", "fsfdf dsfdsfs 23213", "0"));
        products.add(new Product("name93", "fsfdf dsfdsfs 23213", "0"));
        products.add(new Product("name94", "fsfdf dsfdsfs 23213", "0"));
        products.add(new Product("name95", "fsfdf dsfdsfs 23213", "0"));
        products.add(new Product("name10", null, "1"));
        products.add(new Product("name101", "fsfdf dsfdsfs 23213sada", "0"));
        products.add(new Product("name102", "asdas", "0"));
        products.add(new Product("name103", "das", "0"));
        products.add(new Product("name11", null, "1"));
        products.add(new Product("name111", "232132131", "0"));
        products.add(new Product("name12", null, "1"));
        products.add(new Product("name121", "dsad231  1111 fsfdf dsfdsfs 23213fsfdf dsfdsfs 23213fsfdf dsfdsfs 23213fsfdf dsfdsfs 23213fsfdf dsfdsfs 23213fsfdf dsfdsfs 23213fsfdf dsfdsfs 23213fsfdf dsfdsfs 23213", "0"));
        products.add(new Product("name122", "fdsfsfdf dsfdsfs 23213fsfdf dsfdsfs 23213fsfdf dsfdsfs 23213fsfdf dsfdsfs 23213fsfdf dsfdsfs 23213fsfdf dsfdsfs 23213fsfdf dsfdsfs 23213fsfdf dsfdsfs 23213fsfdf dsfdsfs 23213fsfdf dsfdsfs 23213fsfdf dsfdsfs 23213fsfdf dsfdsfs 23213fsfdf dsfdsfs 23213fsfdf dsfdsfs 23213fsfdf dsfdsfs 23213fsfdf dsfdsfs 23213fsfdf dsfdsfs 23213a", "0"));
        products.add(new Product("name13", null, "1"));
        products.add(new Product("name131", "fsfdf dsfdsfs 23213fsfdf dsfsfdf dsfdsfs 23213fsfdf dsfdsfs 23213fsfdf dsfdsfs 23213fsfdf dsfdsfs 23213fdsfs 23213fsfdf dsfdsfs 23213fsfdf dsfdsfs 23213fsfdf dsfdsfs 23213fsfdf dsfdsfs 23213fsfdf dsfdsfs 23213fsfdf dsfdsfs 23213fsfdf dsfdsfs 23213fsfdf dsfdsfs 23213fsfdf dsfdsfs 23213", "0"));
        products.add(new Product("name132", "adwqa2 ", "0"));
        products.add(new Product("name132", "12", "0"));
        products.add(new Product("name134", "111", "0"));
        products.add(new Product("name135", "323ds", "0"));
        products.add(new Product("name14", null, "1"));
        products.add(new Product("name141", "23d", "0"));
        products.add(new Product("name142", "dsdas", "0"));
        products.add(new Product("name143", "sad", "0"));
        products.add(new Product("name15", null, "1"));
        products.add(new Product("name151", "asdd2 ", "0"));
        products.add(new Product("name16", null, "1"));
        products.add(new Product("name161", "dsadas", "0"));
        products.add(new Product("name162", "2ccccc", "0"));

        return new JRBeanCollectionDataSource(products);
    }
}
