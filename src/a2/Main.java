package a2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {


    public static void main(String[] args)  throws IOException, JAXBException, FileNotFoundException {
        ObjectMapperWeather omw = new ObjectMapperWeather();
        Weather w1 = omw.readJsonWithObjectMapper();
        at.ac.fh_kufstein.a2.Weather w = new at.ac.fh_kufstein.a2.Weather(w1.getId(), w1.getMain(), w1.getDescription(), w1.getIcon());
        JAXBContext jaxbContext = JAXBContext.newInstance(at.ac.fh_kufstein.a2.Weather.class);
        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(w, new File("src/at/ac/fh_kufstein/a2/weather.xml"));
        marshaller.marshal(w, System.out);
    }


}
