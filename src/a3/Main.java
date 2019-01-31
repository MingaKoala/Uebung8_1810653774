package a3;

public class Main {

    public static void main(String[] args) throws JAXBException, FileNotFoundException {
        File file = new File("src/at/ac/fh_kufstein/a2/weather.xml");
        JAXBContext jaxbContext = JAXBContext.newInstance(at.ac.fh_kufstein.a2.Weather.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        at.ac.fh_kufstein.a2.Weather w = (at.ac.fh_kufstein.a2.Weather) unmarshaller.unmarshal(file);
        System.out.println(w);

        at.ac.fh_kufstein.a5.Weather w2 = new at.ac.fh_kufstein.a5.Weather();
        w2.setId(w.getId());
        w2.setMain(w.getMain());
        w2.setDescription(w.getDescription());
        w2.setIcon(w.getIcon());
        JSONWriterObjectMapper jom = new JSONWriterObjectMapper();
        jom.writeWeatherToJson(w2);
    }
}
